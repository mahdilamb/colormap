package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colorbrewer 2.0 Accent
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Accent")
public final class Accent extends CategoricalColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Accent
     */
    public Accent() {
        super(
                new ColorImpl(127, 201, 127),
                new ColorImpl(190, 174, 212),
                new ColorImpl(253, 192, 134),
                new ColorImpl(255, 255, 153),
                new ColorImpl(56, 108, 176),
                new ColorImpl(240, 2, 127),
                new ColorImpl(191, 91, 23),
                new ColorImpl(102, 102, 102));

    }


}
