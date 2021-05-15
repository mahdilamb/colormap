![Java (JDK11)](https://github.com/mahdilamb/colormap/workflows/Java%20(JDK11)%20CI%20with%20Gradle/badge.svg)
![Java (JDK8)](https://github.com/mahdilamb/colormap/workflows/Java%20(JDK8)%20CI%20with%20Gradle/badge.svg)

# Colormap

Colormap is a Java package for creating and using colormaps. It includes many "reference" colormaps, including those from [Matplotlib](https://matplotlib.org/)
, [Tableau](https://www.tableau.com/) and other sources (see [credits](#credits)). 

## Overview

- The main access to the colormaps is through ```net.mahdilamb.colormap.Colormaps```. This includes a lot of wrapper classes and the ability to list the reference colormaps ```Colormaps.named()```. 
- The wrapper classes include a reversed colormap (```Colormaps.reversedColormap()```), as well as a "fluid" colormap ```Colormaps.fluidColormap()```. A fluid colormap is not, unlike the reference colormaps, limited to the range 0-1. Instead, a fluid colormap can autoscale, or be clamped between a min and max value (see ```net.mahdilamb.colormap.FluidColormap``` for more information). Fluid colormaps can also have the backing colormap changed. 

## Using reference colormaps

Reference colormaps can either be accessed through ```Colormaps.get(String)```, which can take a String such as ```"sequential.viridis"```, ```"viridis"``` or ```"sequential.viridis.reversed"```. Alternatively, they can be accessed using a class path embedded in the Colormaps class e.g. ```Colormaps.Sequential.Viridis()``` (and then, for exampled made fluid ```Colormaps.fluidColormap(Colormaps.Sequential.Viridis())```). 

## Creating colormaps

Colormaps can be created in two ways either using a builder ```Colormaps.buildSequential()``` and ```Colormaps.buildQualitative()```, or by extending ```net.mahdilamb.colormap.SequentialColormap``` and ```net.mahdilamb.colormap.QualitativeColormap```. Reference colormaps are created by the latter approach. 

## Fluid colormaps example

As the fluid colormaps are autoranging, they fire an even when the color is changed. The below example shows how this might be done using a lambda expression. The original value is ```0```, but this changes when a new color is requested from the colormap, and the range is changed, and a new event is triggered.

```java
import net.mahdilamb.colormap.Colormaps;
import net.mahdilamb.colormap.FluidColormap;

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

The colormap package includes a Colors utility class ```net.mahdilamb.colormap.Colors```. It holds constants for the colors specified in CSS4, AWT and [Tableau](https://www.tableau.com/). 

##### Developer note

It is possible to also include the xkcd colors. The addition of the colors is done automatically from text files in ```src\test\java\net\mahdilamb\colormap\reflect\InsertColors.java```. Uncomment the line referring to the xkcd file parsing and add an extra method in the Color class.

```java
public static Color getXKCD(String name) {
    return get(ColorType.XKCD, name);
}
```

## Maven

The package can be imported from [maven](https://search.maven.org/artifact/net.mahdilamb/colormap).

## Reference colormaps
|Category|ColorMap|Sample|Source|
|---|---|---|---|
|Cyclic|Edge|![edge](swatches/cyclic.edge.png)|[Paraview](https://www.paraview.org/)|
|Cyclic|HSV|![hsv](swatches/cyclic.hsv.png)||
|Cyclic|IceFire|![icefire](swatches/cyclic.icefire.png)|[Paraview](https://www.paraview.org/)|
|Cyclic|MRYBM|![mrybm](swatches/cyclic.mrybm.png)|[CET](https://colorcet.com/)|
|Cyclic|MYGBM|![mygbm](swatches/cyclic.mygbm.png)|[CET](https://colorcet.com/)|
|Cyclic|Phase|![phase](swatches/cyclic.phase.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Cyclic|Twilight|![twilight](swatches/cyclic.twilight.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Cyclic|TwilightShifted|![twilightshifted](swatches/cyclic.twilightshifted.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Diverging|ArmyRose|![armyrose](swatches/diverging.armyrose.png)|[CARTO](https://carto.com/carto-colors/)|
|Diverging|Balance|![balance](swatches/diverging.balance.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Diverging|BentCoolWarm|![bentcoolwarm](swatches/diverging.bentcoolwarm.png)|[Kenneth Moreland](https://www.kennethmoreland.com/color-advice/)|
|Diverging|BrBG|![brbg](swatches/diverging.brbg.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|Curl|![curl](swatches/diverging.curl.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Diverging|Delta|![delta](swatches/diverging.delta.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Diverging|Diff|![diff](swatches/diverging.diff.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Diverging|Earth|![earth](swatches/diverging.earth.png)|[CARTO](https://carto.com/carto-colors/)|
|Diverging|Fall|![fall](swatches/diverging.fall.png)|[CARTO](https://carto.com/carto-colors/)|
|Diverging|Geyser|![geyser](swatches/diverging.geyser.png)|[CARTO](https://carto.com/carto-colors/)|
|Diverging|Oxy|![oxy](swatches/diverging.oxy.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Diverging|Picnic|![picnic](swatches/diverging.picnic.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Diverging|PiYG|![piyg](swatches/diverging.piyg.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|Portland|![portland](swatches/diverging.portland.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Diverging|PRGn|![prgn](swatches/diverging.prgn.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|PuOr|![puor](swatches/diverging.puor.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|RdBu|![rdbu](swatches/diverging.rdbu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|RdGy|![rdgy](swatches/diverging.rdgy.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|RdYlBu|![rdylbu](swatches/diverging.rdylbu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|RdYlGn|![rdylgn](swatches/diverging.rdylgn.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|SmoothCoolWarm|![smoothcoolwarm](swatches/diverging.smoothcoolwarm.png)|[Kenneth Moreland](https://www.kennethmoreland.com/color-advice/)|
|Diverging|Spectral|![spectral](swatches/diverging.spectral.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Diverging|TealRose|![tealrose](swatches/diverging.tealrose.png)|[CARTO](https://carto.com/carto-colors/)|
|Diverging|Temps|![temps](swatches/diverging.temps.png)|[CARTO](https://carto.com/carto-colors/)|
|Diverging|Topo|![topo](swatches/diverging.topo.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Diverging|Tropic|![tropic](swatches/diverging.tropic.png)|[CARTO](https://carto.com/carto-colors/)|
|Qualitative|Accent|![accent](swatches/qualitative.accent.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Alphabet|![alphabet](swatches/qualitative.alphabet.png)|[Polychrome](https://cran.r-project.org/web/packages/Polychrome/index.html)|
|Qualitative|Antique|![antique](swatches/qualitative.antique.png)|[CARTO](https://carto.com/carto-colors/)|
|Qualitative|Bold|![bold](swatches/qualitative.bold.png)|[CARTO](https://carto.com/carto-colors/)|
|Qualitative|D3|![d3](swatches/qualitative.d3.png)|[d3.js](https://github.com/d3/d3-scale-chromatic/blob/master/README.md#schemeCategory10)|
|Qualitative|Dark2|![dark2](swatches/qualitative.dark2.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Dark24|![dark24](swatches/qualitative.dark24.png)|[Polychrome](https://cran.r-project.org/web/packages/Polychrome/index.html)|
|Qualitative|G10|![g10](swatches/qualitative.g10.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Qualitative|Light24|![light24](swatches/qualitative.light24.png)|[Polychrome](https://cran.r-project.org/web/packages/Polychrome/index.html)|
|Qualitative|Paired|![paired](swatches/qualitative.paired.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Pastel|![pastel](swatches/qualitative.pastel.png)|[CARTO](https://carto.com/carto-colors/)|
|Qualitative|Pastel1|![pastel1](swatches/qualitative.pastel1.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Pastel2|![pastel2](swatches/qualitative.pastel2.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Plotly|![plotly](swatches/qualitative.plotly.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Qualitative|Prism|![prism](swatches/qualitative.prism.png)|[CARTO](https://carto.com/carto-colors/)|
|Qualitative|Safe|![safe](swatches/qualitative.safe.png)|[CARTO](https://carto.com/carto-colors/)|
|Qualitative|Set1|![set1](swatches/qualitative.set1.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Set2|![set2](swatches/qualitative.set2.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|Set3|![set3](swatches/qualitative.set3.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Qualitative|T10|![t10](swatches/qualitative.t10.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Qualitative|Tab10|![tab10](swatches/qualitative.tab10.png)|[Tableau](https://www.tableau.com/)|
|Qualitative|Tab20|![tab20](swatches/qualitative.tab20.png)|[Tableau](https://www.tableau.com/)|
|Qualitative|Tab20b|![tab20b](swatches/qualitative.tab20b.png)|[Tableau](https://www.tableau.com/)|
|Qualitative|Tab20c|![tab20c](swatches/qualitative.tab20c.png)|[Tableau](https://www.tableau.com/)|
|Qualitative|Vivid|![vivid](swatches/qualitative.vivid.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|AgGrnYl|![aggrnyl](swatches/sequential.aggrnyl.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Sequential|AgSunset|![agsunset](swatches/sequential.agsunset.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Sequential|Algae|![algae](swatches/sequential.algae.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Amp|![amp](swatches/sequential.amp.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|BlackBody|![blackbody](swatches/sequential.blackbody.png)|[Kenneth Moreland](https://www.kennethmoreland.com/color-advice/)|
|Sequential|BlackbodyAlt|![blackbodyalt](swatches/sequential.blackbodyalt.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Sequential|BlackBodyExtended|![blackbodyextended](swatches/sequential.blackbodyextended.png)|[Kenneth Moreland](https://www.kennethmoreland.com/color-advice/)|
|Sequential|Blues|![blues](swatches/sequential.blues.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|BluGrn|![blugrn](swatches/sequential.blugrn.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|BluYl|![bluyl](swatches/sequential.bluyl.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|BrwnYl|![brwnyl](swatches/sequential.brwnyl.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|BuGn|![bugn](swatches/sequential.bugn.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|BuPu|![bupu](swatches/sequential.bupu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|Burg|![burg](swatches/sequential.burg.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|BurgYl|![burgyl](swatches/sequential.burgyl.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Cividis|![cividis](swatches/sequential.cividis.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Sequential|CubeYF|![cubeyf](swatches/sequential.cubeyf.png)|[MyCarta](https://mycarta.wordpress.com/2013/02/21/perceptual-rainbow-palette-the-method/)|
|Sequential|DarkMint|![darkmint](swatches/sequential.darkmint.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Deep|![deep](swatches/sequential.deep.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Dense|![dense](swatches/sequential.dense.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Electric|![electric](swatches/sequential.electric.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Sequential|Emrld|![emrld](swatches/sequential.emrld.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|GnBu|![gnbu](swatches/sequential.gnbu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|Gray|![gray](swatches/sequential.gray.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Greens|![greens](swatches/sequential.greens.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|Greys|![greys](swatches/sequential.greys.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|Haline|![haline](swatches/sequential.haline.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Hesperia|![hesperia](swatches/sequential.hesperia.png)|[Peter Karpov](http://inversed.ru/Blog_2.htm)|
|Sequential|Hot|![hot](swatches/sequential.hot.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Sequential|Ice|![ice](swatches/sequential.ice.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Inferno|![inferno](swatches/sequential.inferno.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Sequential|Jet|![jet](swatches/sequential.jet.png)||
|Sequential|Kindlmann|![kindlmann](swatches/sequential.kindlmann.png)|[Kindlmann et al.](https://www.kennethmoreland.com/color-advice/)|
|Sequential|KindlmannExtended|![kindlmannextended](swatches/sequential.kindlmannextended.png)|[Kindlmann et al.](https://www.kennethmoreland.com/color-advice/)|
|Sequential|KovesiBGYW|![kovesibgyw](swatches/sequential.kovesibgyw.png)|[CET](https://colorcet.com/)|
|Sequential|KovesiKRYW|![kovesikryw](swatches/sequential.kovesikryw.png)|[CET](https://colorcet.com/)|
|Sequential|Lacerta|![lacerta](swatches/sequential.lacerta.png)|[Peter Karpov](http://inversed.ru/Blog_2.htm)|
|Sequential|Laguna|![laguna](swatches/sequential.laguna.png)|[Peter Karpov](http://inversed.ru/Blog_2.htm)|
|Sequential|Magenta|![magenta](swatches/sequential.magenta.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Magma|![magma](swatches/sequential.magma.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Sequential|Matter|![matter](swatches/sequential.matter.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Mint|![mint](swatches/sequential.mint.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Oranges|![oranges](swatches/sequential.oranges.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|OrRd|![orrd](swatches/sequential.orrd.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|OrYel|![oryel](swatches/sequential.oryel.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Peach|![peach](swatches/sequential.peach.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|PinkYl|![pinkyl](swatches/sequential.pinkyl.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Plasma|![plasma](swatches/sequential.plasma.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Sequential|PlasmaModified|![plasmamodified](swatches/sequential.plasmamodified.png)|[Peter Karpov](http://inversed.ru/Blog_2.htm)|
|Sequential|Plotly3|![plotly3](swatches/sequential.plotly3.png)|[Plotly](https://plotly.com/python/colorscales/)|
|Sequential|PuBu|![pubu](swatches/sequential.pubu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|PuBuGn|![pubugn](swatches/sequential.pubugn.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|PuRd|![purd](swatches/sequential.purd.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|Purp|![purp](swatches/sequential.purp.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Purples|![purples](swatches/sequential.purples.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|PurpOr|![purpor](swatches/sequential.purpor.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Rain|![rain](swatches/sequential.rain.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|RdPu|![rdpu](swatches/sequential.rdpu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|RedOr|![redor](swatches/sequential.redor.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Reds|![reds](swatches/sequential.reds.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|Solar|![solar](swatches/sequential.solar.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Speed|![speed](swatches/sequential.speed.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Sunset|![sunset](swatches/sequential.sunset.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|SunsetDark|![sunsetdark](swatches/sequential.sunsetdark.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Tarn|![tarn](swatches/sequential.tarn.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Teal|![teal](swatches/sequential.teal.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|TealGrn|![tealgrn](swatches/sequential.tealgrn.png)|[CARTO](https://carto.com/carto-colors/)|
|Sequential|Tempo|![tempo](swatches/sequential.tempo.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Thermal|![thermal](swatches/sequential.thermal.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Turbid|![turbid](swatches/sequential.turbid.png)|[CMOcean](https://matplotlib.org/cmocean/)|
|Sequential|Turbo|![turbo](swatches/sequential.turbo.png)|[Google AI](https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html)|
|Sequential|Viridis|![viridis](swatches/sequential.viridis.png)|[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)|
|Sequential|YlGn|![ylgn](swatches/sequential.ylgn.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|YlGnBu|![ylgnbu](swatches/sequential.ylgnbu.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|YlOrBr|![ylorbr](swatches/sequential.ylorbr.png)|[ColorBrewer](https://colorbrewer2.org/)|
|Sequential|YlOrRd|![ylorrd](swatches/sequential.ylorrd.png)|[ColorBrewer](https://colorbrewer2.org/)|
## Colormap credits

* Default colormaps include all [ColorBrewer 2.0](https://colorbrewer2.org/) color maps;
* Smooth Cool Warm, Bent Cool Warm, Black Body, Kindlmann, Extended
  Kindlmann (https://www.kennethmoreland.com/color-advice/)
* [Tableau](https://www.tableau.com/) colour maps
* Colormaps from [Peter Karpov](http://inversed.ru/Blog_2.htm).
* Turbo from https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html
* ["Why We Use Bad Color Maps and What You Can Do About It."](https://doi.org/10.2352/ISSN.2470-1173.2016.16.HVEI-133)
  Kenneth Moreland.
* ["Beautiful colormaps for oceanography](https://matplotlib.org/cmocean/)
