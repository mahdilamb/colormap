package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Reds")
public final class Reds extends LinearColorMap {
    public Reds(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 245, 240));
        addColorNode(new Color(254, 224, 210));
        addColorNode(new Color(252, 187, 161));
        addColorNode(new Color(252, 146, 114));
        addColorNode(new Color(251, 106, 74));
        addColorNode(new Color(239, 59, 44));
        addColorNode(new Color(203, 24, 29));
        addColorNode(new Color(165, 15, 21));
        addColorNode(new Color(103, 0, 13));

    }

    public Reds() {
        this(null, null);

    }

}
