package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.DIVERGING, name = "BrBG")
public final class BrBG extends LinearColorMap {
    public BrBG(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(84, 48, 5);
        addColorNode(140, 81, 10);
        addColorNode(191, 129, 45);
        addColorNode(223, 194, 125);
        addColorNode(246, 232, 195);
        addColorNode(245, 245, 245);
        addColorNode(199, 234, 229);
        addColorNode(128, 205, 193);
        addColorNode(53, 151, 143);
        addColorNode(1, 102, 94);
        addColorNode(0, 60, 48);
    }

    public BrBG() {
        this(null, null);

    }

}
