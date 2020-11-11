package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "GnBu")
public final class GnBu extends LinearColorMap {
    public GnBu(){super(
                new Color(247, 252, 240),
                new Color(224, 243, 219),
                new Color(204, 235, 197),
                new Color(168, 221, 181),
                new Color(123, 204, 196),
                new Color(78, 179, 211),
                new Color(43, 140, 190),
                new Color(8, 104, 172),
                new Color(8, 64, 129));


    }


}
