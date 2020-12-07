package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 colormap BrBG.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "BrBG")
public final class BrBG extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 colormap BrBG.
     */
    public BrBG() {
        super(
                new ColorImpl(84, 48, 5),
                new ColorImpl(140, 81, 10),
                new ColorImpl(191, 129, 45),
                new ColorImpl(223, 194, 125),
                new ColorImpl(246, 232, 195),
                new ColorImpl(245, 245, 245),
                new ColorImpl(199, 234, 229),
                new ColorImpl(128, 205, 193),
                new ColorImpl(53, 151, 143),
                new ColorImpl(1, 102, 94),
                new ColorImpl(0, 60, 48)
        );
    }

}
