package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Teal sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Teal", source = "CARTO")
public final class Teal extends SequentialColormap {
    /**
     * Create a colormap based on Teal from Plotly
     */
    public Teal() {
        super(
                new Color(209, 238, 234),
                new Color(168, 219, 217),
                new Color(133, 196, 201),
                new Color(104, 171, 184),
                new Color(79, 144, 166),
                new Color(59, 115, 143),
                new Color(42, 86, 116)

        );


    }


}
