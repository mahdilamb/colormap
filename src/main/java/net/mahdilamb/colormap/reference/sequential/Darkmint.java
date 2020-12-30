package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Darkmint sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Darkmint")
public final class Darkmint extends SequentialColormap {
    /**
     * Create a colormap based on Darkmint from Plotly
     */
    public Darkmint() {
        super(
                new Color(210, 251, 212),
                new Color(165, 219, 194),
                new Color(123, 188, 176),
                new Color(85, 156, 158),
                new Color(58, 124, 137),
                new Color(35, 93, 114),
                new Color(18, 63, 90)

        );


    }


}
