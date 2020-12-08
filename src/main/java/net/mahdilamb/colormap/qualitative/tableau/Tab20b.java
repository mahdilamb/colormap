package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColormap;
import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Tableau Tab20c
 */
@NewColormap(type = ColormapType.QUALITATIVE, name = "Tab20b")
public final class Tab20b extends CategoricalColormap {
    /**
     * Create a colormap based on Tableau Tab20b
     */
    public Tab20b() {
        super(
                Color.create("#393B79"),
                Color.create("#5254A3"),
                Color.create("#6B6ECF"),
                Color.create("#9C9EDE"),
                Color.create("#637939"),
                Color.create("#8CA252"),
                Color.create("#B5CF6B"),
                Color.create("#CEDB9C"),
                Color.create("#8C6D31"),
                Color.create("#BD9E39"),
                Color.create("#E7BA52"),
                Color.create("#E7CB94"),
                Color.create("#843C39"),
                Color.create("#AD494A"),
                Color.create("#D6616B"),
                Color.create("#E7969C"),
                Color.create("#7B4173"),
                Color.create("#A55194"),
                Color.create("#CE6DBD"),
                Color.create("#DE9ED6"));
    }

}
