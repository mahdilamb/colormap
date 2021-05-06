package net.mahdilamb.colormap;

import java.awt.*;

/**
 * Functional interface to be used to monitor changes in color values
 */
@FunctionalInterface
public interface ColormapNodeListener {
    /**
     * Called when a color has changed
     *
     * @param newColor the new color
     * @param oldColor the old color
     * @param state    the node
     */
    void colorChanged(Color newColor, Color oldColor, ColormapNode state);
}
