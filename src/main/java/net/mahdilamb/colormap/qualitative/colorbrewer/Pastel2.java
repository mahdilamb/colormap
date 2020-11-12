package net.mahdilamb.colormap.qualitative.colorbrewer;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;
/**
 * Colorbrewer 2.0 Pastel2
 */
@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Pastel2")
public final class Pastel2 extends CategoricalColorMap {
    /**
     * Create a colormap based on Colorbrewer 2.0 Pastel2
     */
    public Pastel2() {
        super(
                new Color(179, 226, 205),
                new Color(253, 205, 172),
                new Color(203, 213, 232),
                new Color(244, 202, 228),
                new Color(230, 245, 201),
                new Color(255, 242, 174),
                new Color(241, 226, 204),
                new Color(204, 204, 204));
    }

}
