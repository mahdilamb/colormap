package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Blues")
public final class Blues extends LinearColorMap {
    public Blues(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(247, 251, 255);
        addColorNode(222, 235, 247);
        addColorNode(198, 219, 239);
        addColorNode(158, 202, 225);
        addColorNode(107, 174, 214);
        addColorNode(66, 146, 198);
        addColorNode(33, 113, 181);
        addColorNode(8, 81, 156);
        addColorNode(8, 48, 107);

    }

    public Blues() {
        this(null, null);
    }

}
