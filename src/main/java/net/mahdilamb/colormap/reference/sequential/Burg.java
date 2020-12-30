package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Burg sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Burg")
public final class Burg extends SequentialColormap {
    /**
     * Create a colormap based on Burg from Plotly
     */
    public Burg() {
        super(
                new Color(255, 198, 196),
                new Color(244, 163, 168),
                new Color(227, 129, 145),
                new Color(204, 96, 125),
                new Color(173, 70, 108),
                new Color(139, 48, 88),
                new Color(103, 32, 68)

        );


    }


}
