package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Oryel sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "OrYel",source = "CARTO")
public final class OrYel extends SequentialColormap {
    /**
     * Create a colormap based on Oryel from Plotly
     */
    public OrYel() {
        super(
                new Color(236, 218, 154),
                new Color(239, 196, 126),
                new Color(243, 173, 106),
                new Color(247, 148, 93),
                new Color(249, 123, 87),
                new Color(246, 99, 86),
                new Color(238, 77, 90)
        );


    }


}
