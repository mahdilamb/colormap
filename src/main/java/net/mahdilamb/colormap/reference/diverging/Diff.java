package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * CMOceans's Diff
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Diff", source = "Ocean")
public final class Diff extends SequentialColormap {

    /**
     * Create a colormap based on CMOceans's Diff
     */
    public Diff() {
        super(
                new Color(28, 34, 7),
                new Color(34, 39, 9),
                new Color(56, 57, 20),
                new Color(79, 74, 29),
                new Color(103, 90, 41),
                new Color(122, 109, 65),
                new Color(141, 128, 91),
                new Color(160, 149, 118),
                new Color(179, 170, 147),
                new Color(200, 193, 176),
                new Color(223, 217, 207),
                new Color(243, 238, 235),
                new Color(238, 236, 236),
                new Color(212, 214, 217),
                new Color(185, 191, 197),
                new Color(158, 170, 179),
                new Color(133, 150, 162)

        );

    }


}
