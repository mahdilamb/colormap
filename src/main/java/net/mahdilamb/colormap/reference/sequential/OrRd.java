package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Sequential ColorBrewer colormap from Orange to Red.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "OrRd", source = "ColorBrewer")
public final class OrRd extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer OrRd.
     */
    public OrRd() {
        super(
                new Color(255, 247, 236),
                new Color(254, 232, 200),
                new Color(253, 212, 158),
                new Color(253, 187, 132),
                new Color(252, 141, 89),
                new Color(239, 101, 72),
                new Color(215, 48, 31),
                new Color(179, 0, 0),
                new Color(127, 0, 0));


    }


}
