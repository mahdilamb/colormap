package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 BuPu
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "BuPu")
public final class BuPu extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 BuPu.
     */
    public BuPu() {
        super(Color.create(247, 252, 253),
                Color.create(224, 236, 244),
                Color.create(191, 211, 230),
                Color.create(158, 188, 218),
                Color.create(140, 150, 198),
                Color.create(140, 107, 177),
                Color.create(136, 65, 157),
                Color.create(129, 15, 124),
                Color.create(77, 0, 75));

    }


}
