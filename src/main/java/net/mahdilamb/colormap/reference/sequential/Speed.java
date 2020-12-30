package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Speed sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Speed",source = "Ocean")
public final class Speed extends SequentialColormap {
    /**
     * Create a colormap based on Speed from Plotly
     */
    public Speed() {
        super(
                new Color(255, 253, 205),
                new Color(246, 237, 177),
                new Color(237, 221, 147),
                new Color(227, 207, 119),
                new Color(213, 194, 89),
                new Color(197, 184, 63),
                new Color(177, 174, 39),
                new Color(155, 166, 20),
                new Color(133, 159, 7),
                new Color(108, 150, 7),
                new Color(84, 142, 17),
                new Color(59, 132, 28),
                new Color(37, 122, 36),
                new Color(19, 111, 41),
                new Color(11, 99, 44),
                new Color(15, 86, 44),
                new Color(21, 73, 42),
                new Color(25, 61, 36),
                new Color(25, 47, 28),
                new Color(23, 35, 19)

        );


    }


}
