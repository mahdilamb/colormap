package net.mahdilamb.colormap.api;

import java.util.*;

/**
 * Default implementation of a colormap that samples values between 0 and 1.
 */
final class ColormapImpl implements Colormap {
    /**
     * Color sampler functional interface
     */
    @FunctionalInterface
    interface ColorSampler {
        /**
         * Calculate the color based on the amount between a floor color and a ceiling
         * color
         *
         * @param floorColor the floor color
         * @param ceilColor  the ceiling color
         * @param amount     the amount to sample between the two
         * @return a sampled color
         */
        RGBA sample(RGBA floorColor, RGBA ceilColor, float amount);
    }

    /**
     * Value sampler function interface
     */
    @FunctionalInterface
    interface ValueSampler {
        /**
         * Calculate a position based on the requested
         *
         * @param requested the requested value
         * @return a similar position, probably rounded to relevant precision
         */
        float sample(float requested);
    }

    private final ColorSampler cSampler;
    private final ValueSampler vSampler;
    private final NavigableMap<Float, RGBA> colors;
    private final RGBA NaNColor;
    private final RGBA lowColor;
    private final RGBA highColor;
    private final Collection<Float> originalKeys;
    private final String colormapLabel;

    /**
     * Default implementation of a colormap as used by {@link ColormapBuilder}
     *
     * @param vSampler  the value sampler
     * @param cSampler  the color sampler
     * @param colors    the position-to-color mapper
     * @param NaNColor  the color to use if the value is NaN
     * @param lowColor  the color to use if the value is below 0
     * @param highColor the color to use if the value is greater than 0
     */
    ColormapImpl(ValueSampler vSampler, ColorSampler cSampler, NavigableMap<Float, RGBA> colors, RGBA NaNColor, RGBA lowColor, RGBA highColor) {
        this.colors = Objects.requireNonNull(colors);
        this.NaNColor = Objects.requireNonNull(NaNColor);
        this.lowColor = Objects.requireNonNull(lowColor);
        this.highColor = Objects.requireNonNull(highColor);
        this.vSampler = Objects.requireNonNull(vSampler);
        this.cSampler = Objects.requireNonNull(cSampler);
        originalKeys = new ArrayList<>(colors.keySet());
        colormapLabel = colors.toString();
    }

    @Override
    public final RGBA get(Float position) {
        if (position == null || !Float.isFinite(position)) {
            return NaNColor;
        }
        if (position <= 0) {
            return lowColor;
        } else if (position >= 1) {
            return highColor;
        } else {
            if (colors.size() <= 1) {
                return colors.firstEntry().getValue();
            } else {
                final float pos = vSampler.sample(position);
                final Map.Entry<Float, RGBA> lowKey = colors.floorEntry(pos);
                if (lowKey.getKey().compareTo(pos) == 0) {
                    return lowKey.getValue();
                }
                final Map.Entry<Float, RGBA> highKey = colors.higherEntry(lowKey.getKey());
                if (highKey.getKey().compareTo(pos) == 0) {
                    return highKey.getValue();
                }
                final RGBA color = cSampler.sample(lowKey.getValue(), highKey.getValue(), (pos - lowKey.getKey()) / (highKey.getKey() - lowKey.getKey()));
                colors.put(pos, color);
                return color;
            }
        }
    }

    @Override
    public RGBA getNaNColor() {
        return NaNColor;
    }

    @Override
    public RGBA getLowColor() {
        return lowColor;
    }

    @Override
    public RGBA getHighColor() {
        return highColor;
    }

    @Override
    public Collection<Float> getDefinedPositions() {
        return Collections.unmodifiableCollection(originalKeys);
    }

    @Override
    public final String toString() {
        return String.format("Colormap %s", colormapLabel);
    }

}
