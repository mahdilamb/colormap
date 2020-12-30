package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * T10 qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "T10")
public final class T10 extends QualitativeColormap {
    /**
     * Create a colormap based on T10 colormap
     */
    public T10() {
        super(
                new Color(76, 120, 168),
                new Color(245, 133, 24),
                new Color(228, 87, 86),
                new Color(114, 183, 178),
                new Color(84, 162, 75),
                new Color(238, 202, 59),
                new Color(178, 121, 162),
                new Color(255, 157, 166),
                new Color(157, 117, 93),
                new Color(186, 176, 172)
        );

    }


}
