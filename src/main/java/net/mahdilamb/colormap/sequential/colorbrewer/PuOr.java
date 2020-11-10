package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PuOr")
public final class PuOr extends LinearColorMap {
    public PuOr(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(127, 59, 8);
        addColorNode(179, 88, 6);
        addColorNode(224, 130, 20);
        addColorNode(253, 184, 99);
        addColorNode(254, 224, 182);
        addColorNode(247, 247, 247);
        addColorNode(216, 218, 235);
        addColorNode(178, 171, 210);
        addColorNode(128, 115, 172);
        addColorNode(84, 39, 136);
        addColorNode(45, 0, 75);


    }

    public PuOr() {
        this(null, null);

    }

}
