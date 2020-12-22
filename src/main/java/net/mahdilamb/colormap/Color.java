package net.mahdilamb.colormap;

import net.mahdilamb.colormap.api.RGBA;
import net.mahdilamb.colormap.reference.ColorType;
import net.mahdilamb.colormap.reference.ReferenceColor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Default implementation of an RGBA color
 */
public final class Color implements RGBA {
	/**
	 * Base color "transparent"
	 */
	public final static RGBA TRANSPARENT = new Color(0,0,0,0);
    /**
     * AWT color "red".
     */
    @ReferenceColor(type = ColorType.AWT, name = "red")
    public final static RGBA RED = new Color(255, 0, 0);
    /**
     * AWT color "green".
     */
    @ReferenceColor(type = ColorType.AWT, name = "green")
    public final static RGBA GREEN = new Color(0, 255, 0);
    /**
     * AWT color "blue".
     */
    @ReferenceColor(type = ColorType.AWT, name = "blue")
    public final static RGBA BLUE = new Color(0, 0, 255);
    /**
     * AWT color "cyan".
     */
    @ReferenceColor(type = ColorType.AWT, name = "cyan")
    public final static RGBA CYAN = new Color(0, 255, 255);
    /**
     * AWT color "magenta".
     */
    @ReferenceColor(type = ColorType.AWT, name = "magenta")
    public final static RGBA MAGENTA = new Color(255, 0, 255);
    /**
     * AWT color "yellow".
     */
    @ReferenceColor(type = ColorType.AWT, name = "yellow")
    public final static RGBA YELLOW = new Color(255, 255, 0);
    /**
     * AWT color "white".
     */
    @ReferenceColor(type = ColorType.AWT, name = "white")
    public final static RGBA WHITE = new Color(255, 255, 255);
    /**
     * AWT color "black".
     */
    @ReferenceColor(type = ColorType.AWT, name = "black")
    public final static RGBA BLACK = new Color(0, 0, 0);
    /**
     * AWT color "lightgray".
     */
    @ReferenceColor(type = ColorType.AWT, name = "lightgray")
    public final static RGBA LIGHT_GRAY = new Color(192, 192, 192);
    /**
     * AWT color "darkgray".
     */
    @ReferenceColor(type = ColorType.AWT, name = "darkgray")
    public final static RGBA DARK_GRAY = new Color(64, 64, 64);
    /**
     * AWT color "pink".
     */
    @ReferenceColor(type = ColorType.AWT, name = "pink")
    public final static RGBA PINK = new Color(255, 175, 175);
    /**
     * AWT color "orange".
     */
    @ReferenceColor(type = ColorType.AWT, name = "orange")
    public final static RGBA ORANGE = new Color(255, 200, 0);
    /**
     * AWT color "gray".
     */
    @ReferenceColor(type = ColorType.AWT, name = "gray")
    public final static RGBA GRAY = new Color(128, 128, 128);

