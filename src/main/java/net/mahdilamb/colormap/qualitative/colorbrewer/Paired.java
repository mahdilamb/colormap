package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Paired")
public final class Paired extends CategoricalColorMap {
    public Paired(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(166, 206, 227));
        addColorNode(new Color(31, 120, 180));
        addColorNode(new Color(178, 223, 138));
        addColorNode(new Color(51, 160, 44));
        addColorNode(new Color(251, 154, 153));
        addColorNode(new Color(227, 26, 28));
        addColorNode(new Color(253, 191, 111));
        addColorNode(new Color(255, 127, 0));
        addColorNode(new Color(202, 178, 214));
        addColorNode(new Color(106, 61, 154));
        addColorNode(new Color(255, 255, 153));
        addColorNode(new Color(177, 89, 40));


    }

    public Paired() {
        this(null, null);

    }

}
