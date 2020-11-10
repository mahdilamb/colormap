package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.colormap.sequential.uniformsequential.Viridis;

import java.io.IOException;

/**
 * colormap that can be changed
 */
public final class DynamicColorMap extends ColorMap {
    volatile ColorMap currentColorMap;

    public DynamicColorMap(ColorMap colorMap, Float lowValue, Float highValue) {
        super(lowValue, highValue);
        currentColorMap = colorMap;
    }

    public DynamicColorMap(ColorMap colorMap) {
        this(colorMap, null, null);
    }

    public DynamicColorMap() {
        this(new Viridis());
    }

    public DynamicColorMap(String colorMapName) {
        this(getColorMap(colorMapName));
    }


    @Override
    public Color colorAt(Float value) {
        return currentColorMap.colorAt(value);
    }

    @Override
    Float getHighValue() {
        return currentColorMap.getHighValue();
    }

    @Override
    public void setHighValue(Float highValue) {
        currentColorMap.setHighValue(highValue);
    }

    @Override
    Float getLowValue() {
        return currentColorMap.getLowValue();
    }

    @Override
    public void setLowValue(Float lowValue) {
        currentColorMap.setLowValue(lowValue);
    }

    @Override
    Color getLowColor() {
        return currentColorMap.getLowColor();
    }

    @Override
    public void setLowColor(Color lowColor) {
        currentColorMap.setLowColor(lowColor);
    }

    @Override
    Color getHighColor() {
        return currentColorMap.getHighColor();
    }

    @Override
    public void setHighColor(Color highColor) {
        currentColorMap.setHighColor(highColor);
    }

    @Override
    public Color getNaNColor() {
        return currentColorMap.getNaNColor();
    }

    @Override
    public void setNaNColor(Color NaNColor) {
        currentColorMap.setNaNColor(NaNColor);
    }

    @Override
    Color calculateColor(Float value) {
        return currentColorMap.calculateColor(value);
    }

    @Override
    public boolean isReversed() {
        return currentColorMap.isReversed;
    }

    @Override
    public void setReversed(boolean isReversed) {
        currentColorMap.setReversed(isReversed);
    }

    @Override
    public ColorMapNode getColorFromValue(float value) {
        return currentColorMap.getColorFromValue(value);
    }

    @Override
    public void recalculateColors() {
        currentColorMap.recalculateColors();
    }

    public void setColorMap(ColorMap newColorMap) {
        newColorMap.currentMaxValue = currentColorMap.currentMaxValue;
        newColorMap.currentMinValue = currentColorMap.currentMinValue;
        newColorMap.highColor = currentColorMap.highColor;
        newColorMap.lowColor = currentColorMap.lowColor;
        newColorMap.highValue = currentColorMap.highValue;
        newColorMap.lowValue = currentColorMap.lowValue;
        newColorMap.NaNColor = currentColorMap.NaNColor;
        newColorMap.isReversed = currentColorMap.isReversed;
        newColorMap.colorValues.addAll(currentColorMap.colorValues);
        for (final ColorMapNode node : newColorMap.colorValues) {
            node.colorMap = newColorMap;
        }
        currentColorMap = newColorMap;
        recalculateColors();

    }

    @Override
    public DynamicColorMap clone() {

        final DynamicColorMap newColorMap = new DynamicColorMap();
        newColorMap.currentColorMap = this.currentColorMap.clone();
        return newColorMap;

    }
}
