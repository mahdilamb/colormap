package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Vivid qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Vivid", source = "CARTO")
public final class Vivid extends QualitativeColormap {

    /**
     * Create a colormap based on Vivid colormap
     */
    public Vivid() {
        super(
                new Color(229, 134, 6),
                new Color(93, 105, 177),
                new Color(82, 188, 163),
                new Color(153, 201, 69),
                new Color(204, 97, 176),
                new Color(36, 121, 108),
                new Color(218, 165, 27),
                new Color(47, 138, 196),
                new Color(118, 78, 159),
                new Color(237, 100, 90),
                new Color(204, 58, 142),
                new Color(165, 170, 153)

        );

    }


}
