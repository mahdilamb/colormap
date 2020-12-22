package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 BuPu
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BuPu")
public final class BuPu extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 BuPu.
     */
    public BuPu() {
        super(new Color(247, 252, 253),
                new Color(224, 236, 244),
                new Color(191, 211, 230),
                new Color(158, 188, 218),
                new Color(140, 150, 198),
                new Color(140, 107, 177),
                new Color(136, 65, 157),
                new Color(129, 15, 124),
                new Color(77, 0, 75));

    }


}
