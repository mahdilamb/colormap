package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Abstract color map that allows or the definition of a color map that is evenly spaced, or spaced at defined locations apart.
 *
 */
public abstract class ColorMapImpl implements ColorMap  {
    /**
     * All registered colormaps
     */
    static final Map<String, Class<ColorMap>> colorMaps = new HashMap<>();
    /**
     * A subset of all the color maps - those that are the defaults.
     */
    static final NavigableSet<String> defaultColorMaps = new TreeSet<>();

    /**
     * A node that belongs to ColorMap, primarily defined by its value
     */
    public static final class ColorMapNode {
        private final Color color;
        private final ColorMapImpl colorMap;
        private Double value;

        private ColorMapNode(final ColorMapImpl colorMap, final Color color, final Double value) {
            this.colorMap = colorMap;
            this.value = value;
            this.color = color;
        }

        private void recalculate() {
            final Color newColor = colorMap.calculateColor(value);
            color.setColor(newColor);
        }

        /**
         * Set the value of this node
         *
         * @param value Value to set this node to.
         */
        public void setValue(final Double value) {
            if (Objects.equals(value, this.value)) {
                return;
            }
            final Double oldValue = this.value;
            this.value = value;
            recalculate();

            if (value <= colorMap.currentMinValue || oldValue != null && oldValue <= colorMap.currentMinValue) {
                colorMap.recalculateMinValue();
            }
            if (value >= colorMap.currentMaxValue || oldValue != null && oldValue >= colorMap.currentMaxValue) {
                colorMap.recalculateMaxValue();
            }
        }

        @Override
        public String toString() {
            return String.format("%s at %.3f", color.toString(), value);
        }

        /**
         * Remove this node from its colormap.
         */
        public void remove() {
            colorMap.currentNodes.remove(this);
            if (colorMap.currentMinValue <= value) {
                colorMap.recalculateMinValue();
            }
            if (colorMap.currentMaxValue >= value) {
                colorMap.recalculateMaxValue();
            }
        }

        /**
         * @return The color of the node
         */
        public final Color getColor() {
            return color;
        }

        /**
         * @return The value of the node.
         */
        public final Double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            ColorMapNode that = (ColorMapNode) o;

