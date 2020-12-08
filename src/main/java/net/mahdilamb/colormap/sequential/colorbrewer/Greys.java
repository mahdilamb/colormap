package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Greys.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Greys")
public final class Greys extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Greys.
     */
    public Greys() {
        super(Color.create(255, 255, 255),
                Color.create(240, 240, 240),
                Color.create(217, 217, 217),
                Color.create(189, 189, 189),
                Color.create(150, 150, 150),
                Color.create(115, 115, 115),
                Color.create(82, 82, 82),
                Color.create(37, 37, 37),
                Color.create(0, 0, 0));

    }


}
