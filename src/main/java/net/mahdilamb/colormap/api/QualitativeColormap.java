package net.mahdilamb.colormap.api;

import net.mahdilamb.colormap.Color;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * A basic qualitative colormap that is primarily used by reference colormaps
 * through extension.
 */
public class QualitativeColormap implements Colormap {
    private final NavigableMap<Float, RGBA> colors = new TreeMap<>();
    private final RGBA NaNColor;
    private final RGBA lowColor;
    private final RGBA highColor;

    /**
     * Create a new qualitative colormap
     *
     * @param colors    the colors in the color map
     * @param NaNColor  the color to use if the value is NaN
     * @param lowColor  the color to use if the value is below 0
     * @param highColor the color to use if the value is above 1
     */
    protected QualitativeColormap(RGBA[] colors, RGBA NaNColor, RGBA lowColor, RGBA highColor) {
        for (int i = 0; i < colors.length; i++) {
            this.colors.put((float) i / (colors.length), colors[i]);
        }
        this.colors.put(1f, colors[colors.length - 1]);

        this.NaNColor = NaNColor == null ? Color.BLACK : NaNColor;
        this.lowColor = lowColor == null ? this.colors.firstEntry().getValue() : lowColor;
        this.highColor = highColor == null ? this.colors.lastEntry().getValue() : highColor;
    }

    /**
     * Create a new qualitative colormap that is autoranging
     *
     * @param colors the colors in the color map
     */
    protected QualitativeColormap(RGBA... colors) {
        this(colors, null, null, null);
    }

    @Override
    public RGBA get(Float position) {
        if (position == null || !Float.isFinite(position)) {
            return NaNColor;
        }
        if (position < 0) {
            return lowColor;
        } else if (position > 1) {
            return highColor;
        } else {
            if (colors.size() <= 1) {
                return colors.firstEntry().getValue();
            } else {
                return colors.floorEntry(position).getValue();
            }
        }
    }

    @Override
    public RGBA getNaNColor() {
        return NaNColor;
    }

    @Override
    public RGBA getLowColor() {
        return lowColor;
    }

    @Override
    public RGBA getHighColor() {
        return highColor;
    }

    @Override
    public Collection<Float> getDefinedPositions() {
        return Collections.unmodifiableCollection(colors.keySet());
    }

    @Override
    public final String toString() {
        return String.format("Colormap {%s}", getClass().getSimpleName());
    }
}
