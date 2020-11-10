package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab10")
public final class Tab10 extends CategoricalColorMap {
    public Tab10(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode("tab:blue");
        addColorNode("tab:orange");
        addColorNode("tab:green");
        addColorNode("tab:red");
        addColorNode("tab:purple");
        addColorNode("tab:brown");
        addColorNode("tab:pink");
        addColorNode("tab:grey");
        addColorNode("tab:olive");
        addColorNode("tab:aqua");
    }

    public Tab10() {
        this(null, null);

    }

}
