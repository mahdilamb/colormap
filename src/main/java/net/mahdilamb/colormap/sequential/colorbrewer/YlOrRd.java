package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlOrRd")
public final class YlOrRd extends LinearColorMap {
    public YlOrRd() {
        super(
                new Color(255, 255, 204),
                new Color(255, 237, 160),
                new Color(254, 217, 118),
                new Color(254, 178, 76),
                new Color(253, 141, 60),
                new Color(252, 78, 42),
                new Color(227, 26, 28),
                new Color(189, 0, 38),
                new Color(128, 0, 38));

    }

}
