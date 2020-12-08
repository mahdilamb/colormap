package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Pastel2
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Pastel2")
public final class Pastel2 extends CategoricalColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Pastel2
     */
    public Pastel2() {
        super(
                Color.create(179, 226, 205),
                Color.create(253, 205, 172),
                Color.create(203, 213, 232),
                Color.create(244, 202, 228),
                Color.create(230, 245, 201),
                Color.create(255, 242, 174),
                Color.create(241, 226, 204),
                Color.create(204, 204, 204));
    }

}
