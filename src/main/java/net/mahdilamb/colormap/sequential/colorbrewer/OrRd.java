package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap from Orange to Red.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "OrRd")
public final class OrRd extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer OrRd.
     */
    public OrRd() {
        super(
                Color.create(255, 247, 236),
                Color.create(254, 232, 200),
                Color.create(253, 212, 158),
                Color.create(253, 187, 132),
                Color.create(252, 141, 89),
                Color.create(239, 101, 72),
                Color.create(215, 48, 31),
                Color.create(179, 0, 0),
                Color.create(127, 0, 0));


    }


}
