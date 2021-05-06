package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * CMOceans's Tarn
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Tarn", source = "Ocean")
public final class Tarn extends SequentialColormap {

    /**
     * Create a colormap based on CMOceans's Tarn
     */
    public Tarn() {
        super(
                new Color(16, 30, 79),
                new Color(14, 36, 86),
                new Color(12, 60, 99),
                new Color(23, 83, 107),
                new Color(30, 105, 118),
                new Color(46, 126, 126),
                new Color(84, 145, 133),
                new Color(121, 162, 143),
                new Color(156, 181, 154),
                new Color(193, 200, 166),
                new Color(227, 219, 194),
                new Color(249, 244, 237),
                new Color(247, 234, 226),
                new Color(233, 205, 184),
                new Color(221, 177, 142),
                new Color(210, 150, 100),
                new Color(193, 127, 60),
                new Color(158, 115, 45),
                new Color(123, 103, 34),
                new Color(90, 89, 24),
                new Color(57, 75, 12),
                new Color(38, 56, 16),
                new Color(23, 35, 14)

        );

    }


}
