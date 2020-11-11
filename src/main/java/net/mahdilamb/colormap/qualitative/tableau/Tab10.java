package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab10")
public final class Tab10 extends CategoricalColorMap {
    public Tab10(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                Color.getTableauColor("blue"),
                Color.getTableauColor("orange"),
                Color.getTableauColor("green"),
                Color.getTableauColor("red"),
                Color.getTableauColor("purple"),
                Color.getTableauColor("brown"),
                Color.getTableauColor("pink"),
                Color.getTableauColor("grey"),
                Color.getTableauColor("olive"),
                Color.getTableauColor("aqua"));
    }


}
