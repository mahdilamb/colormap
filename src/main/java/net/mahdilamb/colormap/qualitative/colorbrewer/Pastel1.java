package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Pastel1")
public final class Pastel1 extends CategoricalColorMap {
    public Pastel1(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(251, 180, 174),
                new Color(179, 205, 227),
                new Color(204, 235, 197),
                new Color(222, 203, 228),
                new Color(254, 217, 166),
                new Color(255, 255, 204),
                new Color(229, 216, 189),
                new Color(253, 218, 236),
                new Color(242, 242, 242));


    }


}
