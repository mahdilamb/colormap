package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
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
                new ColorImpl(179, 226, 205),
                new ColorImpl(253, 205, 172),
                new ColorImpl(203, 213, 232),
                new ColorImpl(244, 202, 228),
                new ColorImpl(230, 245, 201),
                new ColorImpl(255, 242, 174),
                new ColorImpl(241, 226, 204),
                new ColorImpl(204, 204, 204));
    }

}
