package net.mahdilamb.colormap;

/**
 * API for a node in a fluid colormap.
 *
 * @see FluidColormap
 */
public interface ColormapNode {
    /**
     * @return the value of this node
     */
    Float getValue();


    /**
     * @return the color of this value. Will not be {@code null}
     */
    Color getColor();

    /**
     * Add a listener to this color value. Adding a listener triggers an event to be fired
     *
     * @param listener the listener to add
     */
    void addListener(ColormapNodeListener listener);

    /**
     * Add a listener to this color value. Adding a listener triggers an event to be fired
     *
     * @param listener the listener to add
     */
    default void addListener(ColorListener listener) {
        addListener((ColormapNodeListener) listener);
    }

    /**
     * Remove a listener from this color value, if listening.
     *
     * @param listener the listener to remove
     */
    void removeListener(ColormapNodeListener listener);

    /**
     * Remove a listener from this color value, if listening.
     *
     * @param listener the listener to remove
     */
    default void removeListener(ColorListener listener) {
        removeListener((ColormapNodeListener) listener);
    }

    /**
     * Remove all listeners from this color value
     */
    void removeListeners();

    /**
     * Set the value of this node
     *
     * @param value the value to set
     */
    default void update(Float value) {
        if (getColormap() == null) {
            return;
        }
        getColormap().update(this, value);
    }

    /**
     * @return the colormap associated with this colormap. Will be {@code null} once removed from the tree
     */
    FluidColormap getColormap();

    /**
     * Remove this color node from the colormap
     */
    default void remove() {
        if (getColormap() == null) {
            return;
        }
        getColormap().remove(this);
    }
}
