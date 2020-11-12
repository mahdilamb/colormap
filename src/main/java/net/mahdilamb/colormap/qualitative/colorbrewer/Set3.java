package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 Set3
 */
@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Set3")
public final class Set3 extends CategoricalColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Set3
     */
    public Set3() {
        super(
                new Color(141, 211, 199),
                new Color(255, 255, 179),
                new Color(190, 186, 218),
                new Color(251, 128, 114),
                new Color(128, 177, 211),
                new Color(253, 180, 98),
                new Color(179, 222, 105),
                new Color(252, 205, 229),
                new Color(217, 217, 217),
                new Color(188, 128, 189),
                new Color(204, 235, 197),
                new Color(255, 237, 111));

    }


}
