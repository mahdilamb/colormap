package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sequential colormap Blackbody (from Plotly).
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BlackbodyAlt", source = "Plotly")
public final class BlackbodyAlt extends SequentialColormap {
    /**
     * Create a colormap based on Blackbody from Plotly.
     */
    public BlackbodyAlt() {
        super(
                Color.BLACK,
                new Color(230, 0, 0),
                new Color(230, 210, 0),
                Color.WHITE,
                new Color(160, 200, 255)

        );
    }


}
