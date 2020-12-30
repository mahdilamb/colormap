package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Solar sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Solar")
public final class Solar extends SequentialColormap {
    /**
     * Create a colormap based on Solar from Plotly
     */
    public Solar() {
        super(
                new Color(51, 19, 23),
                new Color(79, 28, 33),
                new Color(108, 36, 36),
                new Color(135, 47, 32),
                new Color(157, 66, 25),
                new Color(174, 88, 20),
                new Color(188, 111, 19),
                new Color(199, 137, 22),
                new Color(209, 164, 32),
                new Color(217, 192, 44),
                new Color(222, 222, 59),
                new Color(224, 253, 74)

        );


    }


}
