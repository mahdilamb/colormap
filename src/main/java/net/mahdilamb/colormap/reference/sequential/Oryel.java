package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Oryel sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Oryel")
public final class Oryel extends SequentialColormap {
    /**
     * Create a colormap based on Oryel from Plotly
     */
    public Oryel() {
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
