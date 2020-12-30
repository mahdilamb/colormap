package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * CMOceans's Topo
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Topo", source = "Ocean")
public final class Topo extends SequentialColormap {

    /**
     * Create a colormap based on CMOceans's Topo
     */
    public Topo() {
        super(
                new Color(249, 253, 228),
                new Color(244, 246, 217),
                new Color(228, 218, 174),
                new Color(214, 191, 132),
                new Color(202, 165, 90),
                new Color(179, 145, 63),
                new Color(145, 129, 64),
                new Color(113, 114, 61),
                new Color(81, 99, 51),
                new Color(48, 85, 32),
                new Color(27, 65, 29),
                new Color(17, 44, 23),
                new Color(223, 242, 187),
                new Color(172, 225, 168),
                new Color(122, 206, 163),
                new Color(91, 184, 164),
                new Color(78, 159, 161)

        );

    }


}