    //{{START}}//
	/**
	 * CSS color "aliceblue" (#F0F8FF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "aliceblue")
	public static final RGBA aliceblue = new Color(240, 248, 255);

	/**
	 * CSS color "antiquewhite" (#FAEBD7)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "antiquewhite")
	public static final RGBA antiquewhite = new Color(250, 235, 215);

	/**
	 * CSS color "aqua" (#00FFFF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "aqua")
	public static final RGBA aqua = new Color(0, 255, 255);

	/**
	 * CSS color "aquamarine" (#7FFFD4)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "aquamarine")
	public static final RGBA aquamarine = new Color(127, 255, 212);

	/**
	 * CSS color "azure" (#F0FFFF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "azure")
	public static final RGBA azure = new Color(240, 255, 255);

	/**
	 * CSS color "beige" (#F5F5DC)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "beige")
	public static final RGBA beige = new Color(245, 245, 220);

	/**
	 * CSS color "bisque" (#FFE4C4)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "bisque")
	public static final RGBA bisque = new Color(255, 228, 196);

	/**
	 * CSS color "black" (#000000)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "black")
	public static final RGBA black = new Color(0, 0, 0);

	/**
	 * CSS color "blanchedalmond" (#FFEBCD)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "blanchedalmond")
	public static final RGBA blanchedalmond = new Color(255, 235, 205);

	/**
	 * CSS color "blue" (#0000FF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "blue")
	public static final RGBA blue = new Color(0, 0, 255);

	/**
	 * CSS color "blueviolet" (#8A2BE2)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "blueviolet")
	public static final RGBA blueviolet = new Color(138, 43, 226);

	/**
	 * CSS color "brown" (#A52A2A)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "brown")
	public static final RGBA brown = new Color(165, 42, 42);

	/**
	 * CSS color "burlywood" (#DEB887)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "burlywood")
	public static final RGBA burlywood = new Color(222, 184, 135);

	/**
	 * CSS color "cadetblue" (#5F9EA0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "cadetblue")
	public static final RGBA cadetblue = new Color(95, 158, 160);

	/**
	 * CSS color "chartreuse" (#7FFF00)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "chartreuse")
	public static final RGBA chartreuse = new Color(127, 255, 0);

	/**
	 * CSS color "chocolate" (#D2691E)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "chocolate")
	public static final RGBA chocolate = new Color(210, 105, 30);

	/**
	 * CSS color "coral" (#FF7F50)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "coral")
	public static final RGBA coral = new Color(255, 127, 80);

	/**
	 * CSS color "cornflowerblue" (#6495ED)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "cornflowerblue")
	public static final RGBA cornflowerblue = new Color(100, 149, 237);

	/**
	 * CSS color "cornsilk" (#FFF8DC)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "cornsilk")
	public static final RGBA cornsilk = new Color(255, 248, 220);

	/**
	 * CSS color "crimson" (#DC143C)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "crimson")
	public static final RGBA crimson = new Color(220, 20, 60);

	/**
	 * CSS color "cyan" (#00FFFF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "cyan")
	public static final RGBA cyan = new Color(0, 255, 255);

	/**
	 * CSS color "darkblue" (#00008B)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkblue")
	public static final RGBA darkblue = new Color(0, 0, 139);

	/**
	 * CSS color "darkcyan" (#008B8B)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkcyan")
	public static final RGBA darkcyan = new Color(0, 139, 139);

	/**
	 * CSS color "darkgoldenrod" (#B8860B)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkgoldenrod")
	public static final RGBA darkgoldenrod = new Color(184, 134, 11);

	/**
	 * CSS color "darkgray" (#A9A9A9)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkgray")
	public static final RGBA darkgray = new Color(169, 169, 169);

	/**
	 * CSS color "darkgreen" (#006400)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkgreen")
	public static final RGBA darkgreen = new Color(0, 100, 0);

	/**
	 * CSS color "darkgrey" (#A9A9A9)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkgrey")
	public static final RGBA darkgrey = new Color(169, 169, 169);

	/**
	 * CSS color "darkkhaki" (#BDB76B)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkkhaki")
	public static final RGBA darkkhaki = new Color(189, 183, 107);

	/**
	 * CSS color "darkmagenta" (#8B008B)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkmagenta")
	public static final RGBA darkmagenta = new Color(139, 0, 139);

	/**
	 * CSS color "darkolivegreen" (#556B2F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkolivegreen")
	public static final RGBA darkolivegreen = new Color(85, 107, 47);

	/**
	 * CSS color "darkorange" (#FF8C00)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkorange")
	public static final RGBA darkorange = new Color(255, 140, 0);

	/**
	 * CSS color "darkorchid" (#9932CC)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkorchid")
	public static final RGBA darkorchid = new Color(153, 50, 204);

	/**
	 * CSS color "darkred" (#8B0000)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkred")
	public static final RGBA darkred = new Color(139, 0, 0);

	/**
	 * CSS color "darksalmon" (#E9967A)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darksalmon")
	public static final RGBA darksalmon = new Color(233, 150, 122);

	/**
	 * CSS color "darkseagreen" (#8FBC8F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkseagreen")
	public static final RGBA darkseagreen = new Color(143, 188, 143);

	/**
	 * CSS color "darkslateblue" (#483D8B)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkslateblue")
	public static final RGBA darkslateblue = new Color(72, 61, 139);

	/**
	 * CSS color "darkslategray" (#2F4F4F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkslategray")
	public static final RGBA darkslategray = new Color(47, 79, 79);

	/**
	 * CSS color "darkslategrey" (#2F4F4F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkslategrey")
	public static final RGBA darkslategrey = new Color(47, 79, 79);

	/**
	 * CSS color "darkturquoise" (#00CED1)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkturquoise")
	public static final RGBA darkturquoise = new Color(0, 206, 209);

	/**
	 * CSS color "darkviolet" (#9400D3)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "darkviolet")
	public static final RGBA darkviolet = new Color(148, 0, 211);

	/**
	 * CSS color "deeppink" (#FF1493)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "deeppink")
	public static final RGBA deeppink = new Color(255, 20, 147);

	/**
	 * CSS color "deepskyblue" (#00BFFF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "deepskyblue")
	public static final RGBA deepskyblue = new Color(0, 191, 255);

	/**
	 * CSS color "dimgray" (#696969)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "dimgray")
	public static final RGBA dimgray = new Color(105, 105, 105);

	/**
	 * CSS color "dimgrey" (#696969)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "dimgrey")
	public static final RGBA dimgrey = new Color(105, 105, 105);

	/**
	 * CSS color "dodgerblue" (#1E90FF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "dodgerblue")
	public static final RGBA dodgerblue = new Color(30, 144, 255);

	/**
	 * CSS color "firebrick" (#B22222)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "firebrick")
	public static final RGBA firebrick = new Color(178, 34, 34);

	/**
	 * CSS color "floralwhite" (#FFFAF0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "floralwhite")
	public static final RGBA floralwhite = new Color(255, 250, 240);

	/**
	 * CSS color "forestgreen" (#228B22)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "forestgreen")
	public static final RGBA forestgreen = new Color(34, 139, 34);

	/**
	 * CSS color "fuchsia" (#FF00FF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "fuchsia")
	public static final RGBA fuchsia = new Color(255, 0, 255);

	/**
	 * CSS color "gainsboro" (#DCDCDC)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "gainsboro")
	public static final RGBA gainsboro = new Color(220, 220, 220);

	/**
	 * CSS color "ghostwhite" (#F8F8FF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "ghostwhite")
	public static final RGBA ghostwhite = new Color(248, 248, 255);

	/**
	 * CSS color "gold" (#FFD700)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "gold")
	public static final RGBA gold = new Color(255, 215, 0);

	/**
	 * CSS color "goldenrod" (#DAA520)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "goldenrod")
	public static final RGBA goldenrod = new Color(218, 165, 32);

	/**
	 * CSS color "gray" (#808080)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "gray")
	public static final RGBA gray = new Color(128, 128, 128);

	/**
	 * CSS color "green" (#008000)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "green")
	public static final RGBA green = new Color(0, 128, 0);

	/**
	 * CSS color "greenyellow" (#ADFF2F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "greenyellow")
	public static final RGBA greenyellow = new Color(173, 255, 47);

	/**
	 * CSS color "grey" (#808080)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "grey")
	public static final RGBA grey = new Color(128, 128, 128);

	/**
	 * CSS color "honeydew" (#F0FFF0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "honeydew")
	public static final RGBA honeydew = new Color(240, 255, 240);

	/**
	 * CSS color "hotpink" (#FF69B4)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "hotpink")
	public static final RGBA hotpink = new Color(255, 105, 180);

	/**
	 * CSS color "indianred" (#CD5C5C)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "indianred")
	public static final RGBA indianred = new Color(205, 92, 92);

	/**
	 * CSS color "indigo" (#4B0082)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "indigo")
	public static final RGBA indigo = new Color(75, 0, 130);

	/**
	 * CSS color "ivory" (#FFFFF0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "ivory")
	public static final RGBA ivory = new Color(255, 255, 240);

	/**
	 * CSS color "khaki" (#F0E68C)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "khaki")
	public static final RGBA khaki = new Color(240, 230, 140);

	/**
	 * CSS color "lavender" (#E6E6FA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lavender")
	public static final RGBA lavender = new Color(230, 230, 250);

	/**
	 * CSS color "lavenderblush" (#FFF0F5)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lavenderblush")
	public static final RGBA lavenderblush = new Color(255, 240, 245);

	/**
	 * CSS color "lawngreen" (#7CFC00)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lawngreen")
	public static final RGBA lawngreen = new Color(124, 252, 0);

	/**
	 * CSS color "lemonchiffon" (#FFFACD)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lemonchiffon")
	public static final RGBA lemonchiffon = new Color(255, 250, 205);

	/**
	 * CSS color "lightblue" (#ADD8E6)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightblue")
	public static final RGBA lightblue = new Color(173, 216, 230);

	/**
	 * CSS color "lightcoral" (#F08080)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightcoral")
	public static final RGBA lightcoral = new Color(240, 128, 128);

	/**
	 * CSS color "lightcyan" (#E0FFFF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightcyan")
	public static final RGBA lightcyan = new Color(224, 255, 255);

	/**
	 * CSS color "lightgoldenrodyellow" (#FAFAD2)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightgoldenrodyellow")
	public static final RGBA lightgoldenrodyellow = new Color(250, 250, 210);

	/**
	 * CSS color "lightgray" (#D3D3D3)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightgray")
	public static final RGBA lightgray = new Color(211, 211, 211);

	/**
	 * CSS color "lightgreen" (#90EE90)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightgreen")
	public static final RGBA lightgreen = new Color(144, 238, 144);

	/**
	 * CSS color "lightgrey" (#D3D3D3)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightgrey")
	public static final RGBA lightgrey = new Color(211, 211, 211);

	/**
	 * CSS color "lightpink" (#FFB6C1)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightpink")
	public static final RGBA lightpink = new Color(255, 182, 193);

	/**
	 * CSS color "lightsalmon" (#FFA07A)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightsalmon")
	public static final RGBA lightsalmon = new Color(255, 160, 122);

	/**
	 * CSS color "lightseagreen" (#20B2AA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightseagreen")
	public static final RGBA lightseagreen = new Color(32, 178, 170);

	/**
	 * CSS color "lightskyblue" (#87CEFA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightskyblue")
	public static final RGBA lightskyblue = new Color(135, 206, 250);

	/**
	 * CSS color "lightslategray" (#778899)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightslategray")
	public static final RGBA lightslategray = new Color(119, 136, 153);

	/**
	 * CSS color "lightslategrey" (#778899)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightslategrey")
	public static final RGBA lightslategrey = new Color(119, 136, 153);

	/**
	 * CSS color "lightsteelblue" (#B0C4DE)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightsteelblue")
	public static final RGBA lightsteelblue = new Color(176, 196, 222);

	/**
	 * CSS color "lightyellow" (#FFFFE0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lightyellow")
	public static final RGBA lightyellow = new Color(255, 255, 224);

	/**
	 * CSS color "lime" (#00FF00)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "lime")
	public static final RGBA lime = new Color(0, 255, 0);

	/**
	 * CSS color "limegreen" (#32CD32)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "limegreen")
	public static final RGBA limegreen = new Color(50, 205, 50);

	/**
	 * CSS color "linen" (#FAF0E6)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "linen")
	public static final RGBA linen = new Color(250, 240, 230);

	/**
	 * CSS color "magenta" (#FF00FF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "magenta")
	public static final RGBA magenta = new Color(255, 0, 255);

	/**
	 * CSS color "maroon" (#800000)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "maroon")
	public static final RGBA maroon = new Color(128, 0, 0);

	/**
	 * CSS color "mediumaquamarine" (#66CDAA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumaquamarine")
	public static final RGBA mediumaquamarine = new Color(102, 205, 170);

	/**
	 * CSS color "mediumblue" (#0000CD)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumblue")
	public static final RGBA mediumblue = new Color(0, 0, 205);

	/**
	 * CSS color "mediumorchid" (#BA55D3)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumorchid")
	public static final RGBA mediumorchid = new Color(186, 85, 211);

	/**
	 * CSS color "mediumpurple" (#9370DB)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumpurple")
	public static final RGBA mediumpurple = new Color(147, 112, 219);

	/**
	 * CSS color "mediumseagreen" (#3CB371)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumseagreen")
	public static final RGBA mediumseagreen = new Color(60, 179, 113);

	/**
	 * CSS color "mediumslateblue" (#7B68EE)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumslateblue")
	public static final RGBA mediumslateblue = new Color(123, 104, 238);

	/**
	 * CSS color "mediumspringgreen" (#00FA9A)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumspringgreen")
	public static final RGBA mediumspringgreen = new Color(0, 250, 154);

	/**
	 * CSS color "mediumturquoise" (#48D1CC)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumturquoise")
	public static final RGBA mediumturquoise = new Color(72, 209, 204);

	/**
	 * CSS color "mediumvioletred" (#C71585)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mediumvioletred")
	public static final RGBA mediumvioletred = new Color(199, 21, 133);

	/**
	 * CSS color "midnightblue" (#191970)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "midnightblue")
	public static final RGBA midnightblue = new Color(25, 25, 112);

	/**
	 * CSS color "mintcream" (#F5FFFA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mintcream")
	public static final RGBA mintcream = new Color(245, 255, 250);

	/**
	 * CSS color "mistyrose" (#FFE4E1)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "mistyrose")
	public static final RGBA mistyrose = new Color(255, 228, 225);

	/**
	 * CSS color "moccasin" (#FFE4B5)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "moccasin")
	public static final RGBA moccasin = new Color(255, 228, 181);

	/**
	 * CSS color "navajowhite" (#FFDEAD)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "navajowhite")
	public static final RGBA navajowhite = new Color(255, 222, 173);

	/**
	 * CSS color "navy" (#000080)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "navy")
	public static final RGBA navy = new Color(0, 0, 128);

	/**
	 * CSS color "oldlace" (#FDF5E6)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "oldlace")
	public static final RGBA oldlace = new Color(253, 245, 230);

	/**
	 * CSS color "olive" (#808000)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "olive")
	public static final RGBA olive = new Color(128, 128, 0);

	/**
	 * CSS color "olivedrab" (#6B8E23)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "olivedrab")
	public static final RGBA olivedrab = new Color(107, 142, 35);

	/**
	 * CSS color "orange" (#FFA500)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "orange")
	public static final RGBA orange = new Color(255, 165, 0);

	/**
	 * CSS color "orangered" (#FF4500)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "orangered")
	public static final RGBA orangered = new Color(255, 69, 0);

	/**
	 * CSS color "orchid" (#DA70D6)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "orchid")
	public static final RGBA orchid = new Color(218, 112, 214);

	/**
	 * CSS color "palegoldenrod" (#EEE8AA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "palegoldenrod")
	public static final RGBA palegoldenrod = new Color(238, 232, 170);

	/**
	 * CSS color "palegreen" (#98FB98)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "palegreen")
	public static final RGBA palegreen = new Color(152, 251, 152);

	/**
	 * CSS color "paleturquoise" (#AFEEEE)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "paleturquoise")
	public static final RGBA paleturquoise = new Color(175, 238, 238);

	/**
	 * CSS color "palevioletred" (#DB7093)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "palevioletred")
	public static final RGBA palevioletred = new Color(219, 112, 147);

	/**
	 * CSS color "papayawhip" (#FFEFD5)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "papayawhip")
	public static final RGBA papayawhip = new Color(255, 239, 213);

	/**
	 * CSS color "peachpuff" (#FFDAB9)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "peachpuff")
	public static final RGBA peachpuff = new Color(255, 218, 185);

	/**
	 * CSS color "peru" (#CD853F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "peru")
	public static final RGBA peru = new Color(205, 133, 63);

	/**
	 * CSS color "pink" (#FFC0CB)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "pink")
	public static final RGBA pink = new Color(255, 192, 203);

	/**
	 * CSS color "plum" (#DDA0DD)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "plum")
	public static final RGBA plum = new Color(221, 160, 221);

	/**
	 * CSS color "powderblue" (#B0E0E6)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "powderblue")
	public static final RGBA powderblue = new Color(176, 224, 230);

	/**
	 * CSS color "purple" (#800080)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "purple")
	public static final RGBA purple = new Color(128, 0, 128);

	/**
	 * CSS color "rebeccapurple" (#663399)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "rebeccapurple")
	public static final RGBA rebeccapurple = new Color(102, 51, 153);

	/**
	 * CSS color "red" (#FF0000)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "red")
	public static final RGBA red = new Color(255, 0, 0);

	/**
	 * CSS color "rosybrown" (#BC8F8F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "rosybrown")
	public static final RGBA rosybrown = new Color(188, 143, 143);

	/**
	 * CSS color "royalblue" (#4169E1)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "royalblue")
	public static final RGBA royalblue = new Color(65, 105, 225);

	/**
	 * CSS color "saddlebrown" (#8B4513)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "saddlebrown")
	public static final RGBA saddlebrown = new Color(139, 69, 19);

	/**
	 * CSS color "salmon" (#FA8072)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "salmon")
	public static final RGBA salmon = new Color(250, 128, 114);

	/**
	 * CSS color "sandybrown" (#F4A460)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "sandybrown")
	public static final RGBA sandybrown = new Color(244, 164, 96);

	/**
	 * CSS color "seagreen" (#2E8B57)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "seagreen")
	public static final RGBA seagreen = new Color(46, 139, 87);

	/**
	 * CSS color "seashell" (#FFF5EE)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "seashell")
	public static final RGBA seashell = new Color(255, 245, 238);

	/**
	 * CSS color "sienna" (#A0522D)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "sienna")
	public static final RGBA sienna = new Color(160, 82, 45);

	/**
	 * CSS color "silver" (#C0C0C0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "silver")
	public static final RGBA silver = new Color(192, 192, 192);

	/**
	 * CSS color "skyblue" (#87CEEB)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "skyblue")
	public static final RGBA skyblue = new Color(135, 206, 235);

	/**
	 * CSS color "slateblue" (#6A5ACD)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "slateblue")
	public static final RGBA slateblue = new Color(106, 90, 205);

	/**
	 * CSS color "slategray" (#708090)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "slategray")
	public static final RGBA slategray = new Color(112, 128, 144);

	/**
	 * CSS color "slategrey" (#708090)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "slategrey")
	public static final RGBA slategrey = new Color(112, 128, 144);

	/**
	 * CSS color "snow" (#FFFAFA)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "snow")
	public static final RGBA snow = new Color(255, 250, 250);

	/**
	 * CSS color "springgreen" (#00FF7F)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "springgreen")
	public static final RGBA springgreen = new Color(0, 255, 127);

	/**
	 * CSS color "steelblue" (#4682B4)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "steelblue")
	public static final RGBA steelblue = new Color(70, 130, 180);

	/**
	 * CSS color "tan" (#D2B48C)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "tan")
	public static final RGBA tan = new Color(210, 180, 140);

	/**
	 * CSS color "teal" (#008080)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "teal")
	public static final RGBA teal = new Color(0, 128, 128);

	/**
	 * CSS color "thistle" (#D8BFD8)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "thistle")
	public static final RGBA thistle = new Color(216, 191, 216);

	/**
	 * CSS color "tomato" (#FF6347)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "tomato")
	public static final RGBA tomato = new Color(255, 99, 71);

	/**
	 * CSS color "turquoise" (#40E0D0)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "turquoise")
	public static final RGBA turquoise = new Color(64, 224, 208);

	/**
	 * CSS color "violet" (#EE82EE)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "violet")
	public static final RGBA violet = new Color(238, 130, 238);

	/**
	 * CSS color "wheat" (#F5DEB3)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "wheat")
	public static final RGBA wheat = new Color(245, 222, 179);

	/**
	 * CSS color "white" (#FFFFFF)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "white")
	public static final RGBA white = new Color(255, 255, 255);

	/**
	 * CSS color "whitesmoke" (#F5F5F5)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "whitesmoke")
	public static final RGBA whitesmoke = new Color(245, 245, 245);

	/**
	 * CSS color "yellow" (#FFFF00)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "yellow")
	public static final RGBA yellow = new Color(255, 255, 0);

	/**
	 * CSS color "yellowgreen" (#9ACD32)
	 */
	@ReferenceColor(type = ColorType.CSS, name = "yellowgreen")
	public static final RGBA yellowgreen = new Color(154, 205, 50);


