package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.utils.ColorUtils;

public class LinearColorMap extends ColorMap {
    public LinearColorMap(final Double lowValue, final Double highValue, final Color... colorNodes) {
        super(lowValue, highValue, colorNodes);
    }

    /**
     * return val clamped between min and max
     *
     * @param val
     * @param max
     * @param min
     * @return
     */
    static <T extends Number & Comparable<T>> T clamp(final T val, final T max, final T min) {
        return val.compareTo(max) > 0 ? max : val.compareTo(min) < 0 ? min : val;


    }

    /**
     * linear interpolation
     *
     * @param a   left value
     * @param b   right value
     * @param amt amount of interpolation between 0 and 1;
     * @return
     */
    static double lerp(final double a, final double b, double amt) {
        amt = clamp(amt, 1d, 0d);
        return a * amt + b * (1 - amt);
    }

    /**
     * linearly interpolate between colors in L*ab space
     *
     * @param lower
     * @param upper
     * @param amount
     * @return
     */
    static Color lerp(final Color lower, final Color upper, final double amount) {
        final float[] lowerLab = lower.asLab();
        final float[] upperLab = upper.asLab();
        final float[] newLab = new float[3];
        for (int i = 0; i < 3; i++) {
            newLab[i] = (float) lerp(lowerLab[i], upperLab[i], amount);
        }
        final int[] rgb = ColorUtils.LabToRGB(newLab);
        return new Color(rgb[0], rgb[1], rgb[2]);
    }

    @Override
    public Color colorAt(final Double value) {
        if (getColorNodes().containsKey(value)) {
            return getColorNodes().get(value).clone();
        } else {
            final double lowerVal = getColorNodes().floorKey(value);
            final double upperVal = getColorNodes().ceilingKey(value);

            final Color lower = currentColorNodes.get(lowerVal);
            final Color upper = currentColorNodes.get(upperVal);

            final Color outColor = lerp(upper, lower, (value - lowerVal) / (upperVal - lowerVal));
            outColor.setAlpha((float) lerp(upper.getAlpha() / 255f, lower.getAlpha() / 255f, value));
            return outColor;

        }

    }


}
