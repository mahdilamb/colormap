package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BuPu")
public final class BuPu extends LinearColorMap {
    public BuPu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(247, 252, 253);
        addColorNode(224, 236, 244);
        addColorNode(191, 211, 230);
        addColorNode(158, 188, 218);
        addColorNode(140, 150, 198);
        addColorNode(140, 107, 177);
        addColorNode(136, 65, 157);
        addColorNode(129, 15, 124);
        addColorNode(77, 0, 75);

    }

    public BuPu() {
        this(null, null);

    }

}
