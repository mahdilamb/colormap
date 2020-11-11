package net.mahdilamb.colormap.color;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

/**
 * Annotation to help in the discovery and cache of constant colors
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
public @interface NewColor {
    /**
     *
     * @return Category of the Color
     */
    ColorType type();

    /**
     *
     * @return Name of the color
     */
    String name();
}
