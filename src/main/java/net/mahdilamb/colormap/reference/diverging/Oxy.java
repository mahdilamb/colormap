package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Oxy
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Oxy",source = "Ocean")
public final class Oxy extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Oxy
     */
    public Oxy() {
        super(
                new Color(64, 5, 5),
                new Color(85, 7, 11),
                new Color(109, 6, 15),
                new Color(131, 8, 12),
                new Color(82, 81, 81),
                new Color(95, 94, 94),
                new Color(107, 107, 106),
                new Color(120, 119, 119),
                new Color(133, 133, 132),
                new Color(147, 147, 146),
                new Color(162, 161, 160),
                new Color(177, 176, 175),
                new Color(192, 192, 191),
                new Color(207, 207, 206),
                new Color(224, 224, 223),
                new Color(242, 242, 241),
                new Color(234, 241, 69),
                new Color(232, 217, 46),
                new Color(227, 195, 34),
                new Color(221, 175, 25)
        );

    }


}
