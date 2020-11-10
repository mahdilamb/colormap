package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlOrBr")
public final class YlOrBr extends LinearColorMap {
    public YlOrBr(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 255, 229);
        addColorNode(255, 247, 188);
        addColorNode(254, 227, 145);
        addColorNode(254, 196, 79);
        addColorNode(254, 153, 41);
        addColorNode(236, 112, 20);
        addColorNode(204, 76, 2);
        addColorNode(153, 52, 4);
        addColorNode(102, 37, 6);

    }

    public YlOrBr() {
        this(null, null);

    }

}
