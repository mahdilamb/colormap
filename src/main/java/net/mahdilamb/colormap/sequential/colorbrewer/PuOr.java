package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 PuOr.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "PuOr")
public final class PuOr extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 PuOr.
     */
    public PuOr() {
        super(
                new ColorImpl(127, 59, 8),
                new ColorImpl(179, 88, 6),
                new ColorImpl(224, 130, 20),
                new ColorImpl(253, 184, 99),
                new ColorImpl(254, 224, 182),
                new ColorImpl(247, 247, 247),
                new ColorImpl(216, 218, 235),
                new ColorImpl(178, 171, 210),
                new ColorImpl(128, 115, 172),
                new ColorImpl(84, 39, 136),
                new ColorImpl(45, 0, 75));


    }


}
