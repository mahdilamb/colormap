package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Accent")
public final class Accent extends CategoricalColorMap {
    public Accent(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(127, 201, 127));
        addColorNode(new Color(190, 174, 212));
        addColorNode(new Color(253, 192, 134));
        addColorNode(new Color(255, 255, 153));
        addColorNode(new Color(56, 108, 176));
        addColorNode(new Color(240, 2, 127));
        addColorNode(new Color(191, 91, 23));
        addColorNode(new Color(102, 102, 102));

    }

    public Accent() {
        this(null, null);

    }

}
