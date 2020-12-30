package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tealgrn sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Tealgrn")
public final class Tealgrn extends SequentialColormap {
    /**
     * Create a colormap based on Tealgrn from Plotly
     */
    public Tealgrn() {
        super(
                new Color(176, 242, 188),
                new Color(137, 232, 172),
                new Color(103, 219, 165),
                new Color(76, 200, 163),
                new Color(56, 178, 163),
                new Color(44, 152, 160),
                new Color(37, 125, 152)

        );


    }


}
