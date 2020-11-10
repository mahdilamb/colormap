package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

import static net.mahdilamb.utils.ColorUtils.isValidHexadecimal;

/**
 * Abstract color map
 *
 * @author mahdilamb
 */
public abstract class ColorMap implements Cloneable {
    protected final static Map<String, Class<ColorMap>> colorMaps = new HashMap<>();
    protected final static TreeSet<String> defaultColorMaps = new TreeSet<>();

    protected final Map<Float, Color> definedColorNodes = new HashMap<>();
    protected final List<Color> colorNodes = new Vector<>();
    protected final NavigableMap<Float, Color> currentColorNodes = new TreeMap<>();
    protected final List<ColorMapNode> colorValues = new Vector<>();
    protected float currentMinValue = Float.MAX_VALUE;
    protected float currentMaxValue = Float.MIN_VALUE;
    protected Float lowValue;
    protected Float highValue;
    protected Color NaNColor = new Color(Color.black);
    protected Color lowColor = null;
    protected Color highColor = null;
    protected boolean isReversed = false;

    public ColorMap(Float lowValue, Float highValue) {
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    protected void recalculateColors() {
        for (final ColorMapNode node : colorValues) {
            node.recalculate();
        }
    }

    /**
     * add color node based on a specified position
     */
    public void addColorNode(final Float position, final Color color) {
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

    public void addColorNode(final float r, final float g, final float b) {
        addColorNode(new Color(r, g, b));

    }

    public void addColorNode(final int r, final int g, final int b) {
        addColorNode(new Color(r, g, b));

    }

    public void addColorNode(final Float position, final String hex) {
        addColorNode(position, new Color(hex));
    }

    public void addColorNode(final String string) {
        if (isValidHexadecimal(string)) {
            addColorNode(new Color(string));
        } else {
            addColorNode(Color.getColor(string));
        }

    }

    /**
     * Calculate color nodes based on position (if undefined) and cache them
     */
    void calculateColorNodes() {
        if (currentColorNodes.size() == 0) {
            currentColorNodes.putAll(definedColorNodes);
            for (int i = 0; i < colorNodes.size(); i++) {
                currentColorNodes.put((float) i / (colorNodes.size() - 1), colorNodes.get(i));
            }
        }
    }

    /**
     * given a value between 0f and 1f return a color
     */
    public abstract Color colorAt(Float value);

    public Color getColorAt(final Float value) {
        return colorAt(isReversed ? (1 - value) : value);

    }

    Color calculateColor(final Float value) {
        final Color color;
        if (value == null || getLowValue() == null || getHighValue() == null) {
            color = getNaNColor().clone();
        } else {
            if (value < getLowValue()) {
                color = getLowColor().clone();
            } else if (value > getHighValue()) {
                color = getHighColor().clone();
            } else {
                if (getHighValue() - getLowValue() == 0f) {
                    color = getColorAt(.5f);
                } else {
                    color = getColorAt((value - getLowValue()) / (getHighValue() - getLowValue()));
                }
            }
        }
        return color;
    }

    public ColorMapNode getColorFromValue(final float value) {
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

    Float getHighValue() {
        return highValue == null ? currentMaxValue : highValue;
    }

    public void setHighValue(final Float highValue) {
        if (!this.highValue.equals(highValue)) {
            this.highValue = highValue;
            currentColorNodes.clear();
            recalculateColors();
        }
    }

    Float getLowValue() {
        return lowValue == null ? currentMinValue : lowValue;
    }

    public void setLowValue(final Float lowValue) {
        if (this.lowValue.equals(lowValue)) {
            return;
        }
        this.lowValue = lowValue;
        currentColorNodes.clear();
        recalculateColors();

    }

    Color getLowColor() {
        return lowColor == null ? getColorAt(0f) : lowColor;
    }

    public void setLowColor(final Color lowColor) {
        if (!this.lowColor.equals(lowColor)) {
            this.lowColor = lowColor;
            recalculateColors();
        }
    }

    Color getHighColor() {
        return highColor == null ? getColorAt(1f) : highColor;
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

    protected NavigableMap<Float, Color> getColorNodes() {
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

    @Override
    public abstract ColorMap clone();


    protected void recalculateMaxValue() {
        Float currentMaxValue = null;

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
        Float currentMinValue = null;
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
        if (cmparts.length == 2) {
            if (cmparts[1].compareTo("reversed") == 0) {
                return getColorMap(null, cmparts[0].toLowerCase(), true);
            } else {
                return getColorMap(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), false);
            }

        } else if (cmparts.length == 3) {
            return getColorMap(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), cmparts[2].compareTo("reversed") == 0);
        } else if (cmparts.length == 1) {
            return getColorMap(null, cmparts[0].toLowerCase(), false);
        } else {
            throw new IllegalArgumentException("argument should be in the form A.B.[C]. Where A is the category such as sequential, qualitative, diverging. "
                    + "B is the name of the color map. And C is \"reversed\" if the color maps should be reversed.  ");
        }
    }

    private static void cacheDefaultColorMaps() throws IOException, ClassNotFoundException {
        if (defaultColorMaps.size() == 0) {
            final File packageName = new File(ColorMap.class.getPackage().getName().replace(".", File.separator));
            final Enumeration<URL> resources = ColorMap.class.getClassLoader().getResources(String.valueOf(packageName));
            final Stack<File> directories = new Stack<>();
            resources.asIterator().forEachRemaining(resource -> {
                try {
                    final File dir = new File(resource.toURI());
                    if (dir.isDirectory()) {
                        directories.push(dir);
                    } else {
                        addColorMapClass(packageName, dir);
                    }
                } catch (URISyntaxException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            });
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
        final Class<?> colorMap = Class.forName(file.toString().substring(file.toString().indexOf(packageName.toString())).replace(File.separator, ".").replace(".class", ""));
        final NewColorMap annotation = colorMap.getDeclaredAnnotation(NewColorMap.class);
        if(annotation == null){
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
