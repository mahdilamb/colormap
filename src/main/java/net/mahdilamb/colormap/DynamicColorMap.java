package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;

/**
 * colormap that can be changed
 */
public final class DynamicColorMap extends ColorMap {
    private ColorMap currentColormap;

    public DynamicColorMap(ColorMap colorMap) {
        setColorMap(colorMap);
    }

    public void setColorMap(ColorMap newColorMap) {
        definedColorNodes.clear();
        definedColorNodes.putAll(newColorMap.definedColorNodes);

        colorMapColors.clear();
        colorMapColors.addAll(newColorMap.colorMapColors);

        currentColors.clear();
        currentColors.putAll(newColorMap.currentColors);

        lowValue = newColorMap.lowValue;
        highValue = newColorMap.highValue;

        NaNColor = newColorMap.NaNColor;
        lowColor = newColorMap.lowColor;
        highColor = newColorMap.highColor;

        isReversed = newColorMap.isReversed;

        currentColormap = newColorMap;
        recalculateColors();

    }

    @Override
    public Color colorAt(Double value) {
        return currentColormap.colorAt(value);
    }
}
