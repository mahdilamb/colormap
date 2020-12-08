package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Interface for all colormaps
 */
public interface Colormap extends Iterable<Double>, Cloneable {
    /*
    The following tags are to add a basic class structure to ease finding colormaps. Do not remove!
     */
    //{START}//
	/**
	 * Create cyclic colormaps 
	 */
	final class Cyclic {
		private Cyclic (){}
		/**
		 * @return a new Twilight colormap
		 */
		public static Colormap Twilight(){
			return Colormap.get("Cyclic.Twilight");
		}

		/**
		 * @return a new TwilightShifted colormap
		 */
		public static Colormap TwilightShifted(){
			return Colormap.get("Cyclic.TwilightShifted");
		}

	}

	/**
	 * Create diverging colormaps 
	 */
	final class Diverging {
		private Diverging (){}
		/**
		 * @return a new BentCoolWarm colormap
		 */
		public static Colormap BentCoolWarm(){
			return Colormap.get("Diverging.BentCoolWarm");
		}

		/**
		 * @return a new BrBG colormap
		 */
		public static Colormap BrBG(){
			return Colormap.get("Diverging.BrBG");
		}

		/**
		 * @return a new PRGn colormap
		 */
		public static Colormap PRGn(){
			return Colormap.get("Diverging.PRGn");
		}

		/**
		 * @return a new PiYG colormap
		 */
		public static Colormap PiYG(){
			return Colormap.get("Diverging.PiYG");
		}

		/**
		 * @return a new PuOr colormap
		 */
		public static Colormap PuOr(){
			return Colormap.get("Diverging.PuOr");
		}

		/**
		 * @return a new RdBu colormap
		 */
		public static Colormap RdBu(){
			return Colormap.get("Diverging.RdBu");
		}

		/**
		 * @return a new RdGy colormap
		 */
		public static Colormap RdGy(){
			return Colormap.get("Diverging.RdGy");
		}

		/**
		 * @return a new RdYlBu colormap
		 */
		public static Colormap RdYlBu(){
			return Colormap.get("Diverging.RdYlBu");
		}

		/**
		 * @return a new RdYlGn colormap
		 */
		public static Colormap RdYlGn(){
			return Colormap.get("Diverging.RdYlGn");
		}

		/**
		 * @return a new SmoothCoolWarm colormap
		 */
		public static Colormap SmoothCoolWarm(){
			return Colormap.get("Diverging.SmoothCoolWarm");
		}

		/**
		 * @return a new Spectral colormap
		 */
		public static Colormap Spectral(){
			return Colormap.get("Diverging.Spectral");
		}

	}

	/**
	 * Create qualitative colormaps 
	 */
	final class Qualitative {
		private Qualitative (){}
		/**
		 * @return a new Accent colormap
		 */
		public static Colormap Accent(){
			return Colormap.get("Qualitative.Accent");
		}

		/**
		 * @return a new Dark2 colormap
		 */
		public static Colormap Dark2(){
			return Colormap.get("Qualitative.Dark2");
		}

		/**
		 * @return a new Paired colormap
		 */
		public static Colormap Paired(){
			return Colormap.get("Qualitative.Paired");
		}

		/**
		 * @return a new Pastel1 colormap
		 */
		public static Colormap Pastel1(){
			return Colormap.get("Qualitative.Pastel1");
		}

		/**
		 * @return a new Pastel2 colormap
		 */
		public static Colormap Pastel2(){
			return Colormap.get("Qualitative.Pastel2");
		}

		/**
		 * @return a new Set1 colormap
		 */
		public static Colormap Set1(){
			return Colormap.get("Qualitative.Set1");
		}

		/**
		 * @return a new Set2 colormap
		 */
		public static Colormap Set2(){
			return Colormap.get("Qualitative.Set2");
		}

		/**
		 * @return a new Set3 colormap
		 */
		public static Colormap Set3(){
			return Colormap.get("Qualitative.Set3");
		}

		/**
		 * @return a new Tab10 colormap
		 */
		public static Colormap Tab10(){
			return Colormap.get("Qualitative.Tab10");
		}

		/**
		 * @return a new Tab20 colormap
		 */
		public static Colormap Tab20(){
			return Colormap.get("Qualitative.Tab20");
		}

		/**
		 * @return a new Tab20b colormap
		 */
		public static Colormap Tab20b(){
			return Colormap.get("Qualitative.Tab20b");
		}

		/**
		 * @return a new Tab20c colormap
		 */
		public static Colormap Tab20c(){
			return Colormap.get("Qualitative.Tab20c");
		}

	}

