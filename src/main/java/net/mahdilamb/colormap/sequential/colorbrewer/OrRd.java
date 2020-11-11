package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "OrRd")
public final class OrRd extends LinearColorMap {
    public OrRd(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(255, 247, 236),
                new Color(254, 232, 200),
                new Color(253, 212, 158),
                new Color(253, 187, 132),
                new Color(252, 141, 89),
                new Color(239, 101, 72),
                new Color(215, 48, 31),
                new Color(179, 0, 0),
                new Color(127, 0, 0));


    }


}
