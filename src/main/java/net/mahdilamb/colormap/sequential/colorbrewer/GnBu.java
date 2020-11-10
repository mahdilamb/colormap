package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "GnBu")
public final class GnBu extends LinearColorMap {
    public GnBu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(247, 252, 240);
        addColorNode(224, 243, 219);
        addColorNode(204, 235, 197);
        addColorNode(168, 221, 181);
        addColorNode(123, 204, 196);
        addColorNode(78, 179, 211);
        addColorNode(43, 140, 190);
        addColorNode(8, 104, 172);
        addColorNode(8, 64, 129);


    }

    public GnBu() {
        this(null, null);

    }

}
