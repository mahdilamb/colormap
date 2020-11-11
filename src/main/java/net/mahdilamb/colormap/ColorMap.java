package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Abstract color map
 *
 * @author mahdilamb
 */
public abstract class ColorMap {
    private final static Map<String, Class<ColorMap>> colorMaps = new HashMap<>();
    private final static TreeSet<String> defaultColorMaps = new TreeSet<>();

    protected final Map<Double, Color> definedColorNodes = new HashMap<>();
    protected final List<Color> colorNodes = new Vector<>();
    protected final NavigableMap<Double, Color> currentColorNodes = new TreeMap<>();
    protected final List<ColorMapNode> colorValues = new Vector<>();
    protected double currentMinValue = Double.MAX_VALUE;
    protected double currentMaxValue = Double.MIN_VALUE;
    protected Double lowValue;
    protected Double highValue;
    protected Color NaNColor = new Color(Color.black);
    protected Color lowColor = null;
    protected Color highColor = null;
    protected boolean isReversed = false;

    protected ColorMap(final Double lowValue, final Double highValue, final Color... colorNodes) {
        this.lowValue = lowValue;
        this.highValue = highValue;
        addColorNodes(colorNodes);
    }


    protected void recalculateColors() {
        for (final ColorMapNode node : colorValues) {
            node.recalculate();
        }
    }

    /**
     * add color node based on a specified position
     */
    public void addColorNode(final Double position, final Color color) {
        if (position == null) {
            addColorNode(color);
            return;
        }
        if (position < 0f || position > 1f) {
            throw new IllegalArgumentException("position must be in range 0>= position <= 1");
        }
        currentColorNodes.clear();
        definedColorNodes.put(position, color);
    }

    /**
     * add color node whose position is later calculated based on its order
     */
    public void addColorNode(final Color color) {
        currentColorNodes.clear();
        colorNodes.add(color);

    }

    public void addColorNodes(final Color... colorNodes) {
        currentColorNodes.clear();
        this.colorNodes.addAll(Arrays.asList(colorNodes));

    }

    /**
     * Calculate color nodes based on position (if undefined) and cache them
     */
    void calculateColorNodes() {
        if (currentColorNodes.size() == 0) {
            currentColorNodes.putAll(definedColorNodes);
            for (int i = 0; i < colorNodes.size(); i++) {
                currentColorNodes.put((double) i / (colorNodes.size() - 1), colorNodes.get(i));
            }
        }
    }

    /**
     * given a value between 0f and 1f return a color
     */
    public abstract Color colorAt(Double value);

    public Color getColorAt(final Double value) {
        return colorAt(isReversed ? (1 - value) : value);

    }

    Color calculateColor(final Double value) {
        final Color color;
        if (value == null || getLowValue() == null || getHighValue() == null) {
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
        colorValues.add(color);
        return color;
    }

    Double getHighValue() {
        return highValue == null ? currentMaxValue : highValue;
    }

    public void setHighValue(final Double highValue) {
        if (!this.highValue.equals(highValue)) {
            this.highValue = highValue;
            currentColorNodes.clear();
            recalculateColors();
        }
    }

    Double getLowValue() {
        return lowValue == null ? currentMinValue : lowValue;
    }

    public void setLowValue(final Double lowValue) {
        if (this.lowValue.equals(lowValue)) {
            return;
        }
        this.lowValue = lowValue;
        currentColorNodes.clear();
        recalculateColors();

    }

    Color getLowColor() {
        return lowColor == null ? getColorAt(0d) : lowColor;
    }

    public void setLowColor(final Color lowColor) {
        if (!this.lowColor.equals(lowColor)) {
            this.lowColor = lowColor;
            recalculateColors();
        }
    }

    Color getHighColor() {
        return highColor == null ? getColorAt(1d) : highColor;
    }

    public void setHighColor(final Color highColor) {
        if (!this.highColor.equals(highColor)) {
            this.highColor = highColor;
            recalculateColors();
        }
    }

    public Color getNaNColor() {
        return NaNColor.clone();
    }

    public void setNaNColor(final Color NaNColor) {
        if (!this.NaNColor.equals(NaNColor)) {
            this.NaNColor = NaNColor;
            recalculateColors();
        }
    }

    protected NavigableMap<Double, Color> getColorNodes() {
        calculateColorNodes();
        return currentColorNodes;
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

    protected void recalculateMaxValue() {
        Double currentMaxValue = null;

        for (final ColorMapNode node : colorValues) {
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

    protected void recalculateMinValue() {
        Double currentMinValue = null;
        for (final ColorMapNode node : colorValues) {
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
            final ColorMap out = (ColorMap) colormapClass.getConstructor(Double.class, Double.class).newInstance(null, null);
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
