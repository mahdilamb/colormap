package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Oranges")
public final class Oranges extends LinearColorMap {
    public Oranges(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 245, 235));
        addColorNode(new Color(254, 230, 206));
        addColorNode(new Color(253, 208, 162));
        addColorNode(new Color(253, 174, 107));
        addColorNode(new Color(253, 141, 60));
        addColorNode(new Color(241, 105, 19));
        addColorNode(new Color(217, 72, 1));
        addColorNode(new Color(166, 54, 3));
        addColorNode(new Color(127, 39, 4));

    }

    public Oranges() {
        this(null, null);

    }

}
