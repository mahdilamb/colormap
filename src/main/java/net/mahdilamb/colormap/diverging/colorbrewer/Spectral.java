package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 Spectral
 */
@NewColormap(type = ColormapType.DIVERGING, name = "Spectral")
public final class Spectral extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Spectral
     */
    public Spectral() {
        super(
                new ColorImpl(158, 1, 66),
                new ColorImpl(213, 62, 79),
                new ColorImpl(244, 109, 67),
                new ColorImpl(253, 174, 97),
                new ColorImpl(254, 224, 139),
                new ColorImpl(255, 255, 191),
                new ColorImpl(230, 245, 152),
                new ColorImpl(171, 221, 164),
                new ColorImpl(102, 194, 165),
                new ColorImpl(50, 136, 189),
                new ColorImpl(94, 79, 162));

    }


}
