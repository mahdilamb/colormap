package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuRd")
public final class PuRd extends LinearColorMap {
    public PuRd(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(247, 244, 249);
        addColorNode(231, 225, 239);
        addColorNode(212, 185, 218);
        addColorNode(201, 148, 199);
        addColorNode(223, 101, 176);
        addColorNode(231, 41, 138);
        addColorNode(206, 18, 86);
        addColorNode(152, 0, 67);
        addColorNode(103, 0, 31);


    }

    public PuRd() {
        this(null, null);

    }

}
