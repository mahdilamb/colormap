![Java CI with Gradle](https://github.com/mahdilamb/colormap/workflows/Java%20CI%20with%20Gradle/badge.svg)

# Colormap

Colormap is a Java package for creating and using colormaps. It includes many "reference" colormaps, including those from [Matplotlib](https://matplotlib.org/)
, [Tableau](https://www.tableau.com/) and other sources (see [credits](#credits)). 

## Overview

- The main access to the colormaps is through ```net.mahdilamb.colormap.Colormaps```. This includes a lot of wrapper classes and the ability to list the reference colormaps ```Colormaps.named()```. 
- The wrapper classes include a reversed colormap (```Colormaps.reversedColormap()```), as well as a "fluid" colormap ```Colormaps.fluidColormap()```. A fluid colormap is not, unlike the reference colormaps, limited to the range 0-1. Instead, a fluid colormap can autoscale, or be clamped between a min and max value (see ```net.mahdilamb.colormap.api.FluidColormap``` for more information). Fluid colormaps can also have the backing colormap changed. 

## Using reference colormaps

Reference colormaps can either be accessed through ```Colormaps.get(String)```, which can take a String such as ```"sequential.viridis"```, ```"viridis"``` or ```"sequential.viridis.reversed"```. Alternatively, they can be accessed using a class path embedded in the Colormaps class e.g. ```Colormaps.Sequential.Viridis()``` (and then, for exampled made fluid ```Colormaps.fluidColormap(Colormaps.Sequential.Viridis())```). 

## Creating colormaps

Colormaps can be created in two ways either using a builder ```Colormaps.buildSequential()``` and ```Colormaps.buildQualitative()```, or by extending ```net.mahdilamb.colormap.SequentialColormap``` and ```net.mahdilamb.colormap.QualitativeColormap```. Reference colormaps are created by the latter approach. 

## Fluid colormaps example

As the fluid colormaps are autoranging, they fire an even when the color is changed. The below example shows how this might be done using a lambda expression. The original value is ```0```, but this changes when a new color is requested from the colormap, and the range is changed, and a new event is triggered.

```java
import net.mahdilamb.colormap.Colormaps;
import net.mahdilamb.colormap.api.FluidColormap;

public class Test {
    public static void main(final String[] args) {
        final FluidColormap viridis = Colormaps.fluidColormap(Colormaps.get("Viridis"));
        viridis.get(0f, color -> {
            System.out.println(color);
        });

        viridis.get(-1);
    }
}

```

## Color

The colormap package includes a Color class ```net.mahdilamb.colormap.Color```. It holds constants for the colors specified in CSS4, AWT and [Tableau](https://www.tableau.com/). 

##### Developer note

It is possible to also include the xkcd colors. The addition of the colors is done automatically from text files in ```src\test\java\net\mahdilamb\colormap\reflect\InsertColors.java```. Uncomment the line referring to the xkcd file parsing and add an extra method in the Color class.

```java
public static RGBA getXKCD(String name) {
    return get(ColorType.XKCD, name);
}
```

## Maven

The package can be imported from [maven](https://search.maven.org/artifact/net.mahdilamb/colormap).

## Reference colormaps
|Category|ColorMap|Sample|
|---|---|---|
|Cyclic|Twilight|![twilight](swatches/cyclic.twilight.png)|
|Cyclic|TwilightShifted|![twilightshifted](swatches/cyclic.twilightshifted.png)|
|Diverging|BentCoolWarm|![bentcoolwarm](swatches/diverging.bentcoolwarm.png)|
|Diverging|BrBG|![brbg](swatches/diverging.brbg.png)|
|Diverging|PiYG|![piyg](swatches/diverging.piyg.png)|
|Diverging|PRGn|![prgn](swatches/diverging.prgn.png)|
|Diverging|PuOr|![puor](swatches/diverging.puor.png)|
|Diverging|RdBu|![rdbu](swatches/diverging.rdbu.png)|
|Diverging|RdGy|![rdgy](swatches/diverging.rdgy.png)|
|Diverging|RdYlBu|![rdylbu](swatches/diverging.rdylbu.png)|
|Diverging|RdYlGn|![rdylgn](swatches/diverging.rdylgn.png)|
|Diverging|SmoothCoolWarm|![smoothcoolwarm](swatches/diverging.smoothcoolwarm.png)|
|Diverging|Spectral|![spectral](swatches/diverging.spectral.png)|
|Qualitative|Accent|![accent](swatches/qualitative.accent.png)|
|Qualitative|Dark2|![dark2](swatches/qualitative.dark2.png)|
|Qualitative|Paired|![paired](swatches/qualitative.paired.png)|
|Qualitative|Pastel1|![pastel1](swatches/qualitative.pastel1.png)|
|Qualitative|Pastel2|![pastel2](swatches/qualitative.pastel2.png)|
|Qualitative|Set1|![set1](swatches/qualitative.set1.png)|
|Qualitative|Set2|![set2](swatches/qualitative.set2.png)|
|Qualitative|Set3|![set3](swatches/qualitative.set3.png)|
|Qualitative|Tab10|![tab10](swatches/qualitative.tab10.png)|
|Qualitative|Tab20|![tab20](swatches/qualitative.tab20.png)|
|Qualitative|Tab20b|![tab20b](swatches/qualitative.tab20b.png)|
|Qualitative|Tab20c|![tab20c](swatches/qualitative.tab20c.png)|
|Sequential|BlackBody|![blackbody](swatches/sequential.blackbody.png)|
|Sequential|Blues|![blues](swatches/sequential.blues.png)|
|Sequential|BuGn|![bugn](swatches/sequential.bugn.png)|
|Sequential|BuPu|![bupu](swatches/sequential.bupu.png)|
|Sequential|Cividis|![cividis](swatches/sequential.cividis.png)|
|Sequential|CubeYF|![cubeyf](swatches/sequential.cubeyf.png)|
|Sequential|GnBu|![gnbu](swatches/sequential.gnbu.png)|
|Sequential|Greens|![greens](swatches/sequential.greens.png)|
|Sequential|Greys|![greys](swatches/sequential.greys.png)|
|Sequential|Hesperia|![hesperia](swatches/sequential.hesperia.png)|
|Sequential|Inferno|![inferno](swatches/sequential.inferno.png)|
|Sequential|Kindlmann|![kindlmann](swatches/sequential.kindlmann.png)|
|Sequential|KindlmannExtended|![kindlmannextended](swatches/sequential.kindlmannextended.png)|
|Sequential|KovesiBGYW|![kovesibgyw](swatches/sequential.kovesibgyw.png)|
|Sequential|KovesiKRYW|![kovesikryw](swatches/sequential.kovesikryw.png)|
|Sequential|Lacerta|![lacerta](swatches/sequential.lacerta.png)|
|Sequential|Laguna|![laguna](swatches/sequential.laguna.png)|
|Sequential|Magma|![magma](swatches/sequential.magma.png)|
|Sequential|ModifiedPlasma|![modifiedplasma](swatches/sequential.modifiedplasma.png)|
|Sequential|Oranges|![oranges](swatches/sequential.oranges.png)|
|Sequential|OrRd|![orrd](swatches/sequential.orrd.png)|
|Sequential|Plasma|![plasma](swatches/sequential.plasma.png)|
|Sequential|PuBu|![pubu](swatches/sequential.pubu.png)|
|Sequential|PuBuGn|![pubugn](swatches/sequential.pubugn.png)|
|Sequential|PuRd|![purd](swatches/sequential.purd.png)|
|Sequential|Purples|![purples](swatches/sequential.purples.png)|
|Sequential|RdPu|![rdpu](swatches/sequential.rdpu.png)|
|Sequential|Reds|![reds](swatches/sequential.reds.png)|
|Sequential|Turbo|![turbo](swatches/sequential.turbo.png)|
|Sequential|Viridis|![viridis](swatches/sequential.viridis.png)|
|Sequential|YlGn|![ylgn](swatches/sequential.ylgn.png)|
|Sequential|YlGnBu|![ylgnbu](swatches/sequential.ylgnbu.png)|
|Sequential|YlOrBr|![ylorbr](swatches/sequential.ylorbr.png)|
|Sequential|YlOrRd|![ylorrd](swatches/sequential.ylorrd.png)|

## Credits
* Default colormaps include all [ColorBrewer 2.0](https://colorbrewer2.org/) color maps;
* Smooth Cool Warm, Bent Cool Warm, Black Body, Kindlmann, Extended Kindlmann (https://www.kennethmoreland.com/color-advice/)
* [Tableau](https://www.tableau.com/) colour maps
* Colormaps from [Peter Karpov](http://inversed.ru/Blog_2.htm).
* Turbo from https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html
* ["Why We Use Bad Color Maps and What You Can Do About It."](https://doi.org/10.2352/ISSN.2470-1173.2016.16.HVEI-133) Kenneth Moreland. 
