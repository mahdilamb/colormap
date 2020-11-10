package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdYlBu")
public final class RdYlBu extends LinearColorMap {
    public RdYlBu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(165, 0, 38);
        addColorNode(215, 48, 39);
        addColorNode(244, 109, 67);
        addColorNode(253, 174, 97);
        addColorNode(254, 224, 144);
        addColorNode(255, 255, 191);
        addColorNode(224, 243, 248);
        addColorNode(171, 217, 233);
        addColorNode(116, 173, 209);
        addColorNode(69, 117, 180);
        addColorNode(49, 54, 149);

    }

    public RdYlBu() {
        this(null, null);

    }

}
