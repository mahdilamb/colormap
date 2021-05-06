package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Colorbrewer 2.0 YlGnBu.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "YlGnBu", source = "ColorBrewer")
public final class YlGnBu extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlGnBu.
     */
    public YlGnBu() {
        super(
                new Color(255, 255, 217),
                new Color(237, 248, 177),
                new Color(199, 233, 180),
                new Color(127, 205, 187),
                new Color(65, 182, 196),
                new Color(29, 145, 192),
                new Color(34, 94, 168),
                new Color(37, 52, 148),
                new Color(8, 29, 88));

    }


}
