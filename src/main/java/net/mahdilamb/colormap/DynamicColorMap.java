package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.colormap.sequential.uniformsequential.Viridis;

/**
 * colormap that can be changed
 */
public final class DynamicColorMap extends ColorMap {
    volatile ColorMap currentColorMap;

    public DynamicColorMap(ColorMap colorMap, Double lowValue, Double highValue) {
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
    public Color colorAt(Double value) {
        return currentColorMap.colorAt(value);
    }

    @Override
    Double getHighValue() {
        return currentColorMap.getHighValue();
    }

    @Override
    public void setHighValue(Double highValue) {
        currentColorMap.setHighValue(highValue);
    }

    @Override
    Double getLowValue() {
        return currentColorMap.getLowValue();
    }

    @Override
    public void setLowValue(Double lowValue) {
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
    Color calculateColor(Double value) {
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
    public ColorMapNode getColorFromValue(double value) {
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


}
