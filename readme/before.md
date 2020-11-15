[![Build Status](https://github.com/mahdilamb/colormap/workflows/Java%20CI%20with%20Gradle/badge.svg)](https://github.com/mahdilamb/colormap/actions?query=workflow%3A%22Java+CI+with+Gradle%22)

# Colormap
This is a Java-based package that enables the easy creation of linear and categorical colormaps. 

There are many default colormaps, including many from [Matplotlib](https://matplotlib.org/), [Tableau](https://www.tableau.com/) and other sources (see [credits](#credits)).
For ease, most colormaps can be obtained by using the `ColorMap.getColorMap()`.

The colormaps are autoranging so, in the example below, the color will change depending on the bounds of the color map. The color will originally be the middle color in the color map, but once a lower value is requested, the color will change and an event will be fired. An event is triggered both when a listener is added and when a change is made so that only a single function needs to be defined.
Upper and lower bounds can be set to a color map using the `ColorMap.setLowValue(...)`  and `ColorMap.setHighValue(...)` methods. 

```
import net.mahdilamb.colormap.ColorMap;


public class Test {
    public static void main(final String[] args) {
        final ColorMap viridis = ColorMap.getColorMap("Viridis");
        viridis.getColorFromValue(0).getColor().addColorListener(color -> {
            System.out.println(color);
        });

        viridis.getColorFromValue(-1);
    }
}

```

The getColorMap method is case insensitive and can also be used to obtain the colormap reversed (e.g. `Viridis.reversed`). The `ColorMap.listDefaultColorMaps()` will provide a list of all the default colormaps available.

## Color
The Color class is provided as a framework-agnostic way of generating colors. It includes String constants that represent CSS4, AWT and [Tableau](https://www.tableau.com/) colors.

## Default colormaps