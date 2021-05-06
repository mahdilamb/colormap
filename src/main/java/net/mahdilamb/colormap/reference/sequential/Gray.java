package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Gray sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Gray", source = "Ocean")
public final class Gray extends SequentialColormap {
    /**
     * Create a colormap based on Gray from Plotly
     */
    public Gray() {
        super(
                Color.BLACK,
                new Color(6, 6, 6),
                new Color(21, 20, 20),
                new Color(33, 33, 33),
                new Color(46, 46, 46),
                new Color(58, 57, 57),
                new Color(71, 70, 70),
                new Color(82, 82, 81),
                new Color(94, 94, 93),
                new Color(107, 107, 106),
                new Color(119, 119, 118),
                new Color(133, 132, 132),
                new Color(146, 145, 145),
                new Color(159, 159, 158),
                new Color(174, 173, 173),
                new Color(188, 188, 187),
                new Color(204, 204, 203),
                new Color(220, 220, 219),
                new Color(238, 237, 236),
                new Color(255, 255, 253)
        );


    }


}
