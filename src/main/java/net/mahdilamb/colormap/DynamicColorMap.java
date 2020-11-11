package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.colormap.sequential.perceptuallyuniform.Viridis;

/**
 * colormap that can be changed
 */
public final class DynamicColorMap extends ColorMap {
    private ColorMap currentColormap;

    public DynamicColorMap(ColorMap colorMap) {
        super(colorMap.lowValue, colorMap.highValue);
        setColorMap(colorMap);
    }

    public void setColorMap(ColorMap newColorMap) {
        definedColorNodes.clear();
        definedColorNodes.putAll(newColorMap.definedColorNodes);

        colorNodes.clear();
        colorNodes.addAll(newColorMap.colorNodes);

        currentColorNodes.clear();
        currentColorNodes.putAll(newColorMap.currentColorNodes);

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
