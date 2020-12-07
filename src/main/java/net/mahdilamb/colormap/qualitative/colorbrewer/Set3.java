package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Colorbrewer 2.0 Set3
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Set3")
public final class Set3 extends CategoricalColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Set3
     */
    public Set3() {
        super(
                new ColorImpl(141, 211, 199),
                new ColorImpl(255, 255, 179),
                new ColorImpl(190, 186, 218),
                new ColorImpl(251, 128, 114),
                new ColorImpl(128, 177, 211),
                new ColorImpl(253, 180, 98),
                new ColorImpl(179, 222, 105),
                new ColorImpl(252, 205, 229),
                new ColorImpl(217, 217, 217),
                new ColorImpl(188, 128, 189),
                new ColorImpl(204, 235, 197),
                new ColorImpl(255, 237, 111));

    }


}
