package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 RdYlBu.
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "RdYlBu")
public final class RdYlBu extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdYlBu.
     */
    public RdYlBu() {
        super(
                new Color(165, 0, 38),
                new Color(215, 48, 39),
                new Color(244, 109, 67),
                new Color(253, 174, 97),
                new Color(254, 224, 144),
                new Color(255, 255, 191),
                new Color(224, 243, 248),
                new Color(171, 217, 233),
                new Color(116, 173, 209),
                new Color(69, 117, 180),
                new Color(49, 54, 149));

    }


}
