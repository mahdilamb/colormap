package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Accent")
public final class Accent extends CategoricalColorMap {
    public Accent(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(127, 201, 127);
        addColorNode(190, 174, 212);
        addColorNode(253, 192, 134);
        addColorNode(255, 255, 153);
        addColorNode(56, 108, 176);
        addColorNode(240, 2, 127);
        addColorNode(191, 91, 23);
        addColorNode(102, 102, 102);

    }

    public Accent() {
        this(null, null);

    }

}
