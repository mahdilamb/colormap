package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 YlOrBr.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "YlOrBr", source = "ColorBrewer")
public final class YlOrBr extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlOrBr.
     */
    public YlOrBr() {
        super(
                new Color(255, 255, 229),
                new Color(255, 247, 188),
                new Color(254, 227, 145),
                new Color(254, 196, 79),
                new Color(254, 153, 41),
                new Color(236, 112, 20),
                new Color(204, 76, 2),
                new Color(153, 52, 4),
                new Color(102, 37, 6));

    }


}
