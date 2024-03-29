package net.mahdilamb.colormap;

import net.mahdilamb.colormap.reference.ColorType;
import net.mahdilamb.colormap.reference.ReferenceColor;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;

/**
 * Utility class for working with colors
 */
public final class Colors {
    private Colors() {

    }
    //{{START}}//
    /**
     * Base color "transparent"
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#000000;opacity:0;float:right;margin: 0 10px 0 0"></div>
     */
    public final static Color TRANSPARENT = new Color(0, 0, 0, 0);
    /**
     * AWT color "red".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ff0000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "red")
    public final static Color RED = new Color(255, 0, 0);
    /**
     * AWT color "green".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00ff00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "green")
    public final static Color GREEN = new Color(0, 255, 0);
    /**
     * AWT color "blue".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#0000ff;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "blue")
    public final static Color BLUE = new Color(0, 0, 255);
    /**
     * AWT color "cyan".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00ffff;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "cyan")
    public final static Color CYAN = new Color(0, 255, 255);
    /**
     * AWT color "magenta".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ff00ff;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "magenta")
    public final static Color MAGENTA = new Color(255, 0, 255);
    /**
     * AWT color "yellow".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ffff00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "yellow")
    public final static Color YELLOW = new Color(255, 255, 0);
    /**
     * AWT color "white".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ffffff;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "white")
    public final static Color WHITE = new Color(255, 255, 255);
    /**
     * AWT color "black".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#000000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "black")
    public final static Color BLACK = new Color(0, 0, 0);
    /**
     * AWT color "lightgray".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#c0c0c0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "lightgray")
    public final static Color LIGHT_GRAY = new Color(192, 192, 192);
    /**
     * AWT color "darkgray".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#404040;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "darkgray")
    public final static Color DARK_GRAY = new Color(64, 64, 64);
    /**
     * AWT color "pink".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ffafaf;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "pink")
    public final static Color PINK = new Color(255, 175, 175);
    /**
     * AWT color "orange".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ffc800;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "orange")
    public final static Color ORANGE = new Color(255, 200, 0);
    /**
     * AWT color "gray".
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#808080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.AWT, name = "gray")
    public final static Color GRAY = new Color(128, 128, 128);

    //{{START}}//
    /**
     * CSS color "aliceblue" (#F0F8FF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F0F8FF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "aliceblue")
    public static final Color aliceblue = new Color(240, 248, 255);

    /**
     * CSS color "antiquewhite" (#FAEBD7)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FAEBD7;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "antiquewhite")
    public static final Color antiquewhite = new Color(250, 235, 215);

    /**
     * CSS color "aqua" (#00FFFF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00FFFF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "aqua")
    public static final Color aqua = new Color(0, 255, 255);

    /**
     * CSS color "aquamarine" (#7FFFD4)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#7FFFD4;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "aquamarine")
    public static final Color aquamarine = new Color(127, 255, 212);

    /**
     * CSS color "azure" (#F0FFFF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F0FFFF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "azure")
    public static final Color azure = new Color(240, 255, 255);

    /**
     * CSS color "beige" (#F5F5DC)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F5F5DC;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "beige")
    public static final Color beige = new Color(245, 245, 220);

    /**
     * CSS color "bisque" (#FFE4C4)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFE4C4;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "bisque")
    public static final Color bisque = new Color(255, 228, 196);

    /**
     * CSS color "black" (#000000)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#000000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "black")
    public static final Color black = new Color(0, 0, 0);

    /**
     * CSS color "blanchedalmond" (#FFEBCD)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFEBCD;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "blanchedalmond")
    public static final Color blanchedalmond = new Color(255, 235, 205);

    /**
     * CSS color "blue" (#0000FF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#0000FF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "blue")
    public static final Color blue = new Color(0, 0, 255);

    /**
     * CSS color "blueviolet" (#8A2BE2)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#8A2BE2;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "blueviolet")
    public static final Color blueviolet = new Color(138, 43, 226);

    /**
     * CSS color "brown" (#A52A2A)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#A52A2A;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "brown")
    public static final Color brown = new Color(165, 42, 42);

    /**
     * CSS color "burlywood" (#DEB887)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DEB887;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "burlywood")
    public static final Color burlywood = new Color(222, 184, 135);

    /**
     * CSS color "cadetblue" (#5F9EA0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#5F9EA0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "cadetblue")
    public static final Color cadetblue = new Color(95, 158, 160);

    /**
     * CSS color "chartreuse" (#7FFF00)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#7FFF00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "chartreuse")
    public static final Color chartreuse = new Color(127, 255, 0);

    /**
     * CSS color "chocolate" (#D2691E)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#D2691E;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "chocolate")
    public static final Color chocolate = new Color(210, 105, 30);

    /**
     * CSS color "coral" (#FF7F50)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF7F50;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "coral")
    public static final Color coral = new Color(255, 127, 80);

    /**
     * CSS color "cornflowerblue" (#6495ED)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#6495ED;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "cornflowerblue")
    public static final Color cornflowerblue = new Color(100, 149, 237);

    /**
     * CSS color "cornsilk" (#FFF8DC)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFF8DC;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "cornsilk")
    public static final Color cornsilk = new Color(255, 248, 220);

    /**
     * CSS color "crimson" (#DC143C)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DC143C;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "crimson")
    public static final Color crimson = new Color(220, 20, 60);

    /**
     * CSS color "cyan" (#00FFFF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00FFFF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "cyan")
    public static final Color cyan = new Color(0, 255, 255);

    /**
     * CSS color "darkblue" (#00008B)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00008B;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkblue")
    public static final Color darkblue = new Color(0, 0, 139);

    /**
     * CSS color "darkcyan" (#008B8B)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#008B8B;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkcyan")
    public static final Color darkcyan = new Color(0, 139, 139);

    /**
     * CSS color "darkgoldenrod" (#B8860B)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#B8860B;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkgoldenrod")
    public static final Color darkgoldenrod = new Color(184, 134, 11);

    /**
     * CSS color "darkgray" (#A9A9A9)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#A9A9A9;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkgray")
    public static final Color darkgray = new Color(169, 169, 169);

    /**
     * CSS color "darkgreen" (#006400)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#006400;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkgreen")
    public static final Color darkgreen = new Color(0, 100, 0);

    /**
     * CSS color "darkgrey" (#A9A9A9)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#A9A9A9;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkgrey")
    public static final Color darkgrey = new Color(169, 169, 169);

    /**
     * CSS color "darkkhaki" (#BDB76B)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#BDB76B;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkkhaki")
    public static final Color darkkhaki = new Color(189, 183, 107);

    /**
     * CSS color "darkmagenta" (#8B008B)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#8B008B;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkmagenta")
    public static final Color darkmagenta = new Color(139, 0, 139);

    /**
     * CSS color "darkolivegreen" (#556B2F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#556B2F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkolivegreen")
    public static final Color darkolivegreen = new Color(85, 107, 47);

    /**
     * CSS color "darkorange" (#FF8C00)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF8C00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkorange")
    public static final Color darkorange = new Color(255, 140, 0);

    /**
     * CSS color "darkorchid" (#9932CC)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#9932CC;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkorchid")
    public static final Color darkorchid = new Color(153, 50, 204);

    /**
     * CSS color "darkred" (#8B0000)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#8B0000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkred")
    public static final Color darkred = new Color(139, 0, 0);

    /**
     * CSS color "darksalmon" (#E9967A)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#E9967A;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darksalmon")
    public static final Color darksalmon = new Color(233, 150, 122);

    /**
     * CSS color "darkseagreen" (#8FBC8F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#8FBC8F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkseagreen")
    public static final Color darkseagreen = new Color(143, 188, 143);

    /**
     * CSS color "darkslateblue" (#483D8B)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#483D8B;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkslateblue")
    public static final Color darkslateblue = new Color(72, 61, 139);

    /**
     * CSS color "darkslategray" (#2F4F4F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#2F4F4F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkslategray")
    public static final Color darkslategray = new Color(47, 79, 79);

    /**
     * CSS color "darkslategrey" (#2F4F4F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#2F4F4F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkslategrey")
    public static final Color darkslategrey = new Color(47, 79, 79);

    /**
     * CSS color "darkturquoise" (#00CED1)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00CED1;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkturquoise")
    public static final Color darkturquoise = new Color(0, 206, 209);

    /**
     * CSS color "darkviolet" (#9400D3)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#9400D3;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "darkviolet")
    public static final Color darkviolet = new Color(148, 0, 211);

    /**
     * CSS color "deeppink" (#FF1493)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF1493;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "deeppink")
    public static final Color deeppink = new Color(255, 20, 147);

    /**
     * CSS color "deepskyblue" (#00BFFF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00BFFF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "deepskyblue")
    public static final Color deepskyblue = new Color(0, 191, 255);

    /**
     * CSS color "dimgray" (#696969)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#696969;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "dimgray")
    public static final Color dimgray = new Color(105, 105, 105);

    /**
     * CSS color "dimgrey" (#696969)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#696969;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "dimgrey")
    public static final Color dimgrey = new Color(105, 105, 105);

    /**
     * CSS color "dodgerblue" (#1E90FF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#1E90FF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "dodgerblue")
    public static final Color dodgerblue = new Color(30, 144, 255);

    /**
     * CSS color "firebrick" (#B22222)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#B22222;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "firebrick")
    public static final Color firebrick = new Color(178, 34, 34);

    /**
     * CSS color "floralwhite" (#FFFAF0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFAF0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "floralwhite")
    public static final Color floralwhite = new Color(255, 250, 240);

    /**
     * CSS color "forestgreen" (#228B22)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#228B22;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "forestgreen")
    public static final Color forestgreen = new Color(34, 139, 34);

    /**
     * CSS color "fuchsia" (#FF00FF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF00FF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "fuchsia")
    public static final Color fuchsia = new Color(255, 0, 255);

    /**
     * CSS color "gainsboro" (#DCDCDC)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DCDCDC;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "gainsboro")
    public static final Color gainsboro = new Color(220, 220, 220);

    /**
     * CSS color "ghostwhite" (#F8F8FF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F8F8FF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "ghostwhite")
    public static final Color ghostwhite = new Color(248, 248, 255);

    /**
     * CSS color "gold" (#FFD700)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFD700;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "gold")
    public static final Color gold = new Color(255, 215, 0);

    /**
     * CSS color "goldenrod" (#DAA520)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DAA520;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "goldenrod")
    public static final Color goldenrod = new Color(218, 165, 32);

    /**
     * CSS color "gray" (#808080)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#808080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "gray")
    public static final Color gray = new Color(128, 128, 128);

    /**
     * CSS color "green" (#008000)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#008000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "green")
    public static final Color green = new Color(0, 128, 0);

    /**
     * CSS color "greenyellow" (#ADFF2F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ADFF2F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "greenyellow")
    public static final Color greenyellow = new Color(173, 255, 47);

    /**
     * CSS color "grey" (#808080)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#808080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "grey")
    public static final Color grey = new Color(128, 128, 128);

    /**
     * CSS color "honeydew" (#F0FFF0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F0FFF0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "honeydew")
    public static final Color honeydew = new Color(240, 255, 240);

    /**
     * CSS color "hotpink" (#FF69B4)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF69B4;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "hotpink")
    public static final Color hotpink = new Color(255, 105, 180);

    /**
     * CSS color "indianred" (#CD5C5C)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#CD5C5C;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "indianred")
    public static final Color indianred = new Color(205, 92, 92);

    /**
     * CSS color "indigo" (#4B0082)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#4B0082;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "indigo")
    public static final Color indigo = new Color(75, 0, 130);

    /**
     * CSS color "ivory" (#FFFFF0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFFF0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "ivory")
    public static final Color ivory = new Color(255, 255, 240);

    /**
     * CSS color "khaki" (#F0E68C)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F0E68C;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "khaki")
    public static final Color khaki = new Color(240, 230, 140);

    /**
     * CSS color "lavender" (#E6E6FA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#E6E6FA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lavender")
    public static final Color lavender = new Color(230, 230, 250);

    /**
     * CSS color "lavenderblush" (#FFF0F5)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFF0F5;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lavenderblush")
    public static final Color lavenderblush = new Color(255, 240, 245);

    /**
     * CSS color "lawngreen" (#7CFC00)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#7CFC00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lawngreen")
    public static final Color lawngreen = new Color(124, 252, 0);

    /**
     * CSS color "lemonchiffon" (#FFFACD)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFACD;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lemonchiffon")
    public static final Color lemonchiffon = new Color(255, 250, 205);

    /**
     * CSS color "lightblue" (#ADD8E6)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ADD8E6;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightblue")
    public static final Color lightblue = new Color(173, 216, 230);

    /**
     * CSS color "lightcoral" (#F08080)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F08080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightcoral")
    public static final Color lightcoral = new Color(240, 128, 128);

    /**
     * CSS color "lightcyan" (#E0FFFF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#E0FFFF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightcyan")
    public static final Color lightcyan = new Color(224, 255, 255);

    /**
     * CSS color "lightgoldenrodyellow" (#FAFAD2)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FAFAD2;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightgoldenrodyellow")
    public static final Color lightgoldenrodyellow = new Color(250, 250, 210);

    /**
     * CSS color "lightgray" (#D3D3D3)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#D3D3D3;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightgray")
    public static final Color lightgray = new Color(211, 211, 211);

    /**
     * CSS color "lightgreen" (#90EE90)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#90EE90;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightgreen")
    public static final Color lightgreen = new Color(144, 238, 144);

    /**
     * CSS color "lightgrey" (#D3D3D3)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#D3D3D3;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightgrey")
    public static final Color lightgrey = new Color(211, 211, 211);

    /**
     * CSS color "lightpink" (#FFB6C1)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFB6C1;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightpink")
    public static final Color lightpink = new Color(255, 182, 193);

    /**
     * CSS color "lightsalmon" (#FFA07A)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFA07A;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightsalmon")
    public static final Color lightsalmon = new Color(255, 160, 122);

    /**
     * CSS color "lightseagreen" (#20B2AA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#20B2AA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightseagreen")
    public static final Color lightseagreen = new Color(32, 178, 170);

    /**
     * CSS color "lightskyblue" (#87CEFA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#87CEFA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightskyblue")
    public static final Color lightskyblue = new Color(135, 206, 250);

    /**
     * CSS color "lightslategray" (#778899)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#778899;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightslategray")
    public static final Color lightslategray = new Color(119, 136, 153);

    /**
     * CSS color "lightslategrey" (#778899)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#778899;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightslategrey")
    public static final Color lightslategrey = new Color(119, 136, 153);

    /**
     * CSS color "lightsteelblue" (#B0C4DE)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#B0C4DE;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightsteelblue")
    public static final Color lightsteelblue = new Color(176, 196, 222);

    /**
     * CSS color "lightyellow" (#FFFFE0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFFE0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lightyellow")
    public static final Color lightyellow = new Color(255, 255, 224);

    /**
     * CSS color "lime" (#00FF00)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00FF00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "lime")
    public static final Color lime = new Color(0, 255, 0);

    /**
     * CSS color "limegreen" (#32CD32)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#32CD32;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "limegreen")
    public static final Color limegreen = new Color(50, 205, 50);

    /**
     * CSS color "linen" (#FAF0E6)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FAF0E6;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "linen")
    public static final Color linen = new Color(250, 240, 230);

    /**
     * CSS color "magenta" (#FF00FF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF00FF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "magenta")
    public static final Color magenta = new Color(255, 0, 255);

    /**
     * CSS color "maroon" (#800000)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#800000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "maroon")
    public static final Color maroon = new Color(128, 0, 0);

    /**
     * CSS color "mediumaquamarine" (#66CDAA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#66CDAA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumaquamarine")
    public static final Color mediumaquamarine = new Color(102, 205, 170);

    /**
     * CSS color "mediumblue" (#0000CD)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#0000CD;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumblue")
    public static final Color mediumblue = new Color(0, 0, 205);

    /**
     * CSS color "mediumorchid" (#BA55D3)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#BA55D3;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumorchid")
    public static final Color mediumorchid = new Color(186, 85, 211);

    /**
     * CSS color "mediumpurple" (#9370DB)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#9370DB;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumpurple")
    public static final Color mediumpurple = new Color(147, 112, 219);

    /**
     * CSS color "mediumseagreen" (#3CB371)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#3CB371;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumseagreen")
    public static final Color mediumseagreen = new Color(60, 179, 113);

    /**
     * CSS color "mediumslateblue" (#7B68EE)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#7B68EE;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumslateblue")
    public static final Color mediumslateblue = new Color(123, 104, 238);

    /**
     * CSS color "mediumspringgreen" (#00FA9A)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00FA9A;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumspringgreen")
    public static final Color mediumspringgreen = new Color(0, 250, 154);

    /**
     * CSS color "mediumturquoise" (#48D1CC)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#48D1CC;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumturquoise")
    public static final Color mediumturquoise = new Color(72, 209, 204);

    /**
     * CSS color "mediumvioletred" (#C71585)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#C71585;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mediumvioletred")
    public static final Color mediumvioletred = new Color(199, 21, 133);

    /**
     * CSS color "midnightblue" (#191970)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#191970;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "midnightblue")
    public static final Color midnightblue = new Color(25, 25, 112);

    /**
     * CSS color "mintcream" (#F5FFFA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F5FFFA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mintcream")
    public static final Color mintcream = new Color(245, 255, 250);

    /**
     * CSS color "mistyrose" (#FFE4E1)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFE4E1;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "mistyrose")
    public static final Color mistyrose = new Color(255, 228, 225);

    /**
     * CSS color "moccasin" (#FFE4B5)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFE4B5;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "moccasin")
    public static final Color moccasin = new Color(255, 228, 181);

    /**
     * CSS color "navajowhite" (#FFDEAD)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFDEAD;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "navajowhite")
    public static final Color navajowhite = new Color(255, 222, 173);

    /**
     * CSS color "navy" (#000080)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#000080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "navy")
    public static final Color navy = new Color(0, 0, 128);

    /**
     * CSS color "oldlace" (#FDF5E6)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FDF5E6;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "oldlace")
    public static final Color oldlace = new Color(253, 245, 230);

    /**
     * CSS color "olive" (#808000)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#808000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "olive")
    public static final Color olive = new Color(128, 128, 0);

    /**
     * CSS color "olivedrab" (#6B8E23)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#6B8E23;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "olivedrab")
    public static final Color olivedrab = new Color(107, 142, 35);

    /**
     * CSS color "orange" (#FFA500)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFA500;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "orange")
    public static final Color orange = new Color(255, 165, 0);

    /**
     * CSS color "orangered" (#FF4500)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF4500;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "orangered")
    public static final Color orangered = new Color(255, 69, 0);

    /**
     * CSS color "orchid" (#DA70D6)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DA70D6;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "orchid")
    public static final Color orchid = new Color(218, 112, 214);

    /**
     * CSS color "palegoldenrod" (#EEE8AA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#EEE8AA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "palegoldenrod")
    public static final Color palegoldenrod = new Color(238, 232, 170);

    /**
     * CSS color "palegreen" (#98FB98)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#98FB98;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "palegreen")
    public static final Color palegreen = new Color(152, 251, 152);

    /**
     * CSS color "paleturquoise" (#AFEEEE)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#AFEEEE;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "paleturquoise")
    public static final Color paleturquoise = new Color(175, 238, 238);

    /**
     * CSS color "palevioletred" (#DB7093)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DB7093;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "palevioletred")
    public static final Color palevioletred = new Color(219, 112, 147);

    /**
     * CSS color "papayawhip" (#FFEFD5)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFEFD5;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "papayawhip")
    public static final Color papayawhip = new Color(255, 239, 213);

    /**
     * CSS color "peachpuff" (#FFDAB9)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFDAB9;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "peachpuff")
    public static final Color peachpuff = new Color(255, 218, 185);

    /**
     * CSS color "peru" (#CD853F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#CD853F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "peru")
    public static final Color peru = new Color(205, 133, 63);

    /**
     * CSS color "pink" (#FFC0CB)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFC0CB;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "pink")
    public static final Color pink = new Color(255, 192, 203);

    /**
     * CSS color "plum" (#DDA0DD)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#DDA0DD;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "plum")
    public static final Color plum = new Color(221, 160, 221);

    /**
     * CSS color "powderblue" (#B0E0E6)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#B0E0E6;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "powderblue")
    public static final Color powderblue = new Color(176, 224, 230);

    /**
     * CSS color "purple" (#800080)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#800080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "purple")
    public static final Color purple = new Color(128, 0, 128);

    /**
     * CSS color "rebeccapurple" (#663399)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#663399;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "rebeccapurple")
    public static final Color rebeccapurple = new Color(102, 51, 153);

    /**
     * CSS color "red" (#FF0000)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF0000;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "red")
    public static final Color red = new Color(255, 0, 0);

    /**
     * CSS color "rosybrown" (#BC8F8F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#BC8F8F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "rosybrown")
    public static final Color rosybrown = new Color(188, 143, 143);

    /**
     * CSS color "royalblue" (#4169E1)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#4169E1;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "royalblue")
    public static final Color royalblue = new Color(65, 105, 225);

    /**
     * CSS color "saddlebrown" (#8B4513)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#8B4513;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "saddlebrown")
    public static final Color saddlebrown = new Color(139, 69, 19);

    /**
     * CSS color "salmon" (#FA8072)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FA8072;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "salmon")
    public static final Color salmon = new Color(250, 128, 114);

    /**
     * CSS color "sandybrown" (#F4A460)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F4A460;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "sandybrown")
    public static final Color sandybrown = new Color(244, 164, 96);

    /**
     * CSS color "seagreen" (#2E8B57)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#2E8B57;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "seagreen")
    public static final Color seagreen = new Color(46, 139, 87);

    /**
     * CSS color "seashell" (#FFF5EE)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFF5EE;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "seashell")
    public static final Color seashell = new Color(255, 245, 238);

    /**
     * CSS color "sienna" (#A0522D)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#A0522D;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "sienna")
    public static final Color sienna = new Color(160, 82, 45);

    /**
     * CSS color "silver" (#C0C0C0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#C0C0C0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "silver")
    public static final Color silver = new Color(192, 192, 192);

    /**
     * CSS color "skyblue" (#87CEEB)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#87CEEB;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "skyblue")
    public static final Color skyblue = new Color(135, 206, 235);

    /**
     * CSS color "slateblue" (#6A5ACD)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#6A5ACD;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "slateblue")
    public static final Color slateblue = new Color(106, 90, 205);

    /**
     * CSS color "slategray" (#708090)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#708090;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "slategray")
    public static final Color slategray = new Color(112, 128, 144);

    /**
     * CSS color "slategrey" (#708090)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#708090;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "slategrey")
    public static final Color slategrey = new Color(112, 128, 144);

    /**
     * CSS color "snow" (#FFFAFA)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFAFA;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "snow")
    public static final Color snow = new Color(255, 250, 250);

    /**
     * CSS color "springgreen" (#00FF7F)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#00FF7F;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "springgreen")
    public static final Color springgreen = new Color(0, 255, 127);

    /**
     * CSS color "steelblue" (#4682B4)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#4682B4;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "steelblue")
    public static final Color steelblue = new Color(70, 130, 180);

    /**
     * CSS color "tan" (#D2B48C)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#D2B48C;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "tan")
    public static final Color tan = new Color(210, 180, 140);

    /**
     * CSS color "teal" (#008080)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#008080;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "teal")
    public static final Color teal = new Color(0, 128, 128);

    /**
     * CSS color "thistle" (#D8BFD8)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#D8BFD8;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "thistle")
    public static final Color thistle = new Color(216, 191, 216);

    /**
     * CSS color "tomato" (#FF6347)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FF6347;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "tomato")
    public static final Color tomato = new Color(255, 99, 71);

    /**
     * CSS color "turquoise" (#40E0D0)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#40E0D0;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "turquoise")
    public static final Color turquoise = new Color(64, 224, 208);

    /**
     * CSS color "violet" (#EE82EE)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#EE82EE;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "violet")
    public static final Color violet = new Color(238, 130, 238);

    /**
     * CSS color "wheat" (#F5DEB3)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F5DEB3;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "wheat")
    public static final Color wheat = new Color(245, 222, 179);

    /**
     * CSS color "white" (#FFFFFF)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFFFF;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "white")
    public static final Color white = new Color(255, 255, 255);

    /**
     * CSS color "whitesmoke" (#F5F5F5)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#F5F5F5;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "whitesmoke")
    public static final Color whitesmoke = new Color(245, 245, 245);

    /**
     * CSS color "yellow" (#FFFF00)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#FFFF00;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "yellow")
    public static final Color yellow = new Color(255, 255, 0);

    /**
     * CSS color "yellowgreen" (#9ACD32)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#9ACD32;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.CSS, name = "yellowgreen")
    public static final Color yellowgreen = new Color(154, 205, 50);


    /**
     * Tableau color "blue" (#1f77b4)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#1f77b4;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "blue")
    public static final Color tab_blue = new Color(31, 119, 180);

    /**
     * Tableau color "orange" (#ff7f0e)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ff7f0e;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "orange")
    public static final Color tab_orange = new Color(255, 127, 14);

    /**
     * Tableau color "green" (#2ca02c)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#2ca02c;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "green")
    public static final Color tab_green = new Color(44, 160, 44);

    /**
     * Tableau color "red" (#d62728)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#d62728;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "red")
    public static final Color tab_red = new Color(214, 39, 40);

    /**
     * Tableau color "purple" (#9467bd)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#9467bd;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "purple")
    public static final Color tab_purple = new Color(148, 103, 189);

    /**
     * Tableau color "brown" (#8c564b)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#8c564b;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "brown")
    public static final Color tab_brown = new Color(140, 86, 75);

    /**
     * Tableau color "pink" (#e377c2)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#e377c2;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "pink")
    public static final Color tab_pink = new Color(227, 119, 194);

    /**
     * Tableau color "grey" (#7f7f7f)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#7f7f7f;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "grey")
    public static final Color tab_grey = new Color(127, 127, 127);

    /**
     * Tableau color "olive" (#bcbd22)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#bcbd22;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "olive")
    public static final Color tab_olive = new Color(188, 189, 34);

    /**
     * Tableau color "aqua" (#17becf)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#17becf;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "aqua")
    public static final Color tab_aqua = new Color(23, 190, 207);

    /**
     * Tableau color "lightblue" (#aec7e8)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#aec7e8;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightblue")
    public static final Color tab_lightblue = new Color(174, 199, 232);

    /**
     * Tableau color "lightorange" (#ffbb78)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ffbb78;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightorange")
    public static final Color tab_lightorange = new Color(255, 187, 120);

    /**
     * Tableau color "lightgreen" (#98df8a)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#98df8a;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightgreen")
    public static final Color tab_lightgreen = new Color(152, 223, 138);

    /**
     * Tableau color "lightred" (#ff9896)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#ff9896;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightred")
    public static final Color tab_lightred = new Color(255, 152, 150);

    /**
     * Tableau color "lightpurple" (#c5b0d5)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#c5b0d5;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightpurple")
    public static final Color tab_lightpurple = new Color(197, 176, 213);

    /**
     * Tableau color "lightbrown" (#c49c94)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#c49c94;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightbrown")
    public static final Color tab_lightbrown = new Color(196, 156, 148);

    /**
     * Tableau color "lightpink" (#f7b6d2)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#f7b6d2;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightpink")
    public static final Color tab_lightpink = new Color(247, 182, 210);

    /**
     * Tableau color "lightgrey" (#c7c7c7)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#c7c7c7;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightgrey")
    public static final Color tab_lightgrey = new Color(199, 199, 199);

    /**
     * Tableau color "lightolive" (#dbdb8d)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#dbdb8d;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightolive")
    public static final Color tab_lightolive = new Color(219, 219, 141);

    /**
     * Tableau color "lightaqua" (#9edae5)
     * <div style="border:1px solid black;width:40px;height:20px;background-color:#9edae5;float:right;margin: 0 10px 0 0"></div>
     */
    @ReferenceColor(type = ColorType.TABLEAU, name = "lightaqua")
    public static final Color tab_lightaqua = new Color(158, 218, 229);
    //{{END}}//

