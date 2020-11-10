package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PuOr")
public final class PuOr extends LinearColorMap {
    public PuOr(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(127, 59, 8));
        addColorNode(new Color(179, 88, 6));
        addColorNode(new Color(224, 130, 20));
        addColorNode(new Color(253, 184, 99));
        addColorNode(new Color(254, 224, 182));
        addColorNode(new Color(247, 247, 247));
        addColorNode(new Color(216, 218, 235));
        addColorNode(new Color(178, 171, 210));
        addColorNode(new Color(128, 115, 172));
        addColorNode(new Color(84, 39, 136));
        addColorNode(new Color(45, 0, 75));


    }

    public PuOr() {
        this(null, null);

    }

}
