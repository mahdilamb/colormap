package net.mahdilamb.colormap;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * An annotation used to find Colormaps through reflections.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(TYPE)
public @interface NewColorMap {
    /**
     * @return The type of the color map
     */
    ColorMapType type();

    /**
     * @return The name of the color map.
     */
    String name();
}
