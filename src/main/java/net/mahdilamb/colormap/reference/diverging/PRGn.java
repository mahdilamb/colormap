package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 colormap PRGn.
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "PRGn")
public final class PRGn extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PRGn.
     */
    public PRGn() {
        super(new Color(64, 0, 75),
                new Color(118, 42, 131),
                new Color(153, 112, 171),
                new Color(194, 165, 207),
                new Color(231, 212, 232),
                new Color(247, 247, 247),
                new Color(217, 240, 211),
                new Color(166, 219, 160),
                new Color(90, 174, 97),
                new Color(27, 120, 55),
                new Color(0, 68, 27));
    }

}
