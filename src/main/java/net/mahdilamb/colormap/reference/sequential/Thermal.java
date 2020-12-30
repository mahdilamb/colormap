package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Thermal sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Thermal",source = "Ocean")
public final class Thermal extends SequentialColormap {
    /**
     * Create a colormap based on Thermal from Plotly
     */
    public Thermal() {
        super(
                new Color(4, 35, 51),
                new Color(7, 44, 77),
                new Color(18, 50, 111),
                new Color(39, 52, 145),
                new Color(70, 53, 160),
                new Color(91, 61, 155),
                new Color(110, 71, 148),
                new Color(128, 78, 143),
                new Color(146, 85, 139),
                new Color(166, 92, 134),
                new Color(186, 98, 126),
                new Color(206, 105, 113),
                new Color(224, 113, 99),
                new Color(238, 125, 83),
                new Color(248, 142, 68),
                new Color(251, 161, 61),
                new Color(251, 183, 61),
                new Color(248, 205, 68),
                new Color(241, 228, 79),
                new Color(232, 250, 91)
        );


    }


}
