package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "YlGnBu")
public final class YlGnBu extends LinearColorMap {
    public YlGnBu(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 255, 217);
        addColorNode(237, 248, 177);
        addColorNode(199, 233, 180);
        addColorNode(127, 205, 187);
        addColorNode(65, 182, 196);
        addColorNode(29, 145, 192);
        addColorNode(34, 94, 168);
        addColorNode(37, 52, 148);
        addColorNode(8, 29, 88);

    }

    public YlGnBu() {
        this(null, null);

    }

}
