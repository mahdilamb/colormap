package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Pastel2")
public final class Pastel2 extends CategoricalColorMap {
    public Pastel2(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(179, 226, 205));
        addColorNode(new Color(253, 205, 172));
        addColorNode(new Color(203, 213, 232));
        addColorNode(new Color(244, 202, 228));
        addColorNode(new Color(230, 245, 201));
        addColorNode(new Color(255, 242, 174));
        addColorNode(new Color(241, 226, 204));
        addColorNode(new Color(204, 204, 204));
    }

    public Pastel2() {
        this(null, null);

    }

}
