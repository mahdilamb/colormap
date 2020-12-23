package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tableau colormap Tab20c
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab20c")
public final class Tab20c extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab20c
     */
    public Tab20c() {
        super(
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
