package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;
/**
 * Tableau Tab20c
 */
@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab20")
public final class Tab20 extends CategoricalColorMap {
    /**
     * Create a colormap based on Tableau Tab20
     */
    public Tab20() {
        super(
                Color.getTableauColor("blue"),
                Color.getTableauColor("lightblue"),
                Color.getTableauColor("orange"),
                Color.getTableauColor("lightorange"),
                Color.getTableauColor("green"),
                Color.getTableauColor("lightgreen"),
                Color.getTableauColor("red"),
                Color.getTableauColor("lightred"),
                Color.getTableauColor("purple"),
                Color.getTableauColor("lightpurple"),
                Color.getTableauColor("brown"),
                Color.getTableauColor("lightbrown"),
                Color.getTableauColor("pink"),
                Color.getTableauColor("lightpink"),
                Color.getTableauColor("grey"),
                Color.getTableauColor("lightgrey"),
                Color.getTableauColor("olive"),
                Color.getTableauColor("lightolive"),
                Color.getTableauColor("aqua"),
                Color.getTableauColor("lightaqua"));
    }


}
