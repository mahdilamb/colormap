package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 Dark2
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Dark2", source = "ColorBrewer")
public final class Dark2 extends QualitativeColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 Dark2
     */
    public Dark2() {
        super(new Color(27, 158, 119),
                new Color(217, 95, 2),
                new Color(117, 112, 179),
                new Color(231, 41, 138),
                new Color(102, 166, 30),
                new Color(230, 171, 2),
                new Color(166, 118, 29),
                new Color(102, 102, 102));

    }

}
