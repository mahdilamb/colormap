package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 Set1
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Set1")
public final class Set1 extends CategoricalColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Set1
     */
    public Set1() {
        super(
                new ColorImpl(228, 26, 28),
                new ColorImpl(55, 126, 184),
                new ColorImpl(77, 175, 74),
                new ColorImpl(152, 78, 163),
                new ColorImpl(255, 127, 0),
                new ColorImpl(255, 255, 51),
                new ColorImpl(166, 86, 40),
                new ColorImpl(247, 129, 191),
                new ColorImpl(153, 153, 153));


    }

}
