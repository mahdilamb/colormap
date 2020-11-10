package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "OrRd")
public final class OrRd extends LinearColorMap {
    public OrRd(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 247, 236);
        addColorNode(254, 232, 200);
        addColorNode(253, 212, 158);
        addColorNode(253, 187, 132);
        addColorNode(252, 141, 89);
        addColorNode(239, 101, 72);
        addColorNode(215, 48, 31);
        addColorNode(179, 0, 0);
        addColorNode(127, 0, 0);


    }

    public OrRd() {
        this(null, null);

    }

}
