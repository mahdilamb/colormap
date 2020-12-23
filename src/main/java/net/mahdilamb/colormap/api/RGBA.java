package net.mahdilamb.colormap.api;

import net.mahdilamb.colormap.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * API for a color.
 */
public interface RGBA {
    /**
     * Convert a color from sRGB space into XYZ space. Based on EasyRGB.com and http://www.brucelindbloom.com/index.html?Eqn_RGB_XYZ_Matrix.html
     *
     * @param r the red component
     * @param g the green component
     * @param b the blue component
     * @return a three component float representing the color in XYZ space
     */
    static float[] RGBToXYZ(float r, float g, float b) {
        final float[] out = {r, g, b};
        for (int i = 0; i < 3; ++i) {
            if (out[i] > 0.04045) {
                out[i] = (float) Math.pow((out[i] + 0.055f) / 1.055f, 2.4f);
            } else {
                out[i] /= 12.92f;
            }
            out[i] *= 100f;
        }
        return new float[]{
                (out[0] * 0.4124564f + out[1] * 0.3575761f + out[2] * 0.1804375f),
                (out[0] * 0.2126729f + out[1] * 0.7151522f + out[2] * 0.0721750f),
                (out[0] * 0.0193339f + out[1] * 0.1191920f + out[2] * 0.9503041f)
        };
    }

    /**
     * Convert an XYZ color to L*ab space.
     *
     * @param x the X component (0-100)
     * @param y the Y component (0-100)
     * @param z the Z component (0-100)
     * @return a three-component float array with the color in L*ab space
     */
    static float[] XYZToLab(float x, float y, float z) {
        final float[] temp = {x / 95.047f, y / 100f, z / 108.883f};
        final float j = 16f / 116f;
        for (int i = 0; i < 3; i++) {
            temp[i] = temp[i] > 0.008856 ? (float) Math.cbrt(temp[i]) : (7.787f * temp[i] + j);

        }
        return new float[]{
                (116f * temp[1]) - 16f,
                500f * (temp[0] - temp[1]),
                200f * (temp[1] - temp[2])
        };
    }

    /**
     * Convert a color from L*ab space to XYZ space
     *
     * @param L the l component
     * @param a the a component
     * @param b the b component
     * @return the color in xyz space
     */
    static float[] LabToXYZ(float L, float a, float b) {
        final float[] temp = {L, a, b};

        temp[1] = (L + 16f) / 116f;
        temp[0] = (a / 500f) + temp[1];
        temp[2] = temp[1] - b / 200f;
        for (int i = 0; i < 3; i++) {
            if (temp[i] > 0.20689303442f) {
                temp[i] *= temp[i] * temp[i];
            } else {
                temp[i] = (temp[i] - 16f / 116f) / 7.787f;
            }
        }

        temp[0] *= 95.047f;
        temp[1] *= 100f;
        temp[2] *= 108.883f;
        return temp;
    }

    /**
     * Convert an XYZ color (0-100) into sRGB space. Based on EasyRGB.com and http://www.brucelindbloom.com/index.html?Eqn_DeltaE_CIE94.html
     *
     * @param x the X component (0-100)
     * @param y the Y component (0-100)
     * @param z the Z component (0-100)
     * @return a 3-component float array containing the rgb color (0-1)
     */
    static float[] XYZToRGB(float x, float y, float z) {
        final float[] orig = {x / 100, y / 100, z / 100};
        final float[] rgb = orig.clone();
        rgb[0] = orig[0] * 3.2404542f + orig[1] * -1.5371385f + orig[2] * -0.4985314f;
        rgb[1] = orig[0] * -0.9692660f + orig[1] * 1.8760108f + orig[2] * 0.0415560f;
        rgb[2] = orig[0] * 0.0556434f + orig[1] * -0.2040259f + orig[2] * 1.0572252f;
        for (int i = 0; i < 3; i++) {
            if (rgb[i] > 0.0031308) {
                rgb[i] = 1.055f * ((float) Math.pow(rgb[i], (1 / 2.4))) - 0.055f;
            } else {
                rgb[i] = 12.92f * rgb[i];
            }
        }
        return rgb;
    }

    /**
     * Convert a color from L*ab space to sRGB space
     *
     * @param L the L component
     * @param a the a component
     * @param b the b component
     * @return a 3-component float array containing the color in rgb space
     */
    static float[] LabToRGB(float L, float a, float b) {
        final float[] xyz = LabToXYZ(L, a, b);
        return XYZToRGB(xyz[0], xyz[1], xyz[2]);
    }

    /**
     * Convert a color from sRGB space to L*ab space
     *
     * @param r the red value (0-1)
     * @param g the green value (0-1)
     * @param b the blue value (0-1)
     * @return a 3-component float array with the color in L*ab space
     */
    static float[] RGBToLab(float r, float g, float b) {
        final float[] xyz = RGBToXYZ(r, g, b);
        return XYZToLab(xyz[0], xyz[1], xyz[2]);
    }

