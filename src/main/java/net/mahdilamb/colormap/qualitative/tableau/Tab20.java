package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab20")
public final class Tab20 extends CategoricalColorMap {
    public Tab20(Float lowValue, Float highValue) {
        super(lowValue, highValue);
        addColorNode("tab:blue");
        addColorNode("tab:lightblue");
        addColorNode("tab:orange");
        addColorNode("tab:lightorange");
        addColorNode("tab:green");
        addColorNode("tab:lightgreen");
        addColorNode("tab:red");
        addColorNode("tab:lightred");
        addColorNode("tab:purple");
        addColorNode("tab:lightpurple");
        addColorNode("tab:brown");
        addColorNode("tab:lightbrown");
        addColorNode("tab:pink");
        addColorNode("tab:lightpink");
        addColorNode("tab:grey");
        addColorNode("tab:lightgrey");
        addColorNode("tab:olive");
        addColorNode("tab:lightolive");
        addColorNode("tab:aqua");
        addColorNode("tab:lightaqua");
    }

    public Tab20() {
        this(null, null);

    }

}
