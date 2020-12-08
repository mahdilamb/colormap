package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 YlOrBr.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "YlOrBr")
public final class YlOrBr extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlOrBr.
     */
    public YlOrBr() {
        super(
                Color.create(255, 255, 229),
                Color.create(255, 247, 188),
                Color.create(254, 227, 145),
                Color.create(254, 196, 79),
                Color.create(254, 153, 41),
                Color.create(236, 112, 20),
                Color.create(204, 76, 2),
                Color.create(153, 52, 4),
                Color.create(102, 37, 6));

    }


}
