package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlGn")
public final class YlGn extends LinearColorMap {
    public YlGn(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 255, 229);
        addColorNode(247, 252, 185);
        addColorNode(217, 240, 163);
        addColorNode(173, 221, 142);
        addColorNode(120, 198, 121);
        addColorNode(65, 171, 93);
        addColorNode(35, 132, 67);
        addColorNode(0, 104, 55);
        addColorNode(0, 69, 41);

    }

    public YlGn() {
        this(null, null);

    }

}
