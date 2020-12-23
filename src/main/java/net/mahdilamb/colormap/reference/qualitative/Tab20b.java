package net.mahdilamb.colormap.reference.qualitative;

import net.mahdilamb.colormap.QualitativeColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * Tableau Tab20c
 */
@ReferenceColormap(type = ColormapType.QUALITATIVE, name = "Tab20b")
public final class Tab20b extends QualitativeColormap {
    /**
     * Create a colormap based on Tableau Tab20b
     */
    public Tab20b() {
        super(
                new Color("#393B79"),
                new Color("#5254A3"),
                new Color("#6B6ECF"),
                new Color("#9C9EDE"),
                new Color("#637939"),
                new Color("#8CA252"),
                new Color("#B5CF6B"),
                new Color("#CEDB9C"),
                new Color("#8C6D31"),
                new Color("#BD9E39"),
                new Color("#E7BA52"),
                new Color("#E7CB94"),
                new Color("#843C39"),
                new Color("#AD494A"),
                new Color("#D6616B"),
                new Color("#E7969C"),
                new Color("#7B4173"),
                new Color("#A55194"),
                new Color("#CE6DBD"),
                new Color("#DE9ED6"));
    }

}
