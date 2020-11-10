package net.mahdilamb.colormap.color;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static net.mahdilamb.utils.ColorUtils.*;

/**
 * Class for holding color information. Includes a listenable interface to monitor changes in a color
 */
public class Color implements Cloneable {

    @NewColor(type = ColorType.AWT, name = "red")
    public static final String RED = "#FF0000";
    @NewColor(type = ColorType.AWT, name = "green")
    public static final String GREEN = "#00FF00";
    @NewColor(type = ColorType.AWT, name = "blue")
    public static final String BLUE = "#0000ff";
    @NewColor(type = ColorType.AWT, name = "cyan")
    public static final String CYAN = "#00FFFF";
    @NewColor(type = ColorType.AWT, name = "magenta")
    public static final String MAGENTA = "#FF00FF";
    @NewColor(type = ColorType.AWT, name = "yellow")
    public static final String YELLOW = "#FFFF00";
    @NewColor(type = ColorType.AWT, name = "white")
    public static final String WHITE = "#FFFFFF";
    @NewColor(type = ColorType.AWT, name = "black")
    public static final String BLACK = "#000000";
    @NewColor(type = ColorType.AWT, name = "lightgray")
    public static final String LIGHT_GRAY = "#c0c0c0";
    @NewColor(type = ColorType.AWT, name = "darkgray")
    public static final String DARK_GRAY = "#404040";
    @NewColor(type = ColorType.AWT, name = "pink")
    public static final String PINK = "#ffafaf";
    @NewColor(type = ColorType.AWT, name = "orange")
    public static final String ORANGE = "#ffc800";
    @NewColor(type = ColorType.AWT, name = "gray")
    public static final String GRAY = "#808080";

