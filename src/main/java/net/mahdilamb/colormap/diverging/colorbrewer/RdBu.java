package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdBu")
public final class RdBu extends LinearColorMap {
    public RdBu(){super(
                new Color(103, 0, 31),
                new Color(178, 24, 43),
                new Color(214, 96, 77),
                new Color(244, 165, 130),
                new Color(253, 219, 199),
                new Color(247, 247, 247),
                new Color(209, 229, 240),
                new Color(146, 197, 222),
                new Color(67, 147, 195),
                new Color(33, 102, 172),
                new Color(5, 48, 97));


    }


}
