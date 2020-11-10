package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdBu")
public final class RdBu extends LinearColorMap {
    public RdBu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(103, 0, 31);
        addColorNode(178, 24, 43);
        addColorNode(214, 96, 77);
        addColorNode(244, 165, 130);
        addColorNode(253, 219, 199);
        addColorNode(247, 247, 247);
        addColorNode(209, 229, 240);
        addColorNode(146, 197, 222);
        addColorNode(67, 147, 195);
        addColorNode(33, 102, 172);
        addColorNode(5, 48, 97);


    }

    public RdBu() {
        this(null, null);

    }

}
