package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuBu")
public final class PuBu extends LinearColorMap {
    public PuBu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 247, 251));
        addColorNode(new Color(236, 231, 242));
        addColorNode(new Color(208, 209, 230));
        addColorNode(new Color(166, 189, 219));
        addColorNode(new Color(116, 169, 207));
        addColorNode(new Color(54, 144, 192));
        addColorNode(new Color(5, 112, 176));
        addColorNode(new Color(4, 90, 141));
        addColorNode(new Color(2, 56, 88));


    }

    public PuBu() {
        this(null, null);

    }

}
