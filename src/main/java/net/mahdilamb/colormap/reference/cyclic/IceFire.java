package net.mahdilamb.colormap.reference.cyclic;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's cyclic colormap IceFire
 */
@ReferenceColormap(type = ColormapType.CYCLIC, name = "IceFire")
public final class IceFire extends SequentialColormap {

    /**
     * Create a colormap based on the Plotly's colormap IceFire.
     */
    public IceFire() {
        super(
                Color.BLACK,
                new Color(0, 31, 77),
                new Color(0, 55, 134),
                new Color(14, 88, 168),
                new Color(33, 126, 184),
                new Color(48, 164, 202),
                new Color(84, 200, 223),
                new Color(155, 228, 239),
                new Color(225, 233, 209),
                new Color(243, 213, 115),
                new Color(231, 176, 0),
                new Color(218, 130, 0),
                new Color(198, 84, 0),
                new Color(172, 35, 1),
                new Color(130, 0, 0),
                new Color(76, 0, 0),
                Color.BLACK

        );
    }
}
