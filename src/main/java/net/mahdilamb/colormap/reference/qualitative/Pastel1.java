package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.api.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 Pastel1
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Pastel1")
public final class Pastel1 extends QualitativeColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Pastel1
     */
    public Pastel1() {
        super(new Color(251, 180, 174),
                new Color(179, 205, 227),
                new Color(204, 235, 197),
                new Color(222, 203, 228),
                new Color(254, 217, 166),
                new Color(255, 255, 204),
                new Color(229, 216, 189),
                new Color(253, 218, 236),
                new Color(242, 242, 242));


    }


}
