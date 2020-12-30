package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Antique qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Antique",source = "CARTO")
public final class Antique extends QualitativeColormap {

    /**
     * Create a colormap based on Antique colormap
     */
    public Antique() {
        super(
                new Color(133, 92, 117),
                new Color(217, 175, 107),
                new Color(175, 100, 88),
                new Color(115, 111, 76),
                new Color(82, 106, 131),
                new Color(98, 83, 119),
                new Color(104, 133, 92),
                new Color(156, 156, 94),
                new Color(160, 97, 119),
                new Color(140, 120, 93),
                new Color(70, 115, 120),
                new Color(124, 124, 124)

        );

    }


}
