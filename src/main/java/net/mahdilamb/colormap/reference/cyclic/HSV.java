package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * HSV colormap
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "HSV")
public final class HSV extends SequentialColormap {

    /**
     * Create a colormap based on HSV.
     */
    public HSV() {
        super(
                Color.RED,
                new Color(255, 167, 0),
                new Color(175, 255, 0),
                new Color(8, 255, 0),
                new Color(0, 255, 159),
                new Color(0, 183, 255),
                new Color(0, 16, 255),
                new Color(151, 0, 255),
                new Color(255, 0, 191),
                Color.RED

        );
    }
}
