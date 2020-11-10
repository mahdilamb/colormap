package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdBu")
public final class RdBu extends LinearColorMap {
    public RdBu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(103, 0, 31));
        addColorNode(new Color(178, 24, 43));
        addColorNode(new Color(214, 96, 77));
        addColorNode(new Color(244, 165, 130));
        addColorNode(new Color(253, 219, 199));
        addColorNode(new Color(247, 247, 247));
        addColorNode(new Color(209, 229, 240));
        addColorNode(new Color(146, 197, 222));
        addColorNode(new Color(67, 147, 195));
        addColorNode(new Color(33, 102, 172));
        addColorNode(new Color(5, 48, 97));


    }

    public RdBu() {
        this(null, null);

    }

}
