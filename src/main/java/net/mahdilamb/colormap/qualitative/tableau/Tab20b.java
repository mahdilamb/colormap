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
                Color.from("#393B79"),
                Color.from("#5254A3"),
                Color.from("#6B6ECF"),
                Color.from("#9C9EDE"),
                Color.from("#637939"),
                Color.from("#8CA252"),
                Color.from("#B5CF6B"),
                Color.from("#CEDB9C"),
                Color.from("#8C6D31"),
                Color.from("#BD9E39"),
                Color.from("#E7BA52"),
                Color.from("#E7CB94"),
                Color.from("#843C39"),
                Color.from("#AD494A"),
                Color.from("#D6616B"),
                Color.from("#E7969C"),
                Color.from("#7B4173"),
                Color.from("#A55194"),
                Color.from("#CE6DBD"),
                Color.from("#DE9ED6"));
    }

}
