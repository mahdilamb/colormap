package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import static net.mahdilamb.colormap.color.ColorUtils.lerp;

/**
 * A colormap which linearly interpolates between colors in L*ab space.
 */
public class LinearColormap extends AbstractColormap {
    /**
     * Create a linear color map with the provided colors
     *
     * @param colors The colors to generate a linear color map with.
     */
    public LinearColormap(final Color... colors) {
        addColors(colors);
    }

    /**
     * Copy/converter constructor
     *
     * @param other the colormap to copy/convert from
     */
    public LinearColormap(final Colormap other) {
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
            outColor.alpha((float) lerp(upper.alpha(), lower.alpha(), value));
            return outColor;

        }
    }

    @Override
    public LinearColormap clone() {
        return new LinearColormap(this);
    }
}
