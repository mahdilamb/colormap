package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PRGn")
public final class PRGn extends LinearColorMap {
    public PRGn(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(64, 0, 75));
        addColorNode(new Color(118, 42, 131));
        addColorNode(new Color(153, 112, 171));
        addColorNode(new Color(194, 165, 207));
        addColorNode(new Color(231, 212, 232));
        addColorNode(new Color(247, 247, 247));
        addColorNode(new Color(217, 240, 211));
        addColorNode(new Color(166, 219, 160));
        addColorNode(new Color(90, 174, 97));
        addColorNode(new Color(27, 120, 55));
        addColorNode(new Color(0, 68, 27));


    }

    public PRGn() {
        this(null, null);

    }

}
