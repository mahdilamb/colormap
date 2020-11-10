package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set3")
public final class Set3 extends CategoricalColorMap {
    public Set3(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(141, 211, 199);
        addColorNode(255, 255, 179);
        addColorNode(190, 186, 218);
        addColorNode(251, 128, 114);
        addColorNode(128, 177, 211);
        addColorNode(253, 180, 98);
        addColorNode(179, 222, 105);
        addColorNode(252, 205, 229);
        addColorNode(217, 217, 217);
        addColorNode(188, 128, 189);
        addColorNode(204, 235, 197);
        addColorNode(255, 237, 111);


    }

    public Set3() {
        this(null, null);

    }

}
