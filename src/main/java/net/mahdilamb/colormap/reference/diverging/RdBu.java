package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 RdBu
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "RdBu")
public final class RdBu extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdBu.
     */
    public RdBu() {
        super(new Color(103, 0, 31),
                new Color(178, 24, 43),
                new Color(214, 96, 77),
                new Color(244, 165, 130),
                new Color(253, 219, 199),
                new Color(247, 247, 247),
                new Color(209, 229, 240),
                new Color(146, 197, 222),
                new Color(67, 147, 195),
                new Color(33, 102, 172),
                new Color(5, 48, 97));


    }


}
