package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set3")
public final class Set3 extends CategoricalColorMap {
    public Set3(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(141, 211, 199));
        addColorNode(new Color(255, 255, 179));
        addColorNode(new Color(190, 186, 218));
        addColorNode(new Color(251, 128, 114));
        addColorNode(new Color(128, 177, 211));
        addColorNode(new Color(253, 180, 98));
        addColorNode(new Color(179, 222, 105));
        addColorNode(new Color(252, 205, 229));
        addColorNode(new Color(217, 217, 217));
        addColorNode(new Color(188, 128, 189));
        addColorNode(new Color(204, 235, 197));
        addColorNode(new Color(255, 237, 111));

    }

    public Set3() {
        this(null, null);

    }

}
