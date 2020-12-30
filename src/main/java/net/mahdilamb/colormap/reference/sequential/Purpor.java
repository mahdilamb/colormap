package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Purpor sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Purpor")
public final class Purpor extends SequentialColormap {
    /**
     * Create a colormap based on Purpor from Plotly
     */
    public Purpor() {
        super(
                new Color(249, 221, 218),
                new Color(242, 185, 196),
                new Color(229, 151, 185),
                new Color(206, 120, 179),
                new Color(173, 95, 173),
                new Color(131, 75, 160),
                new Color(87, 59, 136)


        );


    }


}
