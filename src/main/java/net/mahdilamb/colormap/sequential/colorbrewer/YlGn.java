package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 YlGn.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "YlGn")
public final class YlGn extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 YlGn.
     */
    public YlGn() {
        super(
                Color.create(255, 255, 229),
                Color.create(247, 252, 185),
                Color.create(217, 240, 163),
                Color.create(173, 221, 142),
                Color.create(120, 198, 121),
                Color.create(65, 171, 93),
                Color.create(35, 132, 67),
                Color.create(0, 104, 55),
                Color.create(0, 69, 41));

    }


}
