package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlOrRd")
public final class YlOrRd extends LinearColorMap {
    public YlOrRd(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 255, 204);
        addColorNode(255, 237, 160);
        addColorNode(254, 217, 118);
        addColorNode(254, 178, 76);
        addColorNode(253, 141, 60);
        addColorNode(252, 78, 42);
        addColorNode(227, 26, 28);
        addColorNode(189, 0, 38);
        addColorNode(128, 0, 38);

    }

    public YlOrRd() {
        this(null, null);

    }

}
