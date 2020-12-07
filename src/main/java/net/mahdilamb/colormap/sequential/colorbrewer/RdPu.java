package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(255, 247, 243),
                new ColorImpl(253, 224, 221),
                new ColorImpl(252, 197, 192),
                new ColorImpl(250, 159, 181),
                new ColorImpl(247, 104, 161),
                new ColorImpl(221, 52, 151),
                new ColorImpl(174, 1, 126),
                new ColorImpl(122, 1, 119),
                new ColorImpl(73, 0, 106));


    }


}
