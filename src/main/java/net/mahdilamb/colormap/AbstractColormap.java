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
 */
abstract class AbstractColormap implements Colormap {
    /**
     * An unmodifiable version of colormap
     */
    static final class UnmodifiableColormap implements Colormap {
        private final Colormap original;

        UnmodifiableColormap(Colormap original) {
            this.original = original;

        }

        @Override
        public Color colorAt(double value) {
            return original.colorAt(value);
        }

        @Override
        public boolean isReversed() {
            return original.isReversed();
        }

        @Override
        public void setReversed(boolean isReversed) {
            throw new UnsupportedOperationException();

        }

        /**
         * @return the same object as input
         */
        @Override
        @SuppressWarnings("MethodDoesntCallSuperMethod")
        public Colormap clone() {
            return this;
        }

        @Override
        public void setLowValue(Double lowValue) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setHighValue(Double highValue) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ColormapNode getColorFromValue(double value) {
            return original.getColorFromValue(value);
        }

        @Override
        public Map<Double, Color> getFixedColors() {
            return original.getFixedColors();
        }

        @Override
        public List<Color> getSparseColors() {
            return original.getSparseColors();
        }

        @Override
        public Double lowValue() {
            return original.lowValue();
        }

        @Override
        public Double highValue() {
            return original.highValue();
        }

        @Override
        public Color getNaNColor() {
            return original.getNaNColor();
        }

        @Override
        public void setNaNColor(Color NaNColor) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color getLowColor() {
            return original.getLowColor();
        }

        @Override
        public void setLowColor(Color lowColor) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color getHighColor() {
            return original.getHighColor();
        }

        @Override
        public void setHighColor(Color highColor) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Iterator<Double> iterator() {
            return original.iterator();
        }
    }

    /**
     * All registered colormaps
     */
    static final Map<String, Class<Colormap>> colorMaps = new HashMap<>();
    /**
     * A subset of all the color maps - those that are the defaults.
     */
    static final NavigableSet<String> defaultColorMaps = new TreeSet<>();

    /**
     * Map of colors with their respective positions.
     */
    final Map<Double, Color> definedColorNodes = new HashMap<>();
    /**
     * List of colors with undefined positions.
     */
    final List<Color> colorMapColors = new Vector<>();
    /**
     * The cache of colors associated with this color map whose positions have been calculated from {@link AbstractColormap#colorMapColors}
     */
    final NavigableMap<Double, Color> currentColors = new TreeMap<>();
    /**
     * The current list of nodes associated with this color map
     */
    final List<ColormapNode> currentNodes = new Vector<>();
    /**
     * Current minimum value
     */
    transient double currentMinValue = Double.MAX_VALUE;
    /**
     * Current maximum value
     */
    transient double currentMaxValue = Double.MIN_VALUE;
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
    Color NaNColor = Color.create(Color.black);
    /**
     * Color for values lower than or equal to {@link AbstractColormap#lowValue}
     */
    Color lowColor = null;
    /**
     * Color for values higher than or equal to {@link AbstractColormap#highValue}
     */
    Color highColor = null;
    /**
     * whether the color map is reversed
     */
    boolean isReversed = false;

    AbstractColormap() {

    }

    /**
     * Copy constructor - copies all elements of a colormap except dynamic elements
     * (e.g. current mapped nodes, current high and low value)
     *
     * @param other colormap to copy
     */
    AbstractColormap(final Colormap other) {
        isReversed = other.isReversed();
        highColor = other.getHighColor();
        lowColor = other.getLowColor();
        NaNColor = other.getNaNColor();
        highValue = other.highValue();
        lowValue = other.lowValue();

        definedColorNodes.putAll(other.getFixedColors());
        colorMapColors.addAll(other.getSparseColors());

    }

