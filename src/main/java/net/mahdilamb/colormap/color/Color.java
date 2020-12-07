package net.mahdilamb.colormap.color;

import static net.mahdilamb.colormap.color.ColorUtils.*;

public interface Color extends Cloneable {

    /**
     * @return The float representation of the red component
     */
    float red();

    /**
     * @return The float representation of the green component
     */
    float green();

    /**
     * @return a float representing the blue component of the color
     */
    float blue();

    /**
     * @return a float representing the alpha component of the color
     */
    float alpha();

    /**
     * @return 8-bit representation of the red component.
     */
    default int getRed() {
        return Math.round(red() * 255);
    }

    /**
     * @return 8-bit representation of the green component.
     */
    default int getGreen() {
        return Math.round(green() * 255);
    }

    /**
     * @return 8-bit representation of the blue component.
     */
    default int getBlue() {
        return Math.round(blue() * 255);
    }

    /**
     * @return 8-bit representation of the alpha component.
     */
    default int getAlpha() {
        return Math.round(alpha() * 255);
    }

    /**
     * Replace the value of this color with that supplied
     *
     * @param newColor the new color
     */
    void set(Color newColor);

    /**
     * @param red The new red component, as an integer number;
     * @return this color
     */
    default Color setRed(final int red) {
        return red(red / 255f);
    }

    /**
     * @param red The new red component, as a floating point number.
     * @return this color
     */
    Color red(final double red);

    /**
     * @param green The new green component, as an integer number;
     * @return this color
     */
    default Color setGreen(final int green) {
        return green(green / 255f);
    }

    /**
     * @param green The floating-point representation of the green component.
     * @return this color
     */
    Color green(final double green);

    /**
     * @param blue The floating-point representation of the blue component.
     * @return this color
     */
    Color blue(final double blue);

    /**
     * @param blue The integer representation of the blue component.
     * @return this color
     */
    default Color setBlue(final int blue) {
        return blue(blue / 255f);
    }

    /**
     * @param alpha The floating-point representation of the alpha component.
     * @return this color
     */
    Color alpha(final double alpha);

    /**
     * @param alpha The 8-bit representation of the alpha component.
     * @return this color
     */
    default Color setAlpha(final int alpha) {
        return alpha(alpha / 255f);
    }

    /**
     * Add a listener
     *
     * @param listener Listener to add to this Color.
     */
    void addListener(final ColorListener listener);

    /**
     * Remove a listener
     *
     * @param listener Listener to remove, if already listening, to this Color.
     */
    boolean removeListener(final ColorListener listener);

    /**
     * Remove all listeners
     */
    void removeListeners();

    Color clone();

    /**
     * @return A 3-component array containing the 8-bit representation of the red, green and blue components of this color.
     */
    default int[] asRGB() {
        return new int[]{getRed(), getGreen(), getBlue()};
    }

    /**
     * @return A 4-component array containing the 8-bit representation of the red, green, blue and alpha components of this color.
     */
    default int[] asRGBA() {
        return new int[]{
                getRed(),
                getGreen(),
                getBlue(),
                getAlpha()
        };
    }

    /**
     * @return This color represented in L*ab space. See {@link ColorUtils#RGBToLab(float[])} for more details.
     */
    default float[] asLab() {
        return RGBToLab(asRGB());
    }

    /**
     * @return This color represented as a decimal value;
     */
    default int asDecimal() {
        return RGBAToDecimal(red(), green(), blue(), alpha());
    }

    /**
     * @return A string representation of this color in hexadecimal (includes the alpha component);
     */
    default String asHexadecimal() {
        return RGBtoHexadecimal(asRGBA());
    }

    /**
     * Get an unmodifiable version of a color
     *
     * @param color the color to wrap
     * @return an unmodifiable version of the color
     */
    static Color asUnmodifiable(final Color color) {
        return new ColorImpl.UnmodifiableColor(color);
    }


    /**
     * Create a color from a hex string
     *
     * @param hexString hexString
     * @return a color from the hex string
     */
    static Color from(String hexString) {
        final int[] fromHex = hexadecimalToRGB(hexString);
        return from(fromHex[0], fromHex[1], fromHex[2]);
    }

    /**
     * Create a color from 4 ints
     *
     * @param red   red
     * @param green green
     * @param blue  blue
     * @param alpha alpha
     * @return a color representing the four ints
     */
    static Color from(int red, int green, int blue, int alpha) {
        return new ColorImpl(red, green, blue, alpha);
    }

    /**
     * Construct a Color with full alpha
     *
     * @param red   Red (0-255)
     * @param green Green (0-255)
     * @param blue  Blue (0-255)
     */
    static Color from(int red, int green, int blue) {
        return from(red, green, blue, 255);
    }

    /**
     * Get a CSS4 color by name.
     *
     * @param colorName The name of the CSS4 color.
     * @return A color of the CSS4 color requested or {@code null} if color cannot be found.
     */
    static Color getCSS(final String colorName) {
        return ColorImpl.getColorWithReflection(colorName, ColorType.CSS, ColorImpl.css4Colors);
    }

