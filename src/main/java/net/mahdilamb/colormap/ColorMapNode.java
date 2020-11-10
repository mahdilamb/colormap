package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.colormap.color.ColorListener;

public class ColorMapNode extends Color {
    final Color color;
    ColorMap colorMap;
    Double value;

    public ColorMapNode(ColorMap colorMap, Color color, Double value) {
        super(color);
        this.colorMap = colorMap;
        this.value = value;
        this.color = color;
    }

    public void recalculate() {
        final Color newColor = colorMap.calculateColor(value);
        color.setColor(newColor);
    }

    public void setValue(Double value) {
        if (value.equals(this.value)) {
            return;
        }
        final Double oldValue = this.value;
        this.value = value;
        recalculate();

        if ((value != null && value <= colorMap.currentMinValue) || (oldValue != null && oldValue <= colorMap.currentMinValue)) {
            colorMap.recalculateMinValue();
        }
        if ((value != null && value >= colorMap.currentMaxValue) || (oldValue != null && oldValue >= colorMap.currentMaxValue)) {
            colorMap.recalculateMaxValue();
        }
    }

    @Override
    public void addColorListener(ColorListener listener) {
        color.addColorListener(listener);
    }

    @Override
    public String toString() {
        return String.format("%s at %.3f", color.toString(), value);
    }

    public void remove() {
        colorMap.colorValues.remove(this);
        if (colorMap.currentMinValue <= value) {
            colorMap.recalculateMinValue();
        }
        if (colorMap.currentMaxValue >= value) {
            colorMap.recalculateMaxValue();
        }
    }

    @Override
    public boolean equals(Object other) {
        return this == other;
    }

    public boolean equalsColor(Color color) {
        return this.color.equals(color);
    }

    @Override
    public ColorMapNode clone() {
        return new ColorMapNode(colorMap, color.clone(), value);
    }

    public Color getColor() {
        return color;
    }
}
