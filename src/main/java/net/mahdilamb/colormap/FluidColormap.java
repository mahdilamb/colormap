package net.mahdilamb.colormap;

import java.awt.*;
import java.util.Collection;

/**
 * A fluid colormap is a colormap which is dynamic (i.e. the range of the values is based on the actual values that have been
 * requested, rather than clamped between 0 and 1). Further, the colormap itself can be changed and reversed.
 */
public interface FluidColormap extends Colormap {
    /**
     * Get a color from the colormap
     *
     * @param value the value to get the node form
     * @return the node
     */
    ColormapNode getNode(Float value);

    /**
     * Get a color from the colormap and add a listener (which fires an event when first added
     * and each time the color changes).
     *
     * @param value    the value add to the colormap
     * @param listener the listener to add to the value
     * @return the newly generated colormap node
     */
    default ColormapNode get(Float value, ColormapNodeListener listener) {
        final ColormapNode v = getNode(value);
        v.addListener(listener);
        return v;
    }

    /**
     * Update the colormap node
     *
     * @param node  the node to update
     * @param value the value to set to
     */
    void update(ColormapNode node, Float value);

    /**
     * Remove this color value from the colormap
     *
     * @param colorValue the color value to remove
     */
    void remove(ColormapNode colorValue);

    /**
     * @return whether this colormap is reversed
     */
    boolean isReversed();

    /**
     * Set this colormap to reversed
     *
     * @param reversed whether to set this colormap as reversed
     * @return this colormap
     */
    FluidColormap setReversed(boolean reversed);

    /**
     * @return the minimum value of the getColormap(). Akin to a 0 in the standard colormap
     */
    Float getMinValue();

    /**
     * Set the minimum bounds of the color
     *
     * @param minValue the minimum value to set this color map
     * @return this colormap
     */
    FluidColormap setMinValue(Float minValue);

    /**
     * @return the maximum value of the getColormap(). Akin to a 1 in the standard getColormap().
     */
    Float getMaxValue();

    /**
     * Set the maximum bounds of the color
     *
     * @param maxValue the maximum value to set this color map
     * @return this colormap
     */
    FluidColormap setMaxValue(Float maxValue);

    /**
     * Change the colormap
     *
     * @param colormap the colormap to set. Must not be {@code null}.
     */
    void setColormap(Colormap colormap);

    /**
     * Get the current colormap
     *
     * @return the current colormap used in this fluid colormap
     */
    Colormap getColormap();

    @Override
    default boolean isQualitative() {
        return getColormap().isQualitative();
    }

    /**
     * Change the associated settings
     *
     * @param minValue the minimum value to set in the fluid colormap (minimum clip)
     * @param maxValue the maximum value to set in the fluid colormap (maximum clip)
     * @param reversed whether the colormap should be reversed
     * @return this colormap
     */
    default FluidColormap set(Float minValue, Float maxValue, boolean reversed) {
        setMinValue(minValue);
        setMaxValue(maxValue);
        setReversed(reversed);
        return this;
    }

    /**
     * Get a color from the colormap and add a listener (which fires an event when first added
     * and each time the color changes).
     *
     * @param value    the value add to the colormap
     * @param listener the listener to add to the value
     * @return the newly generated colormap node
     */
    default ColormapNode get(Float value, ColorListener listener) {
        return get(value, (ColormapNodeListener) listener);
    }

    /**
     * Change the colormap based on the name of the colormap
     *
     * @param name the name of the colormap
     */
    default void setColormap(final String name) {
        setColormap(Colormaps.get(name));
    }

    @Override
    default Color get(Float value) {
        return getNode(value).getColor();
    }

    @Override
    default Color getNaNColor() {
        return getColormap().getNaNColor();
    }

    @Override
    default Color getLowColor() {
        return getColormap().getLowColor();
    }

    @Override
    default Color getHighColor() {
        return getColormap().getHighColor();
    }

    @Override
    default Collection<Float> getDefinedPositions() {
        return getColormap().getDefinedPositions();
    }

}
