package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Pastel2")
public final class Pastel2 extends CategoricalColorMap {
    public Pastel2(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(179, 226, 205);
        addColorNode(253, 205, 172);
        addColorNode(203, 213, 232);
        addColorNode(244, 202, 228);
        addColorNode(230, 245, 201);
        addColorNode(255, 242, 174);
        addColorNode(241, 226, 204);
        addColorNode(204, 204, 204);
    }

    public Pastel2() {
        this(null, null);

    }

}
