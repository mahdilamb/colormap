package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "RdPu")
public final class RdPu extends LinearColorMap {
    public RdPu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 247, 243);
        addColorNode(253, 224, 221);
        addColorNode(252, 197, 192);
        addColorNode(250, 159, 181);
        addColorNode(247, 104, 161);
        addColorNode(221, 52, 151);
        addColorNode(174, 1, 126);
        addColorNode(122, 1, 119);
        addColorNode(73, 0, 106);


    }

    public RdPu() {
        this(null, null);

    }

}
