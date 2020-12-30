package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's cyclic colormap Edge
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "Edge", source = "ParaView")
public final class Edge extends SequentialColormap {

    /**
     * Create a colormap based on the Plotly's colormap Edge.
     */
    public Edge() {
        super(
                new Color(49, 49, 49),
                new Color(61, 1, 157),
                new Color(56, 16, 220),
                new Color(45, 71, 249),
                new Color(37, 147, 255),
                new Color(42, 222, 246),
                new Color(96, 253, 250),
                new Color(174, 253, 255),
                new Color(243, 243, 241),
                new Color(255, 253, 169),
                new Color(250, 253, 91),
                new Color(247, 218, 41),
                new Color(255, 142, 37),
                new Color(248, 67, 45),
                new Color(217, 13, 57),
                new Color(151, 2, 61),
                new Color(49, 49, 49)


        );
    }
}
