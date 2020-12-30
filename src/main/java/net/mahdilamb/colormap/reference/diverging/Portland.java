package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Portland
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Portland",source = "Plotly")
public final class Portland extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Portland
     */
    public Portland() {
        super(
                new Color(12, 51, 131),
                new Color(10, 136, 186),
                new Color(242, 211, 56),
                new Color(242, 143, 56),
                new Color(217, 30, 30)
        );

    }


}
