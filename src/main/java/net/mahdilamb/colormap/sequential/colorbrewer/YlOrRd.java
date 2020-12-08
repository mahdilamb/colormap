package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 YlOrRd
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "YlOrRd")
public final class YlOrRd extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlOrRd.
     */
    public YlOrRd() {
        super(
                Color.create(255, 255, 204),
                Color.create(255, 237, 160),
                Color.create(254, 217, 118),
                Color.create(254, 178, 76),
                Color.create(253, 141, 60),
                Color.create(252, 78, 42),
                Color.create(227, 26, 28),
                Color.create(189, 0, 38),
                Color.create(128, 0, 38));

    }

}
