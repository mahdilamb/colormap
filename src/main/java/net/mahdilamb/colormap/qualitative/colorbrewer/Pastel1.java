package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 Pastel1
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Pastel1")
public final class Pastel1 extends CategoricalColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Pastel1
     */
    public Pastel1() {
        super(
                new ColorImpl(251, 180, 174),
                new ColorImpl(179, 205, 227),
                new ColorImpl(204, 235, 197),
                new ColorImpl(222, 203, 228),
                new ColorImpl(254, 217, 166),
                new ColorImpl(255, 255, 204),
                new ColorImpl(229, 216, 189),
                new ColorImpl(253, 218, 236),
                new ColorImpl(242, 242, 242));


    }


}
