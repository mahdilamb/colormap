package net.mahdilamb.colormap.color;

/**
 * Interface to allow for colors to respond changes.
 * e.g. if a color is a component of a colormap and the bounds of a colormap change
 * then this color will also change.
 */
@FunctionalInterface
public interface ColorListener {
    /**
     * Method called when a color changes
     *
     * @param currentColor The current Color.
     */
    void colorChanged(final Color currentColor);
}
