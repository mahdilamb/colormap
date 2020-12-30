package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Pastel qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Pastel")
public final class Pastel extends QualitativeColormap {

    /**
     * Create a colormap based on Pastel colormap
     */
    public Pastel() {
        super(

                new Color(102,197,204),
                new Color(246,207,113),
                new Color(248,156,116),
                new Color(220,176,242),
                new Color(135,197,95),
                new Color(158,185,243),
                new Color(254,136,177),
                new Color(201,219,116),
                new Color(139,224,164),
                new Color(180,151,231),
                new Color(179,179,179)
        );

    }


}
