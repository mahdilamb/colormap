package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Colors;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Tableau Tab10
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab10",source = "Tableau")
public final class Tab10 extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab10
     */
    public Tab10() {
        super(
                Colors.getTableau("blue"),
                Colors.getTableau("orange"),
                Colors.getTableau("green"),
                Colors.getTableau("red"),
                Colors.getTableau("purple"),
                Colors.getTableau("brown"),
                Colors.getTableau("pink"),
                Colors.getTableau("grey"),
                Colors.getTableau("olive"),
                Colors.getTableau("aqua"));
    }


}
