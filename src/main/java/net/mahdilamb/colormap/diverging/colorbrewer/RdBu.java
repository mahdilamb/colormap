package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 RdBu
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdBu")
public final class RdBu extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdBu.
     */
    public RdBu() {
        super(Color.create(103, 0, 31),
                Color.create(178, 24, 43),
                Color.create(214, 96, 77),
                Color.create(244, 165, 130),
                Color.create(253, 219, 199),
                Color.create(247, 247, 247),
                Color.create(209, 229, 240),
                Color.create(146, 197, 222),
                Color.create(67, 147, 195),
                Color.create(33, 102, 172),
                Color.create(5, 48, 97));


    }


}
