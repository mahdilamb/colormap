package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sequential ColorBrewer colormap from Green to Blue.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "GnBu", source = "ColorBrewer")
public final class GnBu extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer GnBu.
     */
    public GnBu() {
        super(new Color(247, 252, 240),
                new Color(224, 243, 219),
                new Color(204, 235, 197),
                new Color(168, 221, 181),
                new Color(123, 204, 196),
                new Color(78, 179, 211),
                new Color(43, 140, 190),
                new Color(8, 104, 172),
                new Color(8, 64, 129));


    }


}
