package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Greens")
public final class Greens extends LinearColorMap {
    public Greens(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(247, 252, 245));
        addColorNode(new Color(229, 245, 224));
        addColorNode(new Color(199, 233, 192));
        addColorNode(new Color(161, 217, 155));
        addColorNode(new Color(116, 196, 118));
        addColorNode(new Color(65, 171, 93));
        addColorNode(new Color(35, 139, 69));
        addColorNode(new Color(0, 109, 44));
        addColorNode(new Color(0, 68, 27));

    }

    public Greens() {
        this(null, null);

    }

}
