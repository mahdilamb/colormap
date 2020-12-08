package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Set3
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Set3")
public final class Set3 extends CategoricalColormap {

    /**
     * Create a colormap based on Colorbrewer 2.0 Set3
     */
    public Set3() {
        super(Color.create(141, 211, 199),
                Color.create(255, 255, 179),
                Color.create(190, 186, 218),
                Color.create(251, 128, 114),
                Color.create(128, 177, 211),
                Color.create(253, 180, 98),
                Color.create(179, 222, 105),
                Color.create(252, 205, 229),
                Color.create(217, 217, 217),
                Color.create(188, 128, 189),
                Color.create(204, 235, 197),
                Color.create(255, 237, 111));

    }


}
