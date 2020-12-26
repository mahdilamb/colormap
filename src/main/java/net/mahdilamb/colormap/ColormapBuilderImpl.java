package net.mahdilamb.colormap;

import java.util.*;

/**
 * Abstract Colormap builder. To be used to create custom colormaps
 *
 * @param <B> the type of the builder
 */
abstract class ColormapBuilderImpl<B extends ColormapBuilder<B, Colormap>> implements ColormapBuilder<B, Colormap> {
    /**
     * Create a Qualitative colormap builder
     */
    static final class QualitativeColormapBuilderImpl extends ColormapBuilderImpl<Qualitative>implements Qualitative {

        QualitativeColormapBuilderImpl() {
            setSampler(requested -> requested, (floorColor, ceilColor, amount) -> floorColor);
        }

        @Override
        protected final void prepare() {
            for (int i = 0; i < sparseColors.size(); i++) {
                colors.put((float) i / (sparseColors.size()), sparseColors.get(i));
            }
        }
    }

    /**
     * Create a Sequential colormap builder
     */
    static final class SequentialColormapBuilderImpl extends ColormapBuilderImpl<Sequential> implements Sequential {

        private float precision = Float.POSITIVE_INFINITY;

        SequentialColormapBuilderImpl() {
        }

        /**
         * Set the sampling precision of the colormap (defaults to infinite)
         *
         * @param precision the precision to be used by the built colormap
         * @return the builder
         */
        @Override
        public final Sequential setPrecision(final float precision) {
            this.precision = precision;
            return this;
        }

        @Override
        protected final void prepare() {
            for (int i = 0; i < sparseColors.size(); i++) {
                colors.put((float) i / (sparseColors.size() - 1), sparseColors.get(i));
            }
            setSampler(requested -> Float.isFinite(precision) ? ((float) Math.floor((requested + precision / 2) / precision) * precision) : requested, RGBA::lerp);
        }
    }

    /**
     * The final position to color map
     */
    protected final NavigableMap<Float, RGBA> colors = new TreeMap<>();
    /**
     * The colors that are being added without positions, whose positions need to be calculated by {@link #prepare()}.
     */
    protected final List<RGBA> sparseColors = new ArrayList<>();
    private RGBA NaNColor = Color.BLACK;
    private RGBA lowColor;
    private RGBA highColor;
    private boolean isBuilt = false;
    private ColormapImpl.ColorSampler cSampler;
    private ColormapImpl.ValueSampler vSampler;

    /**
     * Create an instance of a colormap builder
     */
    ColormapBuilderImpl() {

    }

    /**
     * Method called before generation of a colormap
     */
    protected abstract void prepare();

    /**
     * Set the NaN color for the colormap
     *
     * @param color the color to set which is returned when the value is {@code NaN}
     * @return the builder
     */
    @SuppressWarnings("unchecked")
    public final B setNaNColor(RGBA color) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        this.NaNColor = Objects.requireNonNull(color);
        return (B) this;
    }

    /**
     * Set the low color for the colormap
     *
     * @param color the color to set which is returned when the value is below 0
     * @return the builder
     */
    @SuppressWarnings("unchecked")
    public final B setLowColor(RGBA color) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        this.lowColor = color;
        return (B) this;
    }

    /**
     * Set the high color for the colormap
     *
     * @param color the color to set which is returned when the value is greater than 1
     * @return the builder
     */
    @SuppressWarnings("unchecked")
    public final B setHighColor(RGBA color) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        this.highColor = color;
        return (B) this;
    }

    /**
     * Set the samplers for the colormap builder
     *
     * @param vSampler a functional interface that returns the position for sampling based on requested position
     * @param cSampler a function interface that returns the color sampled between the nearest floor and nearest ceiling color
     * @return this builder
     */
    @SuppressWarnings("unchecked")
    protected B setSampler(final ColormapImpl.ValueSampler vSampler, final ColormapImpl.ColorSampler cSampler) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        this.vSampler = vSampler;
        this.cSampler = cSampler;
        return (B) this;
    }

    /**
     * Add a color to a fixed position
     *
     * @param position the position to add a color to
     * @param color    the color to add to that position
     * @return this builder
     */
    @SuppressWarnings("unchecked")
    public final B addColor(float position, RGBA color) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        if (position < 0 || position > 1) {
            throw new UnsupportedOperationException("Position must be between 0 and 1");
        }

        this.colors.put(position, color);
        return (B) this;
    }

    /**
     * Add a color to a sparse position, as calculated in {@link #prepare()}
     *
     * @param color the color to add
     * @return this builder
     */
    @SuppressWarnings("unchecked")
    public final B addColor(RGBA color) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        sparseColors.add(color);
        return (B) this;
    }

    /**
     * Add colors to sparse positions, as calculated in {@link #prepare()}
     *
     * @param colors the colors to add
     * @return this builder
     */
    @SuppressWarnings("unchecked")
    public final B addColor(RGBA... colors) {
        if (isBuilt) {
            throw new UnsupportedOperationException("Color map already built - cannot be set");
        }
        for (final RGBA color : colors) {
            sparseColors.add(color);
        }
        return (B) this;
    }

    /**
     * Build the colormap
     *
     * @return the colormap defined by the builder
     */
    public final Colormap build() {
        prepare();
        final Map.Entry<Float, RGBA> firstEntry = colors.firstEntry();
        final Map.Entry<Float, RGBA> lastEntry = colors.lastEntry();
        if (firstEntry.getKey() != 0) {
            colors.put(0f, firstEntry.getValue());
        }
        if (lastEntry.getKey() != 1) {
            colors.put(1f, lastEntry.getValue());
        }
        if (lowColor == null) {
            lowColor = firstEntry.getValue();
        }
        if (highColor == null) {
            highColor = lastEntry.getValue();
        }
        if (colors.size() == 0) {
            throw new UnsupportedOperationException("Cannot create a colormap with 0 colors");
        }
        isBuilt = true;
        return new ColormapImpl(vSampler, cSampler, colors, NaNColor, lowColor, highColor);

    }

    /**
     * Default implementation of a colormap that samples values between 0 and 1.
     */
    static final class ColormapImpl implements Colormap {
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
         * Default implementation of a colormap as used by {@link ColormapBuilderImpl}
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
}
