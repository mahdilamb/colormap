package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 colormap PiYG.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "PiYG")
public final class PiYG extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PiYG.
     */
    public PiYG() {
        super(Color.create(142, 1, 82),
                Color.create(197, 27, 125),
                Color.create(222, 119, 174),
                Color.create(241, 182, 218),
                Color.create(253, 224, 239),
                Color.create(247, 247, 247),
                Color.create(230, 245, 208),
                Color.create(184, 225, 134),
                Color.create(127, 188, 65),
                Color.create(77, 146, 33),
                Color.create(39, 100, 25));
    }

}
