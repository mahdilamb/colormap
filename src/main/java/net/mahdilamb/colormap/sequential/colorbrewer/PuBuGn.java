package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 PuBuGn.
 */
@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuBuGn")
public final class PuBuGn extends LinearColorMap {
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
