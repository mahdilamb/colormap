package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 YlOrRd
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "YlOrRd")
public final class YlOrRd extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlOrRd.
     */
    public YlOrRd() {
        super(
                new Color(255, 255, 204),
                new Color(255, 237, 160),
                new Color(254, 217, 118),
                new Color(254, 178, 76),
                new Color(253, 141, 60),
                new Color(252, 78, 42),
                new Color(227, 26, 28),
                new Color(189, 0, 38),
                new Color(128, 0, 38));

    }

}
