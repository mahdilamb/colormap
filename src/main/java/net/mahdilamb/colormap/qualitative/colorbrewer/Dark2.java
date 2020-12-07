package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 Dark2
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Dark2")
public final class Dark2 extends CategoricalColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Dark2
     */
    public Dark2() {
        super(
                new ColorImpl(27, 158, 119),
                new ColorImpl(217, 95, 2),
                new ColorImpl(117, 112, 179),
                new ColorImpl(231, 41, 138),
                new ColorImpl(102, 166, 30),
                new ColorImpl(230, 171, 2),
                new ColorImpl(166, 118, 29),
                new ColorImpl(102, 102, 102));

    }

}
