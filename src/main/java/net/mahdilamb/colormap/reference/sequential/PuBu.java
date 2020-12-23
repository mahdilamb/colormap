package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Sequential ColorBrewer colormap from Purple to Blue.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "PuBu")
public final class PuBu extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer PuBu.
     */
    public PuBu() {
        super(
                new Color(255, 247, 251),
                new Color(236, 231, 242),
                new Color(208, 209, 230),
                new Color(166, 189, 219),
                new Color(116, 169, 207),
                new Color(54, 144, 192),
                new Color(5, 112, 176),
                new Color(4, 90, 141),
                new Color(2, 56, 88));


    }


}
