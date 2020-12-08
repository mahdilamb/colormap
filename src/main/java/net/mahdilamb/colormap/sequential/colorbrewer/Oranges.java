package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

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
                Color.create(255, 245, 235),
                Color.create(254, 230, 206),
                Color.create(253, 208, 162),
                Color.create(253, 174, 107),
                Color.create(253, 141, 60),
                Color.create(241, 105, 19),
                Color.create(217, 72, 1),
                Color.create(166, 54, 3),
                Color.create(127, 39, 4));

    }


}
