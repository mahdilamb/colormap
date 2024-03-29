package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Bluyl sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BluYl",source = "CARTO")
public final class BluYl extends SequentialColormap {
    /**
     * Create a colormap based on Bluyl from Plotly
     */
    public BluYl() {
        super(
                new Color(247, 254, 174),
                new Color(183, 230, 165),
                new Color(124, 203, 162),
                new Color(70, 174, 160),
                new Color(8, 144, 153),
                new Color(0, 113, 139),
                new Color(4, 82, 117)
        );


    }


}
