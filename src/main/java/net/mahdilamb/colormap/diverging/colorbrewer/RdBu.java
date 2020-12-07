package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 RdBu
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdBu")
public final class RdBu extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 RdBu.
     */
    public RdBu() {
        super(
                new ColorImpl(103, 0, 31),
                new ColorImpl(178, 24, 43),
                new ColorImpl(214, 96, 77),
                new ColorImpl(244, 165, 130),
                new ColorImpl(253, 219, 199),
                new ColorImpl(247, 247, 247),
                new ColorImpl(209, 229, 240),
                new ColorImpl(146, 197, 222),
                new ColorImpl(67, 147, 195),
                new ColorImpl(33, 102, 172),
                new ColorImpl(5, 48, 97));


    }


}
