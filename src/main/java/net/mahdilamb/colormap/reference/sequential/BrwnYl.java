package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Brwnyl sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BrwnYl", source = "CARTO")
public final class BrwnYl extends SequentialColormap {
    /**
     * Create a colormap based on Brwnyl from Plotly
     */
    public BrwnYl() {
        super(
                new Color(237, 229, 207),
                new Color(224, 194, 162),
                new Color(211, 156, 131),
                new Color(193, 118, 111),
                new Color(166, 84, 97),
                new Color(129, 55, 83),
                new Color(84, 31, 63)

        );


    }


}