    private final static Map<String, Color> referenceColors = new HashMap<>();

    static {
        for (final Field field : Colors.class.getDeclaredFields()) {
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

    private static Color get(ColorType type, final String name) {
        return referenceColors.get(String.format("%s:%s", type.prefix(), name.toLowerCase()));
    }

    /**
     * Get a CSS color by name
     *
     * @param name the name of the color
     * @return the CSS color, if exist or {@code null} if not
     */
    public static Color getCSS(String name) {
        return get(ColorType.CSS, name);
    }

    /**
     * Get a Tableau color by name
     *
     * @param name the name of the color
     * @return the Tableau color, if exist or {@code null} if not
     */
    public static Color getTableau(String name) {
        return get(ColorType.TABLEAU, name);
    }

    /**
     * Get an AWT color by name
     *
     * @param name the name of the color
     * @return the AWT color, if exist or {@code null} if not
     */
    public static Color getAWT(String name) {
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
    public static Color get(String name) {
        final Matcher matcher = Pattern.compile("([A-z ]*)[:.]([A-z ]*)").matcher(name);
        if (matcher.matches()) {
            return get(ColorType.from(matcher.group(1).toLowerCase()), matcher.group(2));
        } else {
            for (final ColorType type : ColorType.values()) {
                final Color match = get(type, name);
                if (match != null) {
                    return match;
                }
            }
        }
        return null;
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
     * Convert a color to its Lab representation
     *
     * @param color the color
     * @return a 3-component float array with the color in L*ab space
     */
    public static float[] toLab(Color color) {
        return RGBToLab(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f);
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
     * Return val clamped between min and max
     *
     * @param val Value to clamp
     * @param min Minimum the value can be
     * @param max Maximum the value can be
     * @return Value clamped between min and max
     */
    public static float clamp(final float val, final float min, final float max) {
        return Math.min(Math.max(val, min), max);
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
        final float[] lowerLab = RGBToLab(lower.getRed() / 255f, lower.getGreen() / 255f, lower.getBlue() / 255f);
        final float[] upperLab = RGBToLab(upper.getRed() / 255f, upper.getGreen() / 255f, upper.getBlue() / 255f);

        final float[] rgb = LabToRGB(lerp(upperLab[0], lowerLab[0], amount), lerp(upperLab[1], lowerLab[1], amount), lerp(upperLab[2], lowerLab[2], amount));
        return new Color(clamp(rgb[0], 0f, 1f), clamp(rgb[1], 0f, 1f), clamp(rgb[2], 0f, 1f), lerp(upper.getAlpha() / 255f, lower.getAlpha() / 255f, amount));
    }

    /**
     * Calculate the luminance of a color based on the W3C recommendations
     *
     * @param red   the amount of red (0-1)
     * @param green the amount of green (0-1)
     * @param blue  the amount of blue (0-1)
     * @return the luminance
     */
    public static double calculateLuminance(float red, float green, float blue) {
        final double r = red <= 0.03928 ? (red / 12.92) : Math.pow((red + 0.055) / 1.055, 2.4);
        final double g = green <= 0.03928 ? (green / 12.92) : Math.pow((green + 0.055) / 1.055, 2.4);
        final double b = blue <= 0.03928 ? (blue / 12.92) : Math.pow((blue + 0.055) / 1.055, 2.4);
        return (float) (0.2126 * r + 0.7152 * g + 0.0722 * b);
    }

    /**
     * Create a color from hexadecimal
     *
     * @param hex the hexadecimal value
     * @return a color based on the input string
     */
    public static Color fromHexadecimal(final String hex) {
        final String hexadecimal = Colors.sanitizeRGBA(hex);

        return new Color(
                Integer.valueOf(hexadecimal.substring(1, 3), 16),
                Integer.valueOf(hexadecimal.substring(3, 5), 16),
                Integer.valueOf(hexadecimal.substring(5, 7), 16),
                Integer.valueOf(hexadecimal.substring(7, 9), 16)
        );
    }

    /**
     * Calculate the luminance of a color based on the W3C recommendations
     *
     * @param color the color
     * @return the luminance
     */
    public static double calculateLuminance(Color color) {
        return calculateLuminance(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f);
    }


}
