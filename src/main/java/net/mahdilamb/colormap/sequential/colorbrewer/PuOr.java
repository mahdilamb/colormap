package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;
/**
 * Colorbrewer 2.0 PuOr.
 */
@NewColorMap(type = ColorMapType.DIVERGING, name = "PuOr")
public final class PuOr extends LinearColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 PuOr.
     */
    public PuOr() {
        super(
                new Color(127, 59, 8),
                new Color(179, 88, 6),
                new Color(224, 130, 20),
                new Color(253, 184, 99),
                new Color(254, 224, 182),
                new Color(247, 247, 247),
                new Color(216, 218, 235),
                new Color(178, 171, 210),
                new Color(128, 115, 172),
                new Color(84, 39, 136),
                new Color(45, 0, 75));


    }


}
