package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlOrRd")
public final class YlOrRd extends LinearColorMap {
    public YlOrRd(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 255, 204));
        addColorNode(new Color(255, 237, 160));
        addColorNode(new Color(254, 217, 118));
        addColorNode(new Color(254, 178, 76));
        addColorNode(new Color(253, 141, 60));
        addColorNode(new Color(252, 78, 42));
        addColorNode(new Color(227, 26, 28));
        addColorNode(new Color(189, 0, 38));
        addColorNode(new Color(128, 0, 38));

    }

    public YlOrRd() {
        this(null, null);

    }

}
