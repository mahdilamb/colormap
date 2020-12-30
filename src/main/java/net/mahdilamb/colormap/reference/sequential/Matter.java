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
                new Color(253, 237, 176),
                new Color(250, 205, 145),
                new Color(246, 173, 119),
                new Color(240, 142, 98),
                new Color(231, 109, 84),
                new Color(216, 80, 83),
                new Color(195, 56, 90),
                new Color(168, 40, 96),
                new Color(138, 29, 99),
                new Color(107, 24, 93),
                new Color(76, 21, 80),
                new Color(47, 15, 61)


        );


    }


}
