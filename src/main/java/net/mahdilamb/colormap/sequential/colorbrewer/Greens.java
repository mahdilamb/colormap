package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Greens.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Greens")
public final class Greens extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Greens.
     */
    public Greens() {
        super(Color.create(247, 252, 245),
                Color.create(229, 245, 224),
                Color.create(199, 233, 192),
                Color.create(161, 217, 155),
                Color.create(116, 196, 118),
                Color.create(65, 171, 93),
                Color.create(35, 139, 69),
                Color.create(0, 109, 44),
                Color.create(0, 68, 27));

    }


}
