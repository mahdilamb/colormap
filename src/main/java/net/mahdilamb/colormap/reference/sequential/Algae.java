package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Algae sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Algae", source = "Ocean")
public final class Algae extends SequentialColormap {
    /**
     * Create a colormap based on Algae from Plotly
     */
    public Algae() {
        super(
                new Color(215, 249, 208),
                new Color(199, 237, 189),
                new Color(181, 225, 169),
                new Color(164, 214, 152),
                new Color(146, 203, 134),
                new Color(128, 193, 118),
                new Color(107, 183, 103),
                new Color(84, 174, 91),
                new Color(57, 165, 83),
                new Color(28, 154, 81),
                new Color(11, 143, 79),
                new Color(7, 130, 76),
                new Color(13, 118, 72),
                new Color(19, 106, 67),
                new Color(24, 94, 61),
                new Color(26, 83, 54),
                new Color(26, 71, 46),
                new Color(24, 59, 38),
                new Color(22, 47, 29),
                new Color(18, 36, 20)
        );


    }


}
