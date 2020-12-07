package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(247, 251, 255),
                new ColorImpl(222, 235, 247),
                new ColorImpl(198, 219, 239),
                new ColorImpl(158, 202, 225),
                new ColorImpl(107, 174, 214),
                new ColorImpl(66, 146, 198),
                new ColorImpl(33, 113, 181),
                new ColorImpl(8, 81, 156),
                new ColorImpl(8, 48, 107));

    }


}
