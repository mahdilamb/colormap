package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Reds.
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Reds")
public final class Reds extends LinearColormap {
    /**
     * Create a colormap based on ColorBrewer Reds.
     */
    public Reds() {
        super(
                Color.create(255, 245, 240),
                Color.create(254, 224, 210),
                Color.create(252, 187, 161),
                Color.create(252, 146, 114),
                Color.create(251, 106, 74),
                Color.create(239, 59, 44),
                Color.create(203, 24, 29),
                Color.create(165, 15, 21),
                Color.create(103, 0, 13));

    }


}
