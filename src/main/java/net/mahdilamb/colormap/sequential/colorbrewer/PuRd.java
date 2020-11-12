package net.mahdilamb.colormap.sequential.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "PuRd")
public final class PuRd extends LinearColorMap {
    public PuRd() {
        super(
                new Color(247, 244, 249),
                new Color(231, 225, 239),
                new Color(212, 185, 218),
                new Color(201, 148, 199),
                new Color(223, 101, 176),
                new Color(231, 41, 138),
                new Color(206, 18, 86),
                new Color(152, 0, 67),
                new Color(103, 0, 31));


    }


}
