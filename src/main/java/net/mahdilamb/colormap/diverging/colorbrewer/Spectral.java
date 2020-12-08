package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Spectral
 */
@NewColormap(type = ColormapType.DIVERGING, name = "Spectral")
public final class Spectral extends LinearColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 Spectral
     */
    public Spectral() {
        super(Color.create(158, 1, 66),
                Color.create(213, 62, 79),
                Color.create(244, 109, 67),
                Color.create(253, 174, 97),
                Color.create(254, 224, 139),
                Color.create(255, 255, 191),
                Color.create(230, 245, 152),
                Color.create(171, 221, 164),
                Color.create(102, 194, 165),
                Color.create(50, 136, 189),
                Color.create(94, 79, 162));

    }


}
