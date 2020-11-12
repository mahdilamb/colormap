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
|Sequential|ExtendedKindlmann|![ExtendedKindlmann](swatches/SEQUENTIAL.ExtendedKindlmann.png)|
|Sequential|GnBu|![GnBu](swatches/SEQUENTIAL.GnBu.png)|
|Sequential|Greens|![Greens](swatches/SEQUENTIAL.Greens.png)|
|Sequential|Greys|![Greys](swatches/SEQUENTIAL.Greys.png)|
|Sequential|Hesperia|![Hesperia](swatches/SEQUENTIAL.Hesperia.png)|
|Sequential|Inferno|![Inferno](swatches/SEQUENTIAL.Inferno.png)|
|Sequential|Kindlmann|![Kindlmann](swatches/SEQUENTIAL.Kindlmann.png)|
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

## Color
The Color class extends java.awt.Color and adds convenience functions to use css and Tableau colors.

## Credits
* This product includes color specifications and designs developed by Cynthia Brewer (http://colorbrewer.org/).
* "Why We Use Bad Color Maps and What You Can Do About It." Kenneth Moreland. In Proceedings of Human Vision and Electronic Imaging (HVEI), February 2016. DOI 10.2352/ISSN.2470-1173.2016.16.HVEI-133.
