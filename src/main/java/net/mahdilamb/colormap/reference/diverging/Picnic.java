package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Picnic
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Picnic")
public final class Picnic extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Picnic
     */
    public Picnic() {
        super(
                Color.BLUE,
                new Color(51, 153, 255),
                new Color(102, 204, 255),
                new Color(153, 204, 255),
                new Color(204, 204, 255),
                new Color(255, 255, 255),
                new Color(255, 204, 255),
                new Color(255, 153, 255),
                new Color(255, 102, 204),
                new Color(255, 102, 102),
                Color.RED

        );

    }


}
