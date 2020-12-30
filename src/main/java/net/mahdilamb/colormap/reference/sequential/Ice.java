package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Ice sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Ice")
public final class Ice extends SequentialColormap {
    /**
     * Create a colormap based on Ice from Plotly
     */
    public Ice() {
        super(
                new Color(3, 5, 18),
                new Color(25, 25, 51),
                new Color(44, 42, 87),
                new Color(58, 60, 125),
                new Color(62, 83, 160),
                new Color(62, 109, 178),
                new Color(72, 134, 187),
                new Color(89, 159, 196),
                new Color(114, 184, 205),
                new Color(149, 207, 216),
                new Color(192, 229, 232),
                new Color(234, 252, 253)


        );


    }


}
