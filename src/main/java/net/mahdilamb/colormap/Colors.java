package net.mahdilamb.colormap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for working with colors
 */
public final class Colors {
    private Colors() {

    }

    /**
     * Convert a color from sRGB space into XYZ space. Based on EasyRGB.com and http://www.brucelindbloom.com/index.html?Eqn_RGB_XYZ_Matrix.html
     *
     * @param r the red component
     * @param g the green component
     * @param b the blue component
     * @return a three component float representing the color in XYZ space
     */
    public static float[] RGBToXYZ(float r, float g, float b) {
        return RGBToXYZ(new float[3], r, g, b);
    }

    static float[] RGBToXYZ(float[] out, float r, float g, float b) {
        final float R = (r > 0.04045 ? (float) Math.pow((r + 0.055f) / 1.055f, 2.4f) : r / 12.92f) * 100;
        final float G = (g > 0.04045 ? (float) Math.pow((g + 0.055f) / 1.055f, 2.4f) : g / 12.92f) * 100;
        final float B = (b > 0.04045 ? (float) Math.pow((b + 0.055f) / 1.055f, 2.4f) : b / 12.92f) * 100;

        out[0] = R * 0.4124564f + G * 0.3575761f + B * 0.1804375f;
        out[1] = R * 0.2126729f + G * 0.7151522f + B * 0.0721750f;
        out[2] = R * 0.0193339f + G * 0.1191920f + B * 0.9503041f;
        return out;
    }

    /**
     * Convert an XYZ color to L*ab space.
     *
     * @param x the X component (0-100)
     * @param y the Y component (0-100)
     * @param z the Z component (0-100)
     * @return a three-component float array with the color in L*ab space
     */
    public static float[] XYZToLab(float x, float y, float z) {
        return XYZToLab(new float[3], x, y, z);
    }

    static float[] XYZToLab(float[] out, float x, float y, float z) {
        float a = x / 95.047f, b = y * .01f, c = z / 108.883f;
        final float j = 16f / 116f;
        a = a > 0.008856 ? (float) Math.cbrt(a) : (7.787f * a + j);
        b = b > 0.008856 ? (float) Math.cbrt(b) : (7.787f * b + j);
        c = c > 0.008856 ? (float) Math.cbrt(c) : (7.787f * c + j);

        out[0] = (116f * b) - 16f;
        out[1] = 500f * (a - b);
        out[2] = 200f * (b - c);
        return out;
    }

    /**
     * Convert a color from L*ab space to XYZ space
     *
     * @param L the l component
     * @param a the a component
     * @param b the b component
     * @return the color in xyz space
     */
    public static float[] LabToXYZ(float L, float a, float b) {
        return LabToXYZ(new float[3], L, a, b);
    }

    static float[] LabToXYZ(float[] out, float L, float a, float b) {
        out[1] = (L + 16f) / 116f;
        out[0] = (a / 500f) + out[1];
        out[2] = out[1] - b / 200f;
        for (int i = 0; i < 3; i++) {
            if (out[i] > 0.20689303442f) {
                out[i] *= out[i] * out[i];
            } else {
                out[i] = (out[i] - 16f / 116f) / 7.787f;
            }
        }

        out[0] *= 95.047f;
        out[1] *= 100f;
        out[2] *= 108.883f;
        return out;
    }

    /**
     * Convert an XYZ color (0-100) into sRGB space. Based on EasyRGB.com and http://www.brucelindbloom.com/index.html?Eqn_DeltaE_CIE94.html
     *
     * @param x the X component (0-100)
     * @param y the Y component (0-100)
     * @param z the Z component (0-100)
     * @return a 3-component float array containing the rgb color (0-1)
     */
    public static float[] XYZToRGB(float x, float y, float z) {
        return XYZToRGB(new float[3], x, y, z);
    }

    static float[] XYZToRGB(float[] out, float x, float y, float z) {
        final float X = x / 100;
        final float Y = y / 100;
        final float Z = z / 100;
        out[0] = X * 3.2404542f + Y * -1.5371385f + Z * -0.4985314f;
        out[1] = X * -0.9692660f + Y * 1.8760108f + Z * 0.0415560f;
        out[2] = X * 0.0556434f + Y * -0.2040259f + Z * 1.0572252f;
        for (int i = 0; i < 3; i++) {
            if (out[i] > 0.0031308) {
                out[i] = 1.055f * ((float) Math.pow(out[i], (1 / 2.4))) - 0.055f;
            } else {
                out[i] = 12.92f * out[i];
            }
        }
        return out;
    }

