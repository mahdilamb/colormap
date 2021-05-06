package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Plotly's Temps
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Temps", source = "CARTO")
public final class Temps extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Temps
     */
    public Temps() {
        super(
                new Color(0, 147, 146),
                new Color(57, 177, 133),
                new Color(156, 203, 134),
                new Color(233, 226, 156),
                new Color(238, 180, 121),
                new Color(232, 132, 113),
                new Color(207, 89, 126)


        );

    }


}
