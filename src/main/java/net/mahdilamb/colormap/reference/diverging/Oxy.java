package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Oxy
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Oxy")
public final class Oxy extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Oxy
     */
    public Oxy() {
        super(
                new Color(63, 5, 5),
                new Color(101, 6, 13),
                new Color(138, 17, 9),
                new Color(96, 95, 95),
                new Color(119, 118, 118),
                new Color(142, 141, 141),
                new Color(166, 166, 165),
                new Color(193, 192, 191),
                new Color(222, 222, 220),
                new Color(239, 248, 90),
                new Color(230, 210, 41),
                new Color(220, 174, 25)

        );

    }


}
