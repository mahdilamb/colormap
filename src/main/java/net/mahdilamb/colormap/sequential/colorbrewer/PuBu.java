package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(255, 247, 251),
                new ColorImpl(236, 231, 242),
                new ColorImpl(208, 209, 230),
                new ColorImpl(166, 189, 219),
                new ColorImpl(116, 169, 207),
                new ColorImpl(54, 144, 192),
                new ColorImpl(5, 112, 176),
                new ColorImpl(4, 90, 141),
                new ColorImpl(2, 56, 88));


    }


}