	/**
	 * Create sequential colormaps 
	 */
	final class Sequential {
		private Sequential (){}
		/**
		 * @return a new BlackBody colormap
		 */
		public static Colormap BlackBody(){
			return Colormap.get("Sequential.BlackBody");
		}

		/**
		 * @return a new Blues colormap
		 */
		public static Colormap Blues(){
			return Colormap.get("Sequential.Blues");
		}

		/**
		 * @return a new BuGn colormap
		 */
		public static Colormap BuGn(){
			return Colormap.get("Sequential.BuGn");
		}

		/**
		 * @return a new BuPu colormap
		 */
		public static Colormap BuPu(){
			return Colormap.get("Sequential.BuPu");
		}

		/**
		 * @return a new Cividis colormap
		 */
		public static Colormap Cividis(){
			return Colormap.get("Sequential.Cividis");
		}

		/**
		 * @return a new GnBu colormap
		 */
		public static Colormap GnBu(){
			return Colormap.get("Sequential.GnBu");
		}

		/**
		 * @return a new Greens colormap
		 */
		public static Colormap Greens(){
			return Colormap.get("Sequential.Greens");
		}

		/**
		 * @return a new Greys colormap
		 */
		public static Colormap Greys(){
			return Colormap.get("Sequential.Greys");
		}

		/**
		 * @return a new Hesperia colormap
		 */
		public static Colormap Hesperia(){
			return Colormap.get("Sequential.Hesperia");
		}

		/**
		 * @return a new Inferno colormap
		 */
		public static Colormap Inferno(){
			return Colormap.get("Sequential.Inferno");
		}

		/**
		 * @return a new Kindlmann colormap
		 */
		public static Colormap Kindlmann(){
			return Colormap.get("Sequential.Kindlmann");
		}

		/**
		 * @return a new KindlmannExtended colormap
		 */
		public static Colormap KindlmannExtended(){
			return Colormap.get("Sequential.KindlmannExtended");
		}

		/**
		 * @return a new Lacerta colormap
		 */
		public static Colormap Lacerta(){
			return Colormap.get("Sequential.Lacerta");
		}

		/**
		 * @return a new Laguna colormap
		 */
		public static Colormap Laguna(){
			return Colormap.get("Sequential.Laguna");
		}

		/**
		 * @return a new Magma colormap
		 */
		public static Colormap Magma(){
			return Colormap.get("Sequential.Magma");
		}

		/**
		 * @return a new ModifiedPlasma colormap
		 */
		public static Colormap ModifiedPlasma(){
			return Colormap.get("Sequential.ModifiedPlasma");
		}

		/**
		 * @return a new OrRd colormap
		 */
		public static Colormap OrRd(){
			return Colormap.get("Sequential.OrRd");
		}

		/**
		 * @return a new Oranges colormap
		 */
		public static Colormap Oranges(){
			return Colormap.get("Sequential.Oranges");
		}

		/**
		 * @return a new Plasma colormap
		 */
		public static Colormap Plasma(){
			return Colormap.get("Sequential.Plasma");
		}

		/**
		 * @return a new PuBu colormap
		 */
		public static Colormap PuBu(){
			return Colormap.get("Sequential.PuBu");
		}

		/**
		 * @return a new PuBuGn colormap
		 */
		public static Colormap PuBuGn(){
			return Colormap.get("Sequential.PuBuGn");
		}

		/**
		 * @return a new PuRd colormap
		 */
		public static Colormap PuRd(){
			return Colormap.get("Sequential.PuRd");
		}

		/**
		 * @return a new Purples colormap
		 */
		public static Colormap Purples(){
			return Colormap.get("Sequential.Purples");
		}

		/**
		 * @return a new RdPu colormap
		 */
		public static Colormap RdPu(){
			return Colormap.get("Sequential.RdPu");
		}

		/**
		 * @return a new Reds colormap
		 */
		public static Colormap Reds(){
			return Colormap.get("Sequential.Reds");
		}

		/**
		 * @return a new Turbo colormap
		 */
		public static Colormap Turbo(){
			return Colormap.get("Sequential.Turbo");
		}

		/**
		 * @return a new Viridis colormap
		 */
		public static Colormap Viridis(){
			return Colormap.get("Sequential.Viridis");
		}

		/**
		 * @return a new YlGn colormap
		 */
		public static Colormap YlGn(){
			return Colormap.get("Sequential.YlGn");
		}

		/**
		 * @return a new YlGnBu colormap
		 */
		public static Colormap YlGnBu(){
			return Colormap.get("Sequential.YlGnBu");
		}

