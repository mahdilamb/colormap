package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Blues.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Blues")
public final class Blues extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Blues.
     */
    public Blues() {
        super(
                Color.create(247, 251, 255),
                Color.create(222, 235, 247),
                Color.create(198, 219, 239),
                Color.create(158, 202, 225),
                Color.create(107, 174, 214),
                Color.create(66, 146, 198),
                Color.create(33, 113, 181),
                Color.create(8, 81, 156),
                Color.create(8, 48, 107));

    }


}
