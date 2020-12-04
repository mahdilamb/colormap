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
                Color.getTableau("blue"),
                Color.getTableau("lightblue"),
                Color.getTableau("orange"),
                Color.getTableau("lightorange"),
                Color.getTableau("green"),
                Color.getTableau("lightgreen"),
                Color.getTableau("red"),
                Color.getTableau("lightred"),
                Color.getTableau("purple"),
                Color.getTableau("lightpurple"),
                Color.getTableau("brown"),
                Color.getTableau("lightbrown"),
                Color.getTableau("pink"),
                Color.getTableau("lightpink"),
                Color.getTableau("grey"),
                Color.getTableau("lightgrey"),
                Color.getTableau("olive"),
                Color.getTableau("lightolive"),
                Color.getTableau("aqua"),
                Color.getTableau("lightaqua"));
    }


}
