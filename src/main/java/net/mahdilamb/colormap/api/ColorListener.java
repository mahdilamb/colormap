package net.mahdilamb.colormap.api;

/**
 * Functional interface to be used to monitor changes in color values
 */
@FunctionalInterface
public interface ColorListener {
    /**
     * Called when a color has changed
     *
     * @param newColor the new color
     * @param oldColor the old color
     * @param state    the node
     */
    void colorChanged(RGBA newColor, RGBA oldColor, ColormapNode state);
}
