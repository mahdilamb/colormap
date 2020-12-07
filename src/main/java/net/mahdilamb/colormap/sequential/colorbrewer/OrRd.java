package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(255, 247, 236),
                new ColorImpl(254, 232, 200),
                new ColorImpl(253, 212, 158),
                new ColorImpl(253, 187, 132),
                new ColorImpl(252, 141, 89),
                new ColorImpl(239, 101, 72),
                new ColorImpl(215, 48, 31),
                new ColorImpl(179, 0, 0),
                new ColorImpl(127, 0, 0));


    }


}
