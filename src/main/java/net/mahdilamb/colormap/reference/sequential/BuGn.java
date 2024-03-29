package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Colorbrewer 2.0 BuGn.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BuGn", source = "ColorBrewer")
public final class BuGn extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 BuGn.
     */
    public BuGn() {
        super(
                new Color(247, 252, 253),
                new Color(229, 245, 249),
                new Color(204, 236, 230),
                new Color(153, 216, 201),
                new Color(102, 194, 164),
                new Color(65, 174, 118),
                new Color(35, 139, 69),
                new Color(0, 109, 44),
                new Color(0, 68, 27));


    }


}