    /**
     * Convert a color from L*ab space to sRGB space
     *
     * @param L the L component
     * @param a the a component
     * @param b the b component
     * @return a 3-component float array containing the color in rgb space
     */
    public static float[] LabToRGB(float L, float a, float b) {
        final float[] out = new float[3];
        return XYZToRGB(LabToXYZ(out, L, a, b), out[0], out[1], out[2]);
    }

    /**
     * Convert a color from sRGB space to L*ab space
     *
     * @param r the red value (0-1)
     * @param g the green value (0-1)
     * @param b the blue value (0-1)
     * @return a 3-component float array with the color in L*ab space
     */
    public static float[] RGBToLab(float r, float g, float b) {
        final float[] out = new float[3];
        return XYZToLab(RGBToXYZ(out, r, g, b), out[0], out[1], out[2]);
    }

    /**
     * Convert a 8-bit color to a packed int representation of that color
     *
     * @param r the red component (0-255)
     * @param g the green component (0-255)
     * @param b the blue component (0-255)
     * @param a the alpha component (0-255)
     * @return the color as a packed int representation
     */
    public static int RGBAToInteger(int r, int g, int b, int a) {
        return ((a & 0xFF) << 24) |
                ((r & 0xFF) << 16) |
                ((g & 0xFF) << 8) |
                ((b & 0xFF));
    }

    /**
     * Convert a float rgba color to its packed int representation (out of bound components are clipped)
     *
     * @param r the red component (0-1)
     * @param g the green component (0-1)
     * @param b the blue component (0-1)
     * @param a the alpha component (0-1)
     * @return the color as a packed int
     */
    public static int RGBAToInteger(float r, float g, float b, float a) {
        return RGBAToInteger(floatTo8Bit(r), floatTo8Bit(g), floatTo8Bit(b), floatTo8Bit(a));
    }

    /**
     * Convert a decimal to a float rgba
     *
     * @param dec the color as a packed integer
     * @return a four component float array containing the rgba components
     */
    public static float[] integerToRGBA(int dec) {
        return new float[]{
                ((dec >> 16) & 0xff) / 255f,
                ((dec >> 8) & 0xff) / 255f,
                ((dec) & 0xff) / 255f,
                ((dec >> 24) & 0xff) / 255f
        };
    }

    /**
     * Convert a color to its RGB hexadecimal representation
     *
     * @param r the red component (0-255)
     * @param g the green component (0-255)
     * @param b the blue component (0-255)
     * @return Hexadecimal string representation of the color
     */
    public static String toHexadecimal(int r, int g, int b) {
        return String.format("#%02X%02X%02X", r, g, b);
    }

    /**
     * Convert a color to its RGB hexadecimal representation
     *
     * @param r the red component (0-255)
     * @param g the green component (0-255)
     * @param b the blue component (0-255)
     * @param a the alpha component (0-255)
     * @return Hexadecimal string representation of the color
     */
    public static String toHexadecimal(int r, int g, int b, int a) {
        return String.format("#%02X%02X%02X%02X", r, g, b, a);
    }

    /**
     * Check if a hex string is a valid color
     *
     * @param hex the string to test
     * @return whether the string is valid hexadecimal
     */
    public static boolean isValid(String hex) {
        return hex != null && hex.matches("[#]?[0-9A-Fa-f]{6,8}");
    }

    /**
     * Check if a hex string is a valid rgb
     *
     * @param hex the string to test
     * @return whether the string is valid hexadecimal rgb
     */
    public static boolean isValidRGB(String hex) {
        return hex != null && hex.matches("[#]?[0-9A-Fa-f]{6}");
    }

    /**
     * Check if a hex string is a valid rgba
     *
     * @param hex the string to test
     * @return whether the string is valid hexadecimal rgba
     */
    public static boolean isValidRGBA(String hex) {
        return hex != null && hex.matches("[#]?[0-9A-Fa-f]{8}");
    }

    /**
     * Try and convert a string into a hex representation of the string
     *
     * @param hex the input string
     * @return the sanitized string
     */
    public static String sanitizeRGB(String hex) {
        final Matcher m = Pattern.compile("\\s*[#]?([0-9A-Fa-f]{6}).*").matcher(hex);
        if (!m.matches()) {
            throw new UnsupportedOperationException("Unable to sanitize color");
        }
        return "#" + m.group(1);
    }

