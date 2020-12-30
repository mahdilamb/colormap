package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Turbid sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Turbid",source = "Ocean")
public final class Turbid extends SequentialColormap {
    /**
     * Create a colormap based on Turbid from Plotly
     */
    public Turbid() {
        super(
                new Color(232, 245, 171),
                new Color(220, 219, 137),
                new Color(209, 193, 107),
                new Color(199, 168, 83),
                new Color(186, 143, 66),
                new Color(170, 121, 60),
                new Color(151, 103, 58),
                new Color(129, 87, 56),
                new Color(104, 72, 53),
                new Color(80, 59, 46),
                new Color(57, 45, 37),
                new Color(34, 30, 27)

        );


    }


}
