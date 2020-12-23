package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tableau Tab20c
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab20")
public final class Tab20 extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab20
     */
    public Tab20() {
        super(
                Color.getTableau("blue"),
                Color.getTableau("lightblue"),
                Color.getTableau("orange"),
                Color.getTableau("lightorange"),
                Color.getTableau("green"),
                Color.getTableau("lightgreen"),
                Color.getTableau("red"),
                Color.getTableau("lightred"),
                Color.getTableau("purple"),
                Color.getTableau("lightpurple"),
                Color.getTableau("brown"),
                Color.getTableau("lightbrown"),
                Color.getTableau("pink"),
                Color.getTableau("lightpink"),
                Color.getTableau("grey"),
                Color.getTableau("lightgrey"),
                Color.getTableau("olive"),
                Color.getTableau("lightolive"),
                Color.getTableau("aqua"),
                Color.getTableau("lightaqua"));
    }


}
