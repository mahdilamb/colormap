package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Matter sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Matter",source = "Ocean")
public final class Matter extends SequentialColormap {
    /**
     * Create a colormap based on Matter from Plotly
     */
    public Matter() {
        super(
                new Color(254, 237, 176),
                new Color(252, 219, 159),
                new Color(250, 200, 141),
                new Color(248, 182, 126),
                new Color(245, 163, 112),
                new Color(241, 145, 100),
                new Color(236, 126, 90),
                new Color(231, 108, 85),
                new Color(223, 91, 83),
                new Color(213, 75, 84),
                new Color(200, 61, 88),
                new Color(185, 50, 93),
                new Color(170, 41, 97),
                new Color(154, 34, 99),
                new Color(136, 29, 99),
                new Color(118, 26, 97),
                new Color(99, 24, 91),
                new Color(82, 22, 83),
                new Color(64, 19, 73),
                new Color(47, 15, 62)
        );


    }


}
