package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 RdYlGn.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdYlGn")
public final class RdYlGn extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 RdYlGn.
     */
    public RdYlGn() {
        super(
                new ColorImpl(165, 0, 38),
                new ColorImpl(215, 48, 39),
                new ColorImpl(244, 109, 67),
                new ColorImpl(253, 174, 97),
                new ColorImpl(254, 224, 139),
                new ColorImpl(255, 255, 191),
                new ColorImpl(217, 239, 139),
                new ColorImpl(166, 217, 106),
                new ColorImpl(102, 189, 99),
                new ColorImpl(26, 152, 80),
                new ColorImpl(0, 104, 55));

    }


}
