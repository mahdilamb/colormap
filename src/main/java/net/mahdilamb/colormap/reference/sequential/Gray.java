package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Gray sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Gray",source = "Ocean")
public final class Gray extends SequentialColormap {
    /**
     * Create a colormap based on Gray from Plotly
     */
    public Gray() {
        super(
                Color.BLACK,
                new Color(16, 16, 16),
                new Color(38, 38, 38),
                new Color(59, 59, 59),
                new Color(81, 80, 80),
                new Color(102, 101, 101),
                new Color(124, 123, 122),
                new Color(146, 146, 145),
                new Color(171, 171, 170),
                new Color(197, 197, 195),
                new Color(224, 224, 223),
                new Color(254, 254, 253)

        );


    }


}
