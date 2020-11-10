package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlGnBu")
public final class YlGnBu extends LinearColorMap {
    public YlGnBu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 255, 217));
        addColorNode(new Color(237, 248, 177));
        addColorNode(new Color(199, 233, 180));
        addColorNode(new Color(127, 205, 187));
        addColorNode(new Color(65, 182, 196));
        addColorNode(new Color(29, 145, 192));
        addColorNode(new Color(34, 94, 168));
        addColorNode(new Color(37, 52, 148));
        addColorNode(new Color(8, 29, 88));

    }

    public YlGnBu() {
        this(null, null);

    }

}
