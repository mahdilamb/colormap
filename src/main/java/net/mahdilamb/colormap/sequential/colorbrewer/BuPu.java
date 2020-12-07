package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 BuPu
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "BuPu")
public final class BuPu extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 BuPu.
     */
    public BuPu() {
        super(
                new ColorImpl(247, 252, 253),
                new ColorImpl(224, 236, 244),
                new ColorImpl(191, 211, 230),
                new ColorImpl(158, 188, 218),
                new ColorImpl(140, 150, 198),
                new ColorImpl(140, 107, 177),
                new ColorImpl(136, 65, 157),
                new ColorImpl(129, 15, 124),
                new ColorImpl(77, 0, 75));

    }


}
