package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Ice sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Ice", source = "Ocean")
public final class Ice extends SequentialColormap {
    /**
     * Create a colormap based on Ice from Plotly
     */
    public Ice() {
        super(
                new Color(4, 6, 19),
                new Color(16, 17, 37),
                new Color(29, 28, 58),
                new Color(40, 38, 78),
                new Color(50, 49, 100),
                new Color(58, 59, 122),
                new Color(62, 72, 144),
                new Color(63, 85, 161),
                new Color(62, 99, 173),
                new Color(64, 115, 180),
                new Color(69, 129, 186),
                new Color(78, 144, 191),
                new Color(89, 158, 196),
                new Color(101, 172, 201),
                new Color(117, 187, 207),
                new Color(136, 200, 212),
                new Color(160, 214, 220),
                new Color(185, 226, 229),
                new Color(211, 239, 241),
                new Color(234, 253, 253)
        );


    }


}
