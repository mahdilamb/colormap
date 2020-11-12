package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "Spectral")
public final class Spectral extends LinearColorMap {
    public Spectral() {
        super(
                new Color(158, 1, 66),
                new Color(213, 62, 79),
                new Color(244, 109, 67),
                new Color(253, 174, 97),
                new Color(254, 224, 139),
                new Color(255, 255, 191),
                new Color(230, 245, 152),
                new Color(171, 221, 164),
                new Color(102, 194, 165),
                new Color(50, 136, 189),
                new Color(94, 79, 162));

    }


}
