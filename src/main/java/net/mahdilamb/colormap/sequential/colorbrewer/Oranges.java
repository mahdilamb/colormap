package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Oranges")
public final class Oranges extends LinearColorMap {
    public Oranges(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(255, 245, 235);
        addColorNode(254, 230, 206);
        addColorNode(253, 208, 162);
        addColorNode(253, 174, 107);
        addColorNode(253, 141, 60);
        addColorNode(241, 105, 19);
        addColorNode(217, 72, 1);
        addColorNode(166, 54, 3);
        addColorNode(127, 39, 4);

    }

    public Oranges() {
        this(null, null);

    }

}
