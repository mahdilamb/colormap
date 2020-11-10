package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Dark2")
public final class Dark2 extends CategoricalColorMap {
    public Dark2(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode(27, 158, 119);
        addColorNode(217, 95, 2);
        addColorNode(117, 112, 179);
        addColorNode(231, 41, 138);
        addColorNode(102, 166, 30);
        addColorNode(230, 171, 2);
        addColorNode(166, 118, 29);
        addColorNode(102, 102, 102);

    }

    public Dark2() {
        this(null, null);

    }

}
