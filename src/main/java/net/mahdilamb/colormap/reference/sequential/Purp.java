package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Purp sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Purp",source = "CARTO")
public final class Purp extends SequentialColormap {
    /**
     * Create a colormap based on Purp from Plotly
     */
    public Purp() {
        super(
                new Color(243, 224, 247),
                new Color(228, 199, 241),
                new Color(209, 175, 232),
                new Color(185, 152, 221),
                new Color(159, 130, 206),
                new Color(130, 109, 186),
                new Color(99, 88, 159)


        );


    }


}
