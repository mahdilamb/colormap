package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set1")
public final class Set1 extends CategoricalColorMap {
    public Set1(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(228, 26, 28));
        addColorNode(new Color(55, 126, 184));
        addColorNode(new Color(77, 175, 74));
        addColorNode(new Color(152, 78, 163));
        addColorNode(new Color(255, 127, 0));
        addColorNode(new Color(255, 255, 51));
        addColorNode(new Color(166, 86, 40));
        addColorNode(new Color(247, 129, 191));
        addColorNode(new Color(153, 153, 153));


    }

    public Set1() {
        this(null, null);

    }

}
