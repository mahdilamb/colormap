package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Thermal sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Thermal",source = "Ocean")
public final class Thermal extends SequentialColormap {
    /**
     * Create a colormap based on Thermal from Plotly
     */
    public Thermal() {
        super(
                new Color(3, 35, 51),
                new Color(13, 48, 100),
                new Color(53, 50, 155),
                new Color(93, 62, 153),
                new Color(126, 77, 143),
                new Color(158, 89, 135),
                new Color(193, 100, 121),
                new Color(225, 113, 97),
                new Color(246, 139, 69),
                new Color(251, 173, 60),
                new Color(246, 211, 70),
                new Color(231, 250, 90)


        );


    }


}
