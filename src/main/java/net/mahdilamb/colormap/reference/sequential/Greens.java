package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Sequential ColorBrewer colormap going through Greens.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Greens", source = "ColorBrewer")
public final class Greens extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer Greens.
     */
    public Greens() {
        super(new Color(247, 252, 245),
                new Color(229, 245, 224),
                new Color(199, 233, 192),
                new Color(161, 217, 155),
                new Color(116, 196, 118),
                new Color(65, 171, 93),
                new Color(35, 139, 69),
                new Color(0, 109, 44),
                new Color(0, 68, 27));

    }


}
