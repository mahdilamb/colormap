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

## Default colormaps
|Category|ColorMap|Sample|
|---|---|---|
|Diverging|rdylgn|![rdylgn](swatches/diverging.rdylgn.png)|
|Sequential|greys|![greys](swatches/sequential.greys.png)|
|Qualitative|accent|![accent](swatches/qualitative.accent.png)|
|Diverging|piyg|![piyg](swatches/diverging.piyg.png)|
|Sequential|hesperia|![hesperia](swatches/sequential.hesperia.png)|
|Sequential|greens|![greens](swatches/sequential.greens.png)|
|Sequential|orrd|![orrd](swatches/sequential.orrd.png)|
|Cyclic|twilightshifted|![twilightshifted](swatches/cyclic.twilightshifted.png)|
|Sequential|oranges|![oranges](swatches/sequential.oranges.png)|
|Sequential|magma|![magma](swatches/sequential.magma.png)|
|Sequential|bupu|![bupu](swatches/sequential.bupu.png)|
|Sequential|viridis|![viridis](swatches/sequential.viridis.png)|
|Sequential|plasma|![plasma](swatches/sequential.plasma.png)|
|Sequential|modifiedplasma|![modifiedplasma](swatches/sequential.modifiedplasma.png)|
|Diverging|prgn|![prgn](swatches/diverging.prgn.png)|
|Diverging|brbg|![brbg](swatches/diverging.brbg.png)|
|Sequential|purples|![purples](swatches/sequential.purples.png)|
|Qualitative|tab20b|![tab20b](swatches/qualitative.tab20b.png)|
|Qualitative|tab20c|![tab20c](swatches/qualitative.tab20c.png)|
|Sequential|ylorrd|![ylorrd](swatches/sequential.ylorrd.png)|
|Diverging|rdylbu|![rdylbu](swatches/diverging.rdylbu.png)|
|Cyclic|twilight|![twilight](swatches/cyclic.twilight.png)|
|Sequential|blues|![blues](swatches/sequential.blues.png)|
|Qualitative|paired|![paired](swatches/qualitative.paired.png)|
|Sequential|purd|![purd](swatches/sequential.purd.png)|
|Diverging|smoothcoolwarm|![smoothcoolwarm](swatches/diverging.smoothcoolwarm.png)|
|Sequential|kindlmann|![kindlmann](swatches/sequential.kindlmann.png)|
|Sequential|inferno|![inferno](swatches/sequential.inferno.png)|
|Sequential|reds|![reds](swatches/sequential.reds.png)|
|Sequential|ylorbr|![ylorbr](swatches/sequential.ylorbr.png)|
|Sequential|gnbu|![gnbu](swatches/sequential.gnbu.png)|
|Diverging|rdbu|![rdbu](swatches/diverging.rdbu.png)|
|Sequential|bugn|![bugn](swatches/sequential.bugn.png)|
|Sequential|kindlmannextended|![kindlmannextended](swatches/sequential.kindlmannextended.png)|
|Sequential|ylgnbu|![ylgnbu](swatches/sequential.ylgnbu.png)|
|Diverging|spectral|![spectral](swatches/diverging.spectral.png)|
|Qualitative|set3|![set3](swatches/qualitative.set3.png)|
|Qualitative|set2|![set2](swatches/qualitative.set2.png)|
|Qualitative|pastel2|![pastel2](swatches/qualitative.pastel2.png)|
|Qualitative|set1|![set1](swatches/qualitative.set1.png)|
|Diverging|bentcoolwarm|![bentcoolwarm](swatches/diverging.bentcoolwarm.png)|
|Qualitative|tab10|![tab10](swatches/qualitative.tab10.png)|
|Sequential|pubu|![pubu](swatches/sequential.pubu.png)|
|Qualitative|pastel1|![pastel1](swatches/qualitative.pastel1.png)|
|Sequential|pubugn|![pubugn](swatches/sequential.pubugn.png)|
|Diverging|rdgy|![rdgy](swatches/diverging.rdgy.png)|
|Diverging|puor|![puor](swatches/diverging.puor.png)|
|Sequential|lacerta|![lacerta](swatches/sequential.lacerta.png)|
|Sequential|laguna|![laguna](swatches/sequential.laguna.png)|
|Sequential|cividis|![cividis](swatches/sequential.cividis.png)|
|Sequential|turbo|![turbo](swatches/sequential.turbo.png)|
|Qualitative|tab20|![tab20](swatches/qualitative.tab20.png)|
|Qualitative|dark2|![dark2](swatches/qualitative.dark2.png)|
|Sequential|blackbody|![blackbody](swatches/sequential.blackbody.png)|
|Sequential|rdpu|![rdpu](swatches/sequential.rdpu.png)|
|Sequential|ylgn|![ylgn](swatches/sequential.ylgn.png)|

## Credits
* Default colormaps include all [ColorBrewer 2.0](https://colorbrewer2.org/) color maps;
* Smooth Cool Warm, Bent Cool Warm, Black Body, Kindlmann, Extended Kindlmann (https://www.kennethmoreland.com/color-advice/)
* [Tableau](https://www.tableau.com/) colour maps
* Colormaps from [Peter Karpov](http://inversed.ru/Blog_2.htm).
* Turbo from https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html
* ["Why We Use Bad Color Maps and What You Can Do About It."](https://doi.org/10.2352/ISSN.2470-1173.2016.16.HVEI-133) Kenneth Moreland. 
