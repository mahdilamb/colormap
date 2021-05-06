package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

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
                new Color(24, 28, 67),
                new Color(36, 46, 108),
                new Color(41, 64, 158),
                new Color(16, 89, 190),
                new Color(30, 118, 187),
                new Color(64, 141, 186),
                new Color(104, 164, 188),
                new Color(145, 183, 195),
                new Color(185, 202, 208),
                new Color(225, 225, 227),
                new Color(235, 222, 219),
                new Color(223, 189, 178),
                new Color(214, 159, 141),
                new Color(205, 130, 104),
                new Color(195, 97, 67),
                new Color(183, 64, 41),
                new Color(161, 29, 37),
                new Color(131, 14, 41),
                new Color(94, 14, 33),
                new Color(60, 9, 18)

        );

    }


}
