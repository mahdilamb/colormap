package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Dense sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Dense",source = "Ocean")
public final class Dense extends SequentialColormap {
    /**
     * Create a colormap based on Dense from Plotly
     */
    public Dense() {
        super(
                new Color(230, 241, 241),
                new Color(208, 230, 233),
                new Color(185, 218, 228),
                new Color(165, 207, 226),
                new Color(146, 195, 226),
                new Color(131, 182, 227),
                new Color(120, 168, 228),
                new Color(116, 154, 228),
                new Color(116, 138, 226),
                new Color(118, 121, 218),
                new Color(120, 106, 208),
                new Color(121, 90, 193),
                new Color(120, 76, 177),
                new Color(117, 62, 159),
                new Color(112, 49, 138),
                new Color(106, 38, 117),
                new Color(96, 28, 94),
                new Color(85, 22, 73),
                new Color(70, 18, 52),
                new Color(54, 14, 36)

        );


    }


}
