package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Blues")
public final class Blues extends LinearColorMap {
    public Blues(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(247, 251, 255));
        addColorNode(new Color(222, 235, 247));
        addColorNode(new Color(198, 219, 239));
        addColorNode(new Color(158, 202, 225));
        addColorNode(new Color(107, 174, 214));
        addColorNode(new Color(66, 146, 198));
        addColorNode(new Color(33, 113, 181));
        addColorNode(new Color(8, 81, 156));
        addColorNode(new Color(8, 48, 107));

    }

    public Blues() {
        this(null, null);
    }

}
