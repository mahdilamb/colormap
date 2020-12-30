package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * G10 qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "G10")
public final class G10 extends QualitativeColormap {

    /**
     * Create a colormap based on G10 colormap
     */
    public G10() {
        super(
                new Color(51, 102, 204),
                new Color(220, 57, 18),
                new Color(255, 153, 0),
                new Color(16, 150, 24),
                new Color(153, 0, 153),
                new Color(0, 153, 198),
                new Color(221, 68, 119),
                new Color(102, 170, 0),
                new Color(184, 46, 46),
                new Color(49, 99, 149)
        );

    }


}
