package net.mahdilamb.colormap;

import java.util.*;
import java.awt.Color;
/**
 * Create a sequential colormap. Designed to be extended to create
 * reference colormaps. Also enables making a colormap without using the builder
 */
public class SequentialColormap implements Colormap {
    private final Color[] colors;
    private final Color NaNColor;
    private final Color lowColor;
    private final Color highColor;
    private final float precision;
    private Collection<Float> positions;
    private Map<Float, Color> cached;

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
        this.colors = colors.clone();

        this.NaNColor = NaNColor == null ? Color.BLACK : NaNColor;
        this.lowColor = lowColor == null ? this.colors[0] : lowColor;
        this.highColor = highColor == null ? this.colors[colors.length - 1] : highColor;
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
            if (colors.length <= 1) {
                return colors[0];
            } else {
                float pos = position * (colors.length - 1);
                if (this.cached != null) {
                    final Color lerped = this.cached.get(pos);
                    if (lerped != null) {
                        return lerped;
                    }
                }

                int floor = (int) pos;
                if (pos == floor) {
                    return colors[floor];
                }
                if (pos == floor + 1) {
                    return colors[floor + 1];
                }
                final float p = (pos - floor);
                final float t = Float.isFinite(precision) ? ((float) Math.floor((p + precision / 2) / precision) * precision) : p;
                final Color l = Colors.lerp(colors[floor], colors[floor + 1], t);
                if (this.cached == null) {
                    this.cached = new HashMap<>();
                }
                this.cached.put(pos, l);
                return l;
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
        if (positions == null) {
            final Float[] vals = new Float[colors.length];
            double t = 1d / (colors.length - 1);
            for (int i = 0; i < colors.length; ++i) {
                vals[i] = (float) t * i;
            }
            positions = List.of(vals);
        }
        return positions;
    }

    @Override
    public Iterable<Color> colors() {
        return () -> new Iterator<>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < colors.length;
            }

            @Override
            public Color next() {
                return colors[i++];
            }
        };
    }

    @Override
    public boolean isQualitative() {
        return false;
    }

    @Override
    public final String toString() {
        return String.format("Colormap {%s}", getClass().getSimpleName());
    }

}
