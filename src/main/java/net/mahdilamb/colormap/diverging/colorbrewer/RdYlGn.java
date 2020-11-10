package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "RdYlGn")
public final class RdYlGn extends LinearColorMap {
    public RdYlGn(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(165, 0, 38);
        addColorNode(215, 48, 39);
        addColorNode(244, 109, 67);
        addColorNode(253, 174, 97);
        addColorNode(254, 224, 139);
        addColorNode(255, 255, 191);
        addColorNode(217, 239, 139);
        addColorNode(166, 217, 106);
        addColorNode(102, 189, 99);
        addColorNode(26, 152, 80);
        addColorNode(0, 104, 55);

    }

    public RdYlGn() {
        this(null, null);

    }

}
