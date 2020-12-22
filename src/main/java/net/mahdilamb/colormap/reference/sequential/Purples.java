package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Sequential ColorBrewer colormap going through Purples.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Purples")
public final class Purples extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer Purples.
     */
    public Purples() {
        super(
                new Color(252, 251, 253),
                new Color(239, 237, 245),
                new Color(218, 218, 235),
                new Color(188, 189, 220),
                new Color(158, 154, 200),
                new Color(128, 125, 186),
                new Color(106, 81, 163),
                new Color(84, 39, 143),
                new Color(63, 0, 125));

    }


}
