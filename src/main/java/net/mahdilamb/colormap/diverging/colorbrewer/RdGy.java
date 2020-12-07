package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 RdGy.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdGy")
public final class RdGy extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 RdGy.
     */
    public RdGy() {
        super(
                new ColorImpl(103, 0, 31),
                new ColorImpl(178, 24, 43),
                new ColorImpl(214, 96, 77),
                new ColorImpl(244, 165, 130),
                new ColorImpl(253, 219, 199),
                new ColorImpl(255, 255, 255),
                new ColorImpl(224, 224, 224),
                new ColorImpl(186, 186, 186),
                new ColorImpl(135, 135, 135),
                new ColorImpl(77, 77, 77),
                new ColorImpl(26, 26, 26));
    }


}
