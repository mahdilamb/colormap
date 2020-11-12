package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdYlGn")
public final class RdYlGn extends LinearColorMap {
    public RdYlGn() {
        super(
                new Color(165, 0, 38),
                new Color(215, 48, 39),
                new Color(244, 109, 67),
                new Color(253, 174, 97),
                new Color(254, 224, 139),
                new Color(255, 255, 191),
                new Color(217, 239, 139),
                new Color(166, 217, 106),
                new Color(102, 189, 99),
                new Color(26, 152, 80),
                new Color(0, 104, 55));

    }


}
