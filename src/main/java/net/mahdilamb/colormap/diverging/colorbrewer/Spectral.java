package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "Spectral")
public final class Spectral extends LinearColorMap {
    public Spectral(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(158, 1, 66));
        addColorNode(new Color(213, 62, 79));
        addColorNode(new Color(244, 109, 67));
        addColorNode(new Color(253, 174, 97));
        addColorNode(new Color(254, 224, 139));
        addColorNode(new Color(255, 255, 191));
        addColorNode(new Color(230, 245, 152));
        addColorNode(new Color(171, 221, 164));
        addColorNode(new Color(102, 194, 165));
        addColorNode(new Color(50, 136, 189));
        addColorNode(new Color(94, 79, 162));

    }

    public Spectral() {
        this(null, null);

    }

}
