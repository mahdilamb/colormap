package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
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
                new ColorImpl(255, 255, 229),
                new ColorImpl(255, 247, 188),
                new ColorImpl(254, 227, 145),
                new ColorImpl(254, 196, 79),
                new ColorImpl(254, 153, 41),
                new ColorImpl(236, 112, 20),
                new ColorImpl(204, 76, 2),
                new ColorImpl(153, 52, 4),
                new ColorImpl(102, 37, 6));

    }


}
