package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Prism qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Prism",source = "CARTO")
public final class Prism extends QualitativeColormap {

    /**
     * Create a colormap based on Prism colormap
     */
    public Prism() {
        super(
                new Color(95, 70, 144),
                new Color(29, 105, 150),
                new Color(56, 166, 165),
                new Color(15, 133, 84),
                new Color(115, 175, 72),
                new Color(237, 173, 8),
                new Color(225, 124, 5),
                new Color(204, 80, 62),
                new Color(148, 52, 110),
                new Color(111, 64, 112),
                new Color(153, 78, 149),
                new Color(102, 102, 102)

        );

    }


}
