package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Bold qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Bold")
public final class Bold extends QualitativeColormap {

    /**
     * Create a colormap based on Bold colormap
     */
    public Bold() {
        super(
                new Color(127, 60, 141),
                new Color(17, 165, 121),
                new Color(57, 105, 172),
                new Color(242, 183, 1),
                new Color(231, 63, 116),
                new Color(128, 186, 90),
                new Color(230, 131, 16),
                new Color(0, 134, 149),
                new Color(207, 28, 144),
                new Color(249, 123, 114),
                new Color(165, 170, 153)
        );

    }


}
