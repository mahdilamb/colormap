package net.mahdilamb.colormap;


import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.colormap.color.ColorImpl;

import java.util.Objects;

/**
 * Colormap that can be changed
 */
public final class DynamicColormap extends AbstractColormap {
    private Colormap currentColormap;

    /**
     * Construct a dynamic colormap
     *
     * @param colorMap The initial colormap. Should not be {@code null}
     */
    public DynamicColormap(Colormap colorMap) {
        setColorMap(colorMap);
    }

    /**
     * Set the current colormap.
     *
     * @param newColorMap Thew new color map.
     */
    public final void setColorMap(Colormap newColorMap) {
        Objects.requireNonNull(newColorMap);
        definedColorNodes.clear();
        definedColorNodes.putAll(newColorMap.getFixedColors());

        colorMapColors.clear();
        colorMapColors.addAll(newColorMap.getSparseColors());

        lowValue = newColorMap.lowValue();
        highValue = newColorMap.highValue();

        NaNColor = newColorMap.getNaNColor();
        lowColor = newColorMap.getLowColor();
        highColor = newColorMap.getHighColor();

        isReversed = newColorMap.isReversed();

        currentColormap = newColorMap;
        recalculateNodes();

    }

    @Override
    public final Color colorAt(double value) {
        return currentColormap.colorAt(value);
    }

    @Override
    public final DynamicColormap clone() {
        return new DynamicColormap(this);
    }
}
