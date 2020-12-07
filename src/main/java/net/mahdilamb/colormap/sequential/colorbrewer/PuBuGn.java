package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 PuBuGn.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "PuBuGn")
public final class PuBuGn extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 PuBuGn.
     */
    public PuBuGn() {
        super(
                new ColorImpl(255, 247, 251),
                new ColorImpl(236, 226, 240),
                new ColorImpl(208, 209, 230),
                new ColorImpl(166, 189, 219),
                new ColorImpl(103, 169, 207),
                new ColorImpl(54, 144, 192),
                new ColorImpl(2, 129, 138),
                new ColorImpl(1, 108, 89),
                new ColorImpl(1, 70, 54));


    }


}
