package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Pinkyl sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "PinkYl",source = "CARTO")
public final class PinkYl extends SequentialColormap {
    /**
     * Create a colormap based on Pinkyl from Plotly
     */
    public PinkYl() {
        super(
                new Color(254, 246, 181),
                new Color(255, 221, 154),
                new Color(255, 194, 133),
                new Color(255, 166, 121),
                new Color(250, 138, 118),
                new Color(241, 109, 122),
                new Color(225, 83, 131)
        );


    }


}
