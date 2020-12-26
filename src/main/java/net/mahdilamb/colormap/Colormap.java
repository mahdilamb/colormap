package net.mahdilamb.colormap;


import java.util.Collection;
import java.util.Iterator;

/**
 * API for a colormap. Colormaps are backed by a {@link java.util.NavigableMap} such that the keys are the position in the colormap
 * and the values are colors (anything that implements the RGBA interface). The colormap is scaled from 0 to 1 and includes out
 * of bounds colors (a low color, and a high color). It also includes a NaN color.
 * <p>
 * Provides an iterator over the positions that contains colors
 */
public interface Colormap extends Iterable<Float> {

    /**
     * Get the color from the colormap
     *
     * @param position the position to get the color from
     * @return the color at that position
     */
    RGBA get(Float position);

    /**
     * Get the color from the colormap by casting a double value to a float
     *
     * @param position the position of interest
     * @return the color at that position
     */
    default RGBA get(double position) {
        return get(Float.valueOf((float) position));
    }

    /**
     * @return the number of points in the color map
     */
    default int size() {
        return getDefinedPositions().size();
    }

    /**
     * Get the color that is used if the value is not
     * finite or null
     *
     * @return the nan color
     */
    RGBA getNaNColor();

    /**
     * Get the color that is used if the value is below 0
     *
     * @return the low color
     */
    RGBA getLowColor();

    /**
     * Get the color that is used if the value is greater than 1
     *
     * @return the high color
     */
    RGBA getHighColor();

    /**
     * Get the positions of defined colors
     *
     * @return a collection of defined positions
     */
    Collection<Float> getDefinedPositions();

    @Override
    default Iterator<Float> iterator() {
        return getDefinedPositions().iterator();
    }
}
