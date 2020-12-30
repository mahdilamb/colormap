package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Tealrose
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Tealrose")
public final class Tealrose extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Tealrose
     */
    public Tealrose() {
        super(
                new Color(0, 147, 146),
                new Color(114, 170, 161),
                new Color(177, 199, 179),
                new Color(241, 234, 200),
                new Color(229, 185, 173),
                new Color(217, 137, 148),
                new Color(208, 88, 126)

        );

    }


}
