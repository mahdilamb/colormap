package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 PuRd.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "PuRd")
public final class PuRd extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 PuRd.
     */
    public PuRd() {
        super(
                Color.create(247, 244, 249),
                Color.create(231, 225, 239),
                Color.create(212, 185, 218),
                Color.create(201, 148, 199),
                Color.create(223, 101, 176),
                Color.create(231, 41, 138),
                Color.create(206, 18, 86),
                Color.create(152, 0, 67),
                Color.create(103, 0, 31));


    }


}
