package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

/**
 * A colormap whereby colors are sampled based on the floor of their current position
 *
 * @author mahdi
 */
public class CategoricalColorMap extends ColorMap {
    /**
     * Construct a categorical color map with the provided colors
     *
     * @param colors A list of the colors to initialize the color map with.
     */
    public CategoricalColorMap(final Color... colors) {
        addColors(colors);
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
    protected final void calculateColors() {
        if (currentColors.size() == 0) {
            currentColors.putAll(definedColorNodes);
            for (int i = 0; i < colorMapColors.size(); i++) {
                currentColors.put(((double) i / (colorMapColors.size())), colorMapColors.get(i));
            }
        }
    }

}
