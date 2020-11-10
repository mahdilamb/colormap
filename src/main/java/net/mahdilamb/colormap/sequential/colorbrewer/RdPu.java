package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "RdPu")
public final class RdPu extends LinearColorMap {
    public RdPu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(255, 247, 243));
        addColorNode(new Color(253, 224, 221));
        addColorNode(new Color(252, 197, 192));
        addColorNode(new Color(250, 159, 181));
        addColorNode(new Color(247, 104, 161));
        addColorNode(new Color(221, 52, 151));
        addColorNode(new Color(174, 1, 126));
        addColorNode(new Color(122, 1, 119));
        addColorNode(new Color(73, 0, 106));


    }

    public RdPu() {
        this(null, null);

    }

}