	/**
	 * Tableau color "blue" (#1f77b4)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "blue")
	public static final RGBA tab_blue = new Color(31, 119, 180);

	/**
	 * Tableau color "orange" (#ff7f0e)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "orange")
	public static final RGBA tab_orange = new Color(255, 127, 14);

	/**
	 * Tableau color "green" (#2ca02c)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "green")
	public static final RGBA tab_green = new Color(44, 160, 44);

	/**
	 * Tableau color "red" (#d62728)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "red")
	public static final RGBA tab_red = new Color(214, 39, 40);

	/**
	 * Tableau color "purple" (#9467bd)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "purple")
	public static final RGBA tab_purple = new Color(148, 103, 189);

	/**
	 * Tableau color "brown" (#8c564b)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "brown")
	public static final RGBA tab_brown = new Color(140, 86, 75);

	/**
	 * Tableau color "pink" (#e377c2)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "pink")
	public static final RGBA tab_pink = new Color(227, 119, 194);

	/**
	 * Tableau color "grey" (#7f7f7f)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "grey")
	public static final RGBA tab_grey = new Color(127, 127, 127);

	/**
	 * Tableau color "olive" (#bcbd22)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "olive")
	public static final RGBA tab_olive = new Color(188, 189, 34);

	/**
	 * Tableau color "aqua" (#17becf)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "aqua")
	public static final RGBA tab_aqua = new Color(23, 190, 207);

	/**
	 * Tableau color "lightblue" (#aec7e8)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightblue")
	public static final RGBA tab_lightblue = new Color(174, 199, 232);

	/**
	 * Tableau color "lightorange" (#ffbb78)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightorange")
	public static final RGBA tab_lightorange = new Color(255, 187, 120);

	/**
	 * Tableau color "lightgreen" (#98df8a)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightgreen")
	public static final RGBA tab_lightgreen = new Color(152, 223, 138);

	/**
	 * Tableau color "lightred" (#ff9896)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightred")
	public static final RGBA tab_lightred = new Color(255, 152, 150);

	/**
	 * Tableau color "lightpurple" (#c5b0d5)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightpurple")
	public static final RGBA tab_lightpurple = new Color(197, 176, 213);

	/**
	 * Tableau color "lightbrown" (#c49c94)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightbrown")
	public static final RGBA tab_lightbrown = new Color(196, 156, 148);

	/**
	 * Tableau color "lightpink" (#f7b6d2)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightpink")
	public static final RGBA tab_lightpink = new Color(247, 182, 210);

	/**
	 * Tableau color "lightgrey" (#c7c7c7)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightgrey")
	public static final RGBA tab_lightgrey = new Color(199, 199, 199);

	/**
	 * Tableau color "lightolive" (#dbdb8d)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightolive")
	public static final RGBA tab_lightolive = new Color(219, 219, 141);

	/**
	 * Tableau color "lightaqua" (#9edae5)
	 */
	@ReferenceColor(type = ColorType.TABLEAU, name = "lightaqua")
	public static final RGBA tab_lightaqua = new Color(158, 218, 229);


