package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Colors;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tableau colormap Tab20c
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab20c", source = "Tableau")
public final class Tab20c extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab20c
     */
    public Tab20c() {
        super(
                Colors.fromHexadecimal("#3182BD"),
                Colors.fromHexadecimal("#6BAED6"),
                Colors.fromHexadecimal("#9ECAE1"),
                Colors.fromHexadecimal("#C6DBEF"),
                Colors.fromHexadecimal("#E6550D"),
                Colors.fromHexadecimal("#FD8D3C"),
                Colors.fromHexadecimal("#FDAE6B"),
                Colors.fromHexadecimal("#FDD0A2"),
                Colors.fromHexadecimal("#31A354"),
                Colors.fromHexadecimal("#74C476"),
                Colors.fromHexadecimal("#A1D99B"),
                Colors.fromHexadecimal("#C7E9C0"),
                Colors.fromHexadecimal("#756BB1"),
                Colors.fromHexadecimal("#9E9AC8"),
                Colors.fromHexadecimal("#BCBDDC"),
                Colors.fromHexadecimal("#DADAEB"),
                Colors.fromHexadecimal("#636363"),
                Colors.fromHexadecimal("#969696"),
                Colors.fromHexadecimal("#BDBDBD"),
                Colors.fromHexadecimal("#D9D9D9"));
    }


}
