package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Plotly's Armyrose
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "ArmyRose",source = "CARTO")
public final class ArmyRose extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Armyrose
     */
    public ArmyRose() {
        super(
                new Color(121, 130, 52),
                new Color(163, 173, 98),
                new Color(208, 211, 162),
                new Color(253, 251, 228),
                new Color(240, 198, 195),
                new Color(223, 145, 163),
                new Color(212, 103, 128)

        );

    }


}
