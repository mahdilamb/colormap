package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Balance
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Balance",source = "Ocean")
public final class Balance extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Balance
     */
    public Balance() {
        super(
                new Color(23, 28, 66),
                new Color(41, 58, 143),
                new Color(11, 102, 189),
                new Color(69, 144, 185),
                new Color(142, 181, 194),
                new Color(210, 216, 219),
                new Color(230, 210, 204),
                new Color(213, 157, 137),
                new Color(196, 101, 72),
                new Color(172, 43, 36),
                new Color(120, 14, 40),
                new Color(60, 9, 17)

        );

    }


}
