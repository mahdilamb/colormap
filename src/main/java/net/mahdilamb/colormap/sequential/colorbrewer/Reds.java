package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Reds")
public final class Reds extends LinearColorMap {
    public Reds(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(255, 245, 240),
                new Color(254, 224, 210),
                new Color(252, 187, 161),
                new Color(252, 146, 114),
                new Color(251, 106, 74),
                new Color(239, 59, 44),
                new Color(203, 24, 29),
                new Color(165, 15, 21),
                new Color(103, 0, 13));

    }


}
