package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab20")
public final class Tab20 extends CategoricalColorMap {
    public Tab20(Double lowValue, Double highValue) {
        super(lowValue, highValue);
        addColorNode(Color.getTableauColor("blue"));
        addColorNode(Color.getTableauColor("lightblue"));
        addColorNode(Color.getTableauColor("orange"));
        addColorNode(Color.getTableauColor("lightorange"));
        addColorNode(Color.getTableauColor("green"));
        addColorNode(Color.getTableauColor("lightgreen"));
        addColorNode(Color.getTableauColor("red"));
        addColorNode(Color.getTableauColor("lightred"));
        addColorNode(Color.getTableauColor("purple"));
        addColorNode(Color.getTableauColor("lightpurple"));
        addColorNode(Color.getTableauColor("brown"));
        addColorNode(Color.getTableauColor("lightbrown"));
        addColorNode(Color.getTableauColor("pink"));
        addColorNode(Color.getTableauColor("lightpink"));
        addColorNode(Color.getTableauColor("grey"));
        addColorNode(Color.getTableauColor("lightgrey"));
        addColorNode(Color.getTableauColor("olive"));
        addColorNode(Color.getTableauColor("lightolive"));
        addColorNode(Color.getTableauColor("aqua"));
        addColorNode(Color.getTableauColor("lightaqua"));
    }

    public Tab20() {
        this(null, null);

    }

}