    /**
     * Try and convert a string into a hex representation of the string
     *
     * @param hex the input string
     * @return the sanitized string
     */
    public static String sanitizeRGBA(String hex) {
        final Matcher m = Pattern.compile("\\s*[#]?([0-9A-Fa-f]{6,8}).*").matcher(hex);
        if (!m.matches()) {
            throw new UnsupportedOperationException("Unable to sanitize color");
        }
        final String ex = m.group(1);
        return "#" + (ex.length() == 8 ? ex : ex + "ff");
    }

    /**
     * Convert a hexadecimal String representation of a color to a 3-component float array.
     *
     * @param hexadecimal The hexadecimal string representation of the color.
     * @return A float RGB array.
     */
    public static float[] hexadecimalToRGB(final String hexadecimal) {
        final String hex = sanitizeRGB(hexadecimal);
        return new float[]{
                Integer.valueOf(hex.substring(1, 3), 16) / 255f,
                Integer.valueOf(hex.substring(3, 5), 16) / 255f,
                Integer.valueOf(hex.substring(5, 7), 16) / 255f
        };
    }

    /**
     * Convert a hexadecimal String representation of a color to a 3-component 8-bit array.
     *
     * @param hexadecimal The hexadecimal string representation of the color.
     * @return A float RGB array.
     */
    public static int[] hexadecimalToRGB8Bit(final String hexadecimal) {
        final String hex = sanitizeRGB(hexadecimal);
        return new int[]{
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16)
        };
    }

    /**
     * Convert a hexadecimal String representation of a color to a 3-component float array.
     *
     * @param hexadecimal The hexadecimal string representation of the color.
     * @return A float RGB array.
     */
    public static float[] hexadecimalToRGBA(final String hexadecimal) {
        final String hex = sanitizeRGBA(hexadecimal);
        return new float[]{
                Integer.valueOf(hex.substring(1, 3), 16) / 255f,
                Integer.valueOf(hex.substring(3, 5), 16) / 255f,
                Integer.valueOf(hex.substring(5, 7), 16) / 255f,
                Integer.valueOf(hex.substring(7, 9), 16) / 255f
        };
    }

    /**
     * Convert a float component of a color to an 8-bit representation.
     * <p>
     * If the component is {@literal >}1 or {@literal <}0, then 255 or 0 are given, respectively.
     * <p>
     * The "raw" representations are float and are called with methods without a "get" prefix.
     *
     * @param val the value to convert
     * @return the 8-bit representation.
     */
    public static int floatTo8Bit(float val) {
        return val < 0 ? 0 : val > 1 ? 255 : Math.round(255 * val);
    }

    /**
     * Return val clamped between min and max
     *
     * @param val Value to clamp
     * @param min Minimum the value can be
     * @param max Maximum the value can be
     * @param <T> The type of the values.
     * @return Value clamped between min and max
     */
    public static <T extends Comparable<T>> T clamp(final T val, final T min, final T max) {
        return val.compareTo(max) > 0 ? max : val.compareTo(min) < 0 ? min : val;
    }

    /**
     * Linear interpolation
     *
     * @param low  Right value
     * @param high Left value
     * @param amt  Amount of interpolation between 0 and 1;
     * @return A linearly interpolated value
     */
    public static float lerp(final float low, final float high, float amt) {
        amt = clamp(amt, 0f, 1f);
        return low * amt + high * (1 - amt);
    }

    /**
     * Linearly interpolate between colors in L*ab space
     *
     * @param lower  Lower color to interpolate from
     * @param upper  Higher color to interpolate to
     * @param amount The amount to interpolate between the two colors
     * @return A new color interpolated in L*ab space between lower and upper
     */
    public static Color lerp(final Color lower, final Color upper, final float amount) {
        final float[] lowerLab = lower.toLab();
        final float[] upperLab = upper.toLab();

        final float[] rgb = LabToRGB(lerp(upperLab[0], lowerLab[0], amount), lerp(upperLab[1], lowerLab[1], amount), lerp(upperLab[2], lowerLab[2], amount));
        return new Color(rgb[0], rgb[1], rgb[2], lerp(upper.alpha(), lower.alpha(), amount));
    }

}
