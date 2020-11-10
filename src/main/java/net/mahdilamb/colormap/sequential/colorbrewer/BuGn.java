package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BuGn")
public final class BuGn extends LinearColorMap {
    public BuGn(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(247, 252, 253);
        addColorNode(229, 245, 249);
        addColorNode(204, 236, 230);
        addColorNode(153, 216, 201);
        addColorNode(102, 194, 164);
        addColorNode(65, 174, 118);
        addColorNode(35, 139, 69);
        addColorNode(0, 109, 44);
        addColorNode(0, 68, 27);


    }

    public BuGn() {
        this(null, null);
    }

}
