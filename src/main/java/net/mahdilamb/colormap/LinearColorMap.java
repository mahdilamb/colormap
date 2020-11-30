package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import static net.mahdilamb.colormap.utils.ColorUtils.lerp;

/**
 * A colormap which linearly interpolates between colors in L*ab space.
 */
public class LinearColorMap extends ColorMapImpl {
    /**
     * Create a linear color map with the provided colors
     *
     * @param colors The colors to generate a linear color map with.
     */
    public LinearColorMap(final Color... colors) {
        addColors(colors);
    }

    /**
     * Copy/converter constructor
     *
     * @param other the colormap to copy/convert from
     */
    public LinearColorMap(final ColorMapImpl other) {
        super(other);
    }

    @Override
    public Color colorAt(final double value) {
        if (getColorNodes().containsKey(value)) {
            return getColorNodes().get(value).clone();
        } else {
            final double lowerVal = getColorNodes().floorKey(value);
            final double upperVal = getColorNodes().ceilingKey(value);

            final Color lower = currentColors.get(lowerVal);
            final Color upper = currentColors.get(upperVal);

            final Color outColor = lerp(upper, lower, (value - lowerVal) / (upperVal - lowerVal));
            outColor.setAlpha((float) lerp(upper.getAlpha() / 255f, lower.getAlpha() / 255f, value));
            return outColor;

        }
    }

    @Override
    public LinearColorMap clone() {
        return new LinearColorMap(this);
    }
}
