package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Earth
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Earth",source = "CARTO")
public final class Earth extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Earth
     */
    public Earth() {
        super(
                new Color(161, 105, 40),
                new Color(189, 146, 90),
                new Color(214, 189, 141),
                new Color(237, 234, 194),
                new Color(181, 200, 184),
                new Color(121, 167, 172),
                new Color(40, 135, 161)


        );

    }


}
