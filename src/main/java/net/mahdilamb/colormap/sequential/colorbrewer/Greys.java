package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Greys")
public final class Greys extends LinearColorMap {
    public Greys(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(255, 255, 255),
                new Color(240, 240, 240),
                new Color(217, 217, 217),
                new Color(189, 189, 189),
                new Color(150, 150, 150),
                new Color(115, 115, 115),
                new Color(82, 82, 82),
                new Color(37, 37, 37),
                new Color(0, 0, 0));

    }


}
