package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdYlGn")
public final class RdYlGn extends LinearColorMap {
    public RdYlGn(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(165, 0, 38));
        addColorNode(new Color(215, 48, 39));
        addColorNode(new Color(244, 109, 67));
        addColorNode(new Color(253, 174, 97));
        addColorNode(new Color(254, 224, 139));
        addColorNode(new Color(255, 255, 191));
        addColorNode(new Color(217, 239, 139));
        addColorNode(new Color(166, 217, 106));
        addColorNode(new Color(102, 189, 99));
        addColorNode(new Color(26, 152, 80));
        addColorNode(new Color(0, 104, 55));

    }

    public RdYlGn() {
        this(null, null);

    }

}
