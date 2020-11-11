package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Blues")
public final class Blues extends LinearColorMap {
    public Blues(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(247, 251, 255),
                new Color(222, 235, 247),
                new Color(198, 219, 239),
                new Color(158, 202, 225),
                new Color(107, 174, 214),
                new Color(66, 146, 198),
                new Color(33, 113, 181),
                new Color(8, 81, 156),
                new Color(8, 48, 107));

    }


}
