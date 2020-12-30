package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's cyclic colormap Phase
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "Phase",source = "Ocean")
public final class Phase extends SequentialColormap {

    /**
     * Create a colormap based on the Plotly's colormap Phase.
     */
    public Phase() {
        super(
                new Color(167, 119, 12),
                new Color(197, 96, 51),
                new Color(217, 67, 96),
                new Color(221, 38, 163),
                new Color(196, 59, 224),
                new Color(153, 97, 244),
                new Color(95, 127, 228),
                new Color(40, 144, 183),
                new Color(15, 151, 136),
                new Color(39, 153, 79),
                new Color(119, 141, 17),
                new Color(167, 119, 12)

        );
    }
}
