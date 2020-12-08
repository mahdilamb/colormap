package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Tableau colormap Tab20c
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Tab20c")
public final class Tab20c extends CategoricalColormap {
    /**
     * Create a colormap based on Tableau Tab20c
     */
    public Tab20c() {
        super(
                Color.create("#3182BD"),
                Color.create("#6BAED6"),
                Color.create("#9ECAE1"),
                Color.create("#C6DBEF"),
                Color.create("#E6550D"),
                Color.create("#FD8D3C"),
                Color.create("#FDAE6B"),
                Color.create("#FDD0A2"),
                Color.create("#31A354"),
                Color.create("#74C476"),
                Color.create("#A1D99B"),
                Color.create("#C7E9C0"),
                Color.create("#756BB1"),
                Color.create("#9E9AC8"),
                Color.create("#BCBDDC"),
                Color.create("#DADAEB"),
                Color.create("#636363"),
                Color.create("#969696"),
                Color.create("#BDBDBD"),
                Color.create("#D9D9D9"));
    }


}