    @NewColor(type = ColorType.CSS, name = "aliceblue")
    public static final String aliceblue = "#F0F8FF";
    @NewColor(type = ColorType.CSS, name = "antiquewhite")
    public static final String antiquewhite = "#FAEBD7";
    @NewColor(type = ColorType.CSS, name = "aqua")
    public static final String aqua = CYAN;
    @NewColor(type = ColorType.CSS, name = "aquamarine")
    public static final String aquamarine = "#7FFFD4";
    @NewColor(type = ColorType.CSS, name = "azure")
    public static final String azure = "#F0FFFF";
    @NewColor(type = ColorType.CSS, name = "beige")
    public static final String beige = "#F5F5DC";
    @NewColor(type = ColorType.CSS, name = "bisque")
    public static final String bisque = "#FFE4C4";
    @NewColor(type = ColorType.CSS, name = "black")
    public static final String black = BLACK;
    @NewColor(type = ColorType.CSS, name = "blanchedalmond")
    public static final String blanchedalmond = "#FFEBCD";
    @NewColor(type = ColorType.CSS, name = "blue")
    public static final String blue = BLUE;
    @NewColor(type = ColorType.CSS, name = "blueviolet")
    public static final String blueviolet = "#8A2BE2";
    @NewColor(type = ColorType.CSS, name = "brown")
    public static final String brown = "#A52A2A";
    @NewColor(type = ColorType.CSS, name = "burlywood")
    public static final String burlywood = "#DEB887";
    @NewColor(type = ColorType.CSS, name = "cadetblue")
    public static final String cadetblue = "#5F9EA0";
    @NewColor(type = ColorType.CSS, name = "chartreuse")
    public static final String chartreuse = "#7FFF00";
    @NewColor(type = ColorType.CSS, name = "chocolate")
    public static final String chocolate = "#D2691E";
    @NewColor(type = ColorType.CSS, name = "coral")
    public static final String coral = "#FF7F50";
    @NewColor(type = ColorType.CSS, name = "cornflowerblue")
    public static final String cornflowerblue = "#6495ED";
    @NewColor(type = ColorType.CSS, name = "cornsilk")
    public static final String cornsilk = "#FFF8DC";
    @NewColor(type = ColorType.CSS, name = "crimson")
    public static final String crimson = "#DC143C";
    @NewColor(type = ColorType.CSS, name = "cyan")
    public static final String cyan = CYAN;
    @NewColor(type = ColorType.CSS, name = "darkblue")
    public static final String darkblue = "#00008B";
    @NewColor(type = ColorType.CSS, name = "darkcyan")
    public static final String darkcyan = "#008B8B";
    @NewColor(type = ColorType.CSS, name = "darkgoldenrod")
    public static final String darkgoldenrod = "#B8860B";
    @NewColor(type = ColorType.CSS, name = "darkgray")
    public static final String darkgray = "#A9A9A9";
    @NewColor(type = ColorType.CSS, name = "darkgreen")
    public static final String darkgreen = "#006400";
    @NewColor(type = ColorType.CSS, name = "darkgrey")
    public static final String darkgrey = darkgray;
    @NewColor(type = ColorType.CSS, name = "darkkhaki")
    public static final String darkkhaki = "#BDB76B";
    @NewColor(type = ColorType.CSS, name = "darkmagenta")
    public static final String darkmagenta = "#8B008B";
    @NewColor(type = ColorType.CSS, name = "darkolivegreen")
    public static final String darkolivegreen = "#556B2F";
    @NewColor(type = ColorType.CSS, name = "darkorange")
    public static final String darkorange = "#FF8C00";
    @NewColor(type = ColorType.CSS, name = "darkorchid")
    public static final String darkorchid = "#9932CC";
    @NewColor(type = ColorType.CSS, name = "darkred")
    public static final String darkred = "#8B0000";
    @NewColor(type = ColorType.CSS, name = "darksalmon")
    public static final String darksalmon = "#E9967A";
    @NewColor(type = ColorType.CSS, name = "darkseagreen")
    public static final String darkseagreen = "#8FBC8F";
    @NewColor(type = ColorType.CSS, name = "darkslateblue")
    public static final String darkslateblue = "#483D8B";
    @NewColor(type = ColorType.CSS, name = "darkslategray")
    public static final String darkslategray = "#2F4F4F";
    @NewColor(type = ColorType.CSS, name = "darkslategrey")
    public static final String darkslategrey = darkslategray;
    @NewColor(type = ColorType.CSS, name = "darkturquoise")
    public static final String darkturquoise = "#00CED1";
    @NewColor(type = ColorType.CSS, name = "darkviolet")
    public static final String darkviolet = "#9400D3";
    @NewColor(type = ColorType.CSS, name = "deeppink")
    public static final String deeppink = "#FF1493";
    @NewColor(type = ColorType.CSS, name = "deepskyblue")
    public static final String deepskyblue = "#00BFFF";
    @NewColor(type = ColorType.CSS, name = "dimgray")
    public static final String dimgray = "#696969";
    @NewColor(type = ColorType.CSS, name = "dimgrey")
    public static final String dimgrey = dimgray;
    @NewColor(type = ColorType.CSS, name = "dodgerblue")
    public static final String dodgerblue = "#1E90FF";
    @NewColor(type = ColorType.CSS, name = "firebrick")
    public static final String firebrick = "#B22222";
    @NewColor(type = ColorType.CSS, name = "floralwhite")
    public static final String floralwhite = "#FFFAF0";
    @NewColor(type = ColorType.CSS, name = "forestgreen")
    public static final String forestgreen = "#228B22";
    @NewColor(type = ColorType.CSS, name = "fuchsia")
    public static final String fuchsia = MAGENTA;
    @NewColor(type = ColorType.CSS, name = "gainsboro")
    public static final String gainsboro = "#DCDCDC";
    @NewColor(type = ColorType.CSS, name = "ghostwhite")
    public static final String ghostwhite = "#F8F8FF";
    @NewColor(type = ColorType.CSS, name = "gold")
    public static final String gold = "#FFD700";
    @NewColor(type = ColorType.CSS, name = "goldenrod")
    public static final String goldenrod = "#DAA520";
    @NewColor(type = ColorType.CSS, name = "gray")
    public static final String gray = GRAY;
    @NewColor(type = ColorType.CSS, name = "green")
    public static final String green = "#008000";
    @NewColor(type = ColorType.CSS, name = "greenyellow")
    public static final String greenyellow = "#ADFF2F";
    @NewColor(type = ColorType.CSS, name = "grey")
    public static final String grey = gray;
    @NewColor(type = ColorType.CSS, name = "honeydew")
    public static final String honeydew = "#F0FFF0";
    @NewColor(type = ColorType.CSS, name = "hotpink")
    public static final String hotpink = "#FF69B4";
    @NewColor(type = ColorType.CSS, name = "indianred")
    public static final String indianred = "#CD5C5C";
    @NewColor(type = ColorType.CSS, name = "indigo")
    public static final String indigo = "#4B0082";
    @NewColor(type = ColorType.CSS, name = "ivory")
    public static final String ivory = "#FFFFF0";
    @NewColor(type = ColorType.CSS, name = "khaki")
    public static final String khaki = "#F0E68C";
    @NewColor(type = ColorType.CSS, name = "lavender")
    public static final String lavender = "#E6E6FA";
    @NewColor(type = ColorType.CSS, name = "lavenderblush")
    public static final String lavenderblush = "#FFF0F5";
    @NewColor(type = ColorType.CSS, name = "lawngreen")
    public static final String lawngreen = "#7CFC00";
    @NewColor(type = ColorType.CSS, name = "lemonchiffon")
    public static final String lemonchiffon = "#FFFACD";
    @NewColor(type = ColorType.CSS, name = "lightblue")
    public static final String lightblue = "#ADD8E6";
    @NewColor(type = ColorType.CSS, name = "lightcoral")
    public static final String lightcoral = "#F08080";
    @NewColor(type = ColorType.CSS, name = "lightcyan")
    public static final String lightcyan = "#E0FFFF";
    @NewColor(type = ColorType.CSS, name = "lightgoldenrodyellow")
    public static final String lightgoldenrodyellow = "#FAFAD2";
    @NewColor(type = ColorType.CSS, name = "lightgray")
    public static final String lightgray = "#D3D3D3";
    @NewColor(type = ColorType.CSS, name = "lightgreen")
    public static final String lightgreen = "#90EE90";
    @NewColor(type = ColorType.CSS, name = "lightgrey")
    public static final String lightgrey = lightgray;
    @NewColor(type = ColorType.CSS, name = "lightpink")
    public static final String lightpink = "#FFB6C1";
    @NewColor(type = ColorType.CSS, name = "lightsalmon")
    public static final String lightsalmon = "#FFA07A";
    @NewColor(type = ColorType.CSS, name = "lightseagreen")
    public static final String lightseagreen = "#20B2AA";
    @NewColor(type = ColorType.CSS, name = "lightskyblue")
    public static final String lightskyblue = "#87CEFA";
    @NewColor(type = ColorType.CSS, name = "lightslategray")
    public static final String lightslategray = "#778899";
    @NewColor(type = ColorType.CSS, name = "lightslategrey")
    public static final String lightslategrey = lightslategray;
    @NewColor(type = ColorType.CSS, name = "lightsteelblue")
    public static final String lightsteelblue = "#B0C4DE";
    @NewColor(type = ColorType.CSS, name = "lightyellow")
    public static final String lightyellow = "#FFFFE0";
    @NewColor(type = ColorType.CSS, name = "lime")
    public static final String lime = GREEN;
    @NewColor(type = ColorType.CSS, name = "limegreen")
    public static final String limegreen = "#32CD32";
    @NewColor(type = ColorType.CSS, name = "linen")
    public static final String linen = "#FAF0E6";
    @NewColor(type = ColorType.CSS, name = "magenta")
    public static final String magenta = MAGENTA;
    @NewColor(type = ColorType.CSS, name = "maroon")
    public static final String maroon = "#800000";
    @NewColor(type = ColorType.CSS, name = "mediumaquamarine")
    public static final String mediumaquamarine = "#66CDAA";
    @NewColor(type = ColorType.CSS, name = "mediumblue")
    public static final String mediumblue = "#0000CD";
    @NewColor(type = ColorType.CSS, name = "mediumorchid")
    public static final String mediumorchid = "#BA55D3";
    @NewColor(type = ColorType.CSS, name = "mediumpurple")
    public static final String mediumpurple = "#9370DB";
    @NewColor(type = ColorType.CSS, name = "mediumseagreen")
    public static final String mediumseagreen = "#3CB371";
    @NewColor(type = ColorType.CSS, name = "mediumslateblue")
    public static final String mediumslateblue = "#7B68EE";
    @NewColor(type = ColorType.CSS, name = "mediumspringgreen")
    public static final String mediumspringgreen = "#00FA9A";
    @NewColor(type = ColorType.CSS, name = "mediumturquoise")
    public static final String mediumturquoise = "#48D1CC";
    @NewColor(type = ColorType.CSS, name = "mediumvioletred")
    public static final String mediumvioletred = "#C71585";
    @NewColor(type = ColorType.CSS, name = "midnightblue")
    public static final String midnightblue = "#191970";
    @NewColor(type = ColorType.CSS, name = "mintcream")
    public static final String mintcream = "#F5FFFA";
    @NewColor(type = ColorType.CSS, name = "mistyrose")
    public static final String mistyrose = "#FFE4E1";
    @NewColor(type = ColorType.CSS, name = "moccasin")
    public static final String moccasin = "#FFE4B5";
    @NewColor(type = ColorType.CSS, name = "navajowhite")
    public static final String navajowhite = "#FFDEAD";
    @NewColor(type = ColorType.CSS, name = "navy")
    public static final String navy = "#000080";
    @NewColor(type = ColorType.CSS, name = "oldlace")
    public static final String oldlace = "#FDF5E6";
    @NewColor(type = ColorType.CSS, name = "olive")
    public static final String olive = "#808000";
    @NewColor(type = ColorType.CSS, name = "olivedrab")
    public static final String olivedrab = "#6B8E23";
    @NewColor(type = ColorType.CSS, name = "orange")
    public static final String orange = "#FFA500";
    @NewColor(type = ColorType.CSS, name = "orangered")
    public static final String orangered = "#FF4500";
    @NewColor(type = ColorType.CSS, name = "orchid")
    public static final String orchid = "#DA70D6";
    @NewColor(type = ColorType.CSS, name = "palegoldenrod")
    public static final String palegoldenrod = "#EEE8AA";
    @NewColor(type = ColorType.CSS, name = "palegreen")
    public static final String palegreen = "#98FB98";
    @NewColor(type = ColorType.CSS, name = "paleturquoise")
    public static final String paleturquoise = "#AFEEEE";
    @NewColor(type = ColorType.CSS, name = "palevioletred")
    public static final String palevioletred = "#DB7093";
    @NewColor(type = ColorType.CSS, name = "papayawhip")
    public static final String papayawhip = "#FFEFD5";
    @NewColor(type = ColorType.CSS, name = "peachpuff")
    public static final String peachpuff = "#FFDAB9";
    @NewColor(type = ColorType.CSS, name = "peru")
    public static final String peru = "#CD853F";
    @NewColor(type = ColorType.CSS, name = "pink")
    public static final String pink = "#FFC0CB";
    @NewColor(type = ColorType.CSS, name = "plum")
    public static final String plum = "#DDA0DD";
    @NewColor(type = ColorType.CSS, name = "powderblue")
    public static final String powderblue = "#B0E0E6";
    @NewColor(type = ColorType.CSS, name = "purple")
    public static final String purple = "#800080";
    @NewColor(type = ColorType.CSS, name = "rebeccapurple")
    public static final String rebeccapurple = "#663399";
    @NewColor(type = ColorType.CSS, name = "red")
    public static final String red = RED;
    @NewColor(type = ColorType.CSS, name = "rosybrown")
    public static final String rosybrown = "#BC8F8F";
    @NewColor(type = ColorType.CSS, name = "royalblue")
    public static final String royalblue = "#4169E1";
    @NewColor(type = ColorType.CSS, name = "saddlebrown")
    public static final String saddlebrown = "#8B4513";
    @NewColor(type = ColorType.CSS, name = "salmon")
    public static final String salmon = "#FA8072";
    @NewColor(type = ColorType.CSS, name = "sandybrown")
    public static final String sandybrown = "#F4A460";
    @NewColor(type = ColorType.CSS, name = "seagreen")
    public static final String seagreen = "#2E8B57";
    @NewColor(type = ColorType.CSS, name = "seashell")
    public static final String seashell = "#FFF5EE";
    @NewColor(type = ColorType.CSS, name = "sienna")
    public static final String sienna = "#A0522D";
    @NewColor(type = ColorType.CSS, name = "silver")
    public static final String silver = LIGHT_GRAY;
    @NewColor(type = ColorType.CSS, name = "skyblue")
    public static final String skyblue = "#87CEEB";
    @NewColor(type = ColorType.CSS, name = "slateblue")
    public static final String slateblue = "#6A5ACD";
    @NewColor(type = ColorType.CSS, name = "slategray")
    public static final String slategray = "#708090";
    @NewColor(type = ColorType.CSS, name = "slategrey")
    public static final String slategrey = slategray;
    @NewColor(type = ColorType.CSS, name = "snow")
    public static final String snow = "#FFFAFA";
    @NewColor(type = ColorType.CSS, name = "springgreen")
    public static final String springgreen = "#00FF7F";
    @NewColor(type = ColorType.CSS, name = "steelblue")
    public static final String steelblue = "#4682B4";
    @NewColor(type = ColorType.CSS, name = "tan")
    public static final String tan = "#D2B48C";
    @NewColor(type = ColorType.CSS, name = "teal")
    public static final String teal = "#008080";
    @NewColor(type = ColorType.CSS, name = "thistle")
    public static final String thistle = "#D8BFD8";
    @NewColor(type = ColorType.CSS, name = "tomato")
    public static final String tomato = "#FF6347";
    @NewColor(type = ColorType.CSS, name = "turquoise")
    public static final String turquoise = "#40E0D0";
    @NewColor(type = ColorType.CSS, name = "violet")
    public static final String violet = "#EE82EE";
    @NewColor(type = ColorType.CSS, name = "wheat")
    public static final String wheat = "#F5DEB3";
    @NewColor(type = ColorType.CSS, name = "white")
    public static final String white = WHITE;
    @NewColor(type = ColorType.CSS, name = "whitesmoke")
    public static final String whitesmoke = "#F5F5F5";
    @NewColor(type = ColorType.CSS, name = "yellow")
    public static final String yellow = YELLOW;
    @NewColor(type = ColorType.CSS, name = "yellowgreen")
    public static final String yellowgreen = "#9ACD32";

