package net.mahdilamb.colormap.color;

import java.lang.reflect.Field;
import java.util.*;

import static net.mahdilamb.colormap.color.ColorUtils.*;

/**
 * The Color class is a framework independent holder of color. The primary motivation of this class is to hold a 4-component float representation o
 * of an RGBA color that is mutable, and for those changes to be listenable.
 * <p>
 * In addition, there contain string constants that represent generally used colors from AWT, CSS4 and Tableau.
 */
public class Color implements Cloneable {
    /**
     * An unmodifiable version of a color
     */
    public static final class UnmodifiableColor extends Color {
        /**
         * @param color the color to create an unmodifiable version of
         */
        UnmodifiableColor(Color color) {
            super(color);
        }

        @Override
        public Color setRed(final double red) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color setGreen(final double green) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color setBlue(final double blue) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Color setAlpha(final double alpha) throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean isModifiable() {
            return false;
        }
    }

    /**
     * Hexadecimal representation of AWT color "red".
     */
    @NewColor(type = ColorType.AWT, name = "red")
    public static final String RED = "#FF0000";
    /**
     * Hexadecimal representation of AWT color "green".
     */
    @NewColor(type = ColorType.AWT, name = "green")
    public static final String GREEN = "#00FF00";
    /**
     * Hexadecimal representation of AWT color "blue".
     */
    @NewColor(type = ColorType.AWT, name = "blue")
    public static final String BLUE = "#0000ff";
    /**
     * Hexadecimal representation of AWT color "cyan".
     */
    @NewColor(type = ColorType.AWT, name = "cyan")
    public static final String CYAN = "#00FFFF";
    /**
     * Hexadecimal representation of AWT color "magenta".
     */
    @NewColor(type = ColorType.AWT, name = "magenta")
    public static final String MAGENTA = "#FF00FF";
    /**
     * Hexadecimal representation of AWT color "yellow".
     */
    @NewColor(type = ColorType.AWT, name = "yellow")
    public static final String YELLOW = "#FFFF00";
    /**
     * Hexadecimal representation of AWT color "white".
     */
    @NewColor(type = ColorType.AWT, name = "white")
    public static final String WHITE = "#FFFFFF";
    /**
     * Hexadecimal representation of AWT color "black".
     */
    @NewColor(type = ColorType.AWT, name = "black")
    public static final String BLACK = "#000000";
    /**
     * Hexadecimal representation of AWT color "lightgray".
     */
    @NewColor(type = ColorType.AWT, name = "lightgray")
    public static final String LIGHT_GRAY = "#c0c0c0";
    /**
     * Hexadecimal representation of AWT color "darkgray".
     */
    @NewColor(type = ColorType.AWT, name = "darkgray")
    public static final String DARK_GRAY = "#404040";
    /**
     * Hexadecimal representation of AWT color "pink".
     */
    @NewColor(type = ColorType.AWT, name = "pink")
    public static final String PINK = "#ffafaf";
    /**
     * Hexadecimal representation of AWT color "orange".
     */
    @NewColor(type = ColorType.AWT, name = "orange")
    public static final String ORANGE = "#ffc800";
    /**
     * Hexadecimal representation of AWT color "gray".
     */
    @NewColor(type = ColorType.AWT, name = "gray")
    public static final String GRAY = "#808080";

