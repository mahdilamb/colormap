package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
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
                new ColorImpl(247, 244, 249),
                new ColorImpl(231, 225, 239),
                new ColorImpl(212, 185, 218),
                new ColorImpl(201, 148, 199),
                new ColorImpl(223, 101, 176),
                new ColorImpl(231, 41, 138),
                new ColorImpl(206, 18, 86),
                new ColorImpl(152, 0, 67),
                new ColorImpl(103, 0, 31));


    }


}
