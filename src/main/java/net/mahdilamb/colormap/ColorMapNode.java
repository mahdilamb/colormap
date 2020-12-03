package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import java.util.Objects;

/**
 * A node that belongs to ColorMap, primarily defined by its value
 */
public final class ColorMapNode {
    private final Color color;
    private final ColorMapImpl colorMap;
    Double value;

    ColorMapNode(final ColorMapImpl colorMap, final Color color, final Double value) {
        this.colorMap = colorMap;
        this.value = value;
        this.color = color;
    }

    void recalculate() {
        final Color newColor = colorMap.calculateColor(value);
        color.setColor(newColor);
    }

    /**
     * Set the value of this node
     *
     * @param value Value to set this node to.
     */
    public void setValue(final Double value) {
        if (Objects.equals(value, this.value)) {
            return;
        }
        final Double oldValue = this.value;
        this.value = value;
        recalculate();

        if (value <= colorMap.currentMinValue || oldValue != null && oldValue <= colorMap.currentMinValue) {
            colorMap.recalculateMinValue();
        }
        if (value >= colorMap.currentMaxValue || oldValue != null && oldValue >= colorMap.currentMaxValue) {
            colorMap.recalculateMaxValue();
        }
    }

    @Override
    public String toString() {
        return String.format("%s at %.3f", color.toString(), value);
    }

    /**
     * Remove this node from its colormap.
     */
    public void remove() {
        colorMap.currentNodes.remove(this);
        if (colorMap.currentMinValue <= value) {
            colorMap.recalculateMinValue();
        }
        if (colorMap.currentMaxValue >= value) {
            colorMap.recalculateMaxValue();
        }
    }

    /**
     * @return The color of the node
     */
    public final Color getColor() {
        return color;
    }

    /**
     * @return The value of the node.
     */
    public final Double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColorMapNode that = (ColorMapNode) o;

        if (!Objects.equals(color, that.color)) return false;
        if (!Objects.equals(colorMap, that.colorMap)) return false;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (colorMap != null ? colorMap.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
