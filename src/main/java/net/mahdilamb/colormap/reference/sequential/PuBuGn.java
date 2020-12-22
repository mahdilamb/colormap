package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 PuBuGn.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "PuBuGn")
public final class PuBuGn extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 PuBuGn.
     */
    public PuBuGn() {
        super(
                new Color(255, 247, 251),
                new Color(236, 226, 240),
                new Color(208, 209, 230),
                new Color(166, 189, 219),
                new Color(103, 169, 207),
                new Color(54, 144, 192),
                new Color(2, 129, 138),
                new Color(1, 108, 89),
                new Color(1, 70, 54));


    }


}
