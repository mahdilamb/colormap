package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Reds")
public final class Reds extends LinearColorMap {
    public Reds(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 245, 240);
        addColorNode(254, 224, 210);
        addColorNode(252, 187, 161);
        addColorNode(252, 146, 114);
        addColorNode(251, 106, 74);
        addColorNode(239, 59, 44);
        addColorNode(203, 24, 29);
        addColorNode(165, 15, 21);
        addColorNode(103, 0, 13);

    }

    public Reds() {
        this(null, null);

    }

}
