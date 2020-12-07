package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;

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
                new ColorImpl(255, 245, 240),
                new ColorImpl(254, 224, 210),
                new ColorImpl(252, 187, 161),
                new ColorImpl(252, 146, 114),
                new ColorImpl(251, 106, 74),
                new ColorImpl(239, 59, 44),
                new ColorImpl(203, 24, 29),
                new ColorImpl(165, 15, 21),
                new ColorImpl(103, 0, 13));

    }


}
