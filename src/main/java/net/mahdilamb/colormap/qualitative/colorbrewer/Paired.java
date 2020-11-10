package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Paired")
public final class Paired extends CategoricalColorMap {
    public Paired(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(166, 206, 227);
        addColorNode(31, 120, 180);
        addColorNode(178, 223, 138);
        addColorNode(51, 160, 44);
        addColorNode(251, 154, 153);
        addColorNode(227, 26, 28);
        addColorNode(253, 191, 111);
        addColorNode(255, 127, 0);
        addColorNode(202, 178, 214);
        addColorNode(106, 61, 154);
        addColorNode(255, 255, 153);
        addColorNode(177, 89, 40);


    }

    public Paired() {
        this(null, null);

    }

}