    /**
     * Get a AWT color by name.
     *
     * @param colorName The name of the AWT color.
     * @return A color of the AWT color requested or {@code null} if color cannot be found.
     */
    static Color getAWT(final String colorName) {
        return ColorImpl.getColorWithReflection(colorName, ColorType.AWT, ColorImpl.awtColors);
    }

    /**
     * Get a Tableau color by name.
     *
     * @param colorName The name of the Tableau color.
     * @return A color of the Tableau color requested or {@code null} if color cannot be found.
     */
    static Color getTableau(final String colorName) {
        return ColorImpl.getColorWithReflection(colorName, ColorType.TABLEAU, ColorImpl.tableauColors);
    }

    /**
     * Get any of the colors by name using prefixes such as "css:", "awt:", "tableau". Color search is not case-sensitive.
     *
     * @param colorName The name of the color to search for
     * @return The requested color or {@code null} if none can be found.
     */
    static Color get(final String colorName) {
        if (colorName.toLowerCase().startsWith("css:")) {
            return getCSS(colorName.toLowerCase().split(":")[1]);
        } else if (colorName.toLowerCase().startsWith("awt:")) {
            return getAWT(colorName.toLowerCase().split(":")[1]);
        } else if (colorName.toLowerCase().startsWith("tab:") || colorName.toLowerCase().startsWith("tableau:")) {
            return getTableau(colorName.toLowerCase().split(":")[1]);
        } else if (!colorName.contains(":")) {
            return getCSS(colorName.toLowerCase());
        } else {
            System.out.printf("Color %s could not be found%n", colorName);
            return null;
        }
    }

    /**
     * Hexadecimal representation of AWT color "red".
     */
    @NewColor(type = ColorType.AWT, name = "red")
    String RED = "#FF0000";
    /**
     * Hexadecimal representation of AWT color "green".
     */
    @NewColor(type = ColorType.AWT, name = "green")
    String GREEN = "#00FF00";
    /**
     * Hexadecimal representation of AWT color "blue".
     */
    @NewColor(type = ColorType.AWT, name = "blue")
    String BLUE = "#0000ff";
    /**
     * Hexadecimal representation of AWT color "cyan".
     */
    @NewColor(type = ColorType.AWT, name = "cyan")
    String CYAN = "#00FFFF";
    /**
     * Hexadecimal representation of AWT color "magenta".
     */
    @NewColor(type = ColorType.AWT, name = "magenta")
    String MAGENTA = "#FF00FF";
    /**
     * Hexadecimal representation of AWT color "yellow".
     */
    @NewColor(type = ColorType.AWT, name = "yellow")
    String YELLOW = "#FFFF00";
    /**
     * Hexadecimal representation of AWT color "white".
     */
    @NewColor(type = ColorType.AWT, name = "white")
    String WHITE = "#FFFFFF";
    /**
     * Hexadecimal representation of AWT color "black".
     */
    @NewColor(type = ColorType.AWT, name = "black")
    String BLACK = "#000000";
    /**
     * Hexadecimal representation of AWT color "lightgray".
     */
    @NewColor(type = ColorType.AWT, name = "lightgray")
    String LIGHT_GRAY = "#c0c0c0";
    /**
     * Hexadecimal representation of AWT color "darkgray".
     */
    @NewColor(type = ColorType.AWT, name = "darkgray")
    String DARK_GRAY = "#404040";
    /**
     * Hexadecimal representation of AWT color "pink".
     */
    @NewColor(type = ColorType.AWT, name = "pink")
    String PINK = "#ffafaf";
    /**
     * Hexadecimal representation of AWT color "orange".
     */
    @NewColor(type = ColorType.AWT, name = "orange")
    String ORANGE = "#ffc800";
    /**
     * Hexadecimal representation of AWT color "gray".
     */
    @NewColor(type = ColorType.AWT, name = "gray")
    String GRAY = "#808080";

