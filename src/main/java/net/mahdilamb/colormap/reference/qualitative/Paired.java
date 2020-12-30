package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 Paired
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Paired",source = "ColorBrewer")
public final class Paired extends QualitativeColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Paired
     */
    public Paired() {
        super(
                new Color(166, 206, 227),
                new Color(31, 120, 180),
                new Color(178, 223, 138),
                new Color(51, 160, 44),
                new Color(251, 154, 153),
                new Color(227, 26, 28),
                new Color(253, 191, 111),
                new Color(255, 127, 0),
                new Color(202, 178, 214),
                new Color(106, 61, 154),
                new Color(255, 255, 153),
                new Color(177, 89, 40));


    }

}
