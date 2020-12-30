package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Curl
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Curl", source = "Ocean")
public final class Curl extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Curl
     */
    public Curl() {
        super(
                new Color(21, 29, 68),
                new Color(26, 55, 83),
                new Color(28, 80, 98),
                new Color(22, 105, 113),
                new Color(19, 131, 123),
                new Color(56, 153, 129),
                new Color(109, 173, 138),
                new Color(156, 191, 159),
                new Color(198, 211, 188),
                new Color(237, 234, 225),
                new Color(246, 230, 223),
                new Color(234, 197, 179),
                new Color(225, 163, 139),
                new Color(215, 129, 111),
                new Color(200, 97, 98),
                new Color(180, 69, 96),
                new Color(153, 45, 97),
                new Color(122, 27, 94),
                new Color(87, 19, 80),
                new Color(52, 13, 53)
        );

    }


}
