package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Jet sequential colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Jet")
public final class Jet extends SequentialColormap {
    /**
     * Create a colormap based on Jet
     */
    public Jet() {
        super(
                new Color(0, 0, 131),
                new Color(0, 60, 170),
                new Color(5, 255, 255),
                Color.YELLOW,
                new Color(250, 0, 0),
                new Color(128, 0, 0)
        );
    }
}
