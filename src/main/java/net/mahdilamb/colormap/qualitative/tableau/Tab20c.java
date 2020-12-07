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
                Color.from("#3182BD"),
                Color.from("#6BAED6"),
                Color.from("#9ECAE1"),
                Color.from("#C6DBEF"),
                Color.from("#E6550D"),
                Color.from("#FD8D3C"),
                Color.from("#FDAE6B"),
                Color.from("#FDD0A2"),
                Color.from("#31A354"),
                Color.from("#74C476"),
                Color.from("#A1D99B"),
                Color.from("#C7E9C0"),
                Color.from("#756BB1"),
                Color.from("#9E9AC8"),
                Color.from("#BCBDDC"),
                Color.from("#DADAEB"),
                Color.from("#636363"),
                Color.from("#969696"),
                Color.from("#BDBDBD"),
                Color.from("#D9D9D9"));
    }


}
