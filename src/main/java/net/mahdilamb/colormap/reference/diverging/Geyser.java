package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Plotly's Geyser
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Geyser",source = "CARTO")
public final class Geyser extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Geyser
     */
    public Geyser() {
        super(
                new Color(0, 128, 128),
                new Color(112, 164, 148),
                new Color(180, 200, 168),
                new Color(246, 237, 189),
                new Color(237, 187, 138),
                new Color(222, 138, 90),
                new Color(202, 86, 44)

        );

    }


}
