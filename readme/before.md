[![Build Status](https://travis-ci.com/mahdilamb/colormap.svg?token=fWb9xzvbfoQpG3hUJ2qH&branch=master)](https://travis-ci.com/mahdilamb/colormap)

# Colormap
This is a Java-based package that enables the easy creation of linear and categorical colormaps. 

There are many default colormaps, including many from [Matplotlib](https://matplotlib.org/), [Tableau](https://www.tableau.com/) and other sources (see [credits](#credits)).
For ease, most colormaps can be obtained by using the following command:

```
import net.mahdilamb.colormap.ColorMap;

public Test{
    public static void main(String[] args){
        ColorMap.getColorMap("Viridis");
    }
}
```

The getColorMap method is case insensitive and can also be used to obtain the colormap reversed (e.g. "Viridis.reversed"). The ColorMap.listDefaultColorMaps() will provide a list of all the default colormaps available.
## Color
The Color class is provided as a framework-agnostic way of generating colors. It includes String constants that represent CSS4, AWT and [Tableau](https://www.tableau.com/) colors.

## Default colormaps