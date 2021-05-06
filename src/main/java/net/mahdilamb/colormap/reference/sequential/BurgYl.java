package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Burgyl sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BurgYl",source = "CARTO")
public final class BurgYl extends SequentialColormap {
    /**
     * Create a colormap based on Burgyl from Plotly
     */
    public BurgYl() {
        super(
                new Color(251, 230, 197),
                new Color(245, 186, 152),
                new Color(238, 138, 130),
                new Color(220, 113, 118),
                new Color(200, 88, 108),
                new Color(156, 63, 93),
                new Color(112, 40, 74)
        );


    }


}
