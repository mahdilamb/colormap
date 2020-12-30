package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's cyclic colormap Mrybm
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "Mrybm",source = "Kovesi")
public final class Mrybm extends SequentialColormap {

    /**
     * Create a colormap based on the Plotly's colormap Mrybm.
     */
    public Mrybm() {
        super(
                new Color(248, 132, 247),
                new Color(249, 104, 196),
                new Color(234, 67, 136),
                new Color(207, 36, 75),
                new Color(181, 26, 21),
                new Color(189, 67, 4),
                new Color(204, 105, 4),
                new Color(213, 143, 4),
                new Color(207, 170, 39),
                new Color(161, 159, 98),
                new Color(88, 138, 147),
                new Color(34, 105, 196),
                new Color(62, 62, 240),
                new Color(107, 78, 249),
                new Color(149, 107, 250),
                new Color(205, 125, 254),
                new Color(248, 132, 247)

        );
    }
}
