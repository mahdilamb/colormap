package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Deep sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Deep", source = "Ocean")
public final class Deep extends SequentialColormap {
    /**
     * Create a colormap based on Deep from Plotly
     */
    public Deep() {
        super(
                new Color(253, 254, 204),
                new Color(227, 244, 189),
                new Color(198, 234, 176),
                new Color(170, 224, 168),
                new Color(139, 214, 163),
                new Color(115, 203, 163),
                new Color(97, 190, 164),
                new Color(86, 176, 164),
                new Color(80, 163, 162),
                new Color(74, 149, 159),
                new Color(70, 136, 156),
                new Color(66, 122, 153),
                new Color(63, 109, 151),
                new Color(62, 96, 148),
                new Color(63, 80, 142),
                new Color(66, 67, 128),
                new Color(63, 56, 105),
                new Color(57, 46, 84),
                new Color(48, 36, 62),
                new Color(40, 26, 44)

        );


    }


}
