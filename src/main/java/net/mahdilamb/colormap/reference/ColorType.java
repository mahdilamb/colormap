package net.mahdilamb.colormap.reference;

/**
 * The type of color as used by the {@link ReferenceColor} annotation
 */
public enum ColorType {
    /**
     * Color from CSS4
     */
    CSS("css"),
    /**
     * Color present in JavaSE's AWT
     */
    AWT("awt"),
    /**
     * Color from the Tableau package
     */
    TABLEAU("tab"),
    /**
     * Color from XKCD package
     */
    XKCD("xkcd");
    private final String prefix;

    ColorType(final String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return the color prefix
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * Convert a string representation of the color type to an enum
     * @param prefix the prefix to convert
     * @return the enum associated with the prefix
     */
    public static ColorType from(final String prefix) {
        switch (prefix.toLowerCase()) {
            case "css":
                return CSS;
            case "awt":
                return AWT;
            case "tab":
                return TABLEAU;
            case "xkcd":
                return XKCD;
        }
        throw new IllegalArgumentException(prefix + " not found");
    }
}
