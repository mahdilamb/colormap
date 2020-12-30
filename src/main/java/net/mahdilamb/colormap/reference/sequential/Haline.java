package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Haline sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Haline",source = "Ocean")
public final class Haline extends SequentialColormap {
    /**
     * Create a colormap based on Haline from Plotly
     */
    public Haline() {
        super(
                new Color(41, 24, 107),
                new Color(42, 35, 160),
                new Color(15, 71, 153),
                new Color(18, 95, 142),
                new Color(38, 116, 137),
                new Color(53, 136, 136),
                new Color(65, 157, 133),
                new Color(81, 178, 124),
                new Color(111, 198, 107),
                new Color(160, 214, 91),
                new Color(212, 225, 112),
                new Color(253, 238, 153)
        );


    }


}
