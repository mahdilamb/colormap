package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Solar sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Solar", source = "Ocean")
public final class Solar extends SequentialColormap {
    /**
     * Create a colormap based on Solar from Plotly
     */
    public Solar() {
        super(
                new Color(51, 20, 24),
                new Color(67, 25, 30),
                new Color(85, 30, 34),
                new Color(101, 35, 36),
                new Color(119, 40, 36),
                new Color(133, 46, 33),
                new Color(147, 56, 29),
                new Color(159, 67, 25),
                new Color(168, 79, 22),
                new Color(178, 93, 20),
                new Color(186, 107, 19),
                new Color(193, 122, 20),
                new Color(199, 136, 23),
                new Color(205, 151, 27),
                new Color(211, 167, 33),
                new Color(215, 183, 40),
                new Color(219, 200, 49),
                new Color(222, 217, 57),
                new Color(224, 235, 66),
                new Color(225, 253, 75)

        );


    }


}
