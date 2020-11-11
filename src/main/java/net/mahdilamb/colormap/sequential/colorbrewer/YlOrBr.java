package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlOrBr")
public final class YlOrBr extends LinearColorMap {
    public YlOrBr(){super(
                new Color(255, 255, 229),
                new Color(255, 247, 188),
                new Color(254, 227, 145),
                new Color(254, 196, 79),
                new Color(254, 153, 41),
                new Color(236, 112, 20),
                new Color(204, 76, 2),
                new Color(153, 52, 4),
                new Color(102, 37, 6));

    }


}
