package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Abstract color map
 *
 * @author mahdilamb
 */
public abstract class ColorMap {
    public static final class ColorMapNode {
        final Color color;
        final ColorMap colorMap;
        Double value;

        private ColorMapNode(final ColorMap colorMap, final Color color, final Double value) {
            this.colorMap = colorMap;
            this.value = value;
            this.color = color;
        }

        private void recalculate() {
            final Color newColor = colorMap.calculateColor(value);
            color.setColor(newColor);
        }

        public void setValue(final Double value) {
            if (value.equals(this.value)) {
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

        public void remove() {
            colorMap.currentNodes.remove(this);
            if (colorMap.currentMinValue <= value) {
                colorMap.recalculateMinValue();
            }
            if (colorMap.currentMaxValue >= value) {
                colorMap.recalculateMaxValue();
            }
        }

        public final Color getColor() {
            return color;
        }

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

    protected final Map<Double, Color> definedColorNodes = new HashMap<>();
    protected final List<Color> colorMapColors = new Vector<>();
    protected final NavigableMap<Double, Color> currentColors = new TreeMap<>();
    protected final List<ColorMapNode> currentNodes = new Vector<>();
    protected double currentMinValue = Double.MAX_VALUE;
    protected double currentMaxValue = Double.MIN_VALUE;
    protected Double lowValue = null;
    protected Double highValue = null;
    protected Color NaNColor = new Color(Color.black);
    protected Color lowColor = null;
    protected Color highColor = null;
    protected boolean isReversed = false;

    /**
     * Add color node based on a specified position
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
     */
    public void addColor(final Color color) {
        currentColors.clear();
        colorMapColors.add(color);

    }

    public void addColors(final Color... colorNodes) {
        currentColors.clear();
        this.colorMapColors.addAll(Arrays.stream(colorNodes).filter(Objects::nonNull).collect(Collectors.toList()));

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

    protected final void recalculateColors() {
        for (final ColorMapNode node : currentNodes) {
            node.recalculate();
        }
    }

    /**
     * given a value between 0f and 1f return a color
     */
    public abstract Color colorAt(Double value);

    public Color getColorAt(final Double value) {
        return colorAt(isReversed ? (1 - value) : value);
    }

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

    public ColorMapNode getColorFromValue(final double value) {
        if (value < currentMinValue || value > currentMaxValue) {
            if (value < currentMinValue) {
                currentMinValue = value;
            }
            if (value > currentMaxValue) {
                currentMaxValue = value;
            }
            recalculateColors();
        }

        final ColorMapNode color = new ColorMapNode(this, calculateColor(value), value);
        currentNodes.add(color);
        return color;
    }

    private Double getHighValue() {
        return highValue == null ? currentMaxValue : highValue;
    }

    public void setHighValue(final Double highValue) {
        if (this.highValue == null || !this.highValue.equals(highValue)) {
            this.highValue = highValue;
            currentColors.clear();
            recalculateColors();
        }
    }

    private Double getLowValue() {
        return lowValue == null ? currentMinValue : lowValue;
    }

    public void setLowValue(final Double lowValue) {
        if (this.lowValue == null || !this.lowValue.equals(lowValue)) {
            this.lowValue = lowValue;
            currentColors.clear();
            recalculateColors();
        }

    }

    private Color getLowColor() {
        return lowColor == null ? getColorAt(0d) : lowColor;
    }

    public void setLowColor(final Color lowColor) {
        if (!this.lowColor.equals(lowColor)) {
            this.lowColor = lowColor;
            recalculateColors();
        }
    }

    private Color getHighColor() {
        return highColor == null ? getColorAt(1d) : highColor;
    }

    public void setHighColor(final Color highColor) {
        if (!this.highColor.equals(highColor)) {
            this.highColor = highColor;
            recalculateColors();
        }
    }

    private Color getNaNColor() {
        return NaNColor;
    }

    public void setNaNColor(final Color NaNColor) {
        if (!this.NaNColor.equals(NaNColor)) {
            this.NaNColor = NaNColor;
            recalculateColors();
        }
    }

    protected final NavigableMap<Double, Color> getColorNodes() {
        calculateColors();
        return currentColors;
    }

    public boolean isReversed() {
        return isReversed;
    }

    public void setReversed(final boolean isReversed) {
        if (this.isReversed != isReversed) {
            this.isReversed = isReversed;
            recalculateColors();
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
            recalculateColors();
        }
    }

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
            recalculateColors();
        }
    }


    public static void registerColorMap(final String colorMapName, final Class<ColorMap> colorMapClass) {
        colorMaps.put(colorMapName, colorMapClass);
    }

    /**
     * convenience method to get colormap through java reflection
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

    public static Set<String> listDefaultColorMaps() throws IOException, ClassNotFoundException {
        cacheDefaultColorMaps();

        return defaultColorMaps;
    }

}