    //{{END}}//
    private final static Map<String, RGBA> referenceColors = new HashMap<>();

    static {
        for (final Field field : Color.class.getDeclaredFields()) {
            final ReferenceColor annotation = field.getAnnotation(ReferenceColor.class);
            if (annotation == null) {
                continue;
            }
            try {
                referenceColors.put(String.format("%s:%s", annotation.type().prefix(), annotation.name()), (Color) field.get(null));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }



    private static RGBA get(ColorType type, final String name) {
        return referenceColors.get(String.format("%s:%s", type.prefix(), name.toLowerCase()));

    }

    /**
     * Get a CSS color by name
     *
     * @param name the name of the color
     * @return the CSS color, if exist or {@code null} if not
     */
    public static RGBA getCSS(String name) {
        return get(ColorType.CSS, name);
    }

    /**
     * Get a Tableau color by name
     *
     * @param name the name of the color
     * @return the Tableau color, if exist or {@code null} if not
     */
    public static RGBA getTableau(String name) {
        return get(ColorType.TABLEAU, name);
    }

    /**
     * Get an AWT color by name
     *
     * @param name the name of the color
     * @return the AWT color, if exist or {@code null} if not
     */
    public static RGBA getAWT(String name) {
        return get(ColorType.AWT, name);
    }

    /**
     * Get a color by name. In order preference as defined in the enum {@link ColorType}
     * <p>
     * If the name of the color is prefixed (e.g. "css", "awt", "tab", "tableau") with a colon/comma separator
     * will only search colors of that type.
     *
     * @param name the name of the color
     * @return the color, if exist or {@code null} if not
     */
    public static RGBA get(String name) {
        final Matcher matcher = Pattern.compile("([A-z ]*)[:\\.]([A-z ]*)").matcher(name);
        if (matcher.matches()) {
            return get(ColorType.from(matcher.group(1).toLowerCase()), matcher.group(2));
        } else {
            for (final ColorType type : ColorType.values()) {
                final RGBA match = get(type, name);
                if (match != null){
                	return match;
				}
            }
        }
        return null;
    }

    private final float[] rgba;

    private Color(float[] rgba) {
        this.rgba = rgba;
    }

    private Color(float red, float green, float blue, float alpha) {
        this.rgba = new float[]{red, green, blue, alpha};
    }

    /**
     * Construct a color from floating point numbers
     *
     * @param red   the red component (0-1)
     * @param green the green component (0-1)
     * @param blue  the blue component (0-1)
     * @param alpha the alpha component (0-1)
     */
    public Color(double red, double green, double blue, double alpha) {
        this((float) red, (float) green, (float) blue, (float) alpha);
    }

    /**
     * Construct a color from 8-bit components
     *
     * @param red   the red component (0-255)
     * @param green the green component (0-255)
     * @param blue  the blue component (0-255)
     * @param alpha the alpha component (0-255)
     */
    public Color(int red, int green, int blue, int alpha) {
        this(red / 255f, green / 255f, blue / 255f, alpha / 255f);
    }

    /**
     * Construct an opaque color from floating point numbers
     *
     * @param red   the red component (0-1)
     * @param green the green component (0-1)
     * @param blue  the blue component (0-1)
     */
    public Color(double red, double green, double blue) {
        this(red, green, blue, 1);
    }

    /**
     * Construct an opaque color from 8-bit components
     *
     * @param red   the red component (0-255)
     * @param green the green component (0-255)
     * @param blue  the blue component (0-255)
     */
    public Color(int red, int green, int blue) {
        this(red / 255f, green / 255f, blue / 255f, 1);
    }

    /**
     * Construct a color from a hexadecimal string representation of the color
     *
     * @param hex the hexadecimal representation of the color
     */
    public Color(final String hex) {
        this(RGBA.hexadecimalToRGBA(hex));
    }

    /**
     * Construct a color from a decimal representation of the color
     *
     * @param decimal the decimal representation of the color
     */
    public Color(int decimal) {
        this(RGBA.decimalToRGBA(decimal));
    }
	/**
	 * Copy constructor
	 * @param color the color to copy
	 */
	public Color(RGBA color) {
		this(color.red(), color.green(), color.blue(), color.alpha());
	}
    @Override
    public float red() {
        return rgba[0];
    }

    @Override
    public float green() {
        return rgba[1];
    }

    @Override
    public float blue() {
        return rgba[2];
    }

    @Override
    public float alpha() {
        return rgba[3];
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color)) return false;
        return Arrays.equals(rgba, ((Color) o).rgba);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(rgba);
    }

    @Override
    public final String toString() {
    	if (this == TRANSPARENT){
    		return "Color {TRANSPARENT}";
		}
        for (final Map.Entry<String, RGBA> color : referenceColors.entrySet()) {
            if (color.getValue() == this) {
                return String.format("Color {%s, %s}", color.getKey(), toHex());
            }
        }
        return String.format("Color {%s, opacity: %.1f%%}", RGBA.toHexadecimal(getRed(), getGreen(), getBlue()), alpha() * 100);
    }

}
