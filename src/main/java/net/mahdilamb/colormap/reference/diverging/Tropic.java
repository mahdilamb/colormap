package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Tropic
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Tropic",source = "CARTO")
public final class Tropic extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Tropic
     */
    public Tropic() {
        super(
                new Color(0, 155, 158),
                new Color(66, 183, 185),
                new Color(167, 211, 212),
                new Color(241, 241, 241),
                new Color(228, 193, 217),
                new Color(214, 145, 193),
                new Color(199, 93, 171)


        );

    }


}
