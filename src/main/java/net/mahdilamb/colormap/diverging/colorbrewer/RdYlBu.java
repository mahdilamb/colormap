package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
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
                new ColorImpl(165, 0, 38),
                new ColorImpl(215, 48, 39),
                new ColorImpl(244, 109, 67),
                new ColorImpl(253, 174, 97),
                new ColorImpl(254, 224, 144),
                new ColorImpl(255, 255, 191),
                new ColorImpl(224, 243, 248),
                new ColorImpl(171, 217, 233),
                new ColorImpl(116, 173, 209),
                new ColorImpl(69, 117, 180),
                new ColorImpl(49, 54, 149));

    }


}
