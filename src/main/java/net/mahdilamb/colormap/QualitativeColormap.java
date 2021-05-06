package net.mahdilamb.colormap;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * A basic qualitative colormap that is primarily used by reference colormaps
 * through extension.
 */
public class QualitativeColormap implements Colormap {
    private final Color[] colors;
    private final Color NaNColor;
    private final Color lowColor;
    private final Color highColor;
    private Collection<Float> positions;

    /**
     * Create a new qualitative colormap
     *
     * @param colors    the colors in the color map
     * @param NaNColor  the color to use if the value is NaN
     * @param lowColor  the color to use if the value is below 0
     * @param highColor the color to use if the value is above 1
     */
    protected QualitativeColormap(Color[] colors, Color NaNColor, Color lowColor, Color highColor) {
        this.colors = Arrays.copyOf(colors, colors.length + 1);
        this.colors[colors.length] = colors[colors.length - 1];

        this.NaNColor = NaNColor == null ? Color.BLACK : NaNColor;
        this.lowColor = lowColor == null ? this.colors[0] : lowColor;
        this.highColor = highColor == null ? this.colors[colors.length] : highColor;
    }

    /**
     * Create a new qualitative colormap that is autoranging
     *
     * @param colors the colors in the color map
     */
    public QualitativeColormap(Color... colors) {
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
                return colors[(int) Math.floor(position * (colors.length - 1))];
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
            final Float[] vals = new Float[colors.length - 1];
            double t = 1d / (vals.length);
            for (int i = 0; i < vals.length; ++i) {
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
                return i < colors.length - 1;
            }

            @Override
            public Color next() {
                return colors[i++];
            }
        };
    }

    @Override
    public final String toString() {
        return String.format("Colormap {%s}", getClass().getSimpleName());
    }
}
