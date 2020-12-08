package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Set1
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Set1")
public final class Set1 extends CategoricalColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Set1
     */
    public Set1() {
        super(Color.create(228, 26, 28),
                Color.create(55, 126, 184),
                Color.create(77, 175, 74),
                Color.create(152, 78, 163),
                Color.create(255, 127, 0),
                Color.create(255, 255, 51),
                Color.create(166, 86, 40),
                Color.create(247, 129, 191),
                Color.create(153, 153, 153));


    }

}
