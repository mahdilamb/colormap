package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Plotly's cyclic colormap Phase
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "Phase", source = "Ocean")
public final class Phase extends SequentialColormap {

    /**
     * Create a colormap based on the Plotly's colormap Phase.
     */
    public Phase() {
        super(
                new Color(168, 120, 13),
                new Color(186, 107, 35),
                new Color(202, 92, 58),
                new Color(213, 75, 83),
                new Color(221, 56, 118),
                new Color(222, 40, 157),
                new Color(212, 42, 199),
                new Color(195, 62, 226),
                new Color(172, 84, 241),
                new Color(143, 105, 244),
                new Color(110, 122, 235),
                new Color(71, 136, 213),
                new Color(42, 144, 186),
                new Color(26, 148, 160),
                new Color(14, 152, 132),
                new Color(19, 154, 102),
                new Color(60, 153, 60),
                new Color(107, 144, 23),
                new Color(143, 132, 13),
                new Color(168, 120, 13)

        );
    }
}
