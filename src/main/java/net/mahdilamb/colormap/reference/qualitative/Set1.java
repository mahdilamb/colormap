package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 Set1
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Set1")
public final class Set1 extends QualitativeColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Set1
     */
    public Set1() {
        super(new Color(228, 26, 28),
                new Color(55, 126, 184),
                new Color(77, 175, 74),
                new Color(152, 78, 163),
                new Color(255, 127, 0),
                new Color(255, 255, 51),
                new Color(166, 86, 40),
                new Color(247, 129, 191),
                new Color(153, 153, 153));


    }

}
