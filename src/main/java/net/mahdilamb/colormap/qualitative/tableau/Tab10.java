package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Tableau Tab10
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Tab10")
public final class Tab10 extends CategoricalColormap {
    /**
     * Create a colormap based on Tableau Tab10
     */
    public Tab10() {
        super(
                Color.getTableau("blue"),
                Color.getTableau("orange"),
                Color.getTableau("green"),
                Color.getTableau("red"),
                Color.getTableau("purple"),
                Color.getTableau("brown"),
                Color.getTableau("pink"),
                Color.getTableau("grey"),
                Color.getTableau("olive"),
                Color.getTableau("aqua"));
    }


}
