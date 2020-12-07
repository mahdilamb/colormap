package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Sequential ColorBrewer colormap going through Greens.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Greens")
public final class Greens extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Greens.
     */
    public Greens() {
        super(
                new ColorImpl(247, 252, 245),
                new ColorImpl(229, 245, 224),
                new ColorImpl(199, 233, 192),
                new ColorImpl(161, 217, 155),
                new ColorImpl(116, 196, 118),
                new ColorImpl(65, 171, 93),
                new ColorImpl(35, 139, 69),
                new ColorImpl(0, 109, 44),
                new ColorImpl(0, 68, 27));

    }


}
