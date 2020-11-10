package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

/**
 * abstract class whereby colors are sampled based on the floor of their current position
 *
 * @author mahdi
 */
public class CategoricalColorMap extends ColorMap {

    public CategoricalColorMap(Float lowValue, Float highValue) {
        super(lowValue, highValue);
    }

    @Override
    public Color colorAt(Float value) {
        if (getColorNodes().containsKey(value)) {
            return getColorNodes().get(value).clone();
        } else {
            final float lowerVal = getColorNodes().floorKey(value);
            final Color lower = getColorNodes().get(lowerVal);
            return lower.clone();
        }
    }

    // modified so that last element repeats and used as last element rather than only upper bound
    @Override
    void calculateColorNodes() {
        if (currentColorNodes.size() == 0) {
            currentColorNodes.putAll(definedColorNodes);
            for (int i = 0; i < colorNodes.size(); i++) {
                currentColorNodes.put(((float) i / (colorNodes.size())), colorNodes.get(i));
            }
        }
    }

    @Override
    public CategoricalColorMap clone() {

        final CategoricalColorMap newColorMap = new CategoricalColorMap(lowValue, highValue);
        newColorMap.currentMaxValue = this.currentMaxValue;
        newColorMap.currentMinValue = this.currentMinValue;
        newColorMap.highColor = this.highColor;
        newColorMap.lowColor = this.lowColor;

        newColorMap.NaNColor = this.NaNColor;
        newColorMap.isReversed = this.isReversed;
        newColorMap.definedColorNodes.putAll(this.definedColorNodes);
        newColorMap.colorNodes.addAll(this.colorNodes);
        newColorMap.recalculateColors();
        return newColorMap;

    }


}