    /**
     * Hexadecimal representation of CSS color "aliceblue".
     */
    @NewColor(type = ColorType.CSS, name = "aliceblue")
    public static final String aliceblue = "#F0F8FF";
    /**
     * Hexadecimal representation of CSS color "antiquewhite".
     */
    @NewColor(type = ColorType.CSS, name = "antiquewhite")
    public static final String antiquewhite = "#FAEBD7";
    /**
     * Hexadecimal representation of CSS color "aqua".
     */
    @NewColor(type = ColorType.CSS, name = "aqua")
    public static final String aqua = CYAN;
    /**
     * Hexadecimal representation of CSS color "aquamarine".
     */
    @NewColor(type = ColorType.CSS, name = "aquamarine")
    public static final String aquamarine = "#7FFFD4";
    /**
     * Hexadecimal representation of CSS color "azure".
     */
    @NewColor(type = ColorType.CSS, name = "azure")
    public static final String azure = "#F0FFFF";
    /**
     * Hexadecimal representation of CSS color "beige".
     */
    @NewColor(type = ColorType.CSS, name = "beige")
    public static final String beige = "#F5F5DC";
    /**
     * Hexadecimal representation of CSS color "bisque".
     */
    @NewColor(type = ColorType.CSS, name = "bisque")
    public static final String bisque = "#FFE4C4";
    /**
     * Hexadecimal representation of CSS color "black".
     */
    @NewColor(type = ColorType.CSS, name = "black")
    public static final String black = BLACK;
    /**
     * Hexadecimal representation of CSS color "blanchedalmond".
     */
    @NewColor(type = ColorType.CSS, name = "blanchedalmond")
    public static final String blanchedalmond = "#FFEBCD";
    /**
     * Hexadecimal representation of CSS color "blue".
     */
    @NewColor(type = ColorType.CSS, name = "blue")
    public static final String blue = BLUE;
    /**
     * Hexadecimal representation of CSS color "blueviolet".
     */
    @NewColor(type = ColorType.CSS, name = "blueviolet")
    public static final String blueviolet = "#8A2BE2";
    /**
     * Hexadecimal representation of CSS color "brown".
     */
    @NewColor(type = ColorType.CSS, name = "brown")
    public static final String brown = "#A52A2A";
    /**
     * Hexadecimal representation of CSS color "burlywood".
     */
    @NewColor(type = ColorType.CSS, name = "burlywood")
    public static final String burlywood = "#DEB887";
    /**
     * Hexadecimal representation of CSS color "cadetblue".
     */
    @NewColor(type = ColorType.CSS, name = "cadetblue")
    public static final String cadetblue = "#5F9EA0";
    /**
     * Hexadecimal representation of CSS color "chartreuse".
     */
    @NewColor(type = ColorType.CSS, name = "chartreuse")
    public static final String chartreuse = "#7FFF00";
    /**
     * Hexadecimal representation of CSS color "chocolate".
     */
    @NewColor(type = ColorType.CSS, name = "chocolate")
    public static final String chocolate = "#D2691E";
    /**
     * Hexadecimal representation of CSS color "coral".
     */
    @NewColor(type = ColorType.CSS, name = "coral")
    public static final String coral = "#FF7F50";
    /**
     * Hexadecimal representation of CSS color "cornflowerblue".
     */
    @NewColor(type = ColorType.CSS, name = "cornflowerblue")
    public static final String cornflowerblue = "#6495ED";
    /**
     * Hexadecimal representation of CSS color "cornsilk".
     */
    @NewColor(type = ColorType.CSS, name = "cornsilk")
    public static final String cornsilk = "#FFF8DC";
    /**
     * Hexadecimal representation of CSS color "crimson".
     */
    @NewColor(type = ColorType.CSS, name = "crimson")
    public static final String crimson = "#DC143C";
    /**
     * Hexadecimal representation of CSS color "cyan".
     */
    @NewColor(type = ColorType.CSS, name = "cyan")
    public static final String cyan = CYAN;
    /**
     * Hexadecimal representation of CSS color "darkblue".
     */
    @NewColor(type = ColorType.CSS, name = "darkblue")
    public static final String darkblue = "#00008B";
    /**
     * Hexadecimal representation of CSS color "darkcyan".
     */
    @NewColor(type = ColorType.CSS, name = "darkcyan")
    public static final String darkcyan = "#008B8B";
    /**
     * Hexadecimal representation of CSS color "darkgoldenrod".
     */
    @NewColor(type = ColorType.CSS, name = "darkgoldenrod")
    public static final String darkgoldenrod = "#B8860B";
    /**
     * Hexadecimal representation of CSS color "darkgray".
     */
    @NewColor(type = ColorType.CSS, name = "darkgray")
    public static final String darkgray = "#A9A9A9";
    /**
     * Hexadecimal representation of CSS color "darkgreen".
     */
    @NewColor(type = ColorType.CSS, name = "darkgreen")
    public static final String darkgreen = "#006400";
    /**
     * Hexadecimal representation of CSS color "darkgrey".
     */
    @NewColor(type = ColorType.CSS, name = "darkgrey")
    public static final String darkgrey = darkgray;
    /**
     * Hexadecimal representation of CSS color "darkkhaki".
     */
    @NewColor(type = ColorType.CSS, name = "darkkhaki")
    public static final String darkkhaki = "#BDB76B";
    /**
     * Hexadecimal representation of CSS color "darkmagenta".
     */
    @NewColor(type = ColorType.CSS, name = "darkmagenta")
    public static final String darkmagenta = "#8B008B";
    /**
     * Hexadecimal representation of CSS color "darkolivegreen".
     */
    @NewColor(type = ColorType.CSS, name = "darkolivegreen")
    public static final String darkolivegreen = "#556B2F";
    /**
     * Hexadecimal representation of CSS color "darkorange".
     */
    @NewColor(type = ColorType.CSS, name = "darkorange")
    public static final String darkorange = "#FF8C00";
    /**
     * Hexadecimal representation of CSS color "darkorchid".
     */
    @NewColor(type = ColorType.CSS, name = "darkorchid")
    public static final String darkorchid = "#9932CC";
    /**
     * Hexadecimal representation of CSS color "darkred".
     */
    @NewColor(type = ColorType.CSS, name = "darkred")
    public static final String darkred = "#8B0000";
    /**
     * Hexadecimal representation of CSS color "darksalmon".
     */
    @NewColor(type = ColorType.CSS, name = "darksalmon")
    public static final String darksalmon = "#E9967A";
    /**
     * Hexadecimal representation of CSS color "darkseagreen".
     */
    @NewColor(type = ColorType.CSS, name = "darkseagreen")
    public static final String darkseagreen = "#8FBC8F";
    /**
     * Hexadecimal representation of CSS color "darkslateblue".
     */
    @NewColor(type = ColorType.CSS, name = "darkslateblue")
    public static final String darkslateblue = "#483D8B";
    /**
     * Hexadecimal representation of CSS color "darkslategray".
     */
    @NewColor(type = ColorType.CSS, name = "darkslategray")
    public static final String darkslategray = "#2F4F4F";
    /**
     * Hexadecimal representation of CSS color "darkslategrey".
     */
    @NewColor(type = ColorType.CSS, name = "darkslategrey")
    public static final String darkslategrey = darkslategray;
    /**
     * Hexadecimal representation of CSS color "darkturquoise".
     */
    @NewColor(type = ColorType.CSS, name = "darkturquoise")
    public static final String darkturquoise = "#00CED1";
    /**
     * Hexadecimal representation of CSS color "darkviolet".
     */
    @NewColor(type = ColorType.CSS, name = "darkviolet")
    public static final String darkviolet = "#9400D3";
    /**
     * Hexadecimal representation of CSS color "deeppink".
     */
    @NewColor(type = ColorType.CSS, name = "deeppink")
    public static final String deeppink = "#FF1493";
    /**
     * Hexadecimal representation of CSS color "deepskyblue".
     */
    @NewColor(type = ColorType.CSS, name = "deepskyblue")
    public static final String deepskyblue = "#00BFFF";
    /**
     * Hexadecimal representation of CSS color "dimgray".
     */
    @NewColor(type = ColorType.CSS, name = "dimgray")
    public static final String dimgray = "#696969";
    /**
     * Hexadecimal representation of CSS color "dimgrey".
     */
    @NewColor(type = ColorType.CSS, name = "dimgrey")
    public static final String dimgrey = dimgray;
    /**
     * Hexadecimal representation of CSS color "dodgerblue".
     */
    @NewColor(type = ColorType.CSS, name = "dodgerblue")
    public static final String dodgerblue = "#1E90FF";
    /**
     * Hexadecimal representation of CSS color "firebrick".
     */
    @NewColor(type = ColorType.CSS, name = "firebrick")
    public static final String firebrick = "#B22222";
    /**
     * Hexadecimal representation of CSS color "floralwhite".
     */
    @NewColor(type = ColorType.CSS, name = "floralwhite")
    public static final String floralwhite = "#FFFAF0";
    /**
     * Hexadecimal representation of CSS color "forestgreen".
     */
    @NewColor(type = ColorType.CSS, name = "forestgreen")
    public static final String forestgreen = "#228B22";
    /**
     * Hexadecimal representation of CSS color "fuchsia".
     */
    @NewColor(type = ColorType.CSS, name = "fuchsia")
    public static final String fuchsia = MAGENTA;
    /**
     * Hexadecimal representation of CSS color "gainsboro".
     */
    @NewColor(type = ColorType.CSS, name = "gainsboro")
    public static final String gainsboro = "#DCDCDC";
    /**
     * Hexadecimal representation of CSS color "ghostwhite".
     */
    @NewColor(type = ColorType.CSS, name = "ghostwhite")
    public static final String ghostwhite = "#F8F8FF";
    /**
     * Hexadecimal representation of CSS color "gold".
     */
    @NewColor(type = ColorType.CSS, name = "gold")
    public static final String gold = "#FFD700";
    /**
     * Hexadecimal representation of CSS color "goldenrod".
     */
    @NewColor(type = ColorType.CSS, name = "goldenrod")
    public static final String goldenrod = "#DAA520";
    /**
     * Hexadecimal representation of CSS color "gray".
     */
    @NewColor(type = ColorType.CSS, name = "gray")
    public static final String gray = GRAY;
    /**
     * Hexadecimal representation of CSS color "green".
     */
    @NewColor(type = ColorType.CSS, name = "green")
    public static final String green = "#008000";
    /**
     * Hexadecimal representation of CSS color "greenyellow".
     */
    @NewColor(type = ColorType.CSS, name = "greenyellow")
    public static final String greenyellow = "#ADFF2F";
    /**
     * Hexadecimal representation of CSS color "grey".
     */
    @NewColor(type = ColorType.CSS, name = "grey")
    public static final String grey = gray;
    /**
     * Hexadecimal representation of CSS color "honeydew".
     */
    @NewColor(type = ColorType.CSS, name = "honeydew")
    public static final String honeydew = "#F0FFF0";
    /**
     * Hexadecimal representation of CSS color "hotpink".
     */
    @NewColor(type = ColorType.CSS, name = "hotpink")
    public static final String hotpink = "#FF69B4";
    /**
     * Hexadecimal representation of CSS color "indianred".
     */
    @NewColor(type = ColorType.CSS, name = "indianred")
    public static final String indianred = "#CD5C5C";
    /**
     * Hexadecimal representation of CSS color "indigo".
     */
    @NewColor(type = ColorType.CSS, name = "indigo")
    public static final String indigo = "#4B0082";
    /**
     * Hexadecimal representation of CSS color "ivory".
     */
    @NewColor(type = ColorType.CSS, name = "ivory")
    public static final String ivory = "#FFFFF0";
    /**
     * Hexadecimal representation of CSS color "khaki".
     */
    @NewColor(type = ColorType.CSS, name = "khaki")
    public static final String khaki = "#F0E68C";
    /**
     * Hexadecimal representation of CSS color "lavender".
     */
    @NewColor(type = ColorType.CSS, name = "lavender")
    public static final String lavender = "#E6E6FA";
    /**
     * Hexadecimal representation of CSS color "lavenderblush".
     */
    @NewColor(type = ColorType.CSS, name = "lavenderblush")
    public static final String lavenderblush = "#FFF0F5";
    /**
     * Hexadecimal representation of CSS color "lawngreen".
     */
    @NewColor(type = ColorType.CSS, name = "lawngreen")
    public static final String lawngreen = "#7CFC00";
    /**
     * Hexadecimal representation of CSS color "lemonchiffon".
     */
    @NewColor(type = ColorType.CSS, name = "lemonchiffon")
    public static final String lemonchiffon = "#FFFACD";
    /**
     * Hexadecimal representation of CSS color "lightblue".
     */
    @NewColor(type = ColorType.CSS, name = "lightblue")
    public static final String lightblue = "#ADD8E6";
    /**
     * Hexadecimal representation of CSS color "lightcoral".
     */
    @NewColor(type = ColorType.CSS, name = "lightcoral")
    public static final String lightcoral = "#F08080";
    /**
     * Hexadecimal representation of CSS color "lightcyan".
     */
    @NewColor(type = ColorType.CSS, name = "lightcyan")
    public static final String lightcyan = "#E0FFFF";
    /**
     * Hexadecimal representation of CSS color "lightgoldenrodyellow".
     */
    @NewColor(type = ColorType.CSS, name = "lightgoldenrodyellow")
    public static final String lightgoldenrodyellow = "#FAFAD2";
    /**
     * Hexadecimal representation of CSS color "lightgray".
     */
    @NewColor(type = ColorType.CSS, name = "lightgray")
    public static final String lightgray = "#D3D3D3";
    /**
     * Hexadecimal representation of CSS color "lightgreen".
     */
    @NewColor(type = ColorType.CSS, name = "lightgreen")
    public static final String lightgreen = "#90EE90";
    /**
     * Hexadecimal representation of CSS color "lightgrey".
     */
    @NewColor(type = ColorType.CSS, name = "lightgrey")
    public static final String lightgrey = lightgray;
    /**
     * Hexadecimal representation of CSS color "lightpink".
     */
    @NewColor(type = ColorType.CSS, name = "lightpink")
    public static final String lightpink = "#FFB6C1";
    /**
     * Hexadecimal representation of CSS color "lightsalmon".
     */
    @NewColor(type = ColorType.CSS, name = "lightsalmon")
    public static final String lightsalmon = "#FFA07A";
    /**
     * Hexadecimal representation of CSS color "lightseagreen".
     */
    @NewColor(type = ColorType.CSS, name = "lightseagreen")
    public static final String lightseagreen = "#20B2AA";
    /**
     * Hexadecimal representation of CSS color "lightskyblue".
     */
    @NewColor(type = ColorType.CSS, name = "lightskyblue")
    public static final String lightskyblue = "#87CEFA";
    /**
     * Hexadecimal representation of CSS color "lightslategray".
     */
    @NewColor(type = ColorType.CSS, name = "lightslategray")
    public static final String lightslategray = "#778899";
    /**
     * Hexadecimal representation of CSS color "lightslategrey".
     */
    @NewColor(type = ColorType.CSS, name = "lightslategrey")
    public static final String lightslategrey = lightslategray;
    /**
     * Hexadecimal representation of CSS color "lightsteelblue".
     */
    @NewColor(type = ColorType.CSS, name = "lightsteelblue")
    public static final String lightsteelblue = "#B0C4DE";
    /**
     * Hexadecimal representation of CSS color "lightyellow".
     */
    @NewColor(type = ColorType.CSS, name = "lightyellow")
    public static final String lightyellow = "#FFFFE0";
    /**
     * Hexadecimal representation of CSS color "lime".
     */
    @NewColor(type = ColorType.CSS, name = "lime")
    public static final String lime = GREEN;
    /**
     * Hexadecimal representation of CSS color "limegreen".
     */
    @NewColor(type = ColorType.CSS, name = "limegreen")
    public static final String limegreen = "#32CD32";
    /**
     * Hexadecimal representation of CSS color "linen".
     */
    @NewColor(type = ColorType.CSS, name = "linen")
    public static final String linen = "#FAF0E6";
    /**
     * Hexadecimal representation of CSS color "magenta".
     */
    @NewColor(type = ColorType.CSS, name = "magenta")
    public static final String magenta = MAGENTA;
    /**
     * Hexadecimal representation of CSS color "maroon".
     */
    @NewColor(type = ColorType.CSS, name = "maroon")
    public static final String maroon = "#800000";
    /**
     * Hexadecimal representation of CSS color "mediumaquamarine".
     */
    @NewColor(type = ColorType.CSS, name = "mediumaquamarine")
    public static final String mediumaquamarine = "#66CDAA";
    /**
     * Hexadecimal representation of CSS color "mediumblue".
     */
    @NewColor(type = ColorType.CSS, name = "mediumblue")
    public static final String mediumblue = "#0000CD";
    /**
     * Hexadecimal representation of CSS color "mediumorchid".
     */
    @NewColor(type = ColorType.CSS, name = "mediumorchid")
    public static final String mediumorchid = "#BA55D3";
    /**
     * Hexadecimal representation of CSS color "mediumpurple".
     */
    @NewColor(type = ColorType.CSS, name = "mediumpurple")
    public static final String mediumpurple = "#9370DB";
    /**
     * Hexadecimal representation of CSS color "mediumseagreen".
     */
    @NewColor(type = ColorType.CSS, name = "mediumseagreen")
    public static final String mediumseagreen = "#3CB371";
    /**
     * Hexadecimal representation of CSS color "mediumslateblue".
     */
    @NewColor(type = ColorType.CSS, name = "mediumslateblue")
    public static final String mediumslateblue = "#7B68EE";
    /**
     * Hexadecimal representation of CSS color "mediumspringgreen".
     */
    @NewColor(type = ColorType.CSS, name = "mediumspringgreen")
    public static final String mediumspringgreen = "#00FA9A";
    /**
     * Hexadecimal representation of CSS color "mediumturquoise".
     */
    @NewColor(type = ColorType.CSS, name = "mediumturquoise")
    public static final String mediumturquoise = "#48D1CC";
    /**
     * Hexadecimal representation of CSS color "mediumvioletred".
     */
    @NewColor(type = ColorType.CSS, name = "mediumvioletred")
    public static final String mediumvioletred = "#C71585";
    /**
     * Hexadecimal representation of CSS color "midnightblue".
     */
    @NewColor(type = ColorType.CSS, name = "midnightblue")
    public static final String midnightblue = "#191970";
    /**
     * Hexadecimal representation of CSS color "mintcream".
     */
    @NewColor(type = ColorType.CSS, name = "mintcream")
    public static final String mintcream = "#F5FFFA";
    /**
     * Hexadecimal representation of CSS color "mistyrose".
     */
    @NewColor(type = ColorType.CSS, name = "mistyrose")
    public static final String mistyrose = "#FFE4E1";
    /**
     * Hexadecimal representation of CSS color "moccasin".
     */
    @NewColor(type = ColorType.CSS, name = "moccasin")
    public static final String moccasin = "#FFE4B5";
    /**
     * Hexadecimal representation of CSS color "navajowhite".
     */
    @NewColor(type = ColorType.CSS, name = "navajowhite")
    public static final String navajowhite = "#FFDEAD";
    /**
     * Hexadecimal representation of CSS color "navy".
     */
    @NewColor(type = ColorType.CSS, name = "navy")
    public static final String navy = "#000080";
    /**
     * Hexadecimal representation of CSS color "oldlace".
     */
    @NewColor(type = ColorType.CSS, name = "oldlace")
    public static final String oldlace = "#FDF5E6";
    /**
     * Hexadecimal representation of CSS color "olive".
     */
    @NewColor(type = ColorType.CSS, name = "olive")
    public static final String olive = "#808000";
    /**
     * Hexadecimal representation of CSS color "olivedrab".
     */
    @NewColor(type = ColorType.CSS, name = "olivedrab")
    public static final String olivedrab = "#6B8E23";
    /**
     * Hexadecimal representation of CSS color "orange".
     */
    @NewColor(type = ColorType.CSS, name = "orange")
    public static final String orange = "#FFA500";
    /**
     * Hexadecimal representation of CSS color "orangered".
     */
    @NewColor(type = ColorType.CSS, name = "orangered")
    public static final String orangered = "#FF4500";
    /**
     * Hexadecimal representation of CSS color "orchid".
     */
    @NewColor(type = ColorType.CSS, name = "orchid")
    public static final String orchid = "#DA70D6";
    /**
     * Hexadecimal representation of CSS color "palegoldenrod".
     */
    @NewColor(type = ColorType.CSS, name = "palegoldenrod")
    public static final String palegoldenrod = "#EEE8AA";
    /**
     * Hexadecimal representation of CSS color "palegreen".
     */
    @NewColor(type = ColorType.CSS, name = "palegreen")
    public static final String palegreen = "#98FB98";
    /**
     * Hexadecimal representation of CSS color "paleturquoise".
     */
    @NewColor(type = ColorType.CSS, name = "paleturquoise")
    public static final String paleturquoise = "#AFEEEE";
    /**
     * Hexadecimal representation of CSS color "palevioletred".
     */
    @NewColor(type = ColorType.CSS, name = "palevioletred")
    public static final String palevioletred = "#DB7093";
    /**
     * Hexadecimal representation of CSS color "papayawhip".
     */
    @NewColor(type = ColorType.CSS, name = "papayawhip")
    public static final String papayawhip = "#FFEFD5";
    /**
     * Hexadecimal representation of CSS color "peachpuff".
     */
    @NewColor(type = ColorType.CSS, name = "peachpuff")
    public static final String peachpuff = "#FFDAB9";
    /**
     * Hexadecimal representation of CSS color "peru".
     */
    @NewColor(type = ColorType.CSS, name = "peru")
    public static final String peru = "#CD853F";
    /**
     * Hexadecimal representation of CSS color "pink".
     */
    @NewColor(type = ColorType.CSS, name = "pink")
    public static final String pink = "#FFC0CB";
    /**
     * Hexadecimal representation of CSS color "plum".
     */
    @NewColor(type = ColorType.CSS, name = "plum")
    public static final String plum = "#DDA0DD";
    /**
     * Hexadecimal representation of CSS color "powderblue".
     */
    @NewColor(type = ColorType.CSS, name = "powderblue")
    public static final String powderblue = "#B0E0E6";
    /**
     * Hexadecimal representation of CSS color "purple".
     */
    @NewColor(type = ColorType.CSS, name = "purple")
    public static final String purple = "#800080";
    /**
     * Hexadecimal representation of CSS color "rebeccapurple".
     */
    @NewColor(type = ColorType.CSS, name = "rebeccapurple")
    public static final String rebeccapurple = "#663399";
    /**
     * Hexadecimal representation of CSS color "red".
     */
    @NewColor(type = ColorType.CSS, name = "red")
    public static final String red = RED;
    /**
     * Hexadecimal representation of CSS color "rosybrown".
     */
    @NewColor(type = ColorType.CSS, name = "rosybrown")
    public static final String rosybrown = "#BC8F8F";
    /**
     * Hexadecimal representation of CSS color "royalblue".
     */
    @NewColor(type = ColorType.CSS, name = "royalblue")
    public static final String royalblue = "#4169E1";
    /**
     * Hexadecimal representation of CSS color "saddlebrown".
     */
    @NewColor(type = ColorType.CSS, name = "saddlebrown")
    public static final String saddlebrown = "#8B4513";
    /**
     * Hexadecimal representation of CSS color "salmon".
     */
    @NewColor(type = ColorType.CSS, name = "salmon")
    public static final String salmon = "#FA8072";
    /**
     * Hexadecimal representation of CSS color "sandybrown".
     */
    @NewColor(type = ColorType.CSS, name = "sandybrown")
    public static final String sandybrown = "#F4A460";
    /**
     * Hexadecimal representation of CSS color "seagreen".
     */
    @NewColor(type = ColorType.CSS, name = "seagreen")
    public static final String seagreen = "#2E8B57";
    /**
     * Hexadecimal representation of CSS color "seashell".
     */
    @NewColor(type = ColorType.CSS, name = "seashell")
    public static final String seashell = "#FFF5EE";
    /**
     * Hexadecimal representation of CSS color "sienna".
     */
    @NewColor(type = ColorType.CSS, name = "sienna")
    public static final String sienna = "#A0522D";
    /**
     * Hexadecimal representation of CSS color "silver".
     */
    @NewColor(type = ColorType.CSS, name = "silver")
    public static final String silver = LIGHT_GRAY;
    /**
     * Hexadecimal representation of CSS color "skyblue".
     */
    @NewColor(type = ColorType.CSS, name = "skyblue")
    public static final String skyblue = "#87CEEB";
    /**
     * Hexadecimal representation of CSS color "slateblue".
     */
    @NewColor(type = ColorType.CSS, name = "slateblue")
    public static final String slateblue = "#6A5ACD";
    /**
     * Hexadecimal representation of CSS color "slategray".
     */
    @NewColor(type = ColorType.CSS, name = "slategray")
    public static final String slategray = "#708090";
    /**
     * Hexadecimal representation of CSS color "slategrey".
     */
    @NewColor(type = ColorType.CSS, name = "slategrey")
    public static final String slategrey = slategray;
    /**
     * Hexadecimal representation of CSS color "snow".
     */
    @NewColor(type = ColorType.CSS, name = "snow")
    public static final String snow = "#FFFAFA";
    /**
     * Hexadecimal representation of CSS color "springgreen".
     */
    @NewColor(type = ColorType.CSS, name = "springgreen")
    public static final String springgreen = "#00FF7F";
    /**
     * Hexadecimal representation of CSS color "steelblue".
     */
    @NewColor(type = ColorType.CSS, name = "steelblue")
    public static final String steelblue = "#4682B4";
    /**
     * Hexadecimal representation of CSS color "tan".
     */
    @NewColor(type = ColorType.CSS, name = "tan")
    public static final String tan = "#D2B48C";
    /**
     * Hexadecimal representation of CSS color "teal".
     */
    @NewColor(type = ColorType.CSS, name = "teal")
    public static final String teal = "#008080";
    /**
     * Hexadecimal representation of CSS color "thistle".
     */
    @NewColor(type = ColorType.CSS, name = "thistle")
    public static final String thistle = "#D8BFD8";
    /**
     * Hexadecimal representation of CSS color "tomato".
     */
    @NewColor(type = ColorType.CSS, name = "tomato")
    public static final String tomato = "#FF6347";
    /**
     * Hexadecimal representation of CSS color "turquoise".
     */
    @NewColor(type = ColorType.CSS, name = "turquoise")
    public static final String turquoise = "#40E0D0";
    /**
     * Hexadecimal representation of CSS color "violet".
     */
    @NewColor(type = ColorType.CSS, name = "violet")
    public static final String violet = "#EE82EE";
    /**
     * Hexadecimal representation of CSS color "wheat".
     */
    @NewColor(type = ColorType.CSS, name = "wheat")
    public static final String wheat = "#F5DEB3";
    /**
     * Hexadecimal representation of CSS color "white".
     */
    @NewColor(type = ColorType.CSS, name = "white")
    public static final String white = WHITE;
    /**
     * Hexadecimal representation of CSS color "whitesmoke".
     */
    @NewColor(type = ColorType.CSS, name = "whitesmoke")
    public static final String whitesmoke = "#F5F5F5";
    /**
     * Hexadecimal representation of CSS color "yellow".
     */
    @NewColor(type = ColorType.CSS, name = "yellow")
    public static final String yellow = YELLOW;
    /**
     * Hexadecimal representation of CSS color "yellowgreen".
     */
    @NewColor(type = ColorType.CSS, name = "yellowgreen")
    public static final String yellowgreen = "#9ACD32";

