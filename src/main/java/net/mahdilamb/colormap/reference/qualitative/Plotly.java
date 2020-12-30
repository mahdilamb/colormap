package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Plotly")
public final class Plotly extends QualitativeColormap {

    /**
     * Create a colormap based on Plotly colormap
     */
    public Plotly() {
        super(
                new Color(99, 110, 250),
                new Color(239, 85, 59),
                new Color(0, 204, 150),
                new Color(171, 99, 250),
                new Color(255, 161, 90),
                new Color(25, 211, 243),
                new Color(255, 102, 146),
                new Color(182, 232, 128),
                new Color(255, 151, 255),
                new Color(254, 203, 82)
        );

    }


}
