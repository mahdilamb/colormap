package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Dark2
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Dark2")
public final class Dark2 extends CategoricalColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 Dark2
     */
    public Dark2() {
        super(Color.create(27, 158, 119),
                Color.create(217, 95, 2),
                Color.create(117, 112, 179),
                Color.create(231, 41, 138),
                Color.create(102, 166, 30),
                Color.create(230, 171, 2),
                Color.create(166, 118, 29),
                Color.create(102, 102, 102));

    }

}
