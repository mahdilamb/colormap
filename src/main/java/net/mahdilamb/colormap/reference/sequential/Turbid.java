package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Turbid sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Turbid", source = "Ocean")
public final class Turbid extends SequentialColormap {
    /**
     * Create a colormap based on Turbid from Plotly
     */
    public Turbid() {
        super(
                new Color(233, 246, 171),
                new Color(226, 231, 152),
                new Color(218, 215, 132),
                new Color(212, 200, 115),
                new Color(206, 184, 98),
                new Color(200, 170, 85),
                new Color(193, 155, 74),
                new Color(186, 142, 66),
                new Color(177, 130, 62),
                new Color(167, 118, 60),
                new Color(156, 107, 59),
                new Color(143, 97, 58),
                new Color(130, 88, 57),
                new Color(117, 80, 55),
                new Color(102, 72, 53),
                new Color(89, 64, 49),
                new Color(74, 56, 44),
                new Color(61, 48, 39),
                new Color(47, 39, 33),
                new Color(34, 31, 27)

        );


    }


}
