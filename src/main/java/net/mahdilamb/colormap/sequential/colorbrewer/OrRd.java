package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "OrRd")
public final class OrRd extends LinearColorMap {
    public OrRd(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 247, 236));
        addColorNode(new Color(254, 232, 200));
        addColorNode(new Color(253, 212, 158));
        addColorNode(new Color(253, 187, 132));
        addColorNode(new Color(252, 141, 89));
        addColorNode(new Color(239, 101, 72));
        addColorNode(new Color(215, 48, 31));
        addColorNode(new Color(179, 0, 0));
        addColorNode(new Color(127, 0, 0));


    }

    public OrRd() {
        this(null, null);

    }

}
