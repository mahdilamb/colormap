package net.mahdilamb.colormap.reference.diverging;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Plotly's Delta
 */
@ReferenceColormap(type = ColormapType.DIVERGING, name = "Delta", source = "Ocean")
public final class Delta extends SequentialColormap {

    /**
     * Create a colormap based on Plotly's Delta
     */
    public Delta() {
        super(
                new Color(17, 32, 64),
                new Color(33, 49, 109),
                new Color(33, 70, 154),
                new Color(27, 99, 159),
                new Color(38, 126, 165),
                new Color(56, 150, 171),
                new Color(91, 174, 177),
                new Color(143, 194, 187),
                new Color(190, 215, 205),
                new Color(233, 238, 224),
                new Color(246, 237, 177),
                new Color(227, 207, 119),
                new Color(197, 184, 63),
                new Color(155, 166, 20),
                new Color(108, 150, 7),
                new Color(61, 133, 27),
                new Color(19, 111, 41),
                new Color(15, 86, 44),
                new Color(25, 61, 36),
                new Color(23, 35, 19)
        );

    }


}
