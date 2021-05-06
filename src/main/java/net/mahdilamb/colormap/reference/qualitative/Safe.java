package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Safe qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Safe",source = "CARTO")
public final class Safe extends QualitativeColormap {

    /**
     * Create a colormap based on Safe colormap
     */
    public Safe() {
        super(
                new Color(136, 204, 238),
                new Color(204, 102, 119),
                new Color(221, 204, 119),
                new Color(17, 119, 51),
                new Color(51, 34, 136),
                new Color(170, 68, 153),
                new Color(68, 170, 153),
                new Color(153, 153, 51),
                new Color(136, 34, 85),
                new Color(102, 17, 0),
                new Color(102, 153, 204),
                new Color(136, 136, 136)

        );

    }


}
