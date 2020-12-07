package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 colormap PiYG.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "PiYG")
public final class PiYG extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PiYG.
     */
    public PiYG() {
        super(
                new ColorImpl(142, 1, 82),
                new ColorImpl(197, 27, 125),
                new ColorImpl(222, 119, 174),
                new ColorImpl(241, 182, 218),
                new ColorImpl(253, 224, 239),
                new ColorImpl(247, 247, 247),
                new ColorImpl(230, 245, 208),
                new ColorImpl(184, 225, 134),
                new ColorImpl(127, 188, 65),
                new ColorImpl(77, 146, 33),
                new ColorImpl(39, 100, 25));

    }

}
