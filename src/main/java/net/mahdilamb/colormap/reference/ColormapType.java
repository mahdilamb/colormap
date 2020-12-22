package net.mahdilamb.colormap.reference;

/**
 * The type of ColorMap
 */
public enum ColormapType {
    /**
     * A color map that diverges from the middle value in a sequential manner.
     */
    DIVERGING,
    /**
     * A color map made up of "blocks" of colors that do not interpolate.
     */
    QUALITATIVE,
    /**
     * A color map where colors interpolate from one to another.
     */
    SEQUENTIAL,
    /**
     * A colormap which starts and ends on the same color, but changes within.
     */
    CYCLIC
}
