package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuRd")
public final class PuRd extends LinearColorMap {
    public PuRd(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(247, 244, 249));
        addColorNode(new Color(231, 225, 239));
        addColorNode(new Color(212, 185, 218));
        addColorNode(new Color(201, 148, 199));
        addColorNode(new Color(223, 101, 176));
        addColorNode(new Color(231, 41, 138));
        addColorNode(new Color(206, 18, 86));
        addColorNode(new Color(152, 0, 67));
        addColorNode(new Color(103, 0, 31));


    }

    public PuRd() {
        this(null, null);

    }

}
