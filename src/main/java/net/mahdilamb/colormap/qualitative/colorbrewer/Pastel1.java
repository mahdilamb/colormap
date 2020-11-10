package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Pastel1")
public final class Pastel1 extends CategoricalColorMap {
    public Pastel1(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(251, 180, 174);
        addColorNode(179, 205, 227);
        addColorNode(204, 235, 197);
        addColorNode(222, 203, 228);
        addColorNode(254, 217, 166);
        addColorNode(255, 255, 204);
        addColorNode(229, 216, 189);
        addColorNode(253, 218, 236);
        addColorNode(242, 242, 242);


    }

    public Pastel1() {
        this(null, null);

    }

}
