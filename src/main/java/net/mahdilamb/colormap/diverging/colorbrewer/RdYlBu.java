package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 RdYlBu.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdYlBu")
public final class RdYlBu extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdYlBu.
     */
    public RdYlBu() {
        super(
                Color.create(165, 0, 38),
                Color.create(215, 48, 39),
                Color.create(244, 109, 67),
                Color.create(253, 174, 97),
                Color.create(254, 224, 144),
                Color.create(255, 255, 191),
                Color.create(224, 243, 248),
                Color.create(171, 217, 233),
                Color.create(116, 173, 209),
                Color.create(69, 117, 180),
                Color.create(49, 54, 149));

    }


}