    /**
     * Hexadecimal representation of CSS color "aliceblue".
     */
    @NewColor(type = ColorType.CSS, name = "aliceblue")
    String aliceblue = "#F0F8FF";
    /**
     * Hexadecimal representation of CSS color "antiquewhite".
     */
    @NewColor(type = ColorType.CSS, name = "antiquewhite")
    String antiquewhite = "#FAEBD7";
    /**
     * Hexadecimal representation of CSS color "aqua".
     */
    @NewColor(type = ColorType.CSS, name = "aqua")
    String aqua = CYAN;
    /**
     * Hexadecimal representation of CSS color "aquamarine".
     */
    @NewColor(type = ColorType.CSS, name = "aquamarine")
    String aquamarine = "#7FFFD4";
    /**
     * Hexadecimal representation of CSS color "azure".
     */
    @NewColor(type = ColorType.CSS, name = "azure")
    String azure = "#F0FFFF";
    /**
     * Hexadecimal representation of CSS color "beige".
     */
    @NewColor(type = ColorType.CSS, name = "beige")
    String beige = "#F5F5DC";
    /**
     * Hexadecimal representation of CSS color "bisque".
     */
    @NewColor(type = ColorType.CSS, name = "bisque")
    String bisque = "#FFE4C4";
    /**
     * Hexadecimal representation of CSS color "black".
     */
    @NewColor(type = ColorType.CSS, name = "black")
    String black = BLACK;
    /**
     * Hexadecimal representation of CSS color "blanchedalmond".
     */
    @NewColor(type = ColorType.CSS, name = "blanchedalmond")
    String blanchedalmond = "#FFEBCD";
    /**
     * Hexadecimal representation of CSS color "blue".
     */
    @NewColor(type = ColorType.CSS, name = "blue")
    String blue = BLUE;
    /**
     * Hexadecimal representation of CSS color "blueviolet".
     */
    @NewColor(type = ColorType.CSS, name = "blueviolet")
    String blueviolet = "#8A2BE2";
    /**
     * Hexadecimal representation of CSS color "brown".
     */
    @NewColor(type = ColorType.CSS, name = "brown")
    String brown = "#A52A2A";
    /**
     * Hexadecimal representation of CSS color "burlywood".
     */
    @NewColor(type = ColorType.CSS, name = "burlywood")
    String burlywood = "#DEB887";
    /**
     * Hexadecimal representation of CSS color "cadetblue".
     */
    @NewColor(type = ColorType.CSS, name = "cadetblue")
    String cadetblue = "#5F9EA0";
    /**
     * Hexadecimal representation of CSS color "chartreuse".
     */
    @NewColor(type = ColorType.CSS, name = "chartreuse")
    String chartreuse = "#7FFF00";
    /**
     * Hexadecimal representation of CSS color "chocolate".
     */
    @NewColor(type = ColorType.CSS, name = "chocolate")
    String chocolate = "#D2691E";
    /**
     * Hexadecimal representation of CSS color "coral".
     */
    @NewColor(type = ColorType.CSS, name = "coral")
    String coral = "#FF7F50";
    /**
     * Hexadecimal representation of CSS color "cornflowerblue".
     */
    @NewColor(type = ColorType.CSS, name = "cornflowerblue")
    String cornflowerblue = "#6495ED";
    /**
     * Hexadecimal representation of CSS color "cornsilk".
     */
    @NewColor(type = ColorType.CSS, name = "cornsilk")
    String cornsilk = "#FFF8DC";
    /**
     * Hexadecimal representation of CSS color "crimson".
     */
    @NewColor(type = ColorType.CSS, name = "crimson")
    String crimson = "#DC143C";
    /**
     * Hexadecimal representation of CSS color "cyan".
     */
    @NewColor(type = ColorType.CSS, name = "cyan")
    String cyan = CYAN;
    /**
     * Hexadecimal representation of CSS color "darkblue".
     */
    @NewColor(type = ColorType.CSS, name = "darkblue")
    String darkblue = "#00008B";
    /**
     * Hexadecimal representation of CSS color "darkcyan".
     */
    @NewColor(type = ColorType.CSS, name = "darkcyan")
    String darkcyan = "#008B8B";
    /**
     * Hexadecimal representation of CSS color "darkgoldenrod".
     */
    @NewColor(type = ColorType.CSS, name = "darkgoldenrod")
    String darkgoldenrod = "#B8860B";
    /**
     * Hexadecimal representation of CSS color "darkgray".
     */
    @NewColor(type = ColorType.CSS, name = "darkgray")
    String darkgray = "#A9A9A9";
    /**
     * Hexadecimal representation of CSS color "darkgreen".
     */
    @NewColor(type = ColorType.CSS, name = "darkgreen")
    String darkgreen = "#006400";
    /**
     * Hexadecimal representation of CSS color "darkgrey".
     */
    @NewColor(type = ColorType.CSS, name = "darkgrey")
    String darkgrey = darkgray;
    /**
     * Hexadecimal representation of CSS color "darkkhaki".
     */
    @NewColor(type = ColorType.CSS, name = "darkkhaki")
    String darkkhaki = "#BDB76B";
    /**
     * Hexadecimal representation of CSS color "darkmagenta".
     */
    @NewColor(type = ColorType.CSS, name = "darkmagenta")
    String darkmagenta = "#8B008B";
    /**
     * Hexadecimal representation of CSS color "darkolivegreen".
     */
    @NewColor(type = ColorType.CSS, name = "darkolivegreen")
    String darkolivegreen = "#556B2F";
    /**
     * Hexadecimal representation of CSS color "darkorange".
     */
    @NewColor(type = ColorType.CSS, name = "darkorange")
    String darkorange = "#FF8C00";
    /**
     * Hexadecimal representation of CSS color "darkorchid".
     */
    @NewColor(type = ColorType.CSS, name = "darkorchid")
    String darkorchid = "#9932CC";
    /**
     * Hexadecimal representation of CSS color "darkred".
     */
    @NewColor(type = ColorType.CSS, name = "darkred")
    String darkred = "#8B0000";
    /**
     * Hexadecimal representation of CSS color "darksalmon".
     */
    @NewColor(type = ColorType.CSS, name = "darksalmon")
    String darksalmon = "#E9967A";
    /**
     * Hexadecimal representation of CSS color "darkseagreen".
     */
    @NewColor(type = ColorType.CSS, name = "darkseagreen")
    String darkseagreen = "#8FBC8F";
    /**
     * Hexadecimal representation of CSS color "darkslateblue".
     */
    @NewColor(type = ColorType.CSS, name = "darkslateblue")
    String darkslateblue = "#483D8B";
    /**
     * Hexadecimal representation of CSS color "darkslategray".
     */
    @NewColor(type = ColorType.CSS, name = "darkslategray")
    String darkslategray = "#2F4F4F";
    /**
     * Hexadecimal representation of CSS color "darkslategrey".
     */
    @NewColor(type = ColorType.CSS, name = "darkslategrey")
    String darkslategrey = darkslategray;
    /**
     * Hexadecimal representation of CSS color "darkturquoise".
     */
    @NewColor(type = ColorType.CSS, name = "darkturquoise")
    String darkturquoise = "#00CED1";
    /**
     * Hexadecimal representation of CSS color "darkviolet".
     */
    @NewColor(type = ColorType.CSS, name = "darkviolet")
    String darkviolet = "#9400D3";
    /**
     * Hexadecimal representation of CSS color "deeppink".
     */
    @NewColor(type = ColorType.CSS, name = "deeppink")
    String deeppink = "#FF1493";
    /**
     * Hexadecimal representation of CSS color "deepskyblue".
     */
    @NewColor(type = ColorType.CSS, name = "deepskyblue")
    String deepskyblue = "#00BFFF";
    /**
     * Hexadecimal representation of CSS color "dimgray".
     */
    @NewColor(type = ColorType.CSS, name = "dimgray")
    String dimgray = "#696969";
    /**
     * Hexadecimal representation of CSS color "dimgrey".
     */
    @NewColor(type = ColorType.CSS, name = "dimgrey")
    String dimgrey = dimgray;
    /**
     * Hexadecimal representation of CSS color "dodgerblue".
     */
    @NewColor(type = ColorType.CSS, name = "dodgerblue")
    String dodgerblue = "#1E90FF";
    /**
     * Hexadecimal representation of CSS color "firebrick".
     */
    @NewColor(type = ColorType.CSS, name = "firebrick")
    String firebrick = "#B22222";
    /**
     * Hexadecimal representation of CSS color "floralwhite".
     */
    @NewColor(type = ColorType.CSS, name = "floralwhite")
    String floralwhite = "#FFFAF0";
    /**
     * Hexadecimal representation of CSS color "forestgreen".
     */
    @NewColor(type = ColorType.CSS, name = "forestgreen")
    String forestgreen = "#228B22";
    /**
     * Hexadecimal representation of CSS color "fuchsia".
     */
    @NewColor(type = ColorType.CSS, name = "fuchsia")
    String fuchsia = MAGENTA;
    /**
     * Hexadecimal representation of CSS color "gainsboro".
     */
    @NewColor(type = ColorType.CSS, name = "gainsboro")
    String gainsboro = "#DCDCDC";
    /**
     * Hexadecimal representation of CSS color "ghostwhite".
     */
    @NewColor(type = ColorType.CSS, name = "ghostwhite")
    String ghostwhite = "#F8F8FF";
    /**
     * Hexadecimal representation of CSS color "gold".
     */
    @NewColor(type = ColorType.CSS, name = "gold")
    String gold = "#FFD700";
    /**
     * Hexadecimal representation of CSS color "goldenrod".
     */
    @NewColor(type = ColorType.CSS, name = "goldenrod")
    String goldenrod = "#DAA520";
    /**
     * Hexadecimal representation of CSS color "gray".
     */
    @NewColor(type = ColorType.CSS, name = "gray")
    String gray = GRAY;
    /**
     * Hexadecimal representation of CSS color "green".
     */
    @NewColor(type = ColorType.CSS, name = "green")
    String green = "#008000";
    /**
     * Hexadecimal representation of CSS color "greenyellow".
     */
    @NewColor(type = ColorType.CSS, name = "greenyellow")
    String greenyellow = "#ADFF2F";
    /**
     * Hexadecimal representation of CSS color "grey".
     */
    @NewColor(type = ColorType.CSS, name = "grey")
    String grey = gray;
    /**
     * Hexadecimal representation of CSS color "honeydew".
     */
    @NewColor(type = ColorType.CSS, name = "honeydew")
    String honeydew = "#F0FFF0";
    /**
     * Hexadecimal representation of CSS color "hotpink".
     */
    @NewColor(type = ColorType.CSS, name = "hotpink")
    String hotpink = "#FF69B4";
    /**
     * Hexadecimal representation of CSS color "indianred".
     */
    @NewColor(type = ColorType.CSS, name = "indianred")
    String indianred = "#CD5C5C";
    /**
     * Hexadecimal representation of CSS color "indigo".
     */
    @NewColor(type = ColorType.CSS, name = "indigo")
    String indigo = "#4B0082";
    /**
     * Hexadecimal representation of CSS color "ivory".
     */
    @NewColor(type = ColorType.CSS, name = "ivory")
    String ivory = "#FFFFF0";
    /**
     * Hexadecimal representation of CSS color "khaki".
     */
    @NewColor(type = ColorType.CSS, name = "khaki")
    String khaki = "#F0E68C";
    /**
     * Hexadecimal representation of CSS color "lavender".
     */
    @NewColor(type = ColorType.CSS, name = "lavender")
    String lavender = "#E6E6FA";
    /**
     * Hexadecimal representation of CSS color "lavenderblush".
     */
    @NewColor(type = ColorType.CSS, name = "lavenderblush")
    String lavenderblush = "#FFF0F5";
    /**
     * Hexadecimal representation of CSS color "lawngreen".
     */
    @NewColor(type = ColorType.CSS, name = "lawngreen")
    String lawngreen = "#7CFC00";
    /**
     * Hexadecimal representation of CSS color "lemonchiffon".
     */
    @NewColor(type = ColorType.CSS, name = "lemonchiffon")
    String lemonchiffon = "#FFFACD";
    /**
     * Hexadecimal representation of CSS color "lightblue".
     */
    @NewColor(type = ColorType.CSS, name = "lightblue")
    String lightblue = "#ADD8E6";
    /**
     * Hexadecimal representation of CSS color "lightcoral".
     */
    @NewColor(type = ColorType.CSS, name = "lightcoral")
    String lightcoral = "#F08080";
    /**
     * Hexadecimal representation of CSS color "lightcyan".
     */
    @NewColor(type = ColorType.CSS, name = "lightcyan")
    String lightcyan = "#E0FFFF";
    /**
     * Hexadecimal representation of CSS color "lightgoldenrodyellow".
     */
    @NewColor(type = ColorType.CSS, name = "lightgoldenrodyellow")
    String lightgoldenrodyellow = "#FAFAD2";
    /**
     * Hexadecimal representation of CSS color "lightgray".
     */
    @NewColor(type = ColorType.CSS, name = "lightgray")
    String lightgray = "#D3D3D3";
    /**
     * Hexadecimal representation of CSS color "lightgreen".
     */
    @NewColor(type = ColorType.CSS, name = "lightgreen")
    String lightgreen = "#90EE90";
    /**
     * Hexadecimal representation of CSS color "lightgrey".
     */
    @NewColor(type = ColorType.CSS, name = "lightgrey")
    String lightgrey = lightgray;
    /**
     * Hexadecimal representation of CSS color "lightpink".
     */
    @NewColor(type = ColorType.CSS, name = "lightpink")
    String lightpink = "#FFB6C1";
    /**
     * Hexadecimal representation of CSS color "lightsalmon".
     */
    @NewColor(type = ColorType.CSS, name = "lightsalmon")
    String lightsalmon = "#FFA07A";
    /**
     * Hexadecimal representation of CSS color "lightseagreen".
     */
    @NewColor(type = ColorType.CSS, name = "lightseagreen")
    String lightseagreen = "#20B2AA";
    /**
     * Hexadecimal representation of CSS color "lightskyblue".
     */
    @NewColor(type = ColorType.CSS, name = "lightskyblue")
    String lightskyblue = "#87CEFA";
    /**
     * Hexadecimal representation of CSS color "lightslategray".
     */
    @NewColor(type = ColorType.CSS, name = "lightslategray")
    String lightslategray = "#778899";
    /**
     * Hexadecimal representation of CSS color "lightslategrey".
     */
    @NewColor(type = ColorType.CSS, name = "lightslategrey")
    String lightslategrey = lightslategray;
    /**
     * Hexadecimal representation of CSS color "lightsteelblue".
     */
    @NewColor(type = ColorType.CSS, name = "lightsteelblue")
    String lightsteelblue = "#B0C4DE";
    /**
     * Hexadecimal representation of CSS color "lightyellow".
     */
    @NewColor(type = ColorType.CSS, name = "lightyellow")
    String lightyellow = "#FFFFE0";
    /**
     * Hexadecimal representation of CSS color "lime".
     */
    @NewColor(type = ColorType.CSS, name = "lime")
    String lime = GREEN;
    /**
     * Hexadecimal representation of CSS color "limegreen".
     */
    @NewColor(type = ColorType.CSS, name = "limegreen")
    String limegreen = "#32CD32";
    /**
     * Hexadecimal representation of CSS color "linen".
     */
    @NewColor(type = ColorType.CSS, name = "linen")
    String linen = "#FAF0E6";
    /**
     * Hexadecimal representation of CSS color "magenta".
     */
    @NewColor(type = ColorType.CSS, name = "magenta")
    String magenta = MAGENTA;
    /**
     * Hexadecimal representation of CSS color "maroon".
     */
    @NewColor(type = ColorType.CSS, name = "maroon")
    String maroon = "#800000";
    /**
     * Hexadecimal representation of CSS color "mediumaquamarine".
     */
    @NewColor(type = ColorType.CSS, name = "mediumaquamarine")
    String mediumaquamarine = "#66CDAA";
    /**
     * Hexadecimal representation of CSS color "mediumblue".
     */
    @NewColor(type = ColorType.CSS, name = "mediumblue")
    String mediumblue = "#0000CD";
    /**
     * Hexadecimal representation of CSS color "mediumorchid".
     */
    @NewColor(type = ColorType.CSS, name = "mediumorchid")
    String mediumorchid = "#BA55D3";
    /**
     * Hexadecimal representation of CSS color "mediumpurple".
     */
    @NewColor(type = ColorType.CSS, name = "mediumpurple")
    String mediumpurple = "#9370DB";
    /**
     * Hexadecimal representation of CSS color "mediumseagreen".
     */
    @NewColor(type = ColorType.CSS, name = "mediumseagreen")
    String mediumseagreen = "#3CB371";
    /**
     * Hexadecimal representation of CSS color "mediumslateblue".
     */
    @NewColor(type = ColorType.CSS, name = "mediumslateblue")
    String mediumslateblue = "#7B68EE";
    /**
     * Hexadecimal representation of CSS color "mediumspringgreen".
     */
    @NewColor(type = ColorType.CSS, name = "mediumspringgreen")
    String mediumspringgreen = "#00FA9A";
    /**
     * Hexadecimal representation of CSS color "mediumturquoise".
     */
    @NewColor(type = ColorType.CSS, name = "mediumturquoise")
    String mediumturquoise = "#48D1CC";
    /**
     * Hexadecimal representation of CSS color "mediumvioletred".
     */
    @NewColor(type = ColorType.CSS, name = "mediumvioletred")
    String mediumvioletred = "#C71585";
    /**
     * Hexadecimal representation of CSS color "midnightblue".
     */
    @NewColor(type = ColorType.CSS, name = "midnightblue")
    String midnightblue = "#191970";
    /**
     * Hexadecimal representation of CSS color "mintcream".
     */
    @NewColor(type = ColorType.CSS, name = "mintcream")
    String mintcream = "#F5FFFA";
    /**
     * Hexadecimal representation of CSS color "mistyrose".
     */
    @NewColor(type = ColorType.CSS, name = "mistyrose")
    String mistyrose = "#FFE4E1";
    /**
     * Hexadecimal representation of CSS color "moccasin".
     */
    @NewColor(type = ColorType.CSS, name = "moccasin")
    String moccasin = "#FFE4B5";
    /**
     * Hexadecimal representation of CSS color "navajowhite".
     */
    @NewColor(type = ColorType.CSS, name = "navajowhite")
    String navajowhite = "#FFDEAD";
    /**
     * Hexadecimal representation of CSS color "navy".
     */
    @NewColor(type = ColorType.CSS, name = "navy")
    String navy = "#000080";
    /**
     * Hexadecimal representation of CSS color "oldlace".
     */
    @NewColor(type = ColorType.CSS, name = "oldlace")
    String oldlace = "#FDF5E6";
    /**
     * Hexadecimal representation of CSS color "olive".
     */
    @NewColor(type = ColorType.CSS, name = "olive")
    String olive = "#808000";
    /**
     * Hexadecimal representation of CSS color "olivedrab".
     */
    @NewColor(type = ColorType.CSS, name = "olivedrab")
    String olivedrab = "#6B8E23";
    /**
     * Hexadecimal representation of CSS color "orange".
     */
    @NewColor(type = ColorType.CSS, name = "orange")
    String orange = "#FFA500";
    /**
     * Hexadecimal representation of CSS color "orangered".
     */
    @NewColor(type = ColorType.CSS, name = "orangered")
    String orangered = "#FF4500";
    /**
     * Hexadecimal representation of CSS color "orchid".
     */
    @NewColor(type = ColorType.CSS, name = "orchid")
    String orchid = "#DA70D6";
    /**
     * Hexadecimal representation of CSS color "palegoldenrod".
     */
    @NewColor(type = ColorType.CSS, name = "palegoldenrod")
    String palegoldenrod = "#EEE8AA";
    /**
     * Hexadecimal representation of CSS color "palegreen".
     */
    @NewColor(type = ColorType.CSS, name = "palegreen")
    String palegreen = "#98FB98";
    /**
     * Hexadecimal representation of CSS color "paleturquoise".
     */
    @NewColor(type = ColorType.CSS, name = "paleturquoise")
    String paleturquoise = "#AFEEEE";
    /**
     * Hexadecimal representation of CSS color "palevioletred".
     */
    @NewColor(type = ColorType.CSS, name = "palevioletred")
    String palevioletred = "#DB7093";
    /**
     * Hexadecimal representation of CSS color "papayawhip".
     */
    @NewColor(type = ColorType.CSS, name = "papayawhip")
    String papayawhip = "#FFEFD5";
    /**
     * Hexadecimal representation of CSS color "peachpuff".
     */
    @NewColor(type = ColorType.CSS, name = "peachpuff")
    String peachpuff = "#FFDAB9";
    /**
     * Hexadecimal representation of CSS color "peru".
     */
    @NewColor(type = ColorType.CSS, name = "peru")
    String peru = "#CD853F";
    /**
     * Hexadecimal representation of CSS color "pink".
     */
    @NewColor(type = ColorType.CSS, name = "pink")
    String pink = "#FFC0CB";
    /**
     * Hexadecimal representation of CSS color "plum".
     */
    @NewColor(type = ColorType.CSS, name = "plum")
    String plum = "#DDA0DD";
    /**
     * Hexadecimal representation of CSS color "powderblue".
     */
    @NewColor(type = ColorType.CSS, name = "powderblue")
    String powderblue = "#B0E0E6";
    /**
     * Hexadecimal representation of CSS color "purple".
     */
    @NewColor(type = ColorType.CSS, name = "purple")
    String purple = "#800080";
    /**
     * Hexadecimal representation of CSS color "rebeccapurple".
     */
    @NewColor(type = ColorType.CSS, name = "rebeccapurple")
    String rebeccapurple = "#663399";
    /**
     * Hexadecimal representation of CSS color "red".
     */
    @NewColor(type = ColorType.CSS, name = "red")
    String red = RED;
    /**
     * Hexadecimal representation of CSS color "rosybrown".
     */
    @NewColor(type = ColorType.CSS, name = "rosybrown")
    String rosybrown = "#BC8F8F";
    /**
     * Hexadecimal representation of CSS color "royalblue".
     */
    @NewColor(type = ColorType.CSS, name = "royalblue")
    String royalblue = "#4169E1";
    /**
     * Hexadecimal representation of CSS color "saddlebrown".
     */
    @NewColor(type = ColorType.CSS, name = "saddlebrown")
    String saddlebrown = "#8B4513";
    /**
     * Hexadecimal representation of CSS color "salmon".
     */
    @NewColor(type = ColorType.CSS, name = "salmon")
    String salmon = "#FA8072";
    /**
     * Hexadecimal representation of CSS color "sandybrown".
     */
    @NewColor(type = ColorType.CSS, name = "sandybrown")
    String sandybrown = "#F4A460";
    /**
     * Hexadecimal representation of CSS color "seagreen".
     */
    @NewColor(type = ColorType.CSS, name = "seagreen")
    String seagreen = "#2E8B57";
    /**
     * Hexadecimal representation of CSS color "seashell".
     */
    @NewColor(type = ColorType.CSS, name = "seashell")
    String seashell = "#FFF5EE";
    /**
     * Hexadecimal representation of CSS color "sienna".
     */
    @NewColor(type = ColorType.CSS, name = "sienna")
    String sienna = "#A0522D";
    /**
     * Hexadecimal representation of CSS color "silver".
     */
    @NewColor(type = ColorType.CSS, name = "silver")
    String silver = LIGHT_GRAY;
    /**
     * Hexadecimal representation of CSS color "skyblue".
     */
    @NewColor(type = ColorType.CSS, name = "skyblue")
    String skyblue = "#87CEEB";
    /**
     * Hexadecimal representation of CSS color "slateblue".
     */
    @NewColor(type = ColorType.CSS, name = "slateblue")
    String slateblue = "#6A5ACD";
    /**
     * Hexadecimal representation of CSS color "slategray".
     */
    @NewColor(type = ColorType.CSS, name = "slategray")
    String slategray = "#708090";
    /**
     * Hexadecimal representation of CSS color "slategrey".
     */
    @NewColor(type = ColorType.CSS, name = "slategrey")
    String slategrey = slategray;
    /**
     * Hexadecimal representation of CSS color "snow".
     */
    @NewColor(type = ColorType.CSS, name = "snow")
    String snow = "#FFFAFA";
    /**
     * Hexadecimal representation of CSS color "springgreen".
     */
    @NewColor(type = ColorType.CSS, name = "springgreen")
    String springgreen = "#00FF7F";
    /**
     * Hexadecimal representation of CSS color "steelblue".
     */
    @NewColor(type = ColorType.CSS, name = "steelblue")
    String steelblue = "#4682B4";
    /**
     * Hexadecimal representation of CSS color "tan".
     */
    @NewColor(type = ColorType.CSS, name = "tan")
    String tan = "#D2B48C";
    /**
     * Hexadecimal representation of CSS color "teal".
     */
    @NewColor(type = ColorType.CSS, name = "teal")
    String teal = "#008080";
    /**
     * Hexadecimal representation of CSS color "thistle".
     */
    @NewColor(type = ColorType.CSS, name = "thistle")
    String thistle = "#D8BFD8";
    /**
     * Hexadecimal representation of CSS color "tomato".
     */
    @NewColor(type = ColorType.CSS, name = "tomato")
    String tomato = "#FF6347";
    /**
     * Hexadecimal representation of CSS color "turquoise".
     */
    @NewColor(type = ColorType.CSS, name = "turquoise")
    String turquoise = "#40E0D0";
    /**
     * Hexadecimal representation of CSS color "violet".
     */
    @NewColor(type = ColorType.CSS, name = "violet")
    String violet = "#EE82EE";
    /**
     * Hexadecimal representation of CSS color "wheat".
     */
    @NewColor(type = ColorType.CSS, name = "wheat")
    String wheat = "#F5DEB3";
    /**
     * Hexadecimal representation of CSS color "white".
     */
    @NewColor(type = ColorType.CSS, name = "white")
    String white = WHITE;
    /**
     * Hexadecimal representation of CSS color "whitesmoke".
     */
    @NewColor(type = ColorType.CSS, name = "whitesmoke")
    String whitesmoke = "#F5F5F5";
    /**
     * Hexadecimal representation of CSS color "yellow".
     */
    @NewColor(type = ColorType.CSS, name = "yellow")
    String yellow = YELLOW;
    /**
     * Hexadecimal representation of CSS color "yellowgreen".
     */
    @NewColor(type = ColorType.CSS, name = "yellowgreen")
    String yellowgreen = "#9ACD32";

