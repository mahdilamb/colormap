package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sequential ColorBrewer colormap going through Greys.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Greys",source = "ColorBrewer")
public final class Greys extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer Greys.
     */
    public Greys() {
        super(Color.WHITE,
                new Color(240, 240, 240),
                new Color(217, 217, 217),
                new Color(189, 189, 189),
                new Color(150, 150, 150),
                new Color(115, 115, 115),
                new Color(82, 82, 82),
                new Color(37, 37, 37),
                Color.BLACK);

    }


}
