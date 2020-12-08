package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 colormap PRGn.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "PRGn")
public final class PRGn extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PRGn.
     */
    public PRGn() {
        super(Color.create(64, 0, 75),
                Color.create(118, 42, 131),
                Color.create(153, 112, 171),
                Color.create(194, 165, 207),
                Color.create(231, 212, 232),
                Color.create(247, 247, 247),
                Color.create(217, 240, 211),
                Color.create(166, 219, 160),
                Color.create(90, 174, 97),
                Color.create(27, 120, 55),
                Color.create(0, 68, 27));
    }

}
