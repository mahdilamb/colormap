package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Dense sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Dense")
public final class Dense extends SequentialColormap {
    /**
     * Create a colormap based on Dense from Plotly
     */
    public Dense() {
        super(
                new Color(230, 240, 240),
                new Color(191, 221, 229),
                new Color(156, 201, 226),
                new Color(129, 180, 227),
                new Color(115, 154, 228),
                new Color(117, 127, 221),
                new Color(120, 100, 202),
                new Color(119, 74, 175),
                new Color(113, 50, 141),
                new Color(100, 31, 104),
                new Color(80, 20, 66),
                new Color(54, 14, 36)

        );


    }


}
