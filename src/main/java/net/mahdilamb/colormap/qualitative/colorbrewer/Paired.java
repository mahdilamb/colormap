package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Paired")
public final class Paired extends CategoricalColorMap {
    public Paired(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(166, 206, 227),
                new Color(31, 120, 180),
                new Color(178, 223, 138),
                new Color(51, 160, 44),
                new Color(251, 154, 153),
                new Color(227, 26, 28),
                new Color(253, 191, 111),
                new Color(255, 127, 0),
                new Color(202, 178, 214),
                new Color(106, 61, 154),
                new Color(255, 255, 153),
                new Color(177, 89, 40));


    }

}
