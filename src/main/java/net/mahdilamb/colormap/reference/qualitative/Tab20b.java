package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.Colors;
import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Tableau Tab20c
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab20b",source = "Tableau")
public final class Tab20b extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab20b
     */
    public Tab20b() {
        super(
                Colors.fromHexadecimal("#393B79"),
                Colors.fromHexadecimal("#5254A3"),
                Colors.fromHexadecimal("#6B6ECF"),
                Colors.fromHexadecimal("#9C9EDE"),
                Colors.fromHexadecimal("#637939"),
                Colors.fromHexadecimal("#8CA252"),
                Colors.fromHexadecimal("#B5CF6B"),
                Colors.fromHexadecimal("#CEDB9C"),
                Colors.fromHexadecimal("#8C6D31"),
                Colors.fromHexadecimal("#BD9E39"),
                Colors.fromHexadecimal("#E7BA52"),
                Colors.fromHexadecimal("#E7CB94"),
                Colors.fromHexadecimal("#843C39"),
                Colors.fromHexadecimal("#AD494A"),
                Colors.fromHexadecimal("#D6616B"),
                Colors.fromHexadecimal("#E7969C"),
                Colors.fromHexadecimal("#7B4173"),
                Colors.fromHexadecimal("#A55194"),
                Colors.fromHexadecimal("#CE6DBD"),
                Colors.fromHexadecimal("#DE9ED6"));
    }

}
