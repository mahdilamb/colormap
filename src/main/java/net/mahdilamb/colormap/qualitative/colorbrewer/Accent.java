package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;
/**
 * Colorbrewer 2.0 Accent
 */
@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Accent")
public final class Accent extends CategoricalColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Accent
     */
    public Accent() {
        super(
                new Color(127, 201, 127),
                new Color(190, 174, 212),
                new Color(253, 192, 134),
                new Color(255, 255, 153),
                new Color(56, 108, 176),
                new Color(240, 2, 127),
                new Color(191, 91, 23),
                new Color(102, 102, 102));

    }


}
