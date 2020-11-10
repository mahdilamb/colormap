package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuBu")
public final class PuBu extends LinearColorMap {
    public PuBu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 247, 251);
        addColorNode(236, 231, 242);
        addColorNode(208, 209, 230);
        addColorNode(166, 189, 219);
        addColorNode(116, 169, 207);
        addColorNode(54, 144, 192);
        addColorNode(5, 112, 176);
        addColorNode(4, 90, 141);
        addColorNode(2, 56, 88);


    }

    public PuBu() {
        this(null, null);

    }

}
