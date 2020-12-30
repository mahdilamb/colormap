package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 colormap PuOr.
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "PuOr", source = "ColorBrewer")
public final class PuOr extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PuOr.
     */
    public PuOr() {
        super(
                new Color(127, 59, 8),
                new Color(179, 88, 6),
                new Color(224, 130, 20),
                new Color(253, 184, 99),
                new Color(254, 224, 182),
                new Color(247, 247, 247),
                new Color(216, 218, 235),
                new Color(178, 171, 210),
                new Color(128, 115, 172),
                new Color(84, 39, 136),
                new Color(45, 0, 75));


    }

}
