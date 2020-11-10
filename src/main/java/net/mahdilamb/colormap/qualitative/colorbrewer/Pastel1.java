package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Pastel1")
public final class Pastel1 extends CategoricalColorMap {
    public Pastel1(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(251, 180, 174));
        addColorNode(new Color(179, 205, 227));
        addColorNode(new Color(204, 235, 197));
        addColorNode(new Color(222, 203, 228));
        addColorNode(new Color(254, 217, 166));
        addColorNode(new Color(255, 255, 204));
        addColorNode(new Color(229, 216, 189));
        addColorNode(new Color(253, 218, 236));
        addColorNode(new Color(242, 242, 242));


    }

    public Pastel1() {
        this(null, null);

    }

}
