package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Redor sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "RedOr",source = "CARTO")
public final class RedOr extends SequentialColormap {
    /**
     * Create a colormap based on Redor from Plotly
     */
    public RedOr() {
        super(
                new Color(246, 210, 169),
                new Color(245, 183, 142),
                new Color(241, 156, 124),
                new Color(234, 129, 113),
                new Color(221, 104, 108),
                new Color(202, 82, 104),
                new Color(177, 63, 100)
        );


    }


}
