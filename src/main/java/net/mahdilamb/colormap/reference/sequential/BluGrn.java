package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Blugrn sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BluGrn",source = "CARTO")
public final class BluGrn extends SequentialColormap {
    /**
     * Create a colormap based on Blugrn from Plotly
     */
    public BluGrn() {
        super(
                new Color(196, 230, 195),
                new Color(150, 210, 164),
                new Color(109, 188, 144),
                new Color(77, 162, 132),
                new Color(54, 135, 122),
                new Color(38, 107, 110),
                new Color(29, 79, 96)

        );


    }


}
