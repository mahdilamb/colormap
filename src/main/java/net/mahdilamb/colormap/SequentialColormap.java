package net.mahdilamb.colormap;

import java.util.*;

/**
 * Create a sequential colormap. Designed to be extended to create
 * reference colormaps. Also enables making a colormap without using the builder
 */
public class SequentialColormap implements Colormap {
    private final NavigableMap<Float, Color> colors = new TreeMap<>();
    private final Color NaNColor;
    private final Color lowColor;
    private final Color highColor;
    private final float precision;

    /**
     * Create a sequential colormap with the given colors
     *
     * @param colors    the list of colors to use
     * @param NaNColor  the color to use if the value is null or not finite
     * @param lowColor  the color to use if the value is less than 0
     * @param highColor the color to use if the value is greater than 1
     * @param precision the precision of the sampling
     */
    protected SequentialColormap(Color[] colors, Color NaNColor, Color lowColor, Color highColor, float precision) {
        for (int i = 0; i < colors.length; i++) {
            this.colors.put((float) i / (colors.length - 1), colors[i]);
        }
        this.NaNColor = NaNColor == null ? Color.BLACK : NaNColor;
        this.lowColor = lowColor == null ? this.colors.firstEntry().getValue() : lowColor;
        this.highColor = highColor == null ? this.colors.lastEntry().getValue() : highColor;
        this.precision = precision;
    }

    /**
     * Create a sequential colormap with the given colors
     *
     * @param colors    the list of colors to use
     * @param NaNColor  the color to use if the value is null or not finite
     * @param lowColor  the color to use if the value is less than 0
     * @param highColor the color to use if the value is greater than 1
     */
    protected SequentialColormap(Color[] colors, Color NaNColor, Color lowColor, Color highColor) {
        this(colors, NaNColor, lowColor, highColor, Float.POSITIVE_INFINITY);
    }

    /**
     * Create a sequential colormap with the given colors
     *
     * @param colors the list of colors to use
     */
    public SequentialColormap(Color... colors) {
        this(colors, null, null, null);
    }

    @Override
    public Color get(Float position) {
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
                final Map.Entry<Float, Color> lowKey = colors.floorEntry(position);
                if (lowKey.getKey().compareTo(position) == 0) {
                    return lowKey.getValue();
                }
                final Map.Entry<Float, Color> highKey = colors.higherEntry(lowKey.getKey());
                if (highKey.getKey().compareTo(position) == 0) {
                    return highKey.getValue();
                }
                final float p = (position - lowKey.getKey()) / (highKey.getKey() - lowKey.getKey());
                return Colors.lerp(lowKey.getValue(), highKey.getValue(), Float.isFinite(precision) ? ((float) Math.floor((p + precision / 2) / precision) * precision) : p);
            }
        }
    }

    @Override
    public Color getNaNColor() {
        return NaNColor;
    }

    @Override
    public Color getLowColor() {
        return lowColor;
    }

    @Override
    public Color getHighColor() {
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
