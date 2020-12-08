![Java CI with Gradle](https://github.com/mahdilamb/colormap/workflows/Java%20CI%20with%20Gradle/badge.svg)

# Colormap

This is a Java-based package that enables the easy creation of linear and categorical colormaps.

There are many default colormaps, including many from [Matplotlib](https://matplotlib.org/)
, [Tableau](https://www.tableau.com/) and other sources (see [credits](#credits)). For ease, most colormaps can be
obtained by using the `Colormap.get(...)`. Alternatively, colormaps can be created by using inner classes in colormaps
(e.g. `Colormap.Sequential.Viridis()`). 

The colormaps are autoranging so, in the example below, the color will change depending on the bounds of the color map.
The color will originally be the middle color in the color map, but once a lower value is requested, the color will
change and an event will be fired. An event is triggered both when a listener is added and when a change is made so that
only a single function needs to be defined. Upper and lower bounds can be set to a color map using
the `Colormap.setLowValue(...)`  and `Colormap.setHighValue(...)` methods.

```
import net.mahdilamb.colormap.Colormap;

public class Test {
    public static void main(final String[] args) {
        final Colormap viridis = Colormap.get("Viridis");
        viridis.getColorFromValue(0).getColor().addListener(color -> {
            System.out.println(color);
        });

        viridis.getColorFromValue(-1);
    }
}


```

The getColormap method is case insensitive and can also be used to obtain the colormap reversed (
e.g. `Viridis.reversed`). The `Colormap.listDefaults()` will provide a list of all the default colormaps
available.

## Color

The Color class is provided as a framework-agnostic way of generating colors. It includes String constants that
represent CSS4, AWT and [Tableau](https://www.tableau.com/) colors.

## Default colormaps
|Category|ColorMap|Sample|
|---|---|---|
|Cyclic|Twilight|![Twilight](swatches/CYCLIC.Twilight.png)|
|Cyclic|TwilightShifted|![TwilightShifted](swatches/CYCLIC.TwilightShifted.png)|
|Diverging|BentCoolWarm|![BentCoolWarm](swatches/DIVERGING.BentCoolWarm.png)|
|Diverging|BrBG|![BrBG](swatches/DIVERGING.BrBG.png)|
|Diverging|PRGn|![PRGn](swatches/DIVERGING.PRGn.png)|
|Diverging|PiYG|![PiYG](swatches/DIVERGING.PiYG.png)|
|Diverging|PuOr|![PuOr](swatches/DIVERGING.PuOr.png)|
|Diverging|RdBu|![RdBu](swatches/DIVERGING.RdBu.png)|
|Diverging|RdGy|![RdGy](swatches/DIVERGING.RdGy.png)|
|Diverging|RdYlBu|![RdYlBu](swatches/DIVERGING.RdYlBu.png)|
|Diverging|RdYlGn|![RdYlGn](swatches/DIVERGING.RdYlGn.png)|
|Diverging|SmoothCoolWarm|![SmoothCoolWarm](swatches/DIVERGING.SmoothCoolWarm.png)|
|Diverging|Spectral|![Spectral](swatches/DIVERGING.Spectral.png)|
|Qualitative|Accent|![Accent](swatches/QUALITATIVE.Accent.png)|
|Qualitative|Dark2|![Dark2](swatches/QUALITATIVE.Dark2.png)|
|Qualitative|Paired|![Paired](swatches/QUALITATIVE.Paired.png)|
|Qualitative|Pastel1|![Pastel1](swatches/QUALITATIVE.Pastel1.png)|
|Qualitative|Pastel2|![Pastel2](swatches/QUALITATIVE.Pastel2.png)|
|Qualitative|Set1|![Set1](swatches/QUALITATIVE.Set1.png)|
|Qualitative|Set2|![Set2](swatches/QUALITATIVE.Set2.png)|
|Qualitative|Set3|![Set3](swatches/QUALITATIVE.Set3.png)|
|Qualitative|Tab10|![Tab10](swatches/QUALITATIVE.Tab10.png)|
|Qualitative|Tab20|![Tab20](swatches/QUALITATIVE.Tab20.png)|
|Qualitative|Tab20b|![Tab20b](swatches/QUALITATIVE.Tab20b.png)|
|Qualitative|Tab20c|![Tab20c](swatches/QUALITATIVE.Tab20c.png)|
|Sequential|BlackBody|![BlackBody](swatches/SEQUENTIAL.BlackBody.png)|
|Sequential|Blues|![Blues](swatches/SEQUENTIAL.Blues.png)|
|Sequential|BuGn|![BuGn](swatches/SEQUENTIAL.BuGn.png)|
|Sequential|BuPu|![BuPu](swatches/SEQUENTIAL.BuPu.png)|
|Sequential|Cividis|![Cividis](swatches/SEQUENTIAL.Cividis.png)|
|Sequential|GnBu|![GnBu](swatches/SEQUENTIAL.GnBu.png)|
|Sequential|Greens|![Greens](swatches/SEQUENTIAL.Greens.png)|
|Sequential|Greys|![Greys](swatches/SEQUENTIAL.Greys.png)|
|Sequential|Hesperia|![Hesperia](swatches/SEQUENTIAL.Hesperia.png)|
|Sequential|Inferno|![Inferno](swatches/SEQUENTIAL.Inferno.png)|
|Sequential|Kindlmann|![Kindlmann](swatches/SEQUENTIAL.Kindlmann.png)|
|Sequential|KindlmannExtended|![KindlmannExtended](swatches/SEQUENTIAL.KindlmannExtended.png)|
|Sequential|Lacerta|![Lacerta](swatches/SEQUENTIAL.Lacerta.png)|
|Sequential|Laguna|![Laguna](swatches/SEQUENTIAL.Laguna.png)|
|Sequential|Magma|![Magma](swatches/SEQUENTIAL.Magma.png)|
|Sequential|ModifiedPlasma|![ModifiedPlasma](swatches/SEQUENTIAL.ModifiedPlasma.png)|
|Sequential|OrRd|![OrRd](swatches/SEQUENTIAL.OrRd.png)|
|Sequential|Oranges|![Oranges](swatches/SEQUENTIAL.Oranges.png)|
|Sequential|Plasma|![Plasma](swatches/SEQUENTIAL.Plasma.png)|
|Sequential|PuBu|![PuBu](swatches/SEQUENTIAL.PuBu.png)|
|Sequential|PuBuGn|![PuBuGn](swatches/SEQUENTIAL.PuBuGn.png)|
|Sequential|PuRd|![PuRd](swatches/SEQUENTIAL.PuRd.png)|
|Sequential|Purples|![Purples](swatches/SEQUENTIAL.Purples.png)|
|Sequential|RdPu|![RdPu](swatches/SEQUENTIAL.RdPu.png)|
|Sequential|Reds|![Reds](swatches/SEQUENTIAL.Reds.png)|
|Sequential|Turbo|![Turbo](swatches/SEQUENTIAL.Turbo.png)|
|Sequential|Viridis|![Viridis](swatches/SEQUENTIAL.Viridis.png)|
|Sequential|YlGn|![YlGn](swatches/SEQUENTIAL.YlGn.png)|
|Sequential|YlGnBu|![YlGnBu](swatches/SEQUENTIAL.YlGnBu.png)|
|Sequential|YlOrBr|![YlOrBr](swatches/SEQUENTIAL.YlOrBr.png)|
|Sequential|YlOrRd|![YlOrRd](swatches/SEQUENTIAL.YlOrRd.png)|

## Credits
* Default colormaps include all [ColorBrewer 2.0](https://colorbrewer2.org/) color maps;
* Smooth Cool Warm, Bent Cool Warm, Black Body, Kindlmann, Extended Kindlmann (https://www.kennethmoreland.com/color-advice/)
* [Tableau](https://www.tableau.com/) colour maps
* Colormaps from [Peter Karpov](http://inversed.ru/Blog_2.htm).
* Turbo from https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html
* ["Why We Use Bad Color Maps and What You Can Do About It."](https://doi.org/10.2352/ISSN.2470-1173.2016.16.HVEI-133) Kenneth Moreland. 
