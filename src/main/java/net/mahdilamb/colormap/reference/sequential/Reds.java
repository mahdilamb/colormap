package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.api.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Sequential ColorBrewer colormap going through Reds.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Reds")
public final class Reds extends SequentialColormap {
    /**
     * Create a colormap based on ColorBrewer Reds.
     */
    public Reds() {
        super(
                new Color(255, 245, 240),
                new Color(254, 224, 210),
                new Color(252, 187, 161),
                new Color(252, 146, 114),
                new Color(251, 106, 74),
                new Color(239, 59, 44),
                new Color(203, 24, 29),
                new Color(165, 15, 21),
                new Color(103, 0, 13));

    }


}
