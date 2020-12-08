package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 colormap BrBG.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "BrBG")
public final class BrBG extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 colormap BrBG.
     */
    public BrBG() {
        super(Color.create(84, 48, 5),
                Color.create(140, 81, 10),
                Color.create(191, 129, 45),
                Color.create(223, 194, 125),
                Color.create(246, 232, 195),
                Color.create(245, 245, 245),
                Color.create(199, 234, 229),
                Color.create(128, 205, 193),
                Color.create(53, 151, 143),
                Color.create(1, 102, 94),
                Color.create(0, 60, 48));
    }

}
