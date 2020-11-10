package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "Spectral")
public final class Spectral extends LinearColorMap {
    public Spectral(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(158, 1, 66);
        addColorNode(213, 62, 79);
        addColorNode(244, 109, 67);
        addColorNode(253, 174, 97);
        addColorNode(254, 224, 139);
        addColorNode(255, 255, 191);
        addColorNode(230, 245, 152);
        addColorNode(171, 221, 164);
        addColorNode(102, 194, 165);
        addColorNode(50, 136, 189);
        addColorNode(94, 79, 162);

    }

    public Spectral() {
        this(null, null);

    }

}
