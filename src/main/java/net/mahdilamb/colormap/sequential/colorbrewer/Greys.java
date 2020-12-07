package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

/**
 * Sequential ColorBrewer colormap going through Greys.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Greys")
public final class Greys extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Greys.
     */
    public Greys() {
        super(
                new ColorImpl(255, 255, 255),
                new ColorImpl(240, 240, 240),
                new ColorImpl(217, 217, 217),
                new ColorImpl(189, 189, 189),
                new ColorImpl(150, 150, 150),
                new ColorImpl(115, 115, 115),
                new ColorImpl(82, 82, 82),
                new ColorImpl(37, 37, 37),
                new ColorImpl(0, 0, 0));

    }


}
