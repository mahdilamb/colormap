package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab10")
public final class Tab10 extends CategoricalColorMap {
    public Tab10(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(Color.getTableauColor("blue"));
        addColorNode(Color.getTableauColor("orange"));
        addColorNode(Color.getTableauColor("green"));
        addColorNode(Color.getTableauColor("red"));
        addColorNode(Color.getTableauColor("purple"));
        addColorNode(Color.getTableauColor("brown"));
        addColorNode(Color.getTableauColor("pink"));
        addColorNode(Color.getTableauColor("grey"));
        addColorNode(Color.getTableauColor("olive"));
        addColorNode(Color.getTableauColor("aqua"));
    }

    public Tab10() {
        this(null, null);

    }

}
