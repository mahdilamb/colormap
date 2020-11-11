package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlGnBu")
public final class YlGnBu extends LinearColorMap {
    public YlGnBu(){super(
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
