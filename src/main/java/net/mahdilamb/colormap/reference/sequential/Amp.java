package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Amp sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Amp",source = "Ocean")
public final class Amp extends SequentialColormap {
    /**
     * Create a colormap based on Amp from Plotly
     */
    public Amp() {
        super(
                new Color(241, 237, 236),
                new Color(234, 221, 218),
                new Color(228, 205, 198),
                new Color(223, 190, 179),
                new Color(219, 174, 159),
                new Color(214, 159, 140),
                new Color(209, 143, 120),
                new Color(205, 128, 102),
                new Color(200, 113, 85),
                new Color(195, 97, 67),
                new Color(189, 81, 52),
                new Color(182, 63, 41),
                new Color(174, 45, 36),
                new Color(162, 30, 37),
                new Color(147, 18, 40),
                new Color(131, 14, 41),
                new Color(112, 14, 39),
                new Color(95, 14, 33),
                new Color(77, 12, 26),
                new Color(60, 9, 18)
        );


    }


}
