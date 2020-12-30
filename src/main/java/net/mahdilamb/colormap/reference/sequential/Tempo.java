package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Tempo sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Tempo")
public final class Tempo extends SequentialColormap {
    /**
     * Create a colormap based on Tempo from Plotly
     */
    public Tempo() {
        super(
                new Color(254, 245, 244),
                new Color(222, 224, 210),
                new Color(189, 206, 181),
                new Color(153, 189, 156),
                new Color(110, 173, 138),
                new Color(65, 157, 129),
                new Color(25, 137, 125),
                new Color(18, 116, 117),
                new Color(25, 94, 106),
                new Color(28, 72, 93),
                new Color(25, 51, 80),
                new Color(20, 29, 67)


        );


    }


}
