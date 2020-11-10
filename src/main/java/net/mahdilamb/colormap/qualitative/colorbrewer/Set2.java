package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set2")
public final class Set2 extends CategoricalColorMap {
    public Set2(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(102, 194, 165);
        addColorNode(252, 141, 98);
        addColorNode(141, 160, 203);
        addColorNode(231, 138, 195);
        addColorNode(166, 216, 84);
        addColorNode(255, 217, 47);
        addColorNode(229, 196, 148);
        addColorNode(179, 179, 179);

    }

    public Set2() {
        this(null, null);

    }

}
