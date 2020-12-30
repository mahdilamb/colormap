package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * D3 qualitative colormap
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "D3")
public final class D3 extends QualitativeColormap {

    /**
     * Create a colormap based on D3 colormap
     */
    public D3() {
        super(
                new Color(31, 119, 180),
                new Color(255, 127, 14),
                new Color(44, 160, 44),
                new Color(214, 39, 40),
                new Color(148, 103, 189),
                new Color(140, 86, 75),
                new Color(227, 119, 194),
                new Color(127, 127, 127),
                new Color(188, 189, 34),
                new Color(23, 190, 207)
                );

    }


}
