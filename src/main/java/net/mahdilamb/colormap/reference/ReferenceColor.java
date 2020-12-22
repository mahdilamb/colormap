package net.mahdilamb.colormap.reference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Annotation to help in the discovery and cache of constant colors
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ReferenceColor {
    /**
     * @return Category of the Color
     */
    ColorType type();

    /**
     * @return Name of the color
     */
    String name();


}
