package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 Paired
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Paired")
public final class Paired extends CategoricalColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Paired
     */
    public Paired() {
        super(
                new ColorImpl(166, 206, 227),
                new ColorImpl(31, 120, 180),
                new ColorImpl(178, 223, 138),
                new ColorImpl(51, 160, 44),
                new ColorImpl(251, 154, 153),
                new ColorImpl(227, 26, 28),
                new ColorImpl(253, 191, 111),
                new ColorImpl(255, 127, 0),
                new ColorImpl(202, 178, 214),
                new ColorImpl(106, 61, 154),
                new ColorImpl(255, 255, 153),
                new ColorImpl(177, 89, 40));


    }

}
