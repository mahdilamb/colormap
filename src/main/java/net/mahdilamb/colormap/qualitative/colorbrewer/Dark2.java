package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Dark2")
public final class Dark2 extends CategoricalColorMap {
    public Dark2(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(27, 158, 119));
        addColorNode(new Color(217, 95, 2));
        addColorNode(new Color(117, 112, 179));
        addColorNode(new Color(231, 41, 138));
        addColorNode(new Color(102, 166, 30));
        addColorNode(new Color(230, 171, 2));
        addColorNode(new Color(166, 118, 29));
        addColorNode(new Color(102, 102, 102));

    }

    public Dark2() {
        this(null, null);

    }

}
