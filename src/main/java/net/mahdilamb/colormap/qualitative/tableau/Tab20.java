package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Tableau Tab20c
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Tab20")
public final class Tab20 extends CategoricalColormap {
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
