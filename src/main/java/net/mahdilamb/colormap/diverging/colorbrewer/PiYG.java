package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PiYG")
public final class PiYG extends LinearColorMap {
    public PiYG(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(142, 1, 82);
        addColorNode(197, 27, 125);
        addColorNode(222, 119, 174);
        addColorNode(241, 182, 218);
        addColorNode(253, 224, 239);
        addColorNode(247, 247, 247);
        addColorNode(230, 245, 208);
        addColorNode(184, 225, 134);
        addColorNode(127, 188, 65);
        addColorNode(77, 146, 33);
        addColorNode(39, 100, 25);

    }

    public PiYG() {
        this(null, null);

    }

}
