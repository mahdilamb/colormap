package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sunsetdark sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Sunsetdark")
public final class Sunsetdark extends SequentialColormap {
    /**
     * Create a colormap based on Sunsetdark from Plotly
     */
    public Sunsetdark() {
        super(
                new Color(252, 222, 156),
                new Color(250, 164, 118),
                new Color(240, 116, 110),
                new Color(227, 79, 111),
                new Color(220, 57, 119),
                new Color(185, 37, 122),
                new Color(124, 29, 111)

        );


    }


}
