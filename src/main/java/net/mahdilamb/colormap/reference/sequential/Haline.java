package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Haline sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Haline", source = "Ocean")
public final class Haline extends SequentialColormap {
    /**
     * Create a colormap based on Haline from Plotly
     */
    public Haline() {
        super(
                new Color(42, 24, 108),
                new Color(46, 28, 140),
                new Color(38, 43, 163),
                new Color(22, 64, 157),
                new Color(12, 81, 149),
                new Color(17, 94, 143),
                new Color(29, 107, 139),
                new Color(39, 118, 138),
                new Color(48, 129, 137),
                new Color(56, 141, 136),
                new Color(63, 153, 134),
                new Color(71, 165, 131),
                new Color(81, 177, 125),
                new Color(94, 189, 117),
                new Color(115, 200, 106),
                new Color(141, 210, 95),
                new Color(175, 217, 93),
                new Color(204, 223, 106),
                new Color(231, 231, 129),
                new Color(253, 239, 154)
        );


    }


}
