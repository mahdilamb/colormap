package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;
/**
 * Colorbrewer 2.0 Set1
 */
@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set1")
public final class Set1 extends CategoricalColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Set1
     */
    public Set1() {
        super(
                new Color(228, 26, 28),
                new Color(55, 126, 184),
                new Color(77, 175, 74),
                new Color(152, 78, 163),
                new Color(255, 127, 0),
                new Color(255, 255, 51),
                new Color(166, 86, 40),
                new Color(247, 129, 191),
                new Color(153, 153, 153));


    }

}
