package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Dark2")
public final class Dark2 extends CategoricalColorMap {
    public Dark2(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(27, 158, 119),
                new Color(217, 95, 2),
                new Color(117, 112, 179),
                new Color(231, 41, 138),
                new Color(102, 166, 30),
                new Color(230, 171, 2),
                new Color(166, 118, 29),
                new Color(102, 102, 102));

    }

}
