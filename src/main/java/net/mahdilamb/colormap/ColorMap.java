package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Abstract color map that allows or the definition of a color map that is evenly spaced, or spaced at defined locations apart.
 *
 * @author mahdilamb
 */
public abstract class ColorMap {
    /**
     * A node that belongs to ColorMap, primarily defined by its value
     */
    public static final class ColorMapNode {
        private final Color color;
        private final ColorMap colorMap;
        private Double value;

        private ColorMapNode(final ColorMap colorMap, final Color color, final Double value) {
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

    private final static Map<String, Class<ColorMap>> colorMaps = new HashMap<>();
    private final static NavigableSet<String> defaultColorMaps = new TreeSet<>();
    /**
     * Map of colors with their respective positions.
     */
    protected final Map<Double, Color> definedColorNodes = new HashMap<>();
    /**
     * List of colors with undefined positions.
     */
    protected final List<Color> colorMapColors = new Vector<>();
    /**
     * The cache of colors associated with this color map whose positions have been calculated from {@link net.mahdilamb.colormap.ColorMap#colorMapColors}
     */
    protected final NavigableMap<Double, Color> currentColors = new TreeMap<>();
    /**
     * The current list of nodes associated with this color map
     */
    protected final List<ColorMapNode> currentNodes = new Vector<>();
    /**
     * Current minimum value
     */
    protected double currentMinValue = Double.MAX_VALUE;
    /**
     * Current maximum value
     */
    protected double currentMaxValue = Double.MIN_VALUE;
    /**
     * Lowest range of the color map
     */
    protected Double lowValue = null;
    /**
     * Highest range of the color map.
     */
    protected Double highValue = null;
    /**
     * Color for {@code null} values
     */
    protected Color NaNColor = new Color(Color.black);
    /**
     * Color for values lower than or equal to {@link net.mahdilamb.colormap.ColorMap#lowValue}
     */
    protected Color lowColor = null;
    /**
     * Color for values higher than or equal to {@link net.mahdilamb.colormap.ColorMap#highValue}
     */
    protected Color highColor = null;
    /**
     * whether the color map is reversed
     */
    protected boolean isReversed = false;

    /**
     * Add color node based on a specified position
     *
     * @param position The position (0.0-1.0) to place this Color
     * @param color    Color to add to color map
     */
    public void addColor(final Double position, final Color color) {
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
    public void addColor(final Color color) {
        currentColors.clear();
        colorMapColors.add(color);

    }

    /**
     * Add colors to color map that are are calculated based on order.
     *
     * @param colors Colors to add to the color map.
     */
    public void addColors(final Color... colors) {
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
     * Get the Color at a specified value. Does not add the value to the color map. Considers whether the color map is
     * reversed or not.
     *
     * @param value Value to get the associated Color from
     * @return The associated Color
     */
    protected Color getColorAt(final Double value) {
        return colorAt(isReversed ? (1 - value) : value);
    }

    /**
     * Calculate the Color of a value considering the bounds of the Colormap.
     *
     * @param value Value from which to calculate a color
     * @return The calculated color
     */
    protected final Color calculateColor(final Double value) {
        final Color color;
        if (value == null) {
            color = getNaNColor().clone();
        } else {
            if (value < getLowValue()) {
                color = getLowColor().clone();
            } else if (value > getHighValue()) {
                color = getHighColor().clone();
            } else {
                if (getHighValue() - getLowValue() == 0) {
                    color = getColorAt(.5);
                } else {
                    color = getColorAt((value - getLowValue()) / (getHighValue() - getLowValue()));
                }
            }
        }
        return color;
    }

    /**
     * Get the Color at a specified value. Does not add the value to the color map. Primary way to show a graphical representation of this color map.
     *
     * @param value Value to get the associated Color from
     * @return The associated Color
     */
    public abstract Color colorAt(Double value);

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
     * @return The maximum value before all Colors are represented by {@link ColorMap#highColor}.
     * {@code null} means no such ceiling exists.
     */
    public Double getHighValue() {
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
     * @return The minimum value before all Colors are represented by {@link ColorMap#lowColor}.
     * {@code null} means no such floor exists.
     */
    public Double getLowValue() {
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

    private Color getLowColor() {
        return lowColor == null ? getColorAt(0d) : lowColor;
    }

    /**
     * Set the color to use if the value in a color map is lower than {@link ColorMap#getLowValue()}.
     * To disable this floor set {@link ColorMap#getLowValue()} to {@code null}.
     *
     * @param lowColor The Color to provide if a value is lower than {@link ColorMap#getLowValue()}
     */
    protected final void setLowColor(final Color lowColor) {
        if (!this.lowColor.equals(lowColor)) {
            this.lowColor = lowColor;
            recalculateNodes();
        }
    }

    private Color getHighColor() {
        return highColor == null ? getColorAt(1d) : highColor;
    }

    /**
     * Set the color to use if the value in a color map is greater than {@link ColorMap#getHighValue()}.
     * To disable this ceiling set {@link ColorMap#getHighValue()} to {@code null}.
     *
     * @param highColor The Color to provide if a value is higher than {@link ColorMap#getHighValue()}
     */
    protected final void setHighColor(final Color highColor) {
        if (!this.highColor.equals(highColor)) {
            this.highColor = highColor;
            recalculateNodes();
        }
    }

    private Color getNaNColor() {
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
    protected final NavigableMap<Double, Color> getColorNodes() {
        calculateColors();
        return currentColors;
    }

    /**
     * @return If the order of this color map is reversed
     */
    public final boolean isReversed() {
        return isReversed;
    }

    /**
     * Set the color map as reversed
     *
     * @param isReversed Whether to reverse or not.
     */
    public final void setReversed(final boolean isReversed) {
        if (this.isReversed != isReversed) {
            this.isReversed = isReversed;
            recalculateNodes();
        }

    }

    @Override
    public String toString() {
        final NewColorMap annotation = getClass().getDeclaredAnnotation(NewColorMap.class);
        if (annotation == null) {
            return super.toString();
        } else {
            return String.format("%s.%s%s", annotation.type(), annotation.name(), isReversed ? ".Reversed" : "");
        }
    }

    /**
     * Recalculates the current highest value (not Colormap ceiling)
     */
    protected final void recalculateMaxValue() {
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
    protected final void recalculateMinValue() {
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

    /**
     * Register a color map so that it can be found by {@link ColorMap#getColorMap(String)}
     *
     * @param colorMapName  The name used to later find this color map
     * @param colorMapClass The class of the color map.
     */
    public static void registerColorMap(final String colorMapName, final Class<ColorMap> colorMapClass) {
        if (Arrays.stream(colorMapClass.getConstructors()).allMatch(c -> c.getParameterCount() != 0)) {
            throw new UnsupportedOperationException("Registered colormaps must contain a no args constructor");
        }
        colorMaps.put(colorMapName, colorMapClass);
    }


    /**
     * Convenience method to get colormap through java reflection
     *
     * @param colormapType The colormap type (e.g. qualitative, sequential, diverging, cyclic)
     * @param colormapName The name of the colormap (e.g. Viridis)
     * @param isReversed   Whether the colormap should be reversed
     * @return An instance of the requested colormap, or {@code null} if it cannot be found.
     */
    public static ColorMap getColorMap(final String colormapType, final String colormapName, final boolean isReversed) {
        final Class<?> colormapClass;
        final String requestedClass = String.format("%s.%s", colormapType == null ? "*" : colormapType.toLowerCase(), colormapName.toLowerCase());
        if (colorMaps.containsKey(requestedClass)) {
            assert colormapType != null;
            colormapClass = colorMaps.get(String.format("%s.%s", colormapType.toLowerCase(), colormapName.toLowerCase()));
        } else {
            try {
                cacheDefaultColorMaps();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                System.exit(-1);
            }
            colormapClass = colorMaps.get(requestedClass);

        }

        try {
            final ColorMap out = (ColorMap) colormapClass.getConstructor().newInstance();
            out.setReversed(isReversed);
            return out;
        } catch (final InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Get a colormap using a string representation of the colormap in the form:
     * A.B[.C] Where A is the category such as sequential, qualitative, diverging.
     * B is the name of the color map, and C (optional) is reversed if the color maps should be reversed.
     * All parts are case-insensitive.
     *
     * @param colormap A string representation of a colormap (e.g. "sequential.viridis.reversed", note sequential can be omitted).
     * @return An instance of the requested colormap or {@code null} if it cannot be found.
     */
    public static ColorMap getColorMap(final String colormap) {
        final String[] cmparts = colormap.split("\\.");
        switch (cmparts.length) {
            case 2:
                if (cmparts[1].compareTo("reversed") == 0) {
                    return getColorMap(null, cmparts[0].toLowerCase(), true);
                } else {
                    return getColorMap(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), false);
                }
            case 3:
                return getColorMap(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), cmparts[2].compareTo("reversed") == 0);
            case 1:
                return getColorMap(null, cmparts[0].toLowerCase(), false);
            default:
                throw new IllegalArgumentException("argument should be in the form A.B.[C]. Where A is the category such as sequential, qualitative, diverging. "
                        + "B is the name of the color map. And C is \"reversed\" if the color maps should be reversed.  ");
        }
    }

    private static void cacheDefaultColorMaps() throws IOException, ClassNotFoundException {
        if (defaultColorMaps.size() == 0) {
            final File packageName = new File(ColorMap.class.getPackage().getName().replace(".", File.separator));
            final Enumeration<URL> resources = ColorMap.class.getClassLoader().getResources(String.valueOf(packageName));
            final Stack<File> directories = new Stack<>();
            while (resources.hasMoreElements()) {
                try {
                    final File dir = new File(resources.nextElement().toURI());
                    if (dir.isDirectory()) {
                        directories.push(dir);
                    } else {
                        addColorMapClass(packageName, dir);
                    }
                } catch (URISyntaxException | ClassNotFoundException e) {
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
                    if (file.isDirectory()) {
                        directories.push(file);
                    } else {
                        addColorMapClass(packageName, file);
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static void addColorMapClass(final File packageName, final File file) throws ClassNotFoundException {
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
            registerColorMap(withWildCard, (Class<ColorMap>) colorMap);
            registerColorMap(withoutWildCard, (Class<ColorMap>) colorMap);
        }

    }

    /**
     * Get a String list of all the default colormaps.
     *
     * @return A list (set) of the Strings representing the default colormaps.
     */
    public static Set<String> listDefaultColorMaps() {
        try {
            cacheDefaultColorMaps();
        } catch (Exception e) {
            System.out.println("Could not load default colormaps.");
            e.printStackTrace();
            System.exit(-1);
        }
        return defaultColorMaps;
    }

}
