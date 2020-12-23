package net.mahdilamb.colormap;

import net.mahdilamb.colormap.api.*;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NewColormapTests {
    final Colormap monotone = ColormapBuilder.buildSequential().addColor(Color.TRANSPARENT, Color.WHITE).build();

    /**
     * Check that values outside of 0-1 are clipped to 0 to 1
     */
    @Test
    public void OutOfBoundsValueCalculatedCorrectlyTest() {
        assertEquals(monotone.getLowColor(), monotone.get(-1));
        assertEquals(monotone.getHighColor(), monotone.get(2));
    }

    /**
     * Ensure NaN color is supplied correctly
     */
    @Test
    public void NonNumericValuesAreNaNTest() {
        assertEquals(monotone.getNaNColor(), monotone.get(null));
        assertEquals(monotone.getNaNColor(), monotone.get(Float.POSITIVE_INFINITY));
        assertEquals(monotone.getNaNColor(), monotone.get(Float.NaN));
        assertEquals(monotone.getNaNColor(), monotone.get(Float.NEGATIVE_INFINITY));
    }

    /**
     * Check that positional values are proportional (alpha should be proportionate)
     */
    @Test
    public void ValuesAtPositionsInSequentialCalculatedCorrectlyTest() {
        for (float i = 0; i <= 1; i += 0.01) {
            assertEquals(i, monotone.get(i).alpha(), 0.000001);
        }
    }

    /**
     * Check that min and max bounds are updated in fluid colormap
     */
    @Test
    public void FluidColormapAllowsAutoRangingTest() {
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone);
        float min = -1;
        float max = -1;
        for (int i = 0; i < 20; ++i) {
            final float r = (float) ((Math.random() * 20) - 10);
            if (i == 0 || r <= min) {
                min = r;
            }
            if (i == 0 || r >= max) {
                max = r;
            }
            final ColormapNode v = fluidMonotone.getNode(r);
            if (v.getValue() != null) {
                if (v.getValue() != min) {
                    assertNotEquals(fluidMonotone.getColormap().getLowColor(), v.getColor());
                }
                if (v.getValue() != max) {
                    assertNotEquals(fluidMonotone.getColormap().getHighColor(), v.getColor());
                }
            }


            assertNotEquals(fluidMonotone.getColormap().getNaNColor(), v.getColor());
        }

    }

    /**
     * Test that sampling a qualitative colormap works correctly
     */
    @Test
    public void QualitativeColormapWorksCorrectlyTest() {
        final Colormap rainbow = Colormaps.buildQualitative().addColor(Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.indigo, Color.violet).build();
        assertEquals(Color.red, rainbow.get(1f / 14f));
        assertEquals(Color.orange, rainbow.get(3f / 14f));
        assertEquals(Color.yellow, rainbow.get(5f / 14f));
        assertEquals(Color.green, rainbow.get(7f / 14f));
        assertEquals(Color.blue, rainbow.get(9f / 14f));
        assertEquals(Color.indigo, rainbow.get(11f / 14f));
        assertEquals(Color.violet, rainbow.get(13f / 14f));
    }

    /**
     * Ensure that scaling is correct when a minimum value is set
     */
    @Test
    public void MinClippingWorksInFluidColormapTest() {
        final float min = 0;
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, min, null, false);
        for (int i = 0; i < 20; ++i) {
            final float r = (float) ((Math.random() * 20) - 10);
            final ColormapNode x = (ColormapNode) fluidMonotone.get(r);
            if (r <= min) {
                assertEquals(fluidMonotone.getColormap().getLowColor(), x.getColor());
            }
        }
    }

    /**
     * Ensure that scaling is correct when a maximum value is set
     */
    @Test
    public void MaxClippingWorksInFluidColormapTest() {
        final float max = 0;
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, null, max, false);
        for (int i = 0; i < 20; ++i) {
            final float r = (float) ((Math.random() * 20) - 10);
            if (r >= max) {
                assertEquals(fluidMonotone.getColormap().getHighColor(), fluidMonotone.getNode(r).getColor());
            }
        }
    }

    /**
     * Ensure that scaling is correct when a minimum and maximum value is set
     */
    @Test
    public void MinAndMaxClippingWorksInFluidColormapTest() {
        final float min = -2;
        final float max = 2;
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, min, max, false);
        for (int i = 0; i < 20; ++i) {
            final float r = (float) ((Math.random() * 20) - 10);
            final ColormapNode node = (ColormapNode) fluidMonotone.get(r);

            if (r >= max) {
                assertEquals(fluidMonotone.getColormap().getHighColor(), node.getColor());
            } else if (r <= min) {
                assertEquals(fluidMonotone.getColormap().getLowColor(), node.getColor());
            } else {
                if (node.getValue() != null) {
                    if (node.getValue() != min) {
                        assertNotEquals(fluidMonotone.getColormap().getLowColor(), node.getColor());
                    }
                    if (node.getValue() != max) {
                        assertNotEquals(fluidMonotone.getColormap().getHighColor(), node.getColor());
                    }
                }
            }
        }
    }

    @Test
    public void ReversedColormapTest() {
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, 0f, 1f, true);
        assertEquals(Color.WHITE, fluidMonotone.getNode(0f).getColor());
        assertEquals(Color.TRANSPARENT, fluidMonotone.getNode(1f).getColor());
    }

    /**
     * Nodes update if new min is lower than current min
     */
    @Test
    public void ChangingMinUpdatesAppropriatelyTest() {
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, 0f, 1f, false);
        final AtomicInteger count = new AtomicInteger();
        final ColormapNode a = fluidMonotone.get(0f, (n, c, s) -> count.incrementAndGet());
        fluidMonotone.setMinValue(-1f);
        assertNotEquals(fluidMonotone.getColormap().getLowColor(), a.getColor());
        assertEquals(2, count.get());
    }

    /**
     * Nodes do not update if new min is null (i.e. only initial listener trigger)
     */
    @Test
    public void NodesDoNotUpdateIfNewMinIsNullTest() {
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, 0f, 1f, false);
        final AtomicInteger count = new AtomicInteger();
        fluidMonotone.get(0f, color -> count.incrementAndGet());
        fluidMonotone.setMinValue(null);
        assertEquals(1, count.get());
    }

    @Test
    public void UpdatingNodeFiresChangeTest() {
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, null, null, false);
        final AtomicInteger count = new AtomicInteger();
        final ColormapNode a = fluidMonotone.get(1f, color -> count.incrementAndGet());
        fluidMonotone.get(0f);
        a.update(0f);
        assertEquals(3, count.get());
    }

    @Test
    public void RemovingNodesWorksTest() {
        final FluidColormap fluidMonotone = Colormaps.fluidColormap(monotone, null, null, false);
        final ColormapNode a = fluidMonotone.getNode(1f);
        assertEquals(1, ((Colormaps.FluidColormapImpl) fluidMonotone).nodes.size());
        a.remove();
        assertEquals(0, ((Colormaps.FluidColormapImpl) fluidMonotone).nodes.size());
    }

    @Test
    public void ReferenceColormapsFoundTest() {
        assertNotEquals(0, Colormaps.named().size());

    }

}
