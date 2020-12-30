package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sunset sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Sunset",source = "CARTO")
public final class Sunset extends SequentialColormap {
    /**
     * Create a colormap based on Sunset from Plotly
     */
    public Sunset() {
        super(
                new Color(243, 231, 155),
                new Color(250, 196, 132),
                new Color(248, 160, 126),
                new Color(235, 127, 134),
                new Color(206, 102, 147),
                new Color(160, 89, 160),
                new Color(92, 83, 165)

        );


    }


}
