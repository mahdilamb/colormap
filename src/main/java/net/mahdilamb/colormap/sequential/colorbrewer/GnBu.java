package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "GnBu")
public final class GnBu extends LinearColorMap {
    public GnBu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(247, 252, 240));
        addColorNode(new Color(224, 243, 219));
        addColorNode(new Color(204, 235, 197));
        addColorNode(new Color(168, 221, 181));
        addColorNode(new Color(123, 204, 196));
        addColorNode(new Color(78, 179, 211));
        addColorNode(new Color(43, 140, 190));
        addColorNode(new Color(8, 104, 172));
        addColorNode(new Color(8, 64, 129));


    }

    public GnBu() {
        this(null, null);

    }

}
