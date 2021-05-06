package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Magenta sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Magenta",source = "CARTO")
public final class Magenta extends SequentialColormap {
    /**
     * Create a colormap based on Magenta from Plotly
     */
    public Magenta() {
        super(
                new Color(243, 203, 211),
                new Color(234, 169, 189),
                new Color(221, 136, 172),
                new Color(202, 105, 157),
                new Color(177, 77, 142),
                new Color(145, 53, 125),
                new Color(108, 33, 103)


        );


    }


}
