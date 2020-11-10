package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Greens")
public final class Greens extends LinearColorMap {
    public Greens(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(247, 252, 245);
        addColorNode(229, 245, 224);
        addColorNode(199, 233, 192);
        addColorNode(161, 217, 155);
        addColorNode(116, 196, 118);
        addColorNode(65, 171, 93);
        addColorNode(35, 139, 69);
        addColorNode(0, 109, 44);
        addColorNode(0, 68, 27);

    }

    public Greens() {
        this(null, null);

    }

}
