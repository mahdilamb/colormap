package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PRGn")
public final class PRGn extends LinearColorMap {
    public PRGn(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(64, 0, 75);
        addColorNode(118, 42, 131);
        addColorNode(153, 112, 171);
        addColorNode(194, 165, 207);
        addColorNode(231, 212, 232);
        addColorNode(247, 247, 247);
        addColorNode(217, 240, 211);
        addColorNode(166, 219, 160);
        addColorNode(90, 174, 97);
        addColorNode(27, 120, 55);
        addColorNode(0, 68, 27);


    }

    public PRGn() {
        this(null, null);

    }

}
