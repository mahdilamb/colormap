package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

/**
 * abstract class whereby colors are sampled based on the floor of their current position
 *
 * @author mahdi
 */
public class CategoricalColorMap extends ColorMap {

    public CategoricalColorMap(Double lowValue, Double highValue, final Color... colorNodes) {
        super(lowValue, highValue, colorNodes);
    }

    @Override
    public Color colorAt(Double value) {
        if (getColorNodes().containsKey(value)) {
            return getColorNodes().get(value).clone();
        } else {
            final double lowerVal = getColorNodes().floorKey(value);
            final Color lower = getColorNodes().get(lowerVal);
            return lower.clone();
        }
    }

    // modified so that last element repeats and used as last element rather than only upper bound
    @Override
    protected final void calculateColorNodes() {
        if (currentColorNodes.size() == 0) {
            currentColorNodes.putAll(definedColorNodes);
            for (int i = 0; i < colorNodes.size(); i++) {
                currentColorNodes.put(((double) i / (colorNodes.size())), colorNodes.get(i));
            }
        }
    }

}
