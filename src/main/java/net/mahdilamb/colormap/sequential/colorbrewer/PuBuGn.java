package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuBuGn")
public final class PuBuGn extends LinearColorMap {
    public PuBuGn(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 247, 251));
        addColorNode(new Color(236, 226, 240));
        addColorNode(new Color(208, 209, 230));
        addColorNode(new Color(166, 189, 219));
        addColorNode(new Color(103, 169, 207));
        addColorNode(new Color(54, 144, 192));
        addColorNode(new Color(2, 129, 138));
        addColorNode(new Color(1, 108, 89));
        addColorNode(new Color(1, 70, 54));


    }

    public PuBuGn() {
        this(null, null);

    }

}
