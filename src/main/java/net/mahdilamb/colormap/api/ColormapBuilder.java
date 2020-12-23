package net.mahdilamb.colormap.api;

import net.mahdilamb.colormap.Colormaps;

/**
 * API for a colormap builder.
 *
 * @param <B> this builder type
 * @param <C> the type of the output colormap
 */
public interface ColormapBuilder<B extends ColormapBuilder<B, C>, C extends Colormap> {
    /**
     * Set the NaN color for the colormap
     *
     * @param color the color to set which is returned when the value is {@code NaN}
     * @return this builder
     */
    B setNaNColor(RGBA color);

    /**
     * Set the low color for the colormap
     *
     * @param color the color to set which is returned when the value is below 0
     * @return this builder
     */
    B setLowColor(RGBA color);

    /**
     * Set the high color for the colormap
     *
     * @param color the color to set which is returned when the value is greater than 1
     * @return the builder
     */
    B setHighColor(RGBA color);

    /**
     * Add a color to a sparse position
     *
     * @param color the color to add
     * @return this builder
     */
    B addColor(RGBA color);

    /**
     * Add colors to sparse positions
     *
     * @param colors the colors to add
     * @return this builder
     */
    B addColor(RGBA... colors);

    /**
     * Add a color to a fixed position
     *
     * @param position the position to add a color to
     * @param color    the color to add to that position
     * @return this builder
     */
    B addColor(float position, RGBA color);

    /**
     * Build the colormap
     *
     * @return the colormap defined by the builder
     */
    C build();


    /**
     * Build a fluid colormap
     *
     * @param minValue the minimum clip value (can be null)
     * @param maxValue the maximum clip value (can be null)
     * @param reversed whether the colormap should be reversed
     * @return a fluid colormap
     */
    default FluidColormap buildFluid(Float minValue, Float maxValue, boolean reversed) {
        return Colormaps.fluidColormap(build(), minValue, maxValue, reversed);
    }

    /**
     * Build a fluid colormap
     *
     * @return a fluid colormap
     */
    default FluidColormap buildFluid() {
        return buildFluid(null, null, false);
    }

    /**
     * Create a qualitative colormap using a builder
     *
     * @return a builder of qualitative colormaps
     */
    static ColormapBuilder.Qualitative buildQualitative() {
        return new ColormapBuilderImpl.QualitativeColormapBuilderImpl();
    }

    /**
     * Create a sequential colormap using a builder
     *
     * @return a builder of sequential colormaps
     */
    static ColormapBuilder.Sequential buildSequential() {
        return new ColormapBuilderImpl.SequentialColormapBuilderImpl();
    }

    /**
     * API for a qualitative colormap builder
     *
     */
    interface Qualitative extends ColormapBuilder<Qualitative, Colormap> {

    }

    /**
     * API for a sequential colormap builder
     *
     */
    interface Sequential extends ColormapBuilder<Sequential, Colormap> {
        /**
         * Set the sampling precision of the colormap (defaults to infinite)
         *
         * @param precision the precision to be used by the built colormap
         * @return the builder
         */
        Sequential setPrecision(final float precision);
    }
}
