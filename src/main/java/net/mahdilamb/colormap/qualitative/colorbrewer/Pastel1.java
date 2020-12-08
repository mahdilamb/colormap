package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Pastel1
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Pastel1")
public final class Pastel1 extends CategoricalColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Pastel1
     */
    public Pastel1() {
        super(Color.create(251, 180, 174),
                Color.create(179, 205, 227),
                Color.create(204, 235, 197),
                Color.create(222, 203, 228),
                Color.create(254, 217, 166),
                Color.create(255, 255, 204),
                Color.create(229, 216, 189),
                Color.create(253, 218, 236),
                Color.create(242, 242, 242));


    }


}
