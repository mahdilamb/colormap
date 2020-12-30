package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Mint sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Mint",source = "CARTO")
public final class Mint extends SequentialColormap {
    /**
     * Create a colormap based on Mint from Plotly
     */
    public Mint() {
        super(
                new Color(228, 241, 225),
                new Color(180, 217, 204),
                new Color(137, 192, 182),
                new Color(99, 166, 160),
                new Color(68, 140, 138),
                new Color(40, 114, 116),
                new Color(13, 88, 95)

        );


    }


}
