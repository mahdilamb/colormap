package net.mahdilamb.colormap.color;

/**
 * A series of static methods for working with Colors.
 */
public final class ColorUtils {
    private ColorUtils() {
    }

    /**
     * D65 illuminant factors
     */
    private static final float[] D65 = new float[]{
            95.04f, 100, 108.884f
    };

    /**
     * Convert a 3-component float representation of an sRGB color into XYZ space.
     *
     * @param rgb 3-component float RGB representation of an sRGB color
     * @return A 3-component float array containing the color in XYZ space.
     */
    public static float[] RGBToXYZ(final float[] rgb) {
        final float[] temp = rgb.clone();

        for (int i = 0; i < 3; i++) {
            if (temp[i] > 0.04045) {
                temp[i] = (float) Math.pow((temp[i] + 0.055f) / 1.055f, 2.4f);
            } else {
                temp[i] /= 12.92f;
            }
            temp[i] *= 100f;
        }
        return new float[]{
                (temp[0] * 0.4124f + temp[1] * 0.3576f + temp[2] * 0.1805f),
                (temp[0] * 0.2126f + temp[1] * 0.7152f + temp[2] * 0.0722f),
                (temp[0] * 0.0193f + temp[1] * 0.1192f + temp[2] * 0.9505f)
        };
    }

    /**
     * Convert a 3-component 8-bit representation of an sRGB color into XYZ space.
     *
     * @param rgb 3-component 8-bit RGB representation of an sRGB color
     * @return A 3-component float array containing the color in XYZ space.
     */
    public static float[] RGBToXYZ(final int[] rgb) {
        return RGBToXYZ(new float[]{
                rgb[0] / 255f,
                rgb[1] / 255f,
                rgb[2] / 255f,
        });
    }

    /**
     * based on http://www.easyrgb.com/en/math.php
     *
     * @param XYZ the color in XYZ space using D65 standard
     * @return a float array of the color in Lab space
     */
    public static float[] XYZToLab(final float[] XYZ) {
        final float[] temp = XYZ.clone();
        for (int i = 0; i < 3; i++) {
            temp[i] /= D65[i];
            if (temp[i] > 0.008856) {
                temp[i] = (float) Math.cbrt(temp[i]);
            } else {
                temp[i] = (7.787f * temp[i]) + (16f / 116f);
            }
        }
        return new float[]{
                (116f * temp[1]) - 16f,
                500f * (temp[0] - temp[1]),
                200f * (temp[1] - temp[2])
        };
    }

    /**
     * Convert an sRGB color to L*ab
     *
     * @param RGB A 3-component float array representation of a color.
     * @return A 3-component float array containing the L*ab representation of the color.
     */
    public static float[] RGBToLab(final float[] RGB) {
        return XYZToLab(RGBToXYZ(RGB));
    }

    /**
     * Convert an sRGB color to L*ab
     *
     * @param RGB A 3-component int array containing an 8-bit representation of a color.
     * @return A 3-component float array containing the L*ab representation of the color.
     */
    public static float[] RGBToLab(final int[] RGB) {
        return XYZToLab(RGBToXYZ(RGB));
    }

    /**
     * based on http://www.easyrgb.com/en/math.php
     *
     * @param XYZ input XYZ array
     * @return rgb as int array
     */
    public static int[] XYZToRGB(final float[] XYZ) {
        final float[] temp = XYZ.clone();
        for (int i = 0; i < 3; i++) {
            temp[i] /= 100f;
        }
        final float[] rgb = temp.clone();
        rgb[0] = temp[0] * 3.2406f + temp[1] * -1.5372f + temp[2] * -0.4986f;
        rgb[1] = temp[0] * -0.9689f + temp[1] * 1.8758f + temp[2] * 0.0415f;
        rgb[2] = temp[0] * 0.0557f + temp[1] * -0.2040f + temp[2] * 1.0570f;
        for (int i = 0; i < 3; i++) {
            if (rgb[i] > 0.0031308) {
                rgb[i] = 1.055f * ((float) Math.pow(rgb[i], (1 / 2.4))) - 0.055f;

            } else {
                rgb[i] = 12.92f * rgb[i];
            }
            rgb[i] *= 255f;

        }
        return new int[]{
                Math.max(0, Math.min(255, Math.round(rgb[0]))),
                Math.max(0, Math.min(255, Math.round(rgb[1]))),
                Math.max(0, Math.min(255, Math.round(rgb[2])))
        };
    }

