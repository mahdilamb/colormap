package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 RdGy.
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "RdGy")
public final class RdGy extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdGy.
     */
    public RdGy() {
        super(new Color(103, 0, 31),
                new Color(178, 24, 43),
                new Color(214, 96, 77),
                new Color(244, 165, 130),
                new Color(253, 219, 199),
                new Color(255, 255, 255),
                new Color(224, 224, 224),
                new Color(186, 186, 186),
                new Color(135, 135, 135),
                new Color(77, 77, 77),
                new Color(26, 26, 26));
    }


}
