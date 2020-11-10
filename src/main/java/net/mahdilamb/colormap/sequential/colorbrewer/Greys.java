package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Greys")
public final class Greys extends LinearColorMap {
    public Greys(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 255, 255);
        addColorNode(240, 240, 240);
        addColorNode(217, 217, 217);
        addColorNode(189, 189, 189);
        addColorNode(150, 150, 150);
        addColorNode(115, 115, 115);
        addColorNode(82, 82, 82);
        addColorNode(37, 37, 37);
        addColorNode(0, 0, 0);

    }

    public Greys() {
        this(null, null);

    }

}
