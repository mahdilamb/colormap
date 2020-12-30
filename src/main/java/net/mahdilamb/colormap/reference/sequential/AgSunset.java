package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Agsunset sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "AgSunset",source = "Plotly")
public final class AgSunset extends SequentialColormap {
    /**
     * Create a colormap based on Agsunset from Plotly
     */
    public AgSunset() {
        super(
                new Color(75, 41, 145),
                new Color(135, 44, 162),
                new Color(192, 54, 157),
                new Color(234, 79, 136),
                new Color(250, 120, 118),
                new Color(246, 169, 122),
                new Color(237, 217, 163)

        );


    }


}
