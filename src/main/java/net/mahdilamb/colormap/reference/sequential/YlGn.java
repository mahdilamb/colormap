package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 YlGn.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "YlGn")
public final class YlGn extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlGn.
     */
    public YlGn() {
        super(
                new Color(255, 255, 229),
                new Color(247, 252, 185),
                new Color(217, 240, 163),
                new Color(173, 221, 142),
                new Color(120, 198, 121),
                new Color(65, 171, 93),
                new Color(35, 132, 67),
                new Color(0, 104, 55),
                new Color(0, 69, 41));

    }


}
