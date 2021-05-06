package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Colors;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tableau Tab20c
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab20",source = "Tableau")
public final class Tab20 extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab20
     */
    public Tab20() {
        super(
                Colors.getTableau("blue"),
                Colors.getTableau("lightblue"),
                Colors.getTableau("orange"),
                Colors.getTableau("lightorange"),
                Colors.getTableau("green"),
                Colors.getTableau("lightgreen"),
                Colors.getTableau("red"),
                Colors.getTableau("lightred"),
                Colors.getTableau("purple"),
                Colors.getTableau("lightpurple"),
                Colors.getTableau("brown"),
                Colors.getTableau("lightbrown"),
                Colors.getTableau("pink"),
                Colors.getTableau("lightpink"),
                Colors.getTableau("grey"),
                Colors.getTableau("lightgrey"),
                Colors.getTableau("olive"),
                Colors.getTableau("lightolive"),
                Colors.getTableau("aqua"),
                Colors.getTableau("lightaqua"));
    }


}
