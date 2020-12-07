package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 BuGn.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "BuGn")
public final class BuGn extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 BuGn.
     */
    public BuGn() {
        super(
                new ColorImpl(247, 252, 253),
                new ColorImpl(229, 245, 249),
                new ColorImpl(204, 236, 230),
                new ColorImpl(153, 216, 201),
                new ColorImpl(102, 194, 164),
                new ColorImpl(65, 174, 118),
                new ColorImpl(35, 139, 69),
                new ColorImpl(0, 109, 44),
                new ColorImpl(0, 68, 27));


    }


}
