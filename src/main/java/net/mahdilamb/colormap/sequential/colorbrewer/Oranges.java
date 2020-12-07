package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Sequential ColorBrewer colormap going through Oranges.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Oranges")
public final class Oranges extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Oranges.
     */
    public Oranges() {
        super(
                new ColorImpl(255, 245, 235),
                new ColorImpl(254, 230, 206),
                new ColorImpl(253, 208, 162),
                new ColorImpl(253, 174, 107),
                new ColorImpl(253, 141, 60),
                new ColorImpl(241, 105, 19),
                new ColorImpl(217, 72, 1),
                new ColorImpl(166, 54, 3),
                new ColorImpl(127, 39, 4));

    }


}
