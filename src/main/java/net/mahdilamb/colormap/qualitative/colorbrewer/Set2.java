package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
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
                new ColorImpl(102, 194, 165),
                new ColorImpl(252, 141, 98),
                new ColorImpl(141, 160, 203),
                new ColorImpl(231, 138, 195),
                new ColorImpl(166, 216, 84),
                new ColorImpl(255, 217, 47),
                new ColorImpl(229, 196, 148),
                new ColorImpl(179, 179, 179));

    }


}