    static void cacheDefaultColorMaps() throws IOException, ClassNotFoundException {
        if (AbstractColormap.defaultColorMaps.size() == 0) {
            final String packagePath = Colormap.class.getPackageName().replace(".", "/");
            final File packageName = new File(packagePath);
            final URL codeSource = Colormap.class.getProtectionDomain().getCodeSource().getLocation();
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
        final NewColormap annotation = colorMap.getDeclaredAnnotation(NewColormap.class);
        if (annotation == null) {
            return;
        }
        final String name = annotation.name().toLowerCase();
        final String type = annotation.type().name().toLowerCase();
        final String withWildCard = String.format("*.%s", name);
        final String withoutWildCard = String.format("%s.%s", type, name);

        if (Colormap.class.isAssignableFrom(colorMap)) {
            defaultColorMaps.add(String.format("%s.%s", annotation.type(), annotation.name()));
            Colormap.registerColorMap(withWildCard, (Class<Colormap>) colorMap);
            Colormap.registerColorMap(withoutWildCard, (Class<Colormap>) colorMap);
        }

    }

    /**
     * Add color node based on a specified position
     *
     * @param position The position (0.0-1.0) to place this Color
     * @param color    Color to add to color map
     */
    protected void addColor(final double position, final Color color) {
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
        for (final ColormapNode node : currentNodes) {
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
        if (value == null || Double.isNaN(value)) {
            return getNaNColor().clone();
        } else {
            if (currentNodes.size() <= 1) {
                return getColorAt(.5).clone();
            } else if (value < getLowValue()) {
                return lowColor().clone();
            } else if (value > getHighValue()) {
                return highColor().clone();
            } else {
                return getColorAt((value - getLowValue()) / (getHighValue() - getLowValue()));

            }
        }
    }

    @Override
    public final ColormapNode getColorFromValue(final double value) {

        if (value < currentMinValue || value > currentMaxValue) {
            if (value < currentMinValue) {
                currentMinValue = value;
            }
            if (value > currentMaxValue) {
                currentMaxValue = value;
            }
            recalculateNodes();
        }
        final ColormapNode color = new ColormapNode(this, calculateColor(value), value);
        currentNodes.add(color);
        return color;
    }

    @Override
    public final Map<Double, Color> getFixedColors() {
        return Collections.unmodifiableMap(definedColorNodes);
    }

    @Override
    public final List<Color> getSparseColors() {
        return Collections.unmodifiableList(colorMapColors);
    }

    @Override
    public final Double lowValue() {
        return lowValue;
    }

    @Override
    public final Double highValue() {
        return highValue;
    }

    @Override
    public Color getNaNColor() {
        return NaNColor;
    }

    @Override
    public final void setNaNColor(final Color NaNColor) {
        if (!this.NaNColor.equals(NaNColor)) {
            this.NaNColor = NaNColor;
            recalculateNodes();
        }
    }

    @Override
    public Color getLowColor() {
        return lowColor;
    }

    @Override
    public final void setLowColor(final Color lowColor) {
        if (!this.lowColor.equals(lowColor)) {
            this.lowColor = lowColor;
            recalculateNodes();
        }
    }

    @Override
    public Color getHighColor() {
        return highColor;
    }

    @Override
    public final void setHighColor(final Color highColor) {
        if (!this.highColor.equals(highColor)) {
            this.highColor = highColor;
            recalculateNodes();
        }
    }

    /**
     * @return The maximum value before all Colors are represented by {@link AbstractColormap#highColor}.
     * {@code null} means no such ceiling exists.
     */
    protected Double getHighValue() {
        return highValue == null ? currentMaxValue : highValue;
    }

    @Override
    public final void setHighValue(final Double highValue) {
        if (this.highValue == null || !this.highValue.equals(highValue)) {
            this.highValue = highValue;
            currentColors.clear();
            recalculateNodes();
        }
    }

    /**
     * @return The minimum value before all Colors are represented by {@link AbstractColormap#lowColor}.
     * {@code null} means no such floor exists.
     */
    protected Double getLowValue() {
        return lowValue == null ? currentMinValue : lowValue;
    }

    @Override
    public final void setLowValue(final Double lowValue) {
        if (this.lowValue == null || !this.lowValue.equals(lowValue)) {
            this.lowValue = lowValue;
            currentColors.clear();
            recalculateNodes();
        }

    }

    /**
     * @return The color of a value if it is lower than {@link AbstractColormap#lowValue}
     */
    protected final Color lowColor() {
        return lowColor == null ? getColorAt(0d) : lowColor;
    }

    /**
     * @return The color of a value if it is higher than {@link AbstractColormap#highValue}
     */
    protected final Color highColor() {
        return highColor == null ? getColorAt(1d) : highColor;
    }

    /**
     * @return The color of a value if it is null
     */
    protected final Color NaNColor() {
        return NaNColor;
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
    public final String toString() {
        final NewColormap annotation = getClass().getDeclaredAnnotation(NewColormap.class);
        if (annotation != null) {
            return String.format("Colormap {%s.%s%s}", annotation.type(), annotation.name(), isReversed ? ".Reversed" : "");
        }
        return String.format("Colormap {%s}", getClass().getSimpleName());
    }

    /**
     * Recalculates the current highest value (not Colormap ceiling)
     */
    void recalculateMaxValue() {
        Double currentMaxValue = null;

        for (final ColormapNode node : currentNodes) {
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
    void recalculateMinValue() {
        Double currentMinValue = null;
        for (final ColormapNode node : currentNodes) {
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

    @Override
    public abstract Colormap clone();

    @Override
    public final boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractColormap)) return false;
        final AbstractColormap other = (AbstractColormap) o;
        return isReversed == other.isReversed &&
                Double.compare(other.currentMinValue, currentMinValue) == 0 &&
                Double.compare(other.currentMaxValue, currentMaxValue) == 0 &&
                Objects.equals(lowValue, other.lowValue) &&
                Objects.equals(highValue, other.highValue) &&
                Objects.equals(NaNColor, other.NaNColor) &&
                Objects.equals(lowColor, other.lowColor) &&
                Objects.equals(highColor, other.highColor) &&
                definedColorNodes.equals(other.definedColorNodes) &&
                colorMapColors.equals(other.colorMapColors);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(definedColorNodes, colorMapColors, currentMinValue, currentMaxValue, lowValue, highValue, NaNColor, lowColor, highColor, isReversed);
    }

}
