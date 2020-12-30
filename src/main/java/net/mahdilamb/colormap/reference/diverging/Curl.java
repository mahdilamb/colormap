package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Curl
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Curl",source = "Ocean")
public final class Curl extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Curl
     */
    public Curl() {
        super(
                new Color(20, 29, 67),
                new Color(28, 72, 93),
                new Color(18, 115, 117),
                new Color(63, 156, 129),
                new Color(153, 189, 156),
                new Color(223, 225, 211),
                new Color(241, 218, 206),
                new Color(224, 160, 137),
                new Color(203, 101, 99),
                new Color(164, 54, 96),
                new Color(111, 23, 91),
                new Color(51, 13, 53)


        );

    }


}
