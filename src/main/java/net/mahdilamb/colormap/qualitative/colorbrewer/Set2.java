package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set2")
public final class Set2 extends CategoricalColorMap {
    public Set2(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(102, 194, 165));
        addColorNode(new Color(252, 141, 98));
        addColorNode(new Color(141, 160, 203));
        addColorNode(new Color(231, 138, 195));
        addColorNode(new Color(166, 216, 84));
        addColorNode(new Color(255, 217, 47));
        addColorNode(new Color(229, 196, 148));
        addColorNode(new Color(179, 179, 179));

    }

    public Set2() {
        this(null, null);

    }

}
