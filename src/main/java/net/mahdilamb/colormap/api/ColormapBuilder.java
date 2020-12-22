package net.mahdilamb.colormap.api;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.Colormaps;

import java.util.*;

/**
 * Abstract Colormap builder. To be used to create custom colormaps
 *
 * @param <B> the type of the builder
 */
public abstract class ColormapBuilder<B extends ColormapBuilder<B>> {
    /**
     * Create a Qualitative colormap builder
     */
    public static final class QualitativeColormapBuilder extends ColormapBuilder<QualitativeColormapBuilder> {

        QualitativeColormapBuilder() {
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
    public static final class SequentialColormapBuilder extends ColormapBuilder<SequentialColormapBuilder> {

        private float precision = Float.POSITIVE_INFINITY;

        SequentialColormapBuilder() {
        }

        /**
         * Set the sampling precision of the colormap (defaults to infinite)
         *
         * @param precision the precision to be used by the built colormap
         * @return the builder
         */
        public final SequentialColormapBuilder setPrecision(final float precision) {
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

    protected ColormapBuilder() {

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
     * Build a fluid colormap
     *
     * @param minValue the minimum clip value (can be null)
     * @param maxValue the maximum clip value (can be null)
     * @param reversed whether the colormap should be reversed
     * @return a fluid colormap
     */
    public final  FluidColormap buildFluid(Float minValue, Float maxValue, boolean reversed) {
        return Colormaps.fluidColormap(build(), minValue, maxValue, reversed);
    }

    /**
     * Build a fluid colormap
     *
     * @return a fluid colormap
     */
    public final  FluidColormap buildFluid() {
        return buildFluid(null, null, false);
    }

    /**
     * Create a qualitative colormap using a builder
     *
     * @return a builder of qualitative colormaps
     */
    public static QualitativeColormapBuilder buildQualitative() {
        return new QualitativeColormapBuilder();
    }

    /**
     * Create a sequential colormap using a builder
     *
     * @return a builder of sequential colormaps
     */
    public static SequentialColormapBuilder buildSequential() {
        return new SequentialColormapBuilder();
    }
}
