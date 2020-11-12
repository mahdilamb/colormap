package net.mahdilamb.colormap.diverging.colorbrewer;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colorbrewer 2.0 colormap BrBG.
 */
@NewColorMap(type = ColorMapType.DIVERGING, name = "BrBG")
public final class BrBG extends LinearColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 colormap BrBG.
     */
    public BrBG() {
        super(
                new Color(84, 48, 5),
                new Color(140, 81, 10),
                new Color(191, 129, 45),
                new Color(223, 194, 125),
                new Color(246, 232, 195),
                new Color(245, 245, 245),
                new Color(199, 234, 229),
                new Color(128, 205, 193),
                new Color(53, 151, 143),
                new Color(1, 102, 94),
                new Color(0, 60, 48)
        );
    }

}
