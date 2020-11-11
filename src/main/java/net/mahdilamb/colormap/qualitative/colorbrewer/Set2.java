package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set2")
public final class Set2 extends CategoricalColorMap {
    public Set2(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(102, 194, 165),
                new Color(252, 141, 98),
                new Color(141, 160, 203),
                new Color(231, 138, 195),
                new Color(166, 216, 84),
                new Color(255, 217, 47),
                new Color(229, 196, 148),
                new Color(179, 179, 179));

    }


}
