package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BuPu")
public final class BuPu extends LinearColorMap {
    public BuPu(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(new Color(247, 252, 253));
        addColorNode(new Color(224, 236, 244));
        addColorNode(new Color(191, 211, 230));
        addColorNode(new Color(158, 188, 218));
        addColorNode(new Color(140, 150, 198));
        addColorNode(new Color(140, 107, 177));
        addColorNode(new Color(136, 65, 157));
        addColorNode(new Color(129, 15, 124));
        addColorNode(new Color(77, 0, 75));

    }

    public BuPu() {
        this(null, null);

    }

}
