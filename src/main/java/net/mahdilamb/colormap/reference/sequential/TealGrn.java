package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Tealgrn sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "TealGrn",source = "CARTO")
public final class TealGrn extends SequentialColormap {
    /**
     * Create a colormap based on Tealgrn from Plotly
     */
    public TealGrn() {
        super(
                new Color(176, 242, 188),
                new Color(137, 232, 172),
                new Color(103, 219, 165),
                new Color(76, 200, 163),
                new Color(56, 178, 163),
                new Color(44, 152, 160),
                new Color(37, 125, 152)


        );


    }


}
