package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colorbrewer 2.0 Spectral
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Spectral")
public final class Spectral extends SequentialColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 Spectral
     */
    public Spectral() {
        super(new Color(158, 1, 66),
                new Color(213, 62, 79),
                new Color(244, 109, 67),
                new Color(253, 174, 97),
                new Color(254, 224, 139),
                new Color(255, 255, 191),
                new Color(230, 245, 152),
                new Color(171, 221, 164),
                new Color(102, 194, 165),
                new Color(50, 136, 189),
                new Color(94, 79, 162));

    }


}
