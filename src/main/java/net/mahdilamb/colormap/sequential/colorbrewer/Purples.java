package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(252, 251, 253),
                new ColorImpl(239, 237, 245),
                new ColorImpl(218, 218, 235),
                new ColorImpl(188, 189, 220),
                new ColorImpl(158, 154, 200),
                new ColorImpl(128, 125, 186),
                new ColorImpl(106, 81, 163),
                new ColorImpl(84, 39, 143),
                new ColorImpl(63, 0, 125));

    }


}
