package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(255, 247, 251),
                Color.create(236, 226, 240),
                Color.create(208, 209, 230),
                Color.create(166, 189, 219),
                Color.create(103, 169, 207),
                Color.create(54, 144, 192),
                Color.create(2, 129, 138),
                Color.create(1, 108, 89),
                Color.create(1, 70, 54));


    }


}
