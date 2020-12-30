package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 Accent
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Accent", source = "ColorBrewer")
public final class Accent extends QualitativeColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 Accent
     */
    public Accent() {
        super(
                new Color(127, 201, 127),
                new Color(190, 174, 212),
                new Color(253, 192, 134),
                new Color(255, 255, 153),
                new Color(56, 108, 176),
                new Color(240, 2, 127),
                new Color(191, 91, 23),
                new Color(102, 102, 102));

    }


}
