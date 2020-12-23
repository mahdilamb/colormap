package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Colorbrewer 2.0 RdPu.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "RdPu")
public final class RdPu extends SequentialColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 RdPu.
     */
    public RdPu() {
        super(
                new Color(255, 247, 243),
                new Color(253, 224, 221),
                new Color(252, 197, 192),
                new Color(250, 159, 181),
                new Color(247, 104, 161),
                new Color(221, 52, 151),
                new Color(174, 1, 126),
                new Color(122, 1, 119),
                new Color(73, 0, 106));


    }


}
