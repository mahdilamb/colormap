package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Fall
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Fall")
public final class Fall extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Fall
     */
    public Fall() {
        super(
                new Color(61, 89, 65),
                new Color(119, 136, 104),
                new Color(181, 185, 145),
                new Color(246, 237, 189),
                new Color(237, 187, 138),
                new Color(222, 138, 90),
                new Color(202, 86, 44)


        );

    }


}
