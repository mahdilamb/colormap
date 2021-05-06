package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Colorbrewer 2.0 colormap BrBG.
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "BrBG", source = "ColorBrewer")
public final class BrBG extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap BrBG.
     */
    public BrBG() {
        super(new Color(84, 48, 5),
                new Color(140, 81, 10),
                new Color(191, 129, 45),
                new Color(223, 194, 125),
                new Color(246, 232, 195),
                new Color(245, 245, 245),
                new Color(199, 234, 229),
                new Color(128, 205, 193),
                new Color(53, 151, 143),
                new Color(1, 102, 94),
                new Color(0, 60, 48));
    }

}