    @NewColor(type = ColorType.TABLEAU, name = "blue")
    public static final String tab_blue = "#1f77b4";
    @NewColor(type = ColorType.TABLEAU, name = "orange")
    public static final String tab_orange = "#ff7f0e";
    @NewColor(type = ColorType.TABLEAU, name = "green")
    public static final String tab_green = "#2ca02c";
    @NewColor(type = ColorType.TABLEAU, name = "red")
    public static final String tab_red = "#d62728";
    @NewColor(type = ColorType.TABLEAU, name = "purple")
    public static final String tab_purple = "#9467bd";
    @NewColor(type = ColorType.TABLEAU, name = "brown")
    public static final String tab_brown = "#8c564b";
    @NewColor(type = ColorType.TABLEAU, name = "pink")
    public static final String tab_pink = "#e377c2";
    @NewColor(type = ColorType.TABLEAU, name = "grey")
    public static final String tab_grey = "#7f7f7f";
    @NewColor(type = ColorType.TABLEAU, name = "olive")
    public static final String tab_olive = "#bcbd22";
    @NewColor(type = ColorType.TABLEAU, name = "aqua")
    public static final String tab_aqua = "#17becf";
    @NewColor(type = ColorType.TABLEAU, name = "lightblue")
    public static final String tab_lightblue = "#aec7e8";
    @NewColor(type = ColorType.TABLEAU, name = "lightorange")
    public static final String tab_lightorange = "#ffbb78";
    @NewColor(type = ColorType.TABLEAU, name = "lightgreen")
    public static final String tab_lightgreen = "#98df8a";
    @NewColor(type = ColorType.TABLEAU, name = "lightred")
    public static final String tab_lightred = "#ff9896";
    @NewColor(type = ColorType.TABLEAU, name = "lightpurple")
    public static final String tab_lightpurple = "#c5b0d5";
    @NewColor(type = ColorType.TABLEAU, name = "lightbrown")
    public static final String tab_lightbrown = "#c49c94";
    @NewColor(type = ColorType.TABLEAU, name = "lightpink")
    public static final String tab_lightpink = "#f7b6d2";
    @NewColor(type = ColorType.TABLEAU, name = "lightgrey")
    public static final String tab_lightgrey = "#c7c7c7";
    @NewColor(type = ColorType.TABLEAU, name = "lightolive")
    public static final String tab_lightolive = "#dbdb8d";
    @NewColor(type = ColorType.TABLEAU, name = "lightaqua")
    public static final String tab_lightaqua = "#9edae5";
    private final static Map<String, Color> css4Colors = new HashMap<>();
    private final static Map<String, Color> awtColors = new HashMap<>();
    private final static Map<String, Color> tableauColors = new HashMap<>();

