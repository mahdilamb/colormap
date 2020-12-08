package net.mahdilamb.colormap.color;

import java.lang.reflect.Field;
import java.util.*;

/**
 * The Color class is a framework independent holder of color. The primary motivation of this class is to hold a 4-component float representation o
 * of an RGBA color that is mutable, and for those changes to be listenable.
 * <p>
 * In addition, there contain string constants that represent generally used colors from AWT, CSS4 and Tableau.
 */
class ColorImpl implements Color {
    final static Map<String, Color> css4Colors = new HashMap<>();
    final static Map<String, Color> awtColors = new HashMap<>();
    final static Map<String, Color> tableauColors = new HashMap<>();
    /**
     * The main field holding the numeric representation of the color.
     */
    protected final float[] rgba;
    private final Set<ColorListener> listeners = new HashSet<>();

    /**
     * Primary constructor based on float representations of each component
     *
     * @param r Red
     * @param g Green
     * @param b Blue
     * @param a Alpha
     */
    ColorImpl(final double r, final double g, final double b, final double a) {
        rgba = new float[]{(float) r, (float) g, (float) b, (float) a};

    }

    /**
     * Construct color based on 8-bit representation of each component
     *
     * @param r Red (0-255)
     * @param g Green (0-255)
     * @param b BLue (0-255)
     * @param a Alpha (0-255)
     */
    ColorImpl(final int r, final int g, final int b, final int a) {
        this(r / 255f, g / 255f, b / 255f, a / 255f);

    }

    private ColorImpl(final float[] rgb) {
        this(rgb[0], rgb[1], rgb[2], rgb.length == 4 ? rgb[3] : 1f);
    }

    /**
     * Construct a Color with full alpha
     *
     * @param r Red (0.0-1.0)
     * @param g Green (0.0-1.0)
     * @param b Blue (0.0-1.0)
     */
    ColorImpl(final double r, final double g, final double b) {
        this(r, g, b, 1.);
    }

    /**
     * Construct a Color with full alpha
     *
     * @param r Red (0-255)
     * @param g Green (0-255)
     * @param b Blue (0-255)
     */
    ColorImpl(final int r, final int g, final int b) {
        this(r / 255f, g / 255f, b / 255f, 1.);
    }

    /**
     * Copy constructor
     *
     * @param original the original color
     */
    ColorImpl(final ColorImpl original) {
        this(original.rgba.clone());
    }

    static Color getColorWithReflection(final String colorName, final ColorType type, final Map<String, Color> cache) {
        final Color cached = cache.get(colorName);
        if (cached != null) {
            return cached.clone();
        }
        for (final Field field : Color.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(NewColor.class) && field.getType() == String.class) {
                try {

                    final String cName = field.getDeclaredAnnotationsByType(NewColor.class)[0].name();
                    final ColorType cType = field.getDeclaredAnnotationsByType(NewColor.class)[0].type();
                    if (cName.compareTo(colorName) == 0 && cType == type) {
                        cache.put(cName, Color.create((String) field.get(null)));
                        return cache.get(cName).clone();
                    }

                } catch (final IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.printf("Color {%s, %s} could not be found%n", colorName, type);
        return null;
    }

    @Override
    public void addListener(final ColorListener listener) {
        listeners.add(listener);
        fireColorChanged();
    }

    @Override
    public boolean removeListener(final ColorListener listener) {
        return listeners.remove(listener);
    }


    @Override
    public void removeListeners() {
        listeners.clear();
    }

    /**
     * When a change has been made to this Color, use this method to update listeners.
     */
    protected void fireColorChanged() {
        for (final ColorListener listener : listeners) {
            listener.colorChanged(this);

        }
    }

    /**
     * Set the color based on the value of a different Color;
     *
     * @param newColor The new Color which this color will take its value from.
     */
    @Override
    public void set(final Color newColor) {
        rgba[0] = newColor.red();
        rgba[1] = newColor.green();
        rgba[2] = newColor.blue();
        rgba[3] = newColor.alpha();
        fireColorChanged();
    }

    @Override
    public float red() {
        return this.rgba[0];
    }

    @Override
    public Color red(final double red) {
        this.rgba[0] = (float) red;
        fireColorChanged();
        return this;
    }


    @Override
    public float green() {
        return this.rgba[1];
    }

    @Override
    public Color green(final double green) {
        this.rgba[1] = (float) green;
        fireColorChanged();
        return this;
    }

    @Override
    public float blue() {
        return this.rgba[2];
    }

    @Override
    public Color blue(final double blue) {
        this.rgba[2] = (float) blue;
        fireColorChanged();
        return this;
    }

    @Override
    public float alpha() {
        return this.rgba[3];
    }

    @Override
    public Color alpha(final double alpha) {
        this.rgba[3] = (float) alpha;
        fireColorChanged();
        return this;
    }

    @SuppressWarnings("MethodDoesntCallSuperMethod")
    @Override
    public final Color clone() {
        return new ColorImpl(this);
    }

    @Override
    public final String toString() {
        return String.format("Color {%s, %.3f}", asHexadecimal(), alpha());
    }

    @Override
    public final boolean equals(Object o) {
        return o == this || (o instanceof ColorImpl && Arrays.equals(((ColorImpl) o).rgba, rgba));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(rgba);
    }

    /**
     * An unmodifiable version of a color
     */
    static final class UnmodifiableColor implements Color {

        private final Color color;

        /**
         * @param color the color to create an unmodifiable version of
         */
        UnmodifiableColor(final Color color) {
            this.color = color;
        }

        @Override
        public Color red(final double red) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color green(final double green) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color blue(final double blue) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color alpha(final double alpha) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public float red() {
            return color.red();
        }

        @Override
        public float green() {
            return color.green();
        }

        @Override
        public float blue() {
            return color.blue();
        }

        @Override
        public float alpha() {
            return color.alpha();
        }

        @Override
        public void set(Color newColor) {
            throw new UnsupportedOperationException();

        }

        @Override
        public void addListener(ColorListener listener) {
            color.addListener(listener);
        }

        @Override
        public boolean removeListener(ColorListener listener) {
            return color.removeListener(listener);
        }

        @Override
        public void removeListeners() {
            color.removeListeners();
        }

        @Override
        public Color clone() {
            return new UnmodifiableColor(color.clone());
        }
    }


}
