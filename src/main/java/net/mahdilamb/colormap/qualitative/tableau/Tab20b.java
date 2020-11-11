package net.mahdilamb.colormap.qualitative.tableau;

import net.mahdilamb.colormap.CategoricalColorMap;
import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.QUALITATIVE, name = "Tab20b")
public final class Tab20b extends CategoricalColorMap {
    public Tab20b(){super(
                new Color("#393B79"),
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
