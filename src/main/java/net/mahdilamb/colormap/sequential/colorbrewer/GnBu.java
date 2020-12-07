package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Sequential ColorBrewer colormap from Green to Blue.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "GnBu")
public final class GnBu extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer GnBu.
     */
    public GnBu() {
        super(
                new ColorImpl(247, 252, 240),
                new ColorImpl(224, 243, 219),
                new ColorImpl(204, 235, 197),
                new ColorImpl(168, 221, 181),
                new ColorImpl(123, 204, 196),
                new ColorImpl(78, 179, 211),
                new ColorImpl(43, 140, 190),
                new ColorImpl(8, 104, 172),
                new ColorImpl(8, 64, 129));


    }


}
