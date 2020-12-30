package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's cyclic colormap Mygbm
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "MYGBM", source = "CET")
public final class MYGBM extends SequentialColormap {

    /**
     * Create a colormap based on the Plotly's colormap Mygbm.
     */
    public MYGBM() {
        super(
                new Color(239, 85, 241),
                new Color(251, 132, 206),
                new Color(251, 175, 161),
                new Color(252, 212, 113),
                new Color(240, 237, 53),
                new Color(198, 229, 22),
                new Color(150, 211, 16),
                new Color(97, 193, 11),
                new Color(49, 172, 40),
                new Color(67, 144, 100),
                new Color(61, 113, 154),
                new Color(40, 78, 200),
                new Color(46, 33, 234),
                new Color(99, 36, 245),
                new Color(145, 57, 250),
                new Color(197, 67, 250),
                new Color(239, 85, 241)

        );
    }
}
