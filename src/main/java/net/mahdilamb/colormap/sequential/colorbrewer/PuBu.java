package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap from Purple to Blue.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "PuBu")
public final class PuBu extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer PuBu.
     */
    public PuBu() {
        super(
                Color.create(255, 247, 251),
                Color.create(236, 231, 242),
                Color.create(208, 209, 230),
                Color.create(166, 189, 219),
                Color.create(116, 169, 207),
                Color.create(54, 144, 192),
                Color.create(5, 112, 176),
                Color.create(4, 90, 141),
                Color.create(2, 56, 88));


    }


}
