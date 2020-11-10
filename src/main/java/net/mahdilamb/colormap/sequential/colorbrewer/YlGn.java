package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlGn")
public final class YlGn extends LinearColorMap {
    public YlGn(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 255, 229));
        addColorNode(new Color(247, 252, 185));
        addColorNode(new Color(217, 240, 163));
        addColorNode(new Color(173, 221, 142));
        addColorNode(new Color(120, 198, 121));
        addColorNode(new Color(65, 171, 93));
        addColorNode(new Color(35, 132, 67));
        addColorNode(new Color(0, 104, 55));
        addColorNode(new Color(0, 69, 41));

    }

    public YlGn() {
        this(null, null);

    }

}
