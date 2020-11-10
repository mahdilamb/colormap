package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuBuGn")
public final class PuBuGn extends LinearColorMap {
    public PuBuGn(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 247, 251);
        addColorNode(236, 226, 240);
        addColorNode(208, 209, 230);
        addColorNode(166, 189, 219);
        addColorNode(103, 169, 207);
        addColorNode(54, 144, 192);
        addColorNode(2, 129, 138);
        addColorNode(1, 108, 89);
        addColorNode(1, 70, 54);


    }

    public PuBuGn() {
        this(null, null);

    }

}
