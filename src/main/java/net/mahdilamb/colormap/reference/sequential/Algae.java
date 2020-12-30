package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Algae sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Algae",source = "Ocean")
public final class Algae extends SequentialColormap {
    /**
     * Create a colormap based on Algae from Plotly
     */
    public Algae() {
        super(
                new Color(214, 249, 207),
                new Color(186, 228, 174),
                new Color(156, 209, 143),
                new Color(124, 191, 115),
                new Color(85, 174, 91),
                new Color(37, 157, 81),
                new Color(7, 138, 78),
                new Color(13, 117, 71),
                new Color(23, 95, 61),
                new Color(25, 75, 49),
                new Color(23, 55, 35),
                new Color(17, 36, 20)

        );


    }


}
