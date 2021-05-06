package net.mahdilamb.colormap;

import java.awt.*;

/**
 * A one-parameter colormap node listener
 */
@FunctionalInterface
public interface ColorListener extends ColormapNodeListener {
    /**
     * Called when a color has changed
     *
     * @param color the new color
     */
    void colorChanged(Color color);

    @Override
    default void colorChanged(Color newColor, Color oldColor, ColormapNode state) {
        colorChanged(newColor);
    }
}
