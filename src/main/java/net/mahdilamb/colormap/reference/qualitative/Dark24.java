package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Dark24 qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Dark24", source = "Polychrome")
public final class Dark24 extends QualitativeColormap {

    /**
     * Create a colormap based on Dark24 colormap
     */
    public Dark24() {
        super(
                new Color(46,145,229),
                new Color(225,95,153),
                new Color(28,167,28),
                new Color(251,13,13),
                new Color(218,22,255),
                new Color(34,42,42),
                new Color(182,129,0),
                new Color(117,13,134),
                new Color(235,102,59),
                new Color(81,28,251),
                new Color(0,160,139),
                new Color(251,0,209),
                new Color(252,0,128),
                new Color(178,130,141),
                new Color(108,124,50),
                new Color(119,138,174),
                new Color(134,42,22),
                new Color(167,119,241),
                new Color(98,0,66),
                new Color(22,22,167),
                new Color(218,96,202),
                new Color(108,69,22),
                new Color(13,42,99),
                new Color(175,0,56)
        );

    }


}
