package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlOrBr")
public final class YlOrBr extends LinearColorMap {
    public YlOrBr(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 255, 229));
        addColorNode(new Color(255, 247, 188));
        addColorNode(new Color(254, 227, 145));
        addColorNode(new Color(254, 196, 79));
        addColorNode(new Color(254, 153, 41));
        addColorNode(new Color(236, 112, 20));
        addColorNode(new Color(204, 76, 2));
        addColorNode(new Color(153, 52, 4));
        addColorNode(new Color(102, 37, 6));

    }

    public YlOrBr() {
        this(null, null);

    }

}
