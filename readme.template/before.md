[![Build Status](https://travis-ci.com/mahdilamb/colormap.svg?token=fWb9xzvbfoQpG3hUJ2qH&branch=master)](https://travis-ci.com/mahdilamb/colormap)

## Color
The Color class extends java.awt.Color and adds convenience functions to use css and Tableau colors.

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