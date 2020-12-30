package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sequential colormap Plotly3.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Plotly3")
public final class Plotly3 extends SequentialColormap {
    /**
     * Create a colormap based on Plotly3.
     */
    public Plotly3() {
        super(
                new Color(5, 8, 184),
                new Color(25, 16, 216),
                new Color(60, 25, 240),
                new Color(107, 28, 251),
                new Color(152, 28, 253),
                new Color(191, 28, 253),
                new Color(221, 43, 253),
                new Color(242, 70, 254),
                new Color(252, 103, 253),
                new Color(254, 136, 252),
                new Color(254, 165, 253),
                new Color(254, 190, 254),
                new Color(254, 195, 254)
        );


    }


}
