package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Tableau Tab10
 */
@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab10")
public final class Tab10 extends CategoricalColorMap {
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
