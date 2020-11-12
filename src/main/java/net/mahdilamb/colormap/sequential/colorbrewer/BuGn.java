package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 BuGn.
 */
@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BuGn")
public final class BuGn extends LinearColorMap {
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
