package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(247, 252, 253),
                Color.create(229, 245, 249),
                Color.create(204, 236, 230),
                Color.create(153, 216, 201),
                Color.create(102, 194, 164),
                Color.create(65, 174, 118),
                Color.create(35, 139, 69),
                Color.create(0, 109, 44),
                Color.create(0, 68, 27));


    }


}
