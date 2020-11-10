package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "PiYG")
public final class PiYG extends LinearColorMap {
    public PiYG(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(142, 1, 82));
        addColorNode(new Color(197, 27, 125));
        addColorNode(new Color(222, 119, 174));
        addColorNode(new Color(241, 182, 218));
        addColorNode(new Color(253, 224, 239));
        addColorNode(new Color(247, 247, 247));
        addColorNode(new Color(230, 245, 208));
        addColorNode(new Color(184, 225, 134));
        addColorNode(new Color(127, 188, 65));
        addColorNode(new Color(77, 146, 33));
        addColorNode(new Color(39, 100, 25));

    }

    public PiYG() {
        this(null, null);

    }

}
