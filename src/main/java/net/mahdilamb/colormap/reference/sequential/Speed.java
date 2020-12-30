package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Speed sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Speed",source = "Ocean")
public final class Speed extends SequentialColormap {
    /**
     * Create a colormap based on Speed from Plotly
     */
    public Speed() {
        super(
                new Color(254, 252, 205),
                new Color(239, 225, 156),
                new Color(221, 201, 106),
                new Color(194, 182, 59),
                new Color(157, 167, 21),
                new Color(116, 153, 5),
                new Color(75, 138, 20),
                new Color(35, 121, 36),
                new Color(11, 100, 44),
                new Color(18, 78, 43),
                new Color(25, 56, 34),
                new Color(23, 35, 18)

        );


    }


}
