package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Purples.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Purples")
public final class Purples extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Purples.
     */
    public Purples() {
        super(
                Color.create(252, 251, 253),
                Color.create(239, 237, 245),
                Color.create(218, 218, 235),
                Color.create(188, 189, 220),
                Color.create(158, 154, 200),
                Color.create(128, 125, 186),
                Color.create(106, 81, 163),
                Color.create(84, 39, 143),
                Color.create(63, 0, 125));

    }


}
