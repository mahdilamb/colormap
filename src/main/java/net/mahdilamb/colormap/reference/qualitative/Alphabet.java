package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Alphabet qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Alphabet",source = "Polychrome")
public final class Alphabet extends QualitativeColormap {

    /**
     * Create a colormap based on Alphabet colormap
     */
    public Alphabet() {
        super(
                new Color(170, 13, 254),
                new Color(50, 131, 254),
                new Color(133, 102, 13),
                new Color(120, 42, 182),
                new Color(86, 86, 86),
                new Color(28, 131, 86),
                new Color(22, 255, 50),
                new Color(247, 225, 160),
                new Color(226, 226, 226),
                new Color(28, 190, 79),
                new Color(196, 69, 28),
                new Color(222, 160, 253),
                new Color(254, 0, 250),
                new Color(50, 90, 155),
                new Color(254, 175, 22),
                new Color(248, 161, 159),
                new Color(144, 173, 28),
                new Color(246, 34, 46),
                new Color(28, 255, 206),
                new Color(46, 217, 255),
                new Color(177, 13, 161),
                new Color(192, 117, 166),
                new Color(252, 28, 191),
                new Color(176, 0, 104),
                new Color(251, 228, 38),
                new Color(250, 0, 135)
        );

    }


}
