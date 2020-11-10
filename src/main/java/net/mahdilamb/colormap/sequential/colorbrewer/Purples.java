package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Purples")
public final class Purples extends LinearColorMap {
    public Purples(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(252, 251, 253));
        addColorNode(new Color(239, 237, 245));
        addColorNode(new Color(218, 218, 235));
        addColorNode(new Color(188, 189, 220));
        addColorNode(new Color(158, 154, 200));
        addColorNode(new Color(128, 125, 186));
        addColorNode(new Color(106, 81, 163));
        addColorNode(new Color(84, 39, 143));
        addColorNode(new Color(63, 0, 125));

    }

    public Purples() {
        this(null, null);

    }

}