    protected final Set<ColorListener> listeners = new HashSet<>();

    protected final float[] rgba;

    /**
     * Primary constructor based on float representations of each component
     *
     * @param r Red
     * @param g Green
     * @param b Blue
     * @param a Alpha
     */
    public Color(final float r, final float g, final float b, final float a) {
        rgba = new float[]{r, g, b, a};

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
    public Color(final float r, final float g, final float b) {
        this(r, g, b, 1f);

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
     * Copy constructor (shallow copy)
     *
     * @param original the original color
     */
    public Color(final Color original) {
        this(original.rgba);
    }

    /**
     * Constrcut a color from a hexadecimal string representation
     *
     * @param hexString Hexadecimal representation of the color
     */
    public Color(final String hexString) {
        this(hexadecimalToRGB(hexString));
    }


    /*
     *
     * get color from reflection
     *
     */
    private static Color getColorWithReflection(final String colorName, final ColorType type, final Map<String, Color> cache) {
        if (cache.containsKey(colorName)) {
            return cache.get(colorName).clone();
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
        return null;
    }

    public static Color getCSSColor(final String colorName) {
        return getColorWithReflection(colorName, ColorType.CSS, css4Colors);
    }

    public static Color getAWTColor(final String colorName) {
        return getColorWithReflection(colorName, ColorType.AWT, awtColors);
    }

    public static Color getTableauColor(final String colorName) {
        return getColorWithReflection(colorName, ColorType.TABLEAU, tableauColors);
    }

    public static Color getColor(final String colorName) {
        if (colorName.toLowerCase().startsWith("css:")) {
            return getCSSColor(colorName.toLowerCase().split(":")[1]);
        } else if (colorName.toLowerCase().startsWith("swing:")) {
            return getAWTColor(colorName.toLowerCase().split(":")[1]);
        } else if (colorName.toLowerCase().startsWith("tab:") || colorName.toLowerCase().startsWith("tableau:")) {

            return getTableauColor(colorName.toLowerCase().split(":")[1]);
        } else if (!colorName.contains(":")) {
            return getCSSColor(colorName.toLowerCase());
        } else {
            return null;
        }
    }

    /*
     *
     * Listeners
     *
     */
    public void addColorListener(final ColorListener listener) {
        listeners.add(listener);
        fireColorChanged();

    }

    public void removeColorListener(final ColorListener listener) {
        listeners.remove(listener);
    }

    public void removeColorListeners() {
        listeners.clear();
    }

    protected void fireColorChanged() {
        for (final ColorListener listener : listeners) {
            listener.colorChanged(this);

        }
    }


    /*
     *
     * Setters and getters
     *
     */
    public void setColor(final String hexString) {
        setColor(hexadecimalToRGB(hexString));
    }

    public void setColor(final Color newColor) {
        setColor(newColor.asHexadecimal());
    }

    public void setColor(final int[] rgb) {
        rgba[0] = rgb[0] / 255f;
        rgba[1] = rgb[1] / 255f;
        rgba[2] = rgb[2] / 255f;
        rgba[3] = rgb.length == 3 ? this.rgba[3] : (rgb[3] / 255f);
        fireColorChanged();
    }

    public int getRed() {
        return Math.round(this.rgba[0] * 255);
    }

    public void setRed(final float red) {
        this.rgba[0] = red;
        fireColorChanged();
    }

    public void setRed(final int red) {
        setRed(red / 255f);
    }

    public int getGreen() {
        return Math.round(this.rgba[1] * 255);
    }

    public void setGreen(final float green) {
        this.rgba[1] = green;
        fireColorChanged();
    }


    public int getBlue() {
        return Math.round(this.rgba[2] * 255);
    }

    public void setBlue(final float blue) {
        this.rgba[2] = blue;
        fireColorChanged();
    }

    public void setBlue(final int blue) {
        setBlue(blue / 255f);
    }

    public int getAlpha() {
        return Math.round(this.rgba[3] * 255);
    }

    public void setAlpha(final float alpha) {
        this.rgba[3] = alpha;
        fireColorChanged();
    }

    public void setAlpha(final int alpha) {
        setAlpha(alpha / 255f);
    }

    /*
     *
     * Converters
     *
     */
    public int[] asRGB() {
        return new int[]{getRed(), getGreen(), getBlue()};
    }

    public float[] asLab() {
        return RGBToLab(asRGB());
    }

    public int asDecimal() {
        return RGBAToDecimal(rgba);
    }

    public String asHexadecimal() {
        final int[] colorAsRGBA = new int[]{
                getRed(),
                getGreen(),
                getBlue(),
                getAlpha()
        };
        return toHexadecimal(colorAsRGBA);
    }

    public int getRGB() {
        return asDecimal();
    }

    @SuppressWarnings("MethodDoesntCallSuperMethod")
    @Override
    public Color clone() {
        return new Color(rgba.clone());
    }

    @Override
    public String toString() {
        return String.format("Color (%s, %.3f)", asHexadecimal(), getAlpha() / 255f);
    }

    @Override
    public boolean equals(final Object other) {
        return (other instanceof Color && this.asDecimal() == ((Color) other).asDecimal());
    }

    public int hashCode() {
        return Integer.hashCode(getRGB());
    }

}