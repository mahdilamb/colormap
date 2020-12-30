package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Light24 qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Light24", source = "Polychrome")
public final class Light24 extends QualitativeColormap {

    /**
     * Create a colormap based on Light24 colormap
     */
    public Light24() {
        super(
                new Color(253, 50, 22),
                new Color(0, 254, 53),
                new Color(106, 118, 252),
                new Color(254, 212, 196),
                new Color(254, 0, 206),
                new Color(13, 249, 255),
                new Color(246, 249, 38),
                new Color(255, 150, 22),
                new Color(71, 155, 85),
                new Color(238, 166, 251),
                new Color(220, 88, 125),
                new Color(214, 38, 255),
                new Color(110, 137, 156),
                new Color(0, 181, 247),
                new Color(182, 142, 0),
                new Color(201, 251, 229),
                new Color(255, 0, 146),
                new Color(34, 255, 167),
                new Color(227, 238, 158),
                new Color(134, 206, 0),
                new Color(188, 113, 150),
                new Color(126, 125, 205),
                new Color(252, 105, 85),
                new Color(228, 143, 114)
        );

    }


}
