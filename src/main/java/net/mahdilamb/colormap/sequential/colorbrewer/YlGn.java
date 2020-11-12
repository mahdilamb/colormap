package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;
/**
 * Colorbrewer 2.0 YlGn.
 */
@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlGn")
public final class YlGn extends LinearColorMap {
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