    /**
     * Hexadecimal representation of TABLEAU color "blue".
     */
    @NewColor(type = ColorType.TABLEAU, name = "blue")
    String tab_blue = "#1f77b4";
    /**
     * Hexadecimal representation of TABLEAU color "orange".
     */
    @NewColor(type = ColorType.TABLEAU, name = "orange")
    String tab_orange = "#ff7f0e";
    /**
     * Hexadecimal representation of TABLEAU color "green".
     */
    @NewColor(type = ColorType.TABLEAU, name = "green")
    String tab_green = "#2ca02c";
    /**
     * Hexadecimal representation of TABLEAU color "red".
     */
    @NewColor(type = ColorType.TABLEAU, name = "red")
    String tab_red = "#d62728";
    /**
     * Hexadecimal representation of TABLEAU color "purple".
     */
    @NewColor(type = ColorType.TABLEAU, name = "purple")
    String tab_purple = "#9467bd";
    /**
     * Hexadecimal representation of TABLEAU color "brown".
     */
    @NewColor(type = ColorType.TABLEAU, name = "brown")
    String tab_brown = "#8c564b";
    /**
     * Hexadecimal representation of TABLEAU color "pink".
     */
    @NewColor(type = ColorType.TABLEAU, name = "pink")
    String tab_pink = "#e377c2";
    /**
     * Hexadecimal representation of TABLEAU color "grey".
     */
    @NewColor(type = ColorType.TABLEAU, name = "grey")
    String tab_grey = "#7f7f7f";
    /**
     * Hexadecimal representation of TABLEAU color "olive".
     */
    @NewColor(type = ColorType.TABLEAU, name = "olive")
    String tab_olive = "#bcbd22";
    /**
     * Hexadecimal representation of TABLEAU color "aqua".
     */
    @NewColor(type = ColorType.TABLEAU, name = "aqua")
    String tab_aqua = "#17becf";
    /**
     * Hexadecimal representation of TABLEAU color "lightblue".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightblue")
    String tab_lightblue = "#aec7e8";
    /**
     * Hexadecimal representation of TABLEAU color "lightorange".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightorange")
    String tab_lightorange = "#ffbb78";
    /**
     * Hexadecimal representation of TABLEAU color "lightgreen".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightgreen")
    String tab_lightgreen = "#98df8a";
    /**
     * Hexadecimal representation of TABLEAU color "lightred".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightred")
    String tab_lightred = "#ff9896";
    /**
     * Hexadecimal representation of TABLEAU color "lightpurple".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightpurple")
    String tab_lightpurple = "#c5b0d5";
    /**
     * Hexadecimal representation of TABLEAU color "lightbrown".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightbrown")
    String tab_lightbrown = "#c49c94";
    /**
     * Hexadecimal representation of TABLEAU color "lightpink".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightpink")
    String tab_lightpink = "#f7b6d2";
    /**
     * Hexadecimal representation of TABLEAU color "lightgrey".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightgrey")
    String tab_lightgrey = "#c7c7c7";
    /**
     * Hexadecimal representation of TABLEAU color "lightolive".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightolive")
    String tab_lightolive = "#dbdb8d";
    /**
     * Hexadecimal representation of TABLEAU color "lightaqua".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightaqua")
    String tab_lightaqua = "#9edae5";

}
