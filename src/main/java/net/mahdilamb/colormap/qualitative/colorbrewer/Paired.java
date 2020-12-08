package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(166, 206, 227),
                Color.create(31, 120, 180),
                Color.create(178, 223, 138),
                Color.create(51, 160, 44),
                Color.create(251, 154, 153),
                Color.create(227, 26, 28),
                Color.create(253, 191, 111),
                Color.create(255, 127, 0),
                Color.create(202, 178, 214),
                Color.create(106, 61, 154),
                Color.create(255, 255, 153),
                Color.create(177, 89, 40));


    }

}