    /**
     * Hexadecimal representation of TABLEAU color "blue".
     */
    @NewColor(type = ColorType.TABLEAU, name = "blue")
    public static final String tab_blue = "#1f77b4";
    /**
     * Hexadecimal representation of TABLEAU color "orange".
     */
    @NewColor(type = ColorType.TABLEAU, name = "orange")
    public static final String tab_orange = "#ff7f0e";
    /**
     * Hexadecimal representation of TABLEAU color "green".
     */
    @NewColor(type = ColorType.TABLEAU, name = "green")
    public static final String tab_green = "#2ca02c";
    /**
     * Hexadecimal representation of TABLEAU color "red".
     */
    @NewColor(type = ColorType.TABLEAU, name = "red")
    public static final String tab_red = "#d62728";
    /**
     * Hexadecimal representation of TABLEAU color "purple".
     */
    @NewColor(type = ColorType.TABLEAU, name = "purple")
    public static final String tab_purple = "#9467bd";
    /**
     * Hexadecimal representation of TABLEAU color "brown".
     */
    @NewColor(type = ColorType.TABLEAU, name = "brown")
    public static final String tab_brown = "#8c564b";
    /**
     * Hexadecimal representation of TABLEAU color "pink".
     */
    @NewColor(type = ColorType.TABLEAU, name = "pink")
    public static final String tab_pink = "#e377c2";
    /**
     * Hexadecimal representation of TABLEAU color "grey".
     */
    @NewColor(type = ColorType.TABLEAU, name = "grey")
    public static final String tab_grey = "#7f7f7f";
    /**
     * Hexadecimal representation of TABLEAU color "olive".
     */
    @NewColor(type = ColorType.TABLEAU, name = "olive")
    public static final String tab_olive = "#bcbd22";
    /**
     * Hexadecimal representation of TABLEAU color "aqua".
     */
    @NewColor(type = ColorType.TABLEAU, name = "aqua")
    public static final String tab_aqua = "#17becf";
    /**
     * Hexadecimal representation of TABLEAU color "lightblue".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightblue")
    public static final String tab_lightblue = "#aec7e8";
    /**
     * Hexadecimal representation of TABLEAU color "lightorange".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightorange")
    public static final String tab_lightorange = "#ffbb78";
    /**
     * Hexadecimal representation of TABLEAU color "lightgreen".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightgreen")
    public static final String tab_lightgreen = "#98df8a";
    /**
     * Hexadecimal representation of TABLEAU color "lightred".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightred")
    public static final String tab_lightred = "#ff9896";
    /**
     * Hexadecimal representation of TABLEAU color "lightpurple".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightpurple")
    public static final String tab_lightpurple = "#c5b0d5";
    /**
     * Hexadecimal representation of TABLEAU color "lightbrown".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightbrown")
    public static final String tab_lightbrown = "#c49c94";
    /**
     * Hexadecimal representation of TABLEAU color "lightpink".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightpink")
    public static final String tab_lightpink = "#f7b6d2";
    /**
     * Hexadecimal representation of TABLEAU color "lightgrey".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightgrey")
    public static final String tab_lightgrey = "#c7c7c7";
    /**
     * Hexadecimal representation of TABLEAU color "lightolive".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightolive")
    public static final String tab_lightolive = "#dbdb8d";
    /**
     * Hexadecimal representation of TABLEAU color "lightaqua".
     */
    @NewColor(type = ColorType.TABLEAU, name = "lightaqua")
    public static final String tab_lightaqua = "#9edae5";