		/**
		 * @return a new YlOrBr colormap
		 */
		public static Colormap YlOrBr(){
			return Colormap.get("Sequential.YlOrBr");
		}

		/**
		 * @return a new YlOrRd colormap
		 */
		public static Colormap YlOrRd(){
			return Colormap.get("Sequential.YlOrRd");
		}

	}

    //{END}//

    /**
     * Register a color map so that it can be found by {@link Colormap#get(String)}
     *
     * @param colorMapName  The name used to later find this color map
     * @param colorMapClass The class of the color map.
     */
    static void registerColorMap(final String colorMapName, final Class<Colormap> colorMapClass) {
        if (Arrays.stream(colorMapClass.getConstructors()).allMatch(c -> c.getParameterCount() != 0)) {
            throw new UnsupportedOperationException("Registered colormaps must contain a no args constructor");
        }
        AbstractColormap.colorMaps.put(colorMapName, colorMapClass);
    }

    /**
     * Convenience method to get colormap through java reflection
     *
     * @param colormapType The colormap type (e.g. qualitative, sequential, diverging, cyclic)
     * @param colormapName The name of the colormap (e.g. Viridis)
     * @param isReversed   Whether the colormap should be reversed
     * @return An instance of the requested colormap, or {@code null} if it cannot be found.
     */
    static Colormap get(String colormapType, final String colormapName, final boolean isReversed) {
        final Class<?> colormapClass;
        if (colormapType == null) {
            colormapType = "*";
        }
        final String requestedClass = String.format("%s.%s", colormapType.toLowerCase(), colormapName.toLowerCase());
        if (!AbstractColormap.colorMaps.containsKey(requestedClass)) {
            try {
                AbstractColormap.cacheDefaultColorMaps();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
        colormapClass = AbstractColormap.colorMaps.get(requestedClass);

        try {
            final Colormap out = (AbstractColormap) colormapClass.getConstructor().newInstance();
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
    static Colormap get(final String colormap) {
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
    static Set<String> listDefaults() {
        try {
            AbstractColormap.cacheDefaultColorMaps();
        } catch (Exception e) {
            System.out.println("Could not load default colormaps.");
            e.printStackTrace();
        }
        return Collections.unmodifiableSet(AbstractColormap.defaultColorMaps);
    }

    /**
     * Create a linear colormap
     *
     * @param colors colors to create a colormap from
     * @return linear color map
     */
    static LinearColormap createLinear(final Color... colors) {
        return new LinearColormap(colors);
    }

    /**
     * Create a categorical colormap
     *
     * @param colors colors to create a colormap from
     * @return categorical color map
     */
    static CategoricalColormap createCategorical(final Color... colors) {
        return new CategoricalColormap(colors);
    }

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
     * @return a deep copy of this color map
     */
    Colormap clone();

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
    ColormapNode getColorFromValue(final double value);

    /**
     * @return the current colors that are mapped to a position.
     * The returned map should be assumed to be unmodifiable
     */
    Map<Double, Color> getFixedColors();

    /**
     * @return an ordered list containing the sparse colors whose positions are defined by the colormap type.
     * The returned list should be assumed to be unmodifiable
     */
    List<Color> getSparseColors();

    /**
     * @return the user set low value.
     */
    Double lowValue();

    /**
     * @return the user set high value
     */
    Double highValue();

    /**
     * @return the color that is returned when a value is not a number
     */
    Color getNaNColor();

    /**
     * Set the color to use if the value is {@code null}
     *
     * @param NaNColor Color to use if the value is not a number.
     */
    void setNaNColor(final Color NaNColor);

    /**
     * @return the color that is returned when a value lower than the lower bound is requested
     */
    Color getLowColor();

    /**
     * Set the color to use if the value in a color map is lower than {@link AbstractColormap#getLowValue()}.
     * To disable this floor set {@link AbstractColormap#getLowValue()} to {@code null}.
     *
     * @param lowColor The Color to provide if a value is lower than {@link AbstractColormap#getLowValue()}
     */
    void setLowColor(final Color lowColor);

    /**
     * @return the color that is returned when a value higher than the upper bound is requested
     */
    Color getHighColor();

    /**
     * Set the color to use if the value in a color map is greater than {@link AbstractColormap#getHighValue()}.
     * To disable this ceiling set {@link AbstractColormap#getHighValue()} to {@code null}.
     *
     * @param highColor The Color to provide if a value is higher than {@link AbstractColormap#getHighValue()}
     */
    void setHighColor(final Color highColor);

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
}
