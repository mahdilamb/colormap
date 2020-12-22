package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 Set3
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Set2")
public final class Set2 extends QualitativeColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Set2
     */
    public Set2() {
        super(
                new Color(102, 194, 165),
                new Color(252, 141, 98),
                new Color(141, 160, 203),
                new Color(231, 138, 195),
                new Color(166, 216, 84),
                new Color(255, 217, 47),
                new Color(229, 196, 148),
                new Color(179, 179, 179));

    }


}
