package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(127, 201, 127),
                Color.create(190, 174, 212),
                Color.create(253, 192, 134),
                Color.create(255, 255, 153),
                Color.create(56, 108, 176),
                Color.create(240, 2, 127),
                Color.create(191, 91, 23),
                Color.create(102, 102, 102));

    }


}
