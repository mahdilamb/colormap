package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdYlBu")
public final class RdYlBu extends LinearColorMap {
    public RdYlBu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(165, 0, 38));
        addColorNode(new Color(215, 48, 39));
        addColorNode(new Color(244, 109, 67));
        addColorNode(new Color(253, 174, 97));
        addColorNode(new Color(254, 224, 144));
        addColorNode(new Color(255, 255, 191));
        addColorNode(new Color(224, 243, 248));
        addColorNode(new Color(171, 217, 233));
        addColorNode(new Color(116, 173, 209));
        addColorNode(new Color(69, 117, 180));
        addColorNode(new Color(49, 54, 149));

    }

    public RdYlBu() {
        this(null, null);

    }

}
