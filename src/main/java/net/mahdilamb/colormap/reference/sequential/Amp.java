package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Amp sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Amp")
public final class Amp extends SequentialColormap {
    /**
     * Create a colormap based on Amp from Plotly
     */
    public Amp() {
        super(
                new Color(241, 236, 236),
                new Color(230, 209, 203),
                new Color(221, 182, 170),
                new Color(213, 156, 137),
                new Color(205, 129, 103),
                new Color(196, 102, 73),
                new Color(186, 74, 47),
                new Color(172, 44, 36),
                new Color(149, 19, 39),
                new Color(120, 14, 40),
                new Color(89, 13, 31),
                new Color(60, 9, 17)

        );


    }


}
