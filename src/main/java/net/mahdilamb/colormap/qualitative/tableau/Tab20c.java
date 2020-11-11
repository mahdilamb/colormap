package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab20c")
public final class Tab20c extends CategoricalColorMap {
    public Tab20c(){super(
                new Color("#3182BD"),
                new Color("#6BAED6"),
                new Color("#9ECAE1"),
                new Color("#C6DBEF"),
                new Color("#E6550D"),
                new Color("#FD8D3C"),
                new Color("#FDAE6B"),
                new Color("#FDD0A2"),
                new Color("#31A354"),
                new Color("#74C476"),
                new Color("#A1D99B"),
                new Color("#C7E9C0"),
                new Color("#756BB1"),
                new Color("#9E9AC8"),
                new Color("#BCBDDC"),
                new Color("#DADAEB"),
                new Color("#636363"),
                new Color("#969696"),
                new Color("#BDBDBD"),
                new Color("#D9D9D9"));
    }


}
