package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Sequential ColorBrewer colormap going through Oranges.
 */
@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "Oranges")
public final class Oranges extends LinearColorMap {
    public Oranges() {
        super(
                new Color(255, 245, 235),
                new Color(254, 230, 206),
                new Color(253, 208, 162),
                new Color(253, 174, 107),
                new Color(253, 141, 60),
                new Color(241, 105, 19),
                new Color(217, 72, 1),
                new Color(166, 54, 3),
                new Color(127, 39, 4));

    }


}
