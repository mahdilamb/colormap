package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 RdYlGn.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdYlGn")
public final class RdYlGn extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdYlGn.
     */
    public RdYlGn() {
        super(Color.create(165, 0, 38),
                Color.create(215, 48, 39),
                Color.create(244, 109, 67),
                Color.create(253, 174, 97),
                Color.create(254, 224, 139),
                Color.create(255, 255, 191),
                Color.create(217, 239, 139),
                Color.create(166, 217, 106),
                Color.create(102, 189, 99),
                Color.create(26, 152, 80),
                Color.create(0, 104, 55));

    }


}