    private final static Map<String, Color> css4Colors = new HashMap<>();
    private final static Map<String, Color> awtColors = new HashMap<>();
    private final static Map<String, Color> tableauColors = new HashMap<>();
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
    public Color(final double r, final double g, final double b, final double a) {
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
    public Color(final int r, final int g, final int b, final int a) {
        this(r / 255f, g / 255f, b / 255f, a / 255f);

    }

    private Color(final int[] rgb) {
        this(rgb[0], rgb[1], rgb[2], rgb.length == 4 ? rgb[3] : 255);
    }

    private Color(final float[] rgb) {
        this(rgb[0], rgb[1], rgb[2], rgb.length == 4 ? rgb[3] : 1f);
    }

    /**
     * Construct a color based on a decimal representation of its color
     *
     * @param rgba The decimal representation of the color
     */
    public Color(final int rgba) {
        this(decimalToRBGA(rgba));

    }

    /**
     * Construct a Color with full alpha
     *
     * @param r Red (0.0-1.0)
     * @param g Green (0.0-1.0)
     * @param b Blue (0.0-1.0)
     */
    public Color(final double r, final double g, final double b) {
        this(r, g, b, 1.);

    }

    /**
     * Construct a Color with full alpha
     *
     * @param r Red (0-255)
     * @param g Green (0-255)
     * @param b Blue (0-255)
     */
    public Color(final int r, final int g, final int b) {
        this(r, g, b, 255);
    }

    /**
     * Copy constructor
     *
     * @param original the original color
     */
    public Color(final Color original) {
        this(original.rgba.clone());
    }

    /**
     * Construct a color from a hexadecimal string representation
     *
     * @param hexString Hexadecimal representation of the color
     */
    public Color(final String hexString) {
        this(hexadecimalToRGB(hexString));
    }

    /**
     * Add a listener
     *
     * @param listener Listener to add to this Color.
     */
    public void addColorListener(final ColorListener listener) {
        listeners.add(listener);
        fireColorChanged();

    }

    /**
     * Remove a listener
     *
     * @param listener Listener to remove, if already listening, to this Color.
     */
    public void removeColorListener(final ColorListener listener) {
        listeners.remove(listener);
    }

    /**
     * Remove all listeners
     */
    public void removeColorListeners() {
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
    public void setColor(final Color newColor) {
        System.arraycopy(newColor.rgba, 0, rgba, 0, rgba.length);
        fireColorChanged();
    }

    /**
     * @return The float representation of the red component
     */
    public float red() {
        return this.rgba[0];
    }

    /**
     * @return 8-bit representation of the red component.
     */
    public int getRed() {
        return Math.round(red() * 255);
    }

    /**
     * @param red The new red component, as a floating point number.
     * @return this color
     */
    public Color setRed(final double red) {
        this.rgba[0] = (float) red;
        fireColorChanged();
        return this;
    }

    /**
     * @param red The new red component, as an integer number;
     * @return this color
     */
    public Color setRed(final int red) {
        return setRed(red / 255f);
    }

    /**
     * @return The floating-point representation of the green component.
     */
    public float green() {
        return this.rgba[1];
    }

    /**
     * @return The 8-bit representation of the green component.
     */
    public int getGreen() {
        return Math.round(green() * 255);
    }

    /**
     * @param green The floating-point representation of the green component.
     * @return this color
     */
    public Color setGreen(final double green) {
        this.rgba[1] = (float) green;
        fireColorChanged();
        return this;
    }

    /**
     * @param green The new green component, as an integer number;
     * @return this color
     */
    public Color setGreen(final int green) {
        return setGreen(green / 255f);
    }

    /**
     * @return The floating-point representation of the blue component.
     */
    public float blue() {
        return this.rgba[2];
    }

    /**
     * @return The integer representation of the blue component.
     */
    public int getBlue() {
        return Math.round(blue() * 255);
    }

    /**
     * @param blue The floating-point representation of the blue component.
     * @return this color
     */
    public Color setBlue(final double blue) {
        this.rgba[2] = (float) blue;
        fireColorChanged();
        return this;
    }

    /**
     * @param blue The integer representation of the blue component.
     * @return this color
     */
    public Color setBlue(final int blue) {
        return setBlue(blue / 255f);
    }

    /**
     * @return The floating-point representation of the alpha component.
     */
    public float alpha() {
        return this.rgba[3];
    }

    /**
     * @return The 8-bit representation of the alpha component.
     */
    public int getAlpha() {
        return Math.round(alpha() * 255);
    }

    /**
     * @param alpha The floating-point representation of the alpha component.
     * @return this color
     */
    public Color setAlpha(final double alpha) {
        this.rgba[3] = (float) alpha;
        fireColorChanged();
        return this;
    }

    /**
     * @param alpha The 8-bit representation of the alpha component.
     * @return this color
     */
    public final Color setAlpha(final int alpha) {
        return setAlpha(alpha / 255f);
    }

    /**
     * @return A 3-component array containing the 8-bit representation of the red, green and blue components of this color.
     */
    public final int[] asRGB() {
        return new int[]{getRed(), getGreen(), getBlue()};
    }

    /**
     * @return A 4-component array containing the 8-bit representation of the red, green, blue and alpha components of this color.
     */
    public final int[] asRGBA() {
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
    public final float[] asLab() {
        return RGBToLab(asRGB());
    }

    /**
     * @return This color represented as a decimal value;
     */
    public final int asDecimal() {
        return RGBAToDecimal(red(), green(), blue(), alpha());
    }

    /**
     * @return A string representation of this color in hexadecimal (includes the alpha component);
     */
    public final String asHexadecimal() {
        return RGBtoHexadecimal(asRGBA());
    }

    @SuppressWarnings("MethodDoesntCallSuperMethod")
    @Override
    public final Color clone() {
        return new Color(this);
    }

    @Override
    public final String toString() {
        return String.format("Color {%s, %.3f}", asHexadecimal(), alpha());
    }

    @Override
    public final boolean equals(Object o) {
        return o == this || (o instanceof Color && Arrays.equals(((Color) o).rgba, rgba));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(rgba);
    }

    private static Color getColorWithReflection(final String colorName, final ColorType type, final Map<String, Color> cache) {
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
                        cache.put(cName, new Color((String) field.get(null)));
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

    /**
     * Get a CSS4 color by name.
     *
     * @param colorName The name of the CSS4 color.
     * @return A color of the CSS4 color requested or {@code null} if color cannot be found.
     */
    public static Color getCSS(final String colorName) {
        return getColorWithReflection(colorName, ColorType.CSS, css4Colors);
    }

    /**
     * Get a AWT color by name.
     *
     * @param colorName The name of the AWT color.
     * @return A color of the AWT color requested or {@code null} if color cannot be found.
     */
    public static Color getAWT(final String colorName) {
        return getColorWithReflection(colorName, ColorType.AWT, awtColors);
    }

    /**
     * Get a Tableau color by name.
     *
     * @param colorName The name of the Tableau color.
     * @return A color of the Tableau color requested or {@code null} if color cannot be found.
     */
    public static Color getTableau(final String colorName) {
        return getColorWithReflection(colorName, ColorType.TABLEAU, tableauColors);
    }

    /**
     * Get any of the colors by name using prefixes such as "css:", "awt:", "tableau". Color search is not case-sensitive.
     *
     * @param colorName The name of the color to search for
     * @return The requested color or {@code null} if none can be found.
     */
    public static Color get(final String colorName) {
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
     * @return whether this color is modifiable
     */
    public boolean isModifiable() {
        return true;
    }

    /**
     * @return an unmodifiable version of this color
     */
    public final UnmodifiableColor asUnmodifiable() {
        if (this.getClass() == UnmodifiableColor.class) {
            return (UnmodifiableColor) this;
        }
        return new UnmodifiableColor(this);
    }

}
