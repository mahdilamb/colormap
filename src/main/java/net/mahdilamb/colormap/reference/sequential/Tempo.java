package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tempo sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Tempo",source = "Ocean")
public final class Tempo extends SequentialColormap {
    /**
     * Create a colormap based on Tempo from Plotly
     */
    public Tempo() {
        super(
                new Color(255, 246, 244),
                new Color(237, 234, 225),
                new Color(217, 221, 205),
                new Color(198, 211, 188),
                new Color(177, 200, 172),
                new Color(156, 191, 159),
                new Color(133, 181, 147),
                new Color(109, 173, 138),
                new Color(84, 164, 132),
                new Color(56, 153, 129),
                new Color(33, 142, 126),
                new Color(18, 130, 123),
                new Color(18, 118, 118),
                new Color(22, 105, 113),
                new Color(26, 92, 106),
                new Color(28, 80, 98),
                new Color(28, 67, 90),
                new Color(26, 55, 83),
                new Color(24, 42, 75),
                new Color(21, 29, 68)
        );


    }


}