    /**
     * based on http://www.easyrgb.com/en/math.php
     *
     * @param Lab input Lab float array
     * @return XYZ array of input L*ab color
     */
    public static float[] LabToXYZ(final float[] Lab) {
        final float[] temp = Lab.clone();

        temp[1] = (Lab[0] + 16f) / 116f;
        temp[0] = (Lab[1] / 500f) + temp[1];
        temp[2] = temp[1] - (Lab[2]) / 200f;
        for (int i = 0; i < 3; i++) {
            if (temp[i] > 0.20689303442f) {
                temp[i] = temp[i] * temp[i] * temp[i];
            } else {
                temp[i] = (temp[i] - 16f / 116f) / 7.787f;
            }
            temp[i] *= D65[i];
        }

        return temp;
    }

    /**
     * Convert a float array containing an L*ab color to an 8-bit sRGB int array.
     *
     * @param lab A 3-component L*ab float array.
     * @return An 8-bit int array containing the L*ab color in sRGB space.
     */
    public static int[] LabToRGB(final float[] lab) {
        return XYZToRGB(LabToXYZ(lab));
    }

    /**
     * Convert an 8-bit RGBA color to decimal.
     *
     * @param r Red
     * @param g Green
     * @param b Blue
     * @param a Alpha
     * @return A decimal representation of the color.
     */
    public static int RGBAToDecimal(final int r, final int g, final int b, final int a) {
        return ((a & 0xFF) << 24) |
                ((r & 0xFF) << 16) |
                ((g & 0xFF) << 8) |
                ((b & 0xFF));
    }

    /**
     * Convert a float RGBA color to a decimal
     *
     * @param r Red
     * @param g Green
     * @param b Blue
     * @param a Alpha
     * @return A decimal representation of the color.
     */
    public static int RGBAToDecimal(final float r, final float g, final float b, final float a) {
        return RGBAToDecimal(Math.round(r * 255), Math.round(g * 255), Math.round(b * 255), Math.round(a * 255));
    }

    /**
     * Convert a float RGBA array to a decimal representation of the color
     *
     * @param rgba A 4-component float array
     * @return A decimal representation of the color.
     */
    public static int RGBAToDecimal(final float[] rgba) {
        return RGBAToDecimal(rgba[0], rgba[1], rgba[2], rgba[3]);
    }

    /**
     * Converts a decimal representation of a Color to its 8-bit RGBA representation.
     *
     * @param value Decimal representation of an sRGB color.
     * @return A 4 component, 8-bit array.
     */
    public static int[] decimalToRBGA(final int value) {
        return new int[]{
                (value >> 16) & 0xff,
                (value >> 8) & 0xff,
                (value) & 0xff,
                (value >> 24) & 0xff

        };
    }

    /**
     * Convert a color to its RGB hexadecimal representation
     *
     * @param color Color to convert
     * @return Hexadecimal string representation of the color
     */
    public static String toHexadecimal(final Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }

    /**
     * Converts an 8-bit RGB to a hexadecimal string representation.
     *
     * @param value A 3-component RGB 8-bit array
     * @return A hexadecimal string representation of the color
     */
    public static String RGBtoHexadecimal(final int[] value) {
        return String.format("#%02x%02x%02x", value[0], value[1], value[2]);
    }

    /**
     * Check if a hex string is a valid color
     *
     * @param hexadecimal String to check validation
     * @param isRGBA      Whether the string is expected to represent an RGB or RGBA color.
     * @return Whether the hex string is a valid color.
     */
    public static boolean isValidHexadecimal(final String hexadecimal, final Boolean isRGBA) {
        return hexadecimal.matches("[#]?[0-9A-Fa-f]{" + (isRGBA == null ? "6,8" : (isRGBA ? 8 : 6)) + "}");
    }

    /**
     * Check if a hex string is a valid color
     *
     * @param hexadecimal String to check validation
     * @return Whether the hex string is a valid color.
     */
    public static boolean isValidHexadecimal(final String hexadecimal) {
        return isValidHexadecimal(hexadecimal, null);
    }

