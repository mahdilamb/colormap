package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(127, 59, 8),
                Color.create(179, 88, 6),
                Color.create(224, 130, 20),
                Color.create(253, 184, 99),
                Color.create(254, 224, 182),
                Color.create(247, 247, 247),
                Color.create(216, 218, 235),
                Color.create(178, 171, 210),
                Color.create(128, 115, 172),
                Color.create(84, 39, 136),
                Color.create(45, 0, 75));


    }


}
