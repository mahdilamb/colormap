package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BuPu")
public final class BuPu extends LinearColorMap {
    public BuPu() {
        super(
                new Color(247, 252, 253),
                new Color(224, 236, 244),
                new Color(191, 211, 230),
                new Color(158, 188, 218),
                new Color(140, 150, 198),
                new Color(140, 107, 177),
                new Color(136, 65, 157),
                new Color(129, 15, 124),
                new Color(77, 0, 75));

    }


}
