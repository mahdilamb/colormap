package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Hot sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Hot", source = "Plotly")
public final class Hot extends SequentialColormap {
    /**
     * Create a colormap based on Hot from Plotly
     */
    public Hot() {
        super(
                Color.BLACK,
                new Color(230, 0, 0),
                new Color(255, 210, 0),
                Color.WHITE


        );


    }


}