    /**
     * Validates a hexadecimal string
     *
     * @param hex    The string to validate
     * @param isRGBA Whether to validate as RGB or RGBA
     * @return The validated hexadecimal color. Throws and exception if it is not valid and can't be validated.
     */
    public static String validateHexadecimal(String hex, final Boolean isRGBA) {
        final String testHex = hex.charAt(0) != '#' ? '#' + hex : hex;

        if (!isValidHexadecimal(testHex, isRGBA)) {
            throw new UnsupportedOperationException("Can only convert colors in the form #000000");
        }
        return testHex;
    }

    /**
     * Validate a hexadecimal string representation of a color
     *
     * @param hex Input hexadecimal string representation.
     * @return The validated hexadecimal color. Throws and exception if it is not valid and can't be validated.
     */
    public static String validateHexadecimal(final String hex) {
        final String testHex = hex.charAt(0) != '#' ? '#' + hex : hex;

        if (!isValidHexadecimal(testHex)) {
            throw new UnsupportedOperationException("Can only convert colors in the form #000000");
        }
        return testHex;
    }

    /**
     * Convert a hexadecimal String representation of a color to an 8-bit RGB int array.
     *
     * @param hexadecimal The hexadecimal string representation of the color.
     * @return An 8-bit RGB int array.
     */
    public static int[] hexadecimalToRGB(final String hexadecimal) {
        final String hex = validateHexadecimal(hexadecimal, false);

        return new int[]{
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16)
        };
    }

    /**
     * Convert a hexadecimal String representation of a color to an 8-bit RGBA int array.
     *
     * @param hexadecimal The hexadecimal string representation of the color.
     * @return An 8-bit RGBA int array.
     */
    public static int[] hexadecimalToRGBA(final String hexadecimal) {
        final String hex = validateHexadecimal(hexadecimal, true);
        return new int[]{
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16),
                Integer.valueOf(hex.substring(7, 9), 16)
        };
    }

    /**
     * Convert a hexadecimal string representation of a color to an actual Color.
     *
     * @param hexadecimal The hexadecimal string representation of the color
     * @return The actual color.
     */
    public static Color hexadecimalToColor(final String hexadecimal) {
        final int[] rgb = hexadecimalToRGB(hexadecimal);
        return new Color(rgb[0], rgb[1], rgb[2]);
    }

    /**
     * Convert a color from a hexadecimal string representation to a byte array. Useful for making LUTs
     *
     * @param hexadecimal The hexadecimal representation of the Color
     * @return A 3-component, 8-bit RGB array of the color.
     */
    public static byte[][] hexadecimalToByteArray(final String hexadecimal) {
        final String hex = validateHexadecimal(hexadecimal);
        final byte[] red = new byte[255];
        final byte[] green = new byte[255];
        final byte[] blue = new byte[255];
        for (int i = 0; i < 255; i++) {
            red[i] = (byte) (Integer.valueOf(hex.substring(1, 3), 16) * i / 255);
            green[i] = (byte) (Integer.valueOf(hex.substring(3, 5), 16) * i / 255);
            blue[i] = (byte) (Integer.valueOf(hex.substring(5, 7), 16) * i / 255);
        }
        return new byte[][]{red, green, blue};
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
     * @param a   Left value
     * @param b   Right value
     * @param amt Amount of interpolation between 0 and 1;
     * @return A linearly interpolated value
     */
    public static double lerp(final double a, final double b, double amt) {
        amt = clamp(amt, 0d, 1d);
        return a * amt + b * (1 - amt);
    }

    /**
     * Linearly interpolate between colors in L*ab space
     *
     * @param lower  Lower color to interpolate from
     * @param upper  Higher color to interpolate to
     * @param amount The amount to interpolate between the two colors
     * @return A new color interpolated in L*ab space between lower and upper
     */
    public static Color lerp(final Color lower, final Color upper, final double amount) {
        final float[] lowerLab = lower.asLab();
        final float[] upperLab = upper.asLab();
        final float[] newLab = new float[3];
        for (int i = 0; i < 3; i++) {
            newLab[i] = (float) lerp(lowerLab[i], upperLab[i], amount);
        }
        final int[] rgb = LabToRGB(newLab);
        return new Color(rgb[0], rgb[1], rgb[2]);
    }
}
