package net.mahdilamb.colormap.api;

@FunctionalInterface
public interface ColorListener extends ColormapNodeListener {
    /**
     * Called when a color has changed
     *
     * @param color the new color
     */
    void colorChanged(RGBA color);

    @Override
    default void colorChanged(RGBA newColor, RGBA oldColor, ColormapNode state) {
        colorChanged(newColor);
    }
}
