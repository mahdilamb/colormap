package net.mahdilamb.colormap;

import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.List;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Main access class for Colormaps. The primary commands are the {@link #get(String)} method and the access to wrapper classes
 */
public final class Colormaps {

    private Colormaps() {
    }

    private static final class ReversedColormap implements Colormap {
        private final Colormap colormap;
        private Collection<Float> reversed;

        private ReversedColormap(final Colormap colormap) {
            this.colormap = colormap;
        }

        @Override
        public Color get(Float position) {
            if (position == null || !Float.isFinite(position)) {
                return getNaNColor();
            }
            if (position <= 0) {
                return getLowColor();
            } else if (position >= 1) {
                return getHighColor();
            } else {
                return colormap.get(1 - position);
            }
        }

        @Override
        public int size() {
            return colormap.size();
        }

        @Override
        public Color getNaNColor() {
            return colormap.getNaNColor();
        }

        @Override
        public Color getLowColor() {
            return colormap.getHighColor();
        }

        @Override
        public Color getHighColor() {
            return colormap.getLowColor();
        }

        @Override
        public Collection<Float> getDefinedPositions() {
            if (reversed == null) {
                final List<Float> list = new ArrayList<>(colormap.getDefinedPositions());
                Collections.reverse(list);
                reversed = list;
            }
            return reversed;
        }

        @Override
        public boolean isQualitative() {
            return colormap.isQualitative();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ReversedColormap)) return false;
            return colormap.equals(((ReversedColormap) o).colormap);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colormap);
        }

        @Override
        public String toString() {
            return colormap.toString() + " (reversed)";
        }
    }

    /**
     * Default implementation of a color value (which is a union between {@link Color} and a number
     */
    static final class ColorValueImpl implements ColormapNode {
        private FluidColormapImpl colormap;
        private Color color;
        private Float value;
        private ColormapNodeListener listener = null;
        private List<ColormapNodeListener> listeners;

        ColorValueImpl(FluidColormapImpl colormap, Float value, Color color) {
            this.colormap = colormap;
            this.value = value;
            this.color = color;
        }

        @Override
        public synchronized Float getValue() {
            return value;
        }

        @Override
        public synchronized Color getColor() {
            return color;
        }

        @Override
        public void addListener(ColormapNodeListener listener) {
            if (listener == null) {
                return;
            }
            if (this.listeners == null) {
                if (this.listener == null) {
                    this.listener = listener;
                    listener.colorChanged(color, null, this);
                    return;
                }
                listeners = new ArrayList<>();
                listeners.add(this.listener);
                this.listener = null;
            }
            if (listeners.contains(listener)){
                return;
            }
            listeners.add(listener);
            listener.colorChanged(color, null, this);
        }

        @Override
        public void removeListener(ColormapNodeListener listener) {
            if (listener == null) {
                return;
            }
            if (listeners == null) {
                if (Objects.equals(this.listener, listener)) {
                    this.listener = null;
                    return;
                }
                return;
            }
            listeners.remove(listener);
        }

        @Override
        public void removeListeners() {
            if (listeners == null) {
                if (listener != null) {
                    listener = null;
                    return;
                }
                return;
            }
            listeners.clear();
        }

        @Override
        public FluidColormap getColormap() {
            return colormap;
        }

        @Override
        public synchronized void remove() {
            colormap.remove(this);
            colormap = null;
        }

        void fireColorChanged(final Color newColor) {
            if (color.equals(newColor)) {
                return;
            }
            if (colormap == null) {
                this.color = newColor;
                return;
            }
            if (listeners == null) {
                if (listener != null) {
                    listener.colorChanged(newColor == null ? color : newColor, color, this);
                }
            } else {
                for (final ColormapNodeListener listener : listeners) {
                    listener.colorChanged(newColor == null ? color : newColor, color, this);
                }
            }

            if (newColor == null) {
                return;
            }
            this.color = newColor;
        }

        @Override
        public final String toString() {
            if (value == null) {
                return String.format("ColorValue {null, %s}", color);
            }
            return String.format("ColorValue {%.3f, %s}", value, color);
        }

    }

    /**
     * Default implementation of a fluid colormap
     */
    static final class FluidColormapImpl implements FluidColormap {
        private Colormap colormap;
        final Collection<ColorValueImpl> nodes = new ArrayList<>();

        private Float minClip;
        private Float maxClip;
        private boolean reversed;

        Float currentMin;
        Float currentMax;

        boolean hasValues = false;

        FluidColormapImpl(Colormap colormap, Float minValue, Float maxValue, boolean reversed) {
            this.colormap = Objects.requireNonNull(colormap);
            this.minClip = minValue;
            this.maxClip = maxValue;
            this.reversed = reversed;
        }

        private FluidColormap recalculateNodes() {
            for (final ColorValueImpl v : nodes) {
                v.fireColorChanged(getColorProportionate(v.getValue()));
            }
            return this;
        }

        @Override
        public boolean isReversed() {
            return reversed;
        }

        @Override
        public FluidColormap setMinValue(Float minValue) {
            //no need to update if they are the same
            if (Objects.equals(minValue, minClip)) {
                return this;
            }
            //if the new min value is greater than max, then set the colormap to reversed
            if (minValue != null && maxClip != null && minValue.compareTo(maxClip) > 0) {
                reversed = !reversed;
                minClip = maxClip;
                maxClip = minValue;
                return recalculateNodes();
            }
            //otherwise update
            this.minClip = minValue;
            return Objects.equals(minValue, currentMin) ? this : recalculateNodes();
        }

        @Override
        public FluidColormap setMaxValue(Float maxValue) {
            //no need to update if they are the same
            if (Objects.equals(maxValue, maxClip)) {
                return this;
            }
            //if the new max value is less than min, then set the colormap to reversed
            if (maxValue != null && minClip != null && maxValue.compareTo(minClip) < 0) {
                reversed = !reversed;
                maxClip = minClip;
                minClip = maxValue;
                return recalculateNodes();
            }
            //otherwise update
            this.maxClip = maxValue;
            return Objects.equals(maxValue, currentMax) ? this : recalculateNodes();
        }

        @Override
        public FluidColormap setReversed(boolean reversed) {
            if (this.reversed == reversed) {
                return this;
            }
            this.reversed = reversed;
            return recalculateNodes();
        }

        @Override
        public void update(ColormapNode node, Float value) {
            boolean needsUpdated = isNaN(value) && !isNaN(node.getValue());
            ((ColorValueImpl) node).value = value;
            if (value != null) {
                if (currentMin != null && value.compareTo(currentMin) <= 0) {
                    currentMin = value;
                    needsUpdated = true;
                }
                if (currentMax != null && value.compareTo(currentMax) >= 0) {
                    currentMax = value;
                    needsUpdated = true;
                }
            }
            if (needsUpdated) {
                recalculateRange();
                recalculateNodes();
            }
            ((ColorValueImpl) node).fireColorChanged(getColorProportionate(value));
        }

        @Override
        public void remove(ColormapNode colorValue) {
            //noinspection SuspiciousMethodCalls
            if (nodes.remove(colorValue) && hasValues) {
                if (colorValue.getValue().compareTo(currentMin) >= 0 || colorValue.getValue().compareTo(currentMax) <= 0) {
                    recalculateRange();
                    recalculateNodes();
                }
            }
        }

        @Override
        public synchronized void setColormap(Colormap colormap) {
            if (Objects.requireNonNull(colormap) != this.colormap) {
                this.colormap = colormap;
                recalculateNodes();
            }
        }


        /**
         * Scale the given value in the bounds of this colormap
         *
         * @param value the value to scale
         * @return the positional float value
         */
        private float scale(Float value) {
            //do null null check
            Objects.requireNonNull(value);
            float v = value;

            if (Objects.equals(currentMin, currentMax) && minClip == null && maxClip == null) {
                //if both bounds are null, or are equal, give the middle value
                return 0.5f;
            } else {
                final Float min = minClip == null ? currentMin : minClip;
                final Float max = maxClip == null ? currentMax : maxClip;
                final Float w;
                if (minClip != null) {
                    v = Math.max(v, minClip);
                }
                if (maxClip != null) {
                    v = Math.min(v, maxClip);
                }

                v = (v - min) / (max - min);
            }
            //apply reverse
            return isReversed() ? 1 - v : v;
        }

        private static boolean isNaN(Float value) {
            return value == null || !Float.isFinite(value);
        }

        /**
         * Get the color from the colormap in the proportional position
         *
         * @param value the value to get the color at
         * @return the color at the position (relative to min, max and reversed of the colormap)
         */
        private Color getColorProportionate(Float value) {
            return isNaN(value) ? getNaNColor() : colormap.get(scale(value));
        }

        @Override
        public synchronized ColormapNode getNode(Float value) {
            final ColorValueImpl val;
            if (value != null) {
                boolean needsUpdated = false;
                if (currentMin == null || value.compareTo(currentMin) < 0) {
                    currentMin = value;
                    needsUpdated = true;
                }
                if (currentMax == null || value.compareTo(currentMax) > 0) {
                    currentMax = value;
                    needsUpdated = true;
                }
                if (needsUpdated) {

                    recalculateNodes();
                }
                val = new ColorValueImpl(this, value, getColorProportionate(value));
                hasValues = true;
            } else {
                //value is null
                val = new ColorValueImpl(this, null, colormap.get(null));
            }
            nodes.add(val);
            return val;
        }

        private synchronized void recalculateRange() {
            currentMin = null;
            currentMax = null;
            hasValues = false;
            for (final Object value : nodes) {
                final ColorValueImpl v = (ColorValueImpl) value;
                if (v.getValue() != null) {
                    if (currentMin == null || v.getValue().compareTo(currentMin) < 0) {
                        currentMin = v.getValue();
                    }
                    if (currentMax == null || v.getValue().compareTo(currentMax) > 0) {
                        currentMax = v.getValue();
                    }
                    hasValues = true;
                }
            }
        }

        @Override
        public Float getMinValue() {
            return minClip;
        }

        @Override
        public Float getMaxValue() {
            return maxClip;
        }

        @Override
        public final String toString() {
            return String.format("FluidColormap {%s, min: %s (current: %s), max: %s (current: %s)}", colormap.toString(), minClip, currentMin, maxClip, currentMax);
        }

        @Override
        public Colormap getColormap() {
            return colormap;
        }

    }
    //Autogenerated tags. Do not remove
    //{{START}}//
	/**
	 * Create cyclic colormaps 
	 */
	public static final class Cyclic {
		private Cyclic (){}
		/**
		 * @return the Edge colormap
		 */
		public static Colormap Edge(){
			return Colormaps.get("Cyclic.Edge");
		}

		/**
		 * @return the HSV colormap
		 */
		public static Colormap HSV(){
			return Colormaps.get("Cyclic.HSV");
		}

		/**
		 * @return the IceFire colormap
		 */
		public static Colormap IceFire(){
			return Colormaps.get("Cyclic.IceFire");
		}

		/**
		 * @return the MRYBM colormap
		 */
		public static Colormap MRYBM(){
			return Colormaps.get("Cyclic.MRYBM");
		}

		/**
		 * @return the MYGBM colormap
		 */
		public static Colormap MYGBM(){
			return Colormaps.get("Cyclic.MYGBM");
		}

		/**
		 * @return the Phase colormap
		 */
		public static Colormap Phase(){
			return Colormaps.get("Cyclic.Phase");
		}

		/**
		 * @return the Twilight colormap
		 */
		public static Colormap Twilight(){
			return Colormaps.get("Cyclic.Twilight");
		}

		/**
		 * @return the TwilightShifted colormap
		 */
		public static Colormap TwilightShifted(){
			return Colormaps.get("Cyclic.TwilightShifted");
		}

	}

	/**
	 * Create diverging colormaps 
	 */
	public static final class Diverging {
		private Diverging (){}
		/**
		 * @return the ArmyRose colormap
		 */
		public static Colormap ArmyRose(){
			return Colormaps.get("Diverging.ArmyRose");
		}

		/**
		 * @return the Balance colormap
		 */
		public static Colormap Balance(){
			return Colormaps.get("Diverging.Balance");
		}

		/**
		 * @return the BentCoolWarm colormap
		 */
		public static Colormap BentCoolWarm(){
			return Colormaps.get("Diverging.BentCoolWarm");
		}

		/**
		 * @return the BrBG colormap
		 */
		public static Colormap BrBG(){
			return Colormaps.get("Diverging.BrBG");
		}

		/**
		 * @return the Curl colormap
		 */
		public static Colormap Curl(){
			return Colormaps.get("Diverging.Curl");
		}

		/**
		 * @return the Delta colormap
		 */
		public static Colormap Delta(){
			return Colormaps.get("Diverging.Delta");
		}

		/**
		 * @return the Diff colormap
		 */
		public static Colormap Diff(){
			return Colormaps.get("Diverging.Diff");
		}

		/**
		 * @return the Earth colormap
		 */
		public static Colormap Earth(){
			return Colormaps.get("Diverging.Earth");
		}

		/**
		 * @return the Fall colormap
		 */
		public static Colormap Fall(){
			return Colormaps.get("Diverging.Fall");
		}

		/**
		 * @return the Geyser colormap
		 */
		public static Colormap Geyser(){
			return Colormaps.get("Diverging.Geyser");
		}

		/**
		 * @return the Oxy colormap
		 */
		public static Colormap Oxy(){
			return Colormaps.get("Diverging.Oxy");
		}

		/**
		 * @return the Picnic colormap
		 */
		public static Colormap Picnic(){
			return Colormaps.get("Diverging.Picnic");
		}

		/**
		 * @return the PiYG colormap
		 */
		public static Colormap PiYG(){
			return Colormaps.get("Diverging.PiYG");
		}

		/**
		 * @return the Portland colormap
		 */
		public static Colormap Portland(){
			return Colormaps.get("Diverging.Portland");
		}

		/**
		 * @return the PRGn colormap
		 */
		public static Colormap PRGn(){
			return Colormaps.get("Diverging.PRGn");
		}

		/**
		 * @return the PuOr colormap
		 */
		public static Colormap PuOr(){
			return Colormaps.get("Diverging.PuOr");
		}

		/**
		 * @return the RdBu colormap
		 */
		public static Colormap RdBu(){
			return Colormaps.get("Diverging.RdBu");
		}

		/**
		 * @return the RdGy colormap
		 */
		public static Colormap RdGy(){
			return Colormaps.get("Diverging.RdGy");
		}

		/**
		 * @return the RdYlBu colormap
		 */
		public static Colormap RdYlBu(){
			return Colormaps.get("Diverging.RdYlBu");
		}

		/**
		 * @return the RdYlGn colormap
		 */
		public static Colormap RdYlGn(){
			return Colormaps.get("Diverging.RdYlGn");
		}

		/**
		 * @return the SmoothCoolWarm colormap
		 */
		public static Colormap SmoothCoolWarm(){
			return Colormaps.get("Diverging.SmoothCoolWarm");
		}

		/**
		 * @return the Spectral colormap
		 */
		public static Colormap Spectral(){
			return Colormaps.get("Diverging.Spectral");
		}

		/**
		 * @return the TealRose colormap
		 */
		public static Colormap TealRose(){
			return Colormaps.get("Diverging.TealRose");
		}

		/**
		 * @return the Temps colormap
		 */
		public static Colormap Temps(){
			return Colormaps.get("Diverging.Temps");
		}

		/**
		 * @return the Topo colormap
		 */
		public static Colormap Topo(){
			return Colormaps.get("Diverging.Topo");
		}

		/**
		 * @return the Tropic colormap
		 */
		public static Colormap Tropic(){
			return Colormaps.get("Diverging.Tropic");
		}

	}

	/**
	 * Create qualitative colormaps 
	 */
	public static final class Qualitative {
		private Qualitative (){}
		/**
		 * @return the Accent colormap
		 */
		public static Colormap Accent(){
			return Colormaps.get("Qualitative.Accent");
		}

		/**
		 * @return the Alphabet colormap
		 */
		public static Colormap Alphabet(){
			return Colormaps.get("Qualitative.Alphabet");
		}

		/**
		 * @return the Antique colormap
		 */
		public static Colormap Antique(){
			return Colormaps.get("Qualitative.Antique");
		}

		/**
		 * @return the Bold colormap
		 */
		public static Colormap Bold(){
			return Colormaps.get("Qualitative.Bold");
		}

		/**
		 * @return the D3 colormap
		 */
		public static Colormap D3(){
			return Colormaps.get("Qualitative.D3");
		}

		/**
		 * @return the Dark2 colormap
		 */
		public static Colormap Dark2(){
			return Colormaps.get("Qualitative.Dark2");
		}

		/**
		 * @return the Dark24 colormap
		 */
		public static Colormap Dark24(){
			return Colormaps.get("Qualitative.Dark24");
		}

		/**
		 * @return the G10 colormap
		 */
		public static Colormap G10(){
			return Colormaps.get("Qualitative.G10");
		}

		/**
		 * @return the Light24 colormap
		 */
		public static Colormap Light24(){
			return Colormaps.get("Qualitative.Light24");
		}

		/**
		 * @return the Paired colormap
		 */
		public static Colormap Paired(){
			return Colormaps.get("Qualitative.Paired");
		}

		/**
		 * @return the Pastel colormap
		 */
		public static Colormap Pastel(){
			return Colormaps.get("Qualitative.Pastel");
		}

		/**
		 * @return the Pastel1 colormap
		 */
		public static Colormap Pastel1(){
			return Colormaps.get("Qualitative.Pastel1");
		}

		/**
		 * @return the Pastel2 colormap
		 */
		public static Colormap Pastel2(){
			return Colormaps.get("Qualitative.Pastel2");
		}

		/**
		 * @return the Plotly colormap
		 */
		public static Colormap Plotly(){
			return Colormaps.get("Qualitative.Plotly");
		}

		/**
		 * @return the Prism colormap
		 */
		public static Colormap Prism(){
			return Colormaps.get("Qualitative.Prism");
		}

		/**
		 * @return the Safe colormap
		 */
		public static Colormap Safe(){
			return Colormaps.get("Qualitative.Safe");
		}

		/**
		 * @return the Set1 colormap
		 */
		public static Colormap Set1(){
			return Colormaps.get("Qualitative.Set1");
		}

		/**
		 * @return the Set2 colormap
		 */
		public static Colormap Set2(){
			return Colormaps.get("Qualitative.Set2");
		}

		/**
		 * @return the Set3 colormap
		 */
		public static Colormap Set3(){
			return Colormaps.get("Qualitative.Set3");
		}

		/**
		 * @return the T10 colormap
		 */
		public static Colormap T10(){
			return Colormaps.get("Qualitative.T10");
		}

		/**
		 * @return the Tab10 colormap
		 */
		public static Colormap Tab10(){
			return Colormaps.get("Qualitative.Tab10");
		}

		/**
		 * @return the Tab20 colormap
		 */
		public static Colormap Tab20(){
			return Colormaps.get("Qualitative.Tab20");
		}

		/**
		 * @return the Tab20b colormap
		 */
		public static Colormap Tab20b(){
			return Colormaps.get("Qualitative.Tab20b");
		}

		/**
		 * @return the Tab20c colormap
		 */
		public static Colormap Tab20c(){
			return Colormaps.get("Qualitative.Tab20c");
		}

		/**
		 * @return the Vivid colormap
		 */
		public static Colormap Vivid(){
			return Colormaps.get("Qualitative.Vivid");
		}

	}

	/**
	 * Create sequential colormaps 
	 */
	public static final class Sequential {
		private Sequential (){}
		/**
		 * @return the AgGrnYl colormap
		 */
		public static Colormap AgGrnYl(){
			return Colormaps.get("Sequential.AgGrnYl");
		}

		/**
		 * @return the AgSunset colormap
		 */
		public static Colormap AgSunset(){
			return Colormaps.get("Sequential.AgSunset");
		}

		/**
		 * @return the Algae colormap
		 */
		public static Colormap Algae(){
			return Colormaps.get("Sequential.Algae");
		}

		/**
		 * @return the Amp colormap
		 */
		public static Colormap Amp(){
			return Colormaps.get("Sequential.Amp");
		}

		/**
		 * @return the BlackBody colormap
		 */
		public static Colormap BlackBody(){
			return Colormaps.get("Sequential.BlackBody");
		}

		/**
		 * @return the BlackbodyAlt colormap
		 */
		public static Colormap BlackbodyAlt(){
			return Colormaps.get("Sequential.BlackbodyAlt");
		}

		/**
		 * @return the BlackBodyExtended colormap
		 */
		public static Colormap BlackBodyExtended(){
			return Colormaps.get("Sequential.BlackBodyExtended");
		}

		/**
		 * @return the Blues colormap
		 */
		public static Colormap Blues(){
			return Colormaps.get("Sequential.Blues");
		}

		/**
		 * @return the BluGrn colormap
		 */
		public static Colormap BluGrn(){
			return Colormaps.get("Sequential.BluGrn");
		}

		/**
		 * @return the BluYl colormap
		 */
		public static Colormap BluYl(){
			return Colormaps.get("Sequential.BluYl");
		}

		/**
		 * @return the BrwnYl colormap
		 */
		public static Colormap BrwnYl(){
			return Colormaps.get("Sequential.BrwnYl");
		}

		/**
		 * @return the BuGn colormap
		 */
		public static Colormap BuGn(){
			return Colormaps.get("Sequential.BuGn");
		}

		/**
		 * @return the BuPu colormap
		 */
		public static Colormap BuPu(){
			return Colormaps.get("Sequential.BuPu");
		}

		/**
		 * @return the Burg colormap
		 */
		public static Colormap Burg(){
			return Colormaps.get("Sequential.Burg");
		}

		/**
		 * @return the BurgYl colormap
		 */
		public static Colormap BurgYl(){
			return Colormaps.get("Sequential.BurgYl");
		}

		/**
		 * @return the Cividis colormap
		 */
		public static Colormap Cividis(){
			return Colormaps.get("Sequential.Cividis");
		}

		/**
		 * @return the CubeYF colormap
		 */
		public static Colormap CubeYF(){
			return Colormaps.get("Sequential.CubeYF");
		}

		/**
		 * @return the DarkMint colormap
		 */
		public static Colormap DarkMint(){
			return Colormaps.get("Sequential.DarkMint");
		}

		/**
		 * @return the Deep colormap
		 */
		public static Colormap Deep(){
			return Colormaps.get("Sequential.Deep");
		}

		/**
		 * @return the Dense colormap
		 */
		public static Colormap Dense(){
			return Colormaps.get("Sequential.Dense");
		}

		/**
		 * @return the Electric colormap
		 */
		public static Colormap Electric(){
			return Colormaps.get("Sequential.Electric");
		}

		/**
		 * @return the Emrld colormap
		 */
		public static Colormap Emrld(){
			return Colormaps.get("Sequential.Emrld");
		}

		/**
		 * @return the GnBu colormap
		 */
		public static Colormap GnBu(){
			return Colormaps.get("Sequential.GnBu");
		}

		/**
		 * @return the Gray colormap
		 */
		public static Colormap Gray(){
			return Colormaps.get("Sequential.Gray");
		}

		/**
		 * @return the Greens colormap
		 */
		public static Colormap Greens(){
			return Colormaps.get("Sequential.Greens");
		}

		/**
		 * @return the Greys colormap
		 */
		public static Colormap Greys(){
			return Colormaps.get("Sequential.Greys");
		}

		/**
		 * @return the Haline colormap
		 */
		public static Colormap Haline(){
			return Colormaps.get("Sequential.Haline");
		}

		/**
		 * @return the Hesperia colormap
		 */
		public static Colormap Hesperia(){
			return Colormaps.get("Sequential.Hesperia");
		}

		/**
		 * @return the Hot colormap
		 */
		public static Colormap Hot(){
			return Colormaps.get("Sequential.Hot");
		}

		/**
		 * @return the Ice colormap
		 */
		public static Colormap Ice(){
			return Colormaps.get("Sequential.Ice");
		}

		/**
		 * @return the Inferno colormap
		 */
		public static Colormap Inferno(){
			return Colormaps.get("Sequential.Inferno");
		}

		/**
		 * @return the Jet colormap
		 */
		public static Colormap Jet(){
			return Colormaps.get("Sequential.Jet");
		}

		/**
		 * @return the Kindlmann colormap
		 */
		public static Colormap Kindlmann(){
			return Colormaps.get("Sequential.Kindlmann");
		}

		/**
		 * @return the KindlmannExtended colormap
		 */
		public static Colormap KindlmannExtended(){
			return Colormaps.get("Sequential.KindlmannExtended");
		}

		/**
		 * @return the KovesiBGYW colormap
		 */
		public static Colormap KovesiBGYW(){
			return Colormaps.get("Sequential.KovesiBGYW");
		}

		/**
		 * @return the KovesiKRYW colormap
		 */
		public static Colormap KovesiKRYW(){
			return Colormaps.get("Sequential.KovesiKRYW");
		}

		/**
		 * @return the Lacerta colormap
		 */
		public static Colormap Lacerta(){
			return Colormaps.get("Sequential.Lacerta");
		}

		/**
		 * @return the Laguna colormap
		 */
		public static Colormap Laguna(){
			return Colormaps.get("Sequential.Laguna");
		}

		/**
		 * @return the Magenta colormap
		 */
		public static Colormap Magenta(){
			return Colormaps.get("Sequential.Magenta");
		}

		/**
		 * @return the Magma colormap
		 */
		public static Colormap Magma(){
			return Colormaps.get("Sequential.Magma");
		}

		/**
		 * @return the Matter colormap
		 */
		public static Colormap Matter(){
			return Colormaps.get("Sequential.Matter");
		}

		/**
		 * @return the Mint colormap
		 */
		public static Colormap Mint(){
			return Colormaps.get("Sequential.Mint");
		}

		/**
		 * @return the Oranges colormap
		 */
		public static Colormap Oranges(){
			return Colormaps.get("Sequential.Oranges");
		}

		/**
		 * @return the OrRd colormap
		 */
		public static Colormap OrRd(){
			return Colormaps.get("Sequential.OrRd");
		}

		/**
		 * @return the OrYel colormap
		 */
		public static Colormap OrYel(){
			return Colormaps.get("Sequential.OrYel");
		}

		/**
		 * @return the Peach colormap
		 */
		public static Colormap Peach(){
			return Colormaps.get("Sequential.Peach");
		}

		/**
		 * @return the PinkYl colormap
		 */
		public static Colormap PinkYl(){
			return Colormaps.get("Sequential.PinkYl");
		}

		/**
		 * @return the Plasma colormap
		 */
		public static Colormap Plasma(){
			return Colormaps.get("Sequential.Plasma");
		}

		/**
		 * @return the PlasmaModified colormap
		 */
		public static Colormap PlasmaModified(){
			return Colormaps.get("Sequential.PlasmaModified");
		}

		/**
		 * @return the Plotly3 colormap
		 */
		public static Colormap Plotly3(){
			return Colormaps.get("Sequential.Plotly3");
		}

		/**
		 * @return the PuBu colormap
		 */
		public static Colormap PuBu(){
			return Colormaps.get("Sequential.PuBu");
		}

		/**
		 * @return the PuBuGn colormap
		 */
		public static Colormap PuBuGn(){
			return Colormaps.get("Sequential.PuBuGn");
		}

		/**
		 * @return the PuRd colormap
		 */
		public static Colormap PuRd(){
			return Colormaps.get("Sequential.PuRd");
		}

		/**
		 * @return the Purp colormap
		 */
		public static Colormap Purp(){
			return Colormaps.get("Sequential.Purp");
		}

		/**
		 * @return the Purples colormap
		 */
		public static Colormap Purples(){
			return Colormaps.get("Sequential.Purples");
		}

		/**
		 * @return the PurpOr colormap
		 */
		public static Colormap PurpOr(){
			return Colormaps.get("Sequential.PurpOr");
		}

		/**
		 * @return the Rain colormap
		 */
		public static Colormap Rain(){
			return Colormaps.get("Sequential.Rain");
		}

		/**
		 * @return the RdPu colormap
		 */
		public static Colormap RdPu(){
			return Colormaps.get("Sequential.RdPu");
		}

		/**
		 * @return the RedOr colormap
		 */
		public static Colormap RedOr(){
			return Colormaps.get("Sequential.RedOr");
		}

		/**
		 * @return the Reds colormap
		 */
		public static Colormap Reds(){
			return Colormaps.get("Sequential.Reds");
		}

		/**
		 * @return the Solar colormap
		 */
		public static Colormap Solar(){
			return Colormaps.get("Sequential.Solar");
		}

		/**
		 * @return the Speed colormap
		 */
		public static Colormap Speed(){
			return Colormaps.get("Sequential.Speed");
		}

		/**
		 * @return the Sunset colormap
		 */
		public static Colormap Sunset(){
			return Colormaps.get("Sequential.Sunset");
		}

		/**
		 * @return the SunsetDark colormap
		 */
		public static Colormap SunsetDark(){
			return Colormaps.get("Sequential.SunsetDark");
		}

		/**
		 * @return the Tarn colormap
		 */
		public static Colormap Tarn(){
			return Colormaps.get("Sequential.Tarn");
		}

		/**
		 * @return the Teal colormap
		 */
		public static Colormap Teal(){
			return Colormaps.get("Sequential.Teal");
		}

		/**
		 * @return the TealGrn colormap
		 */
		public static Colormap TealGrn(){
			return Colormaps.get("Sequential.TealGrn");
		}

		/**
		 * @return the Tempo colormap
		 */
		public static Colormap Tempo(){
			return Colormaps.get("Sequential.Tempo");
		}

		/**
		 * @return the Thermal colormap
		 */
		public static Colormap Thermal(){
			return Colormaps.get("Sequential.Thermal");
		}

		/**
		 * @return the Turbid colormap
		 */
		public static Colormap Turbid(){
			return Colormaps.get("Sequential.Turbid");
		}

		/**
		 * @return the Turbo colormap
		 */
		public static Colormap Turbo(){
			return Colormaps.get("Sequential.Turbo");
		}

		/**
		 * @return the Viridis colormap
		 */
		public static Colormap Viridis(){
			return Colormaps.get("Sequential.Viridis");
		}

		/**
		 * @return the YlGn colormap
		 */
		public static Colormap YlGn(){
			return Colormaps.get("Sequential.YlGn");
		}

		/**
		 * @return the YlGnBu colormap
		 */
		public static Colormap YlGnBu(){
			return Colormaps.get("Sequential.YlGnBu");
		}

		/**
		 * @return the YlOrBr colormap
		 */
		public static Colormap YlOrBr(){
			return Colormaps.get("Sequential.YlOrBr");
		}

		/**
		 * @return the YlOrRd colormap
		 */
		public static Colormap YlOrRd(){
			return Colormaps.get("Sequential.YlOrRd");
		}

	}

    //{{END}}//

    /**
     * String sequence that works irrespective of whether there is a wild card or not
     */
    final static class ReferenceColormapKey implements CharSequence, Comparable<CharSequence> {
        private final char[] cat;
        private final char[] name;

        private ReferenceColormapKey(char[] cat, char[] name) {
            this.cat = cat;
            this.name = name;
        }

        private ReferenceColormapKey(String cat, String name) {
            this(cat.toCharArray(), name.toCharArray());
        }

        private ReferenceColormapKey(char[] name) {
            this.cat = new char[]{'*'};
            this.name = name;
        }

        @Override
        public int length() {
            return cat.length + name.length + 1;
        }

        @Override
        public final char charAt(int index) {
            if (index == cat.length) {
                return '.';
            }
            if (index > cat.length) {
                return name[index - cat.length - 1];
            }
            return cat[index];
        }

        @Override
        public final CharSequence subSequence(int start, int end) {
            final char[] sub = new char[end - start];
            for (int i = start, j = 0; i < end; ++i, ++j) {
                sub[j] = charAt(i);
            }
            return new String(sub);
        }

        @Override
        public final String toString() {
            return String.format("%s.%s", new String(cat), new String(name));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ReferenceColormapKey)) return false;
            if (cat[0] != '*' && ((ReferenceColormapKey) o).cat[0] != '*') {
                return Arrays.equals(cat, ((ReferenceColormapKey) o).cat) && Arrays.equals(name, ((ReferenceColormapKey) o).name);
            }
            return Arrays.equals(name, ((ReferenceColormapKey) o).name);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(name);
        }

        /**
         * Compare to character sequences as in JDK 9+
         *
         * @param cs2 the other character sequence
         * @return the sort direction of the character sequence with this
         */
        @Override
        public int compareTo(CharSequence cs2) {
            if (this == Objects.requireNonNull(cs2)) {
                return 0;
            }

            for (int i = 0, len = Math.min(length(), cs2.length()); i < len; i++) {
                char a = charAt(i);
                char b = cs2.charAt(i);
                if (a != b) {
                    return a - b;
                }
            }

            return length() - cs2.length();
        }
    }

    private final static Map<ReferenceColormapKey, Object> referenceColormaps = new HashMap<>();

    private static void cacheColormaps() throws IOException, ClassNotFoundException {
        final String packagePath = ReferenceColormap.class.getPackage().getName().replace(".", "/");
        final File packageName = new File(packagePath);
        final URL codeSource = ReferenceColormap.class.getProtectionDomain().getCodeSource().getLocation();
        if (new File(codeSource.getPath()).isDirectory()) {

            final Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            final Stack<File> directories = new Stack<>();
            while (resources.hasMoreElements()) {
                try {
                    final File file = new File(URLDecoder.decode(resources.nextElement().getPath(), "UTF-8"));
                    if (!file.isFile()) {
                        directories.push(file);
                    } else {
                        addColorMapClass(packageName, file);
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            while (!directories.empty()) {
                final File dir = directories.pop();
                if (dir == null) {
                    continue;
                }
                final File[] files = dir.listFiles();
                if (files == null) {
                    continue;
                }
                for (final File file : files) {
                    if (!file.isFile()) {
                        directories.push(file);
                    } else {
                        addColorMapClass(packageName, file);
                    }
                }
            }
        } else {
            try (final ZipInputStream jar = new JarInputStream(codeSource.openStream())) {
                ZipEntry ze;
                while ((ze = jar.getNextEntry()) != null) {
                    final File file = new File(ze.toString());
                    if (!file.toString().endsWith(".class") || file.toString().length() < packagePath.length() || !file.toString().contains(packageName.toString())) {
                        continue;
                    }
                    addColorMapClass(packageName, file);
                }
            }
        }
    }

    static void addColorMapClass(final File packageName, final File file) throws ClassNotFoundException {
        final Class<?> colorMap = Class.forName(
                file
                        .toString()
                        .substring(file.toString().indexOf(packageName.toString()))
                        .replace(File.separator, ".")
                        .replace(".class", "")
        );
        final ReferenceColormap annotation = colorMap.getDeclaredAnnotation(ReferenceColormap.class);
        if (annotation == null || !Colormap.class.isAssignableFrom(colorMap)) {
            return;
        }
        final String name = annotation.name().toLowerCase();
        final String type = annotation.type().name().toLowerCase();
        referenceColormaps.put(new ReferenceColormapKey(type, name), colorMap);
    }

    /**
     * Get a collection of the names of the reference colormaps
     *
     * @param <C> the type of the elements in the output set
     * @return the collection of reference colormap names
     */
    @SuppressWarnings("unchecked")//the set has both features
    public static <C extends CharSequence & Comparable<CharSequence>> Set<C> named() {
        if (referenceColormaps.size() == 0) {
            try {
                cacheColormaps();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (Set<C>) Collections.unmodifiableSet(((Map<? extends C, ?>) referenceColormaps).keySet());
    }

    /**
     * Convenience method to get colormap through java reflection
     *
     * @param colormapType The colormap type (e.g. qualitative, sequential, diverging, cyclic)
     * @param colormapName The name of the colormap (e.g. Viridis)
     * @param isReversed   Whether the colormap should be reversed
     * @return An instance of the requested colormap, or {@code null} if it cannot be found.
     */
    public static Colormap get(String colormapType, String colormapName, boolean isReversed) {
        if (referenceColormaps.size() == 0) {
            try {
                cacheColormaps();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        //if no colormap, use wildcard
        if (colormapType == null) {
            colormapType = "*";
        }
        //format to match key
        final ReferenceColormapKey requestedClass = new ReferenceColormapKey(colormapType.toLowerCase(), colormapName.toLowerCase());
        //see if there is a match
        final Object match = referenceColormaps.get(requestedClass);
        //if it is a class, need to create instance and cache
        if (match instanceof Class) {
            final ReferenceColormap annotation = ((Class<?>) match).getDeclaredAnnotation(ReferenceColormap.class);
            if (annotation == null) {
                return null;
            }

            try {
                @SuppressWarnings("unchecked") final Colormap cmap = ((Class<? extends Colormap>) match).getConstructor().newInstance();
                referenceColormaps.put(requestedClass, cmap);
                return isReversed ? reversedColormap(cmap) : cmap;
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }

        } else {
            return isReversed ? reversedColormap((Colormap) match) : ((Colormap) match);
        }
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
    public static Colormap get(final String colormap) {
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
     * Get a colormap using a string representation of the colormap in the form:
     * A.B[.C] Where A is the category such as sequential, qualitative, diverging.
     * B is the name of the color map, and C (optional) is reversed if the color maps should be reversed.
     * All parts are case-insensitive.
     *
     * @param name A string representation of a colormap (e.g. "sequential.viridis.reversed", note sequential can be omitted).
     * @return An instance of the requested colormap or {@code null} if it cannot be found.
     */
    public static Colormap get(final CharSequence name) {
        final char[] arr = new char[name.length()];
        for (int i = 0; i < name.length(); ++i) {
            arr[i] = name.charAt(i);
        }
        return get(new String(arr));
    }

    /**
     * Build a qualitative colormap
     *
     * @return the build for the qualitative colormap
     */
    public static ColormapBuilder.Qualitative buildQualitative() {
        return ColormapBuilder.buildQualitative();
    }

    /**
     * Build a sequential colormap
     *
     * @return the build for the sequential colormap
     */
    public static ColormapBuilder.Sequential buildSequential() {
        return ColormapBuilder.buildSequential();
    }

    /**
     * Convert a color map to a fluid colormap, i.e. one that autoscales
     *
     * @param colormap the colormap to initialize with
     * @param minValue the minimum value of the fluid colormap (akin to 0 in the standard colormap)
     * @param maxValue the maximum value of the fluid colormap (akin to 1 in the standard colormap)
     * @param reversed whether to use the colormap reversed
     * @return a fluid version of the colormap
     */
    public static FluidColormap fluidColormap(final Colormap colormap, Float minValue, Float maxValue, boolean reversed) {
        if (colormap instanceof FluidColormapImpl) {
            ((FluidColormapImpl) colormap).set(minValue, maxValue, reversed);
            return (FluidColormap) colormap;
        }
        return new FluidColormapImpl(colormap, minValue, maxValue, reversed);
    }

    /**
     * Convert a color map to a fluid colormap, i.e. one that autoscales
     *
     * @param colormap he colormap to initialize with
     * @return a fluid version of this colormap with no minimum and maximum and in the default order
     */
    public static FluidColormap fluidColormap(final Colormap colormap) {
        return fluidColormap(colormap, null, null, false);
    }

    /**
     * Provide a reversed version of a colormap
     *
     * @param colormap the colormap to give a reversed view of
     * @return a reversed version of the input colormap
     */
    public static Colormap reversedColormap(final Colormap colormap) {
        if (colormap instanceof ReversedColormap) {
            return ((ReversedColormap) colormap).colormap;
        } else if (colormap instanceof FluidColormap) {
            ((FluidColormap) colormap).setReversed(!((FluidColormap) colormap).isReversed());
            return colormap;
        }
        return new ReversedColormap(colormap);
    }

    /**
     * Return whether the colormap is reversed
     *
     * @param colormap the colormap to check
     * @return whether the colormap is reversed
     */
    public static boolean isReversed(final Colormap colormap) {
        return colormap instanceof ReversedColormap || colormap instanceof FluidColormap && ((FluidColormap) colormap).isReversed();

    }

}