            if (!Objects.equals(color, that.color)) return false;
            if (!Objects.equals(colorMap, that.colorMap)) return false;
            return Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (color != null ? color.hashCode() : 0);
            result = 31 * result + (colorMap != null ? colorMap.hashCode() : 0);
            result = 31 * result + (value != null ? value.hashCode() : 0);
            return result;
        }
    }


    /**
     * Map of colors with their respective positions.
     */
    final Map<Double, Color> definedColorNodes = new HashMap<>();
    /**
     * List of colors with undefined positions.
     */
    final List<Color> colorMapColors = new Vector<>();
    /**
     * The cache of colors associated with this color map whose positions have been calculated from {@link ColorMapImpl#colorMapColors}
     */
    final NavigableMap<Double, Color> currentColors = new TreeMap<>();
    /**
     * The current list of nodes associated with this color map
     */
    final List<ColorMapNode> currentNodes = new Vector<>();
    /**
     * Current minimum value
     */
    double currentMinValue = Double.MAX_VALUE;
    /**
     * Current maximum value
     */
    double currentMaxValue = Double.MIN_VALUE;
    /**
     * Lowest range of the color map
     */
    Double lowValue = null;
    /**
     * Highest range of the color map.
     */
    Double highValue = null;
    /**
     * Color for {@code null} values
     */
    Color NaNColor = new Color(Color.black);
    /**
     * Color for values lower than or equal to {@link ColorMapImpl#lowValue}
     */
    Color lowColor = null;
    /**
     * Color for values higher than or equal to {@link ColorMapImpl#highValue}
     */
    Color highColor = null;
    /**
     * whether the color map is reversed
     */
    boolean isReversed = false;

    ColorMapImpl() {

    }

    /**
     * Copy constructor - copies all elements of a colormap except dynamic elements
     * (e.g. current mapped nodes, current high and low value)
     *
     * @param other colormap to copy
     */
    ColorMapImpl(final ColorMapImpl other) {
        isReversed = other.isReversed;
        highColor = other.highColor;
        lowColor = other.lowColor;
        NaNColor = other.NaNColor;
        highValue = other.highValue;
        lowValue = other.lowValue;

        definedColorNodes.putAll(other.definedColorNodes);
        colorMapColors.addAll(other.colorMapColors);

    }

    /**
     * Add color node based on a specified position
     *
     * @param position The position (0.0-1.0) to place this Color
     * @param color    Color to add to color map
     */
    protected void addColor(final Double position, final Color color) {
        if (position == null) {
            addColor(color);
            return;
        }
        if (position < 0 || position > 1) {
            throw new IllegalArgumentException("position must be in range 0>= position <= 1");
        }
        currentColors.clear();
        definedColorNodes.put(position, color);
    }

    /**
     * Add color node whose position is later calculated based on its order
     *
     * @param color Color to add to color map
     */
    protected void addColor(final Color color) {
        currentColors.clear();
        colorMapColors.add(color);

    }

    /**
     * Add colors to color map that are are calculated based on order.
     *
     * @param colors Colors to add to the color map.
     */
    protected void addColors(final Color... colors) {
        currentColors.clear();
        this.colorMapColors.addAll(Arrays.asList(colors));

    }

    /**
     * Calculate color nodes based on position (if undefined) and cache them
     */
    protected void calculateColors() {
        if (currentColors.size() == 0) {
            currentColors.putAll(definedColorNodes);
            for (int i = 0; i < colorMapColors.size(); i++) {
                currentColors.put((double) i / (colorMapColors.size() - 1), colorMapColors.get(i));
            }
        }
    }

    /**
     * Recalculate the nodes belonging to this color map.
     */
    protected final void recalculateNodes() {
        for (final ColorMapNode node : currentNodes) {
            node.recalculate();
        }
    }

    /**
     * Calculate the Color of a value considering the bounds of the Colormap.
     *
     * @param value Value from which to calculate a color
     * @return The calculated color
     */
    final Color calculateColor(final Double value) {
        if (value == null) {
            return getNaNColor().clone();
        } else {
            if (currentNodes.size() <= 1) {
                return getColorAt(.5).clone();
            } else if (value < getLowValue()) {
                return getLowColor().clone();
            } else if (value > getHighValue()) {
                return getHighColor().clone();
            } else {
                return getColorAt((value - getLowValue()) / (getHighValue() - getLowValue()));

            }
        }
    }

    /**
     * Get the color node from a value
     *
     * @param value The value to get the associated node form
     * @return The associated color node.
     */
    public final ColorMapNode getColorFromValue(final double value) {

        if (value < currentMinValue || value > currentMaxValue) {
            if (value < currentMinValue) {
                currentMinValue = value;
            }
            if (value > currentMaxValue) {
                currentMaxValue = value;
            }
            recalculateNodes();
        }
        final ColorMapNode color = new ColorMapNode(this, calculateColor(value), value);
        currentNodes.add(color);
        return color;
    }

    /**
     * @return The maximum value before all Colors are represented by {@link ColorMapImpl#highColor}.
     * {@code null} means no such ceiling exists.
     */
    protected Double getHighValue() {
        return highValue == null ? currentMaxValue : highValue;
    }

    /**
     * Set the upper bound of this color map
     *
     * @param highValue The upper bound
     */
    public final void setHighValue(final Double highValue) {
        if (this.highValue == null || !this.highValue.equals(highValue)) {
            this.highValue = highValue;
            currentColors.clear();
            recalculateNodes();
        }
    }

    /**
     * @return The minimum value before all Colors are represented by {@link ColorMapImpl#lowColor}.
     * {@code null} means no such floor exists.
     */
    protected Double getLowValue() {
        return lowValue == null ? currentMinValue : lowValue;
    }

    /**
     * Set the lower bound of this color map
     *
     * @param lowValue Lower bound of this color map
     */
    public final void setLowValue(final Double lowValue) {
        if (this.lowValue == null || !this.lowValue.equals(lowValue)) {
            this.lowValue = lowValue;
            currentColors.clear();
            recalculateNodes();
        }

    }

    /**
     * @return The color of a value if it is lower than {@link ColorMapImpl#lowValue}
     */
    protected final Color getLowColor() {
        return lowColor == null ? getColorAt(0d) : lowColor;
    }

    /**
     * Set the color to use if the value in a color map is lower than {@link ColorMapImpl#getLowValue()}.
     * To disable this floor set {@link ColorMapImpl#getLowValue()} to {@code null}.
     *
     * @param lowColor The Color to provide if a value is lower than {@link ColorMapImpl#getLowValue()}
     */
    public final void setLowColor(final Color lowColor) {
        if (!this.lowColor.equals(lowColor)) {
            this.lowColor = lowColor;
            recalculateNodes();
        }
    }

    /**
     * @return The color of a value if it is higher than {@link ColorMapImpl#highValue}
     */
    protected final Color getHighColor() {
        return highColor == null ? getColorAt(1d) : highColor;
    }

    /**
     * Set the color to use if the value in a color map is greater than {@link ColorMapImpl#getHighValue()}.
     * To disable this ceiling set {@link ColorMapImpl#getHighValue()} to {@code null}.
     *
     * @param highColor The Color to provide if a value is higher than {@link ColorMapImpl#getHighValue()}
     */
    public final void setHighColor(final Color highColor) {
        if (!this.highColor.equals(highColor)) {
            this.highColor = highColor;
            recalculateNodes();
        }
    }

    /**
     * @return The color of a value if it is null
     */
    protected final Color getNaNColor() {
        return NaNColor;
    }

    /**
     * Set the color to use if the value is {@code null}
     *
     * @param NaNColor Color to use if the value is not a number.
     */
    public final void setNaNColor(final Color NaNColor) {
        if (!this.NaNColor.equals(NaNColor)) {
            this.NaNColor = NaNColor;
            recalculateNodes();
        }
    }

    /**
     * @return The current colors in this colormap, including those whose positions were originally undefined.
     */
    final NavigableMap<Double, Color> getColorNodes() {
        calculateColors();
        return currentColors;
    }

    /**
     * @return If the order of this color map is reversed
     */
    @Override
    public final boolean isReversed() {
        return isReversed;
    }

    /**
     * Set the color map as reversed
     *
     * @param isReversed Whether to reverse or not.
     */
    @Override
    public final void setReversed(final boolean isReversed) {
        if (this.isReversed != isReversed) {
            this.isReversed = isReversed;
            recalculateNodes();
        }

    }

    /**
     * @return The number of colors in this colormap.
     */
    public final int numColors() {
        return colorMapColors.size() + definedColorNodes.size();
    }

    @Override
    public String toString() {
        final NewColorMap annotation = getClass().getDeclaredAnnotation(NewColorMap.class);
        if (annotation != null) {
            return String.format("%s.%s%s", annotation.type(), annotation.name(), isReversed ? ".Reversed" : "");
        }
        return super.toString();
    }

    /**
     * Recalculates the current highest value (not Colormap ceiling)
     */
    private void recalculateMaxValue() {
        Double currentMaxValue = null;

        for (final ColorMapNode node : currentNodes) {
            if (node.value == null) {
                continue;
            }
            if (currentMaxValue == null || node.value > currentMaxValue) {
                currentMaxValue = node.value;
            }
        }

        if (currentMaxValue != null && currentMaxValue != this.currentMaxValue) {
            this.currentMaxValue = currentMaxValue;
            recalculateNodes();
        }
    }

    /**
     * Recalculates the current lowest value (not Colormap floor)
     */
    private void recalculateMinValue() {
        Double currentMinValue = null;
        for (final ColorMapNode node : currentNodes) {
            if (node.value == null) {
                continue;
            }
            if (currentMinValue == null || node.value < currentMinValue) {
                currentMinValue = node.value;
            }
        }

        if (currentMinValue != null && currentMinValue != this.currentMinValue) {
            this.currentMinValue = currentMinValue;
            recalculateNodes();
        }
    }


    static void cacheDefaultColorMaps() throws IOException, ClassNotFoundException {
        if (ColorMapImpl.defaultColorMaps.size() == 0) {
            final String packagePath = ColorMap.class.getPackageName().replace(".", "/");
            final File packageName = new File(packagePath);
            final URL codeSource = ColorMap.class.getProtectionDomain().getCodeSource().getLocation();
            if (new File(codeSource.getPath()).isDirectory()) {

                final Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
                final Stack<File> directories = new Stack<>();
                while (resources.hasMoreElements()) {
                    try {
                        final File file = new File(URLDecoder.decode(resources.nextElement().getPath(), "UTF-8"));
                        if (!file.isFile()) {
                            directories.push(file);
                        } else {
                            addColorMapClass(packageName, file);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                while (!directories.empty()) {
                    final File dir = directories.pop();
                    if (dir == null) {
                        continue;
                    }
                    final File[] files = dir.listFiles();
                    if (files == null) {
                        continue;
                    }
                    for (final File file : files) {
                        if (!file.isFile()) {
                            directories.push(file);
                        } else {
                            addColorMapClass(packageName, file);
                        }
                    }
                }
            } else {
                try (final ZipInputStream jar = new JarInputStream(codeSource.openStream())) {
                    ZipEntry ze;
                    while ((ze = jar.getNextEntry()) != null) {
                        final File file = new File(ze.toString());
                        if (!file.toString().endsWith(".class") || file.toString().length() < packagePath.length() || !file.toString().contains(packageName.toString())) {
                            continue;
                        }

                        addColorMapClass(packageName, file);
                    }
                }
            }


        }
    }

    @SuppressWarnings("unchecked")
    static void addColorMapClass(final File packageName, final File file) throws ClassNotFoundException {

        final Class<?> colorMap = Class.forName(
                file
                        .toString()
                        .substring(file.toString().indexOf(packageName.toString()))
                        .replace(File.separator, ".")
                        .replace(".class", "")
        );
        final NewColorMap annotation = colorMap.getDeclaredAnnotation(NewColorMap.class);
        if (annotation == null) {
            return;
        }
        final String name = annotation.name().toLowerCase();
        final String type = annotation.type().name().toLowerCase();
        final String withWildCard = String.format("*.%s", name);
        final String withoutWildCard = String.format("%s.%s", type, name);

        if (ColorMap.class.isAssignableFrom(colorMap)) {
            defaultColorMaps.add(String.format("%s.%s", annotation.type(), annotation.name()));
            ColorMap.registerColorMap(withWildCard, (Class<ColorMap>) colorMap);
            ColorMap.registerColorMap(withoutWildCard, (Class<ColorMap>) colorMap);
        }

    }

    /**
     * @return an iterator over the positions where there are colors
     */
    @Override
    public final Iterator<Double> iterator() {
        calculateColors();
        final NavigableSet<Double> allColors = new TreeSet<>(definedColorNodes.keySet());
        allColors.addAll(currentColors.keySet());
        return allColors.iterator();
    }
}
