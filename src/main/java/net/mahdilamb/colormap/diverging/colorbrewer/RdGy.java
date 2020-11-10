package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdGy")
public final class RdGy extends LinearColorMap {
    public RdGy(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(103, 0, 31);
        addColorNode(178, 24, 43);
        addColorNode(214, 96, 77);
        addColorNode(244, 165, 130);
        addColorNode(253, 219, 199);
        addColorNode(255, 255, 255);
        addColorNode(224, 224, 224);
        addColorNode(186, 186, 186);
        addColorNode(135, 135, 135);
        addColorNode(77, 77, 77);
        addColorNode(26, 26, 26);
    }

    public RdGy() {
        this(null, null);

    }

}
