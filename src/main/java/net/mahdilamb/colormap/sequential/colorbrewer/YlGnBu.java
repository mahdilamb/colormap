package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(255, 255, 217),
                Color.create(237, 248, 177),
                Color.create(199, 233, 180),
                Color.create(127, 205, 187),
                Color.create(65, 182, 196),
                Color.create(29, 145, 192),
                Color.create(34, 94, 168),
                Color.create(37, 52, 148),
                Color.create(8, 29, 88));

    }


}
