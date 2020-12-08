package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 RdGy.
 */
@NewColormap(type = ColormapType.DIVERGING, name = "RdGy")
public final class RdGy extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 RdGy.
     */
    public RdGy() {
        super(Color.create(103, 0, 31),
                Color.create(178, 24, 43),
                Color.create(214, 96, 77),
                Color.create(244, 165, 130),
                Color.create(253, 219, 199),
                Color.create(255, 255, 255),
                Color.create(224, 224, 224),
                Color.create(186, 186, 186),
                Color.create(135, 135, 135),
                Color.create(77, 77, 77),
                Color.create(26, 26, 26));
    }


}
