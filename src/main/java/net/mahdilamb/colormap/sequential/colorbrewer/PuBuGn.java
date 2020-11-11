package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuBuGn")
public final class PuBuGn extends LinearColorMap {
    public PuBuGn(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(255, 247, 251),
                new Color(236, 226, 240),
                new Color(208, 209, 230),
                new Color(166, 189, 219),
                new Color(103, 169, 207),
                new Color(54, 144, 192),
                new Color(2, 129, 138),
                new Color(1, 108, 89),
                new Color(1, 70, 54));


    }


}
