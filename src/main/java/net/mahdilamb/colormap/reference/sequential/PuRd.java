package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 PuRd.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "PuRd", source = "ColorBrewer")
public final class PuRd extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 PuRd.
     */
    public PuRd() {
        super(
                new Color(247, 244, 249),
                new Color(231, 225, 239),
                new Color(212, 185, 218),
                new Color(201, 148, 199),
                new Color(223, 101, 176),
                new Color(231, 41, 138),
                new Color(206, 18, 86),
                new Color(152, 0, 67),
                new Color(103, 0, 31));


    }


}
