package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.utils.ColorUtils;

import java.util.NavigableSet;

public class LinearColorMap extends ColorMap {
    public LinearColorMap(Float lowValue, Float highValue) {
        super(lowValue, highValue);
    }

    /**
     * return val clamped between min and max
     *
     * @param val
     * @param max
     * @param min
     * @return
     */
    static float clamp(final float val, final float max, final float min) {
        return val > max ? max : Math.max(val, min);
    }

    /**
     * linear interpolation
     *
     * @param a   left value
     * @param b   right value
     * @param amt amount of interpolation between 0 and 1;
     * @return
     */
    static float lerp(final float a, final float b, float amt) {
        amt = clamp(amt, 1F, 0F);
        return a * amt + b * (1F - amt);
    }

    /**
     * linearly interpolate between colors in L*ab space
     *
     * @param lower
     * @param upper
     * @param amount
     * @return
     */
    static Color lerp(final Color lower, final Color upper, final float amount) {
        final float[] lowerLab = lower.asLab();
        final float[] upperLab = upper.asLab();
        final float[] newLab = new float[3];
        for (int i = 0; i < 3; i++) {
            newLab[i] = lerp(lowerLab[i], upperLab[i], amount);
        }
        final int[] rgb = ColorUtils.LabToRGB(newLab);
        return new Color(rgb[0], rgb[1], rgb[2]);
    }

    @Override
    public Color colorAt(final Float value) {
        if (getColorNodes().containsKey(value)) {
            return getColorNodes().get(value).clone();
        } else {
            final float lowerVal = getColorNodes().floorKey(value);
            final float upperVal = getColorNodes().ceilingKey(value);

            final Color lower = currentColorNodes.get(lowerVal);
            final Color upper = currentColorNodes.get(upperVal);

            final Color outColor = lerp(upper, lower, (value - lowerVal) / (upperVal - lowerVal));
            outColor.setAlpha(lerp(upper.getAlpha() / 255f, lower.getAlpha() / 255f, value));
            return outColor;

        }

    }

    @Override
    public LinearColorMap clone() {
        final LinearColorMap newColorMap = new LinearColorMap(lowValue, highValue);
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
