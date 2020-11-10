package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BuGn")
public final class BuGn extends LinearColorMap {
    public BuGn(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(247, 252, 253));
        addColorNode(new Color(229, 245, 249));
        addColorNode(new Color(204, 236, 230));
        addColorNode(new Color(153, 216, 201));
        addColorNode(new Color(102, 194, 164));
        addColorNode(new Color(65, 174, 118));
        addColorNode(new Color(35, 139, 69));
        addColorNode(new Color(0, 109, 44));
        addColorNode(new Color(0, 68, 27));


    }

    public BuGn() {
        this(null, null);
    }

}
