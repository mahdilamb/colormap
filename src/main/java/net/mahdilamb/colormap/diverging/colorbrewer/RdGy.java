package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdGy")
public final class RdGy extends LinearColorMap {
    public RdGy(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(103, 0, 31),
                new Color(178, 24, 43),
                new Color(214, 96, 77),
                new Color(244, 165, 130),
                new Color(253, 219, 199),
                new Color(255, 255, 255),
                new Color(224, 224, 224),
                new Color(186, 186, 186),
                new Color(135, 135, 135),
                new Color(77, 77, 77),
                new Color(26, 26, 26));
    }


}
