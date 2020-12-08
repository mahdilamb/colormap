package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap from Green to Blue.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "GnBu")
public final class GnBu extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer GnBu.
     */
    public GnBu() {
        super(Color.create(247, 252, 240),
                Color.create(224, 243, 219),
                Color.create(204, 235, 197),
                Color.create(168, 221, 181),
                Color.create(123, 204, 196),
                Color.create(78, 179, 211),
                Color.create(43, 140, 190),
                Color.create(8, 104, 172),
                Color.create(8, 64, 129));


    }


}
