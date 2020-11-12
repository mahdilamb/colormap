package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Purples.
 */
@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Purples")
public final class Purples extends LinearColorMap {
    /**
     * Create a colormap based on ColorBrewer Purples.
     */
    public Purples() {
        super(
                new Color(252, 251, 253),
                new Color(239, 237, 245),
                new Color(218, 218, 235),
                new Color(188, 189, 220),
                new Color(158, 154, 200),
                new Color(128, 125, 186),
                new Color(106, 81, 163),
                new Color(84, 39, 143),
                new Color(63, 0, 125));

    }


}
