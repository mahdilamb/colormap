package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Delta
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Delta")
public final class Delta extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Delta
     */
    public Delta() {
        super(
                new Color(16, 31, 63),
                new Color(38, 62, 144),
                new Color(30, 110, 161),
                new Color(60, 154, 171),
                new Color(140, 193, 186),
                new Color(217, 229, 218),
                new Color(239, 226, 156),
                new Color(195, 182, 59),
                new Color(115, 152, 5),
                new Color(34, 120, 36),
                new Color(18, 78, 43),
                new Color(23, 35, 18)

        );

    }


}
