package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
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
                new ColorImpl(255, 255, 229),
                new ColorImpl(247, 252, 185),
                new ColorImpl(217, 240, 163),
                new ColorImpl(173, 221, 142),
                new ColorImpl(120, 198, 121),
                new ColorImpl(65, 171, 93),
                new ColorImpl(35, 132, 67),
                new ColorImpl(0, 104, 55),
                new ColorImpl(0, 69, 41));

    }


}
