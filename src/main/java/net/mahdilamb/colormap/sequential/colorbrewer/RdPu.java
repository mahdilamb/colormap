package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 RdPu.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "RdPu")
public final class RdPu extends LinearColormap {
    /**
     * Create a colormap based on Colorbrewer 2.0 RdPu.
     */
    public RdPu() {
        super(
                Color.create(255, 247, 243),
                Color.create(253, 224, 221),
                Color.create(252, 197, 192),
                Color.create(250, 159, 181),
                Color.create(247, 104, 161),
                Color.create(221, 52, 151),
                Color.create(174, 1, 126),
                Color.create(122, 1, 119),
                Color.create(73, 0, 106));


    }


}
