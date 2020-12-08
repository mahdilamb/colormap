package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Set3
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Set2")
public final class Set2 extends CategoricalColormap {


    /**
     * Create a colormap based on Colorbrewer 2.0 Set2
     */
    public Set2() {
        super(
                Color.create(102, 194, 165),
                Color.create(252, 141, 98),
                Color.create(141, 160, 203),
                Color.create(231, 138, 195),
                Color.create(166, 216, 84),
                Color.create(255, 217, 47),
                Color.create(229, 196, 148),
                Color.create(179, 179, 179));

    }


}
