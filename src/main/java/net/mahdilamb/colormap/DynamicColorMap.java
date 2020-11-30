package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;

import java.util.Objects;

/**
 * Colormap that can be changed
 */
public final class DynamicColorMap extends ColorMapImpl {
    private ColorMapImpl currentColormap;

    /**
     * Construct a dynamic colormap
     *
     * @param colorMap The initial colormap. Should not be {@code null}
     */
    public DynamicColorMap(ColorMapImpl colorMap) {
        setColorMap(colorMap);
    }

    /**
     * Set the current colormap.
     *
     * @param newColorMap Thew new color map.
     */
    public void setColorMap(ColorMapImpl newColorMap) {
        Objects.requireNonNull(newColorMap);
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
        recalculateNodes();

    }

    @Override
    public Color colorAt(double value) {
        return currentColormap.colorAt(value);
    }

    @Override
    public DynamicColorMap clone() {
        return new DynamicColorMap(this);
    }
}
