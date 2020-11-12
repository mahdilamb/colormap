package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import static net.mahdilamb.colormap.utils.ColorUtils.lerp;

public class LinearColorMap extends ColorMap {
    public LinearColorMap(final Color... colorNodes) {
        addColors(colorNodes);
    }

    @Override
    public Color colorAt(final Double value) {
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
}
