# ColorMap
A Java-based colormap/heatmap that linearly interpolates in L*ab space.

Linear and categorical colormaps can be easily created either by adding a list of colors, or by providing a list of colors with associated relative positions in the colormap.

Includes a number of default colormaps. When the bounds of the colormap nodes change, a colorChangeEvent is fired so that colored elements will also updated.

* Default colormaps include all ColorBrewer 2.0 color maps (https://colorbrewer2.org/#type=sequential&scheme=BuGn&n=3);
* Smooth Cool Warm, Bent Cool Warm, Black Body, Kindlmann, Extended Kindlmann (https://www.kennethmoreland.com/color-advice/)
* Tableau colour sets
* Colormaps from http://inversed.ru/Blog_2.htm
* Turbo from https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html

## Default colormaps
|Category|ColorMap|Sample|
|---|---|---|
|Diverging|BentCoolWarm|![BentCoolWarm](swatches%5CDIVERGING.BentCoolWarm.png)|
|Diverging|BrBG|![BrBG](swatches%5CDIVERGING.BrBG.png)|
|Diverging|PRGn|![PRGn](swatches%5CDIVERGING.PRGn.png)|
|Diverging|PiYG|![PiYG](swatches%5CDIVERGING.PiYG.png)|
|Diverging|PuOr|![PuOr](swatches%5CDIVERGING.PuOr.png)|
|Diverging|RdBu|![RdBu](swatches%5CDIVERGING.RdBu.png)|
|Diverging|RdGy|![RdGy](swatches%5CDIVERGING.RdGy.png)|
|Diverging|RdYlBu|![RdYlBu](swatches%5CDIVERGING.RdYlBu.png)|
|Diverging|RdYlGn|![RdYlGn](swatches%5CDIVERGING.RdYlGn.png)|
|Diverging|SmoothCoolWarm|![SmoothCoolWarm](swatches%5CDIVERGING.SmoothCoolWarm.png)|
|Diverging|Spectral|![Spectral](swatches%5CDIVERGING.Spectral.png)|
|Qualitative|Accent|![Accent](swatches%5CQUALITATIVE.Accent.png)|
|Qualitative|Dark2|![Dark2](swatches%5CQUALITATIVE.Dark2.png)|
|Qualitative|Paired|![Paired](swatches%5CQUALITATIVE.Paired.png)|
|Qualitative|Pastel1|![Pastel1](swatches%5CQUALITATIVE.Pastel1.png)|
|Qualitative|Pastel2|![Pastel2](swatches%5CQUALITATIVE.Pastel2.png)|
|Qualitative|Set1|![Set1](swatches%5CQUALITATIVE.Set1.png)|
|Qualitative|Set2|![Set2](swatches%5CQUALITATIVE.Set2.png)|
|Qualitative|Set3|![Set3](swatches%5CQUALITATIVE.Set3.png)|
|Qualitative|Tab10|![Tab10](swatches%5CQUALITATIVE.Tab10.png)|
|Qualitative|Tab20|![Tab20](swatches%5CQUALITATIVE.Tab20.png)|
|Qualitative|Tab20b|![Tab20b](swatches%5CQUALITATIVE.Tab20b.png)|
|Qualitative|Tab20c|![Tab20c](swatches%5CQUALITATIVE.Tab20c.png)|
|Sequential|BlackBody|![BlackBody](swatches%5CSEQUENTIAL.BlackBody.png)|
|Sequential|Blues|![Blues](swatches%5CSEQUENTIAL.Blues.png)|
|Sequential|BuGn|![BuGn](swatches%5CSEQUENTIAL.BuGn.png)|
|Sequential|BuPu|![BuPu](swatches%5CSEQUENTIAL.BuPu.png)|
|Sequential|Cividis|![Cividis](swatches%5CSEQUENTIAL.Cividis.png)|
|Sequential|ExtendedKindlmann|![ExtendedKindlmann](swatches%5CSEQUENTIAL.ExtendedKindlmann.png)|
|Sequential|GnBu|![GnBu](swatches%5CSEQUENTIAL.GnBu.png)|
|Sequential|Greens|![Greens](swatches%5CSEQUENTIAL.Greens.png)|
|Sequential|Greys|![Greys](swatches%5CSEQUENTIAL.Greys.png)|
|Sequential|Hesperia|![Hesperia](swatches%5CSEQUENTIAL.Hesperia.png)|
|Sequential|Inferno|![Inferno](swatches%5CSEQUENTIAL.Inferno.png)|
|Sequential|Kindlmann|![Kindlmann](swatches%5CSEQUENTIAL.Kindlmann.png)|
|Sequential|Lacerta|![Lacerta](swatches%5CSEQUENTIAL.Lacerta.png)|
|Sequential|Laguna|![Laguna](swatches%5CSEQUENTIAL.Laguna.png)|
|Sequential|Magma|![Magma](swatches%5CSEQUENTIAL.Magma.png)|
|Sequential|ModifiedPlasma|![ModifiedPlasma](swatches%5CSEQUENTIAL.ModifiedPlasma.png)|
|Sequential|OrRd|![OrRd](swatches%5CSEQUENTIAL.OrRd.png)|
|Sequential|Oranges|![Oranges](swatches%5CSEQUENTIAL.Oranges.png)|
|Sequential|Plasma|![Plasma](swatches%5CSEQUENTIAL.Plasma.png)|
|Sequential|PuBu|![PuBu](swatches%5CSEQUENTIAL.PuBu.png)|
|Sequential|PuBuGn|![PuBuGn](swatches%5CSEQUENTIAL.PuBuGn.png)|
|Sequential|PuRd|![PuRd](swatches%5CSEQUENTIAL.PuRd.png)|
|Sequential|Purples|![Purples](swatches%5CSEQUENTIAL.Purples.png)|
|Sequential|RdPu|![RdPu](swatches%5CSEQUENTIAL.RdPu.png)|
|Sequential|Reds|![Reds](swatches%5CSEQUENTIAL.Reds.png)|
|Sequential|Turbo|![Turbo](swatches%5CSEQUENTIAL.Turbo.png)|
|Sequential|Viridis|![Viridis](swatches%5CSEQUENTIAL.Viridis.png)|
|Sequential|YlGn|![YlGn](swatches%5CSEQUENTIAL.YlGn.png)|
|Sequential|YlGnBu|![YlGnBu](swatches%5CSEQUENTIAL.YlGnBu.png)|
|Sequential|YlOrBr|![YlOrBr](swatches%5CSEQUENTIAL.YlOrBr.png)|
|Sequential|YlOrRd|![YlOrRd](swatches%5CSEQUENTIAL.YlOrRd.png)|

## Color
The Color class extends java.awt.Color and adds convenience functions to use css and Tableau colors.

## Credits
* This product includes color specifications and designs developed by Cynthia Brewer (http://colorbrewer.org/).
* "Why We Use Bad Color Maps and What You Can Do About It." Kenneth Moreland. In Proceedings of Human Vision and Electronic Imaging (HVEI), February 2016. DOI 10.2352/ISSN.2470-1173.2016.16.HVEI-133.
