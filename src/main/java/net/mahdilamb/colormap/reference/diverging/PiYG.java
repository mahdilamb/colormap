package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Colorbrewer 2.0 colormap PiYG.
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "PiYG", source = "ColorBrewer")
public final class PiYG extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PiYG.
     */
    public PiYG() {
        super(new Color(142, 1, 82),
                new Color(197, 27, 125),
                new Color(222, 119, 174),
                new Color(241, 182, 218),
                new Color(253, 224, 239),
                new Color(247, 247, 247),
                new Color(230, 245, 208),
                new Color(184, 225, 134),
                new Color(127, 188, 65),
                new Color(77, 146, 33),
                new Color(39, 100, 25));
    }

}
