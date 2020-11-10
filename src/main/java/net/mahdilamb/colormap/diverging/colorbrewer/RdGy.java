package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdGy")
public final class RdGy extends LinearColorMap {
    public RdGy(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(103, 0, 31));
        addColorNode(new Color(178, 24, 43));
        addColorNode(new Color(214, 96, 77));
        addColorNode(new Color(244, 165, 130));
        addColorNode(new Color(253, 219, 199));
        addColorNode(new Color(255, 255, 255));
        addColorNode(new Color(224, 224, 224));
        addColorNode(new Color(186, 186, 186));
        addColorNode(new Color(135, 135, 135));
        addColorNode(new Color(77, 77, 77));
        addColorNode(new Color(26, 26, 26));
    }

    public RdGy() {
        this(null, null);

    }

}
