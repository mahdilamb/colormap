package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 RdPu.
 */
@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "RdPu")
public final class RdPu extends LinearColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 RdPu.
     */
    public RdPu() {
        super(
                new Color(255, 247, 243),
                new Color(253, 224, 221),
                new Color(252, 197, 192),
                new Color(250, 159, 181),
                new Color(247, 104, 161),
                new Color(221, 52, 151),
                new Color(174, 1, 126),
                new Color(122, 1, 119),
                new Color(73, 0, 106));


    }


}
