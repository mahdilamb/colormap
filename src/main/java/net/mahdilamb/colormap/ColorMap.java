package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * Interface for all colormaps
 */
public interface ColorMap extends Iterable<Double>, Cloneable {

    /**
     * Get the Color at a specified value. Does not add the value to the color map. Primary way to show a graphical representation of this color map.
     *
     * @param value Value to get the associated Color from
     * @return The associated Color
     */
    Color colorAt(double value);

    /**
     * @return whether the colormap is reversed
     */
    boolean isReversed();

    /**
     * Set the color map as reversed
     *
     * @param isReversed whether the colormap should be set as reversed
     */
    void setReversed(boolean isReversed);

    /**
     * Get the Color at a specified value. Does not add the value to the color map. Considers whether the color map is
     * reversed or not.
     *
     * @param value Value to get the associated Color from
     * @return The associated Color
     */
    default Color getColorAt(final double value) {
        return colorAt(isReversed() ? 1 - value : value);
    }

    /**
     * Register a color map so that it can be found by {@link ColorMap#get(String)}
     *
     * @param colorMapName  The name used to later find this color map
     * @param colorMapClass The class of the color map.
     */
    static void registerColorMap(final String colorMapName, final Class<ColorMap> colorMapClass) {
        if (Arrays.stream(colorMapClass.getConstructors()).allMatch(c -> c.getParameterCount() != 0)) {
            throw new UnsupportedOperationException("Registered colormaps must contain a no args constructor");
        }
        ColorMapImpl.colorMaps.put(colorMapName, colorMapClass);
    }


    /**
     * Convenience method to get colormap through java reflection
     *
     * @param colormapType The colormap type (e.g. qualitative, sequential, diverging, cyclic)
     * @param colormapName The name of the colormap (e.g. Viridis)
     * @param isReversed   Whether the colormap should be reversed
     * @return An instance of the requested colormap, or {@code null} if it cannot be found.
     */
    static ColorMap get(String colormapType, final String colormapName, final boolean isReversed) {
        final Class<?> colormapClass;
        if (colormapType == null) {
            colormapType = "*";
        }
        final String requestedClass = String.format("%s.%s", colormapType.toLowerCase(), colormapName.toLowerCase());
        if (!ColorMapImpl.colorMaps.containsKey(requestedClass)) {
            try {
                ColorMapImpl.cacheDefaultColorMaps();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
        colormapClass = ColorMapImpl.colorMaps.get(requestedClass);

        try {
            final ColorMap out = (ColorMapImpl) colormapClass.getConstructor().newInstance();
            out.setReversed(isReversed);
            return out;
        } catch (final InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
        return null;

    }


    /**
     * Get a colormap using a string representation of the colormap in the form:
     * A.B[.C] Where A is the category such as sequential, qualitative, diverging.
     * B is the name of the color map, and C (optional) is reversed if the color maps should be reversed.
     * All parts are case-insensitive.
     *
     * @param colormap A string representation of a colormap (e.g. "sequential.viridis.reversed", note sequential can be omitted).
     * @return An instance of the requested colormap or {@code null} if it cannot be found.
     */
    static ColorMap get(final String colormap) {
        final String[] cmparts = colormap.split("\\.");
        switch (cmparts.length) {
            case 2:
                if (cmparts[1].compareTo("reversed") == 0) {
                    return get(null, cmparts[0].toLowerCase(), true);
                } else {
                    return get(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), false);
                }
            case 3:
                return get(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), cmparts[2].compareTo("reversed") == 0);
            case 1:
                return get(null, cmparts[0].toLowerCase(), false);
            default:
                throw new IllegalArgumentException("argument should be in the form A.B.[C]. Where A is the category such as sequential, qualitative, diverging. "
                        + "B is the name of the color map. And C is \"reversed\" if the color maps should be reversed.  ");
        }
    }


    /**
     * Get a String list of all the default colormaps.
     *
     * @return A list (set) of the Strings representing the default colormaps.
     */
    static Set<String> listDefaultColorMaps() {
        try {
            ColorMapImpl.cacheDefaultColorMaps();
        } catch (Exception e) {
            System.out.println("Could not load default colormaps.");
            e.printStackTrace();
        }
        return Collections.unmodifiableSet(ColorMapImpl.defaultColorMaps);
    }

    /**
     * @return a deep copy of this color map
     */
    ColorMap clone();

    /**
     * Set the color to use if the value is {@code null}
     *
     * @param NaNColor Color to use if the value is not a number.
     */
    void setNaNColor(final Color NaNColor);

    /**
     * Set the color to use if the value in a color map is greater than {@link ColorMapImpl#getHighValue()}.
     * To disable this ceiling set {@link ColorMapImpl#getHighValue()} to {@code null}.
     *
     * @param highColor The Color to provide if a value is higher than {@link ColorMapImpl#getHighValue()}
     */
    void setHighColor(final Color highColor);

    /**
     * Set the color to use if the value in a color map is lower than {@link ColorMapImpl#getLowValue()}.
     * To disable this floor set {@link ColorMapImpl#getLowValue()} to {@code null}.
     *
     * @param lowColor The Color to provide if a value is lower than {@link ColorMapImpl#getLowValue()}
     */
    void setLowColor(final Color lowColor);

    /**
     * Set the lower bound of this color map
     *
     * @param lowValue Lower bound of this color map
     */
    void setLowValue(final Double lowValue);

    /**
     * Set the upper bound of this color map
     *
     * @param highValue The upper bound
     */
    void setHighValue(final Double highValue);

    /**
     * Get the color node from a value
     *
     * @param value The value to get the associated node form
     * @return The associated color node.
     */
    ColorMapNode getColorFromValue(final double value);
}
