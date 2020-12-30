package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Deep sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Deep")
public final class Deep extends SequentialColormap {
    /**
     * Create a colormap based on Deep from Plotly
     */
    public Deep() {
        super(
                new Color(253, 253, 204),
                new Color(206, 236, 179),
                new Color(156, 219, 165),
                new Color(111, 201, 163),
                new Color(86, 177, 163),
                new Color(76, 153, 160),
                new Color(68, 130, 155),
                new Color(62, 108, 150),
                new Color(62, 82, 143),
                new Color(64, 60, 115),
                new Color(54, 43, 77),
                new Color(39, 26, 44)

        );


    }


}