    /**
     * Convert a 8-bit color to a decimal representation of that color
     *
     * @param r the red component (0-255)
     * @param g the green component (0-255)
     * @param b the blue component (0-255)
     * @param a the alpha component (0-255)
     * @return the color as a decimal representation
     */
    static int RGBAToDecimal(int r, int g, int b, int a) {
        return ((a & 0xFF) << 24) |
                ((r & 0xFF) << 16) |
                ((g & 0xFF) << 8) |
                ((b & 0xFF));
    }

    /**
     * Convert a float rgba color to its decimal representation (out of bound components are clipped)
     *
     * @param r the red component (0-1)
     * @param g the green component (0-1)
     * @param b the blue component (0-1)
     * @param a the alpha component (0-1)
     * @return the color as a decimal representation
     */
    static int RGBAToDecimal(float r, float g, float b, float a) {
        return RGBAToDecimal(floatTo8Bit(r), floatTo8Bit(g), floatTo8Bit(b), floatTo8Bit(a));
    }

    /**
     * Convert a decimal to a float rgba
     *
     * @param dec the decimal color
     * @return a four component float array containing the rgba components
     */
    static float[] decimalToRGBA(int dec) {
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
    static String toHexadecimal(int r, int g, int b) {
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
    static String toHexadecimal(int r, int g, int b, int a) {
        return String.format("#%02X%02X%02X%02X", r, g, b, a);
    }

    /**
     * Check if a hex string is a valid color
     *
     * @param hex the string to test
     * @return whether the string is valid hexadecimal
     */
    static boolean isValid(String hex) {
        return hex != null && hex.matches("[#]?[0-9A-Fa-f]{6,8}");
    }

    /**
     * Check if a hex string is a valid rgb
     *
     * @param hex the string to test
     * @return whether the string is valid hexadecimal rgb
     */
    static boolean isValidRGB(String hex) {
        return hex != null && hex.matches("[#]?[0-9A-Fa-f]{6}");
    }

    /**
     * Check if a hex string is a valid rgba
     *
     * @param hex the string to test
     * @return whether the string is valid hexadecimal rgba
     */
    static boolean isValidRGBA(String hex) {
        return hex != null && hex.matches("[#]?[0-9A-Fa-f]{8}");
    }

    /**
     * Try and convert a string into a hex representation of the string
     *
     * @param hex the input string
     * @return the sanitized string
     */
    static String sanitizeRGB(String hex) {
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
    static String sanitizeRGBA(String hex) {
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
    static float[] hexadecimalToRGB(final String hexadecimal) {
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
    static int[] hexadecimalToRGB8Bit(final String hexadecimal) {
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
    static float[] hexadecimalToRGBA(final String hexadecimal) {
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
    static int floatTo8Bit(float val) {
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
    static <T extends Comparable<T>> T clamp(final T val, final T min, final T max) {
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
    static float lerp(final float low, final float high, float amt) {
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
    static Color lerp(final RGBA lower, final RGBA upper, final float amount) {
        final float[] lowerLab = lower.toLab();
        final float[] upperLab = upper.toLab();

        final float[] rgb = RGBA.LabToRGB(lerp(upperLab[0], lowerLab[0], amount), lerp(upperLab[1], lowerLab[1], amount), lerp(upperLab[2], lowerLab[2], amount));
        return new Color(rgb[0], rgb[1], rgb[2], lerp(upper.alpha(), lower.alpha(), amount));
    }

    /**
     * @return the raw red component
     */
    float red();

    /**
     * @return the red component
     */
    default int getRed() {
        return floatTo8Bit(red());
    }

    /**
     * @return the raw green component
     */
    float green();

    /**
     * @return the green component
     */
    default int getGreen() {
        return floatTo8Bit(green());
    }

    /**
     * @return the raw blue component
     */
    float blue();

    /**
     * @return the blue component
     */
    default int getBlue() {
        return floatTo8Bit(blue());
    }

    /**
     * @return the raw alpha component
     */
    float alpha();

    /**
     * @return the alpha component
     */
    default int getAlpha() {
        return floatTo8Bit(alpha());
    }

    /**
     * @return the transparency of this color as a float
     */
    default float transparency() {
        if (alpha() > 1) {
            return 0;
        }
        if (alpha() < 0) {
            return 1;
        }
        return 1 - alpha();
    }

    /**
     * @return the transparency of this color as an 8-bit representation
     */
    default int getTransparency() {
        return floatTo8Bit(transparency());
    }

    /**
     * @return this color in L*ab space
     */
    default float[] toLab() {
        return RGBToLab(red(), green(), blue());
    }

    /**
     * @return this color as a hexadecimal string
     */
    default String toHex() {
        if (alpha() == 1f) {
            return toHexadecimal(getRed(), getGreen(), getBlue());
        }
        return toHexadecimal(getRed(), getGreen(), getBlue(), getAlpha());
    }

    /**
     * Convert this color to a decimal format
     *
     * @return the decimal format of this color
     */
    default int toDecimal() {
        return RGBAToDecimal(getRed(), getGreen(), getBlue(), getAlpha());
    }
}

