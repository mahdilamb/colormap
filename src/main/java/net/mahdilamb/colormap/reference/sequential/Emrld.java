package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Emrld sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Emrld",source = "CARTO")
public final class Emrld extends SequentialColormap {
    /**
     * Create a colormap based on Emrld from Plotly
     */
    public Emrld() {
        super(
                new Color(211, 242, 163),
                new Color(151, 225, 150),
                new Color(108, 192, 139),
                new Color(76, 155, 130),
                new Color(33, 122, 121),
                new Color(16, 89, 101),
                new Color(7, 64, 80)

        );


    }


}
