package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set1")
public final class Set1 extends CategoricalColorMap {
    public Set1(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(228, 26, 28);
        addColorNode(55, 126, 184);
        addColorNode(77, 175, 74);
        addColorNode(152, 78, 163);
        addColorNode(255, 127, 0);
        addColorNode(255, 255, 51);
        addColorNode(166, 86, 40);
        addColorNode(247, 129, 191);
        addColorNode(153, 153, 153);


    }

    public Set1() {
        this(null, null);

    }

}
