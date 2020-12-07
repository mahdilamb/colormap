package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(255, 255, 204),
                new ColorImpl(255, 237, 160),
                new ColorImpl(254, 217, 118),
                new ColorImpl(254, 178, 76),
                new ColorImpl(253, 141, 60),
                new ColorImpl(252, 78, 42),
                new ColorImpl(227, 26, 28),
                new ColorImpl(189, 0, 38),
                new ColorImpl(128, 0, 38));

    }

}
