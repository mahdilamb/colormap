package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PiYG")
public final class PiYG extends LinearColorMap {
    public PiYG(){super(
                new Color(142, 1, 82),
                new Color(197, 27, 125),
                new Color(222, 119, 174),
                new Color(241, 182, 218),
                new Color(253, 224, 239),
                new Color(247, 247, 247),
                new Color(230, 245, 208),
                new Color(184, 225, 134),
                new Color(127, 188, 65),
                new Color(77, 146, 33),
                new Color(39, 100, 25));

    }

}
