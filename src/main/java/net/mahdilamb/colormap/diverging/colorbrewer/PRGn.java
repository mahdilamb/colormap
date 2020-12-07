package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 colormap PRGn.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "PRGn")
public final class PRGn extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 colormap PRGn.
     */
    public PRGn() {
        super(
                new ColorImpl(64, 0, 75),
                new ColorImpl(118, 42, 131),
                new ColorImpl(153, 112, 171),
                new ColorImpl(194, 165, 207),
                new ColorImpl(231, 212, 232),
                new ColorImpl(247, 247, 247),
                new ColorImpl(217, 240, 211),
                new ColorImpl(166, 219, 160),
                new ColorImpl(90, 174, 97),
                new ColorImpl(27, 120, 55),
                new ColorImpl(0, 68, 27)
        );
    }

}
