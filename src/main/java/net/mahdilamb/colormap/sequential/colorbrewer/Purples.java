package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Purples")
public final class Purples extends LinearColorMap {
    public Purples(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(252, 251, 253);
        addColorNode(239, 237, 245);
        addColorNode(218, 218, 235);
        addColorNode(188, 189, 220);
        addColorNode(158, 154, 200);
        addColorNode(128, 125, 186);
        addColorNode(106, 81, 163);
        addColorNode(84, 39, 143);
        addColorNode(63, 0, 125);

    }

    public Purples() {
        this(null, null);

    }

}
