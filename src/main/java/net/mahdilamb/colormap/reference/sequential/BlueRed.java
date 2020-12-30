package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * BlueRed sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BlueRed")
public final class BlueRed extends SequentialColormap {
    /**
     * Create a colormap based onBlueRed
     */
    public BlueRed() {
        super(
                Color.BLUE,
                Color.RED
        );


    }


}
