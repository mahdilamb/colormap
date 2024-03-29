package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Aggrnyl sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "AgGrnYl",source = "Plotly")
public final class AgGrnYl extends SequentialColormap {
    /**
     * Create a colormap based on Aggrnyl from Plotly
     */
    public AgGrnYl() {
        super(
                new Color(36, 86, 104),
                new Color(15, 114, 121),
                new Color(13, 143, 129),
                new Color(57, 171, 126),
                new Color(110, 197, 116),
                new Color(169, 220, 103),
                new Color(237, 239, 93)

        );


    }


}
