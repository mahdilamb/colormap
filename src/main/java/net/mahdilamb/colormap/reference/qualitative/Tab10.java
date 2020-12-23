package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Tableau Tab10
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab10")
public final class Tab10 extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab10
     */
    public Tab10() {
        super(
                Color.getTableau("blue"),
                Color.getTableau("orange"),
                Color.getTableau("green"),
                Color.getTableau("red"),
                Color.getTableau("purple"),
                Color.getTableau("brown"),
                Color.getTableau("pink"),
                Color.getTableau("grey"),
                Color.getTableau("olive"),
                Color.getTableau("aqua"));
    }


}
