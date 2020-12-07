package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 YlGnBu.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "YlGnBu")
public final class YlGnBu extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlGnBu.
     */
    public YlGnBu() {
        super(
                new ColorImpl(255, 255, 217),
                new ColorImpl(237, 248, 177),
                new ColorImpl(199, 233, 180),
                new ColorImpl(127, 205, 187),
                new ColorImpl(65, 182, 196),
                new ColorImpl(29, 145, 192),
                new ColorImpl(34, 94, 168),
                new ColorImpl(37, 52, 148),
                new ColorImpl(8, 29, 88));

    }


}
