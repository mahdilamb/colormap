package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * CMOceans's Rain
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Rain", source = "Ocean")
public final class Rain extends SequentialColormap {

    /**
     * Create a colormap based on CMOceans's Rain
     */
    public Rain() {
        super(
                new Color(34, 27, 56),
                new Color(34, 30, 58),
                new Color(36, 41, 67),
                new Color(37, 53, 76),
                new Color(35, 64, 86),
                new Color(30, 75, 95),
                new Color(21, 87, 102),
                new Color(9, 98, 107),
                new Color(3, 109, 109),
                new Color(9, 120, 110),
                new Color(27, 130, 110),
                new Color(52, 139, 109),
                new Color(79, 147, 110),
                new Color(103, 154, 114),
                new Color(126, 161, 119),
                new Color(147, 168, 126),
                new Color(168, 174, 133),
                new Color(188, 181, 141),
                new Color(207, 188, 156),
                new Color(216, 199, 180),
                new Color(222, 212, 203),
                new Color(229, 225, 224),
                new Color(238, 237, 243)

        );

    }


}
