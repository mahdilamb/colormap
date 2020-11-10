package net.mahdilamb.colormap.tests;

import net.mahdilamb.colormap.ColorMap;
import net.mahdilamb.colormap.color.Color;
import net.mahdilamb.colormap.ColorMapNode;
import net.mahdilamb.colormap.LinearColorMap;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import static org.junit.Assert.*;


public class JUnitTests {
    static final LinearColorMap grays = new LinearColorMap(null, null);
    static final Map<Integer, ColorMapNode> colors = new TreeMap<>();
    static final int maxRange = 255;

    static {
        grays.addColorNode(Color.getColor("black"));
        grays.addColorNode(Color.getColor("white"));
        for (int i = 0; i <= maxRange; i++) {
            colors.put(i, grays.getColorFromValue(((float) i) / maxRange));
        }
    }

    @Test
    public void greyColorMapShouldStartAtBlackTest() {
        assertTrue(colors.get(0).equalsColor(Color.getColor("black")));
    }

    @Test
    public void greyColorMapShouldEndAtWhiteTest() {
        assertTrue(colors.get(maxRange).equalsColor(Color.getColor("white")));
    }

    @Test
    public void cloningShouldReturnSameColorTest() {
        final int color = 10;
        final Color clone = colors.get(color).clone();
        assertTrue(colors.get(color).equalsColor(clone));
    }

    @Test
    public void deletingLastColorShouldChangeAllColorsTest() {
        //store original samples
        final int samples = 10;
        final Random random = new Random();
        boolean isSame = true;
        final Color[] originals = new Color[samples];
        final int[] sampleI = new int[samples];
        for (int i = 0; i < samples; i++) {
            final int r = Math.round(Math.abs(random.nextFloat()) * (maxRange - 1));
            originals[i] = colors.get(r).getColor().clone();
            sampleI[i] = r;
        }
        //remove last value
        colors.get(maxRange).remove();
        //check all samples
        for (int i = 0; i < samples; i++) {
            if (i == maxRange) {
                continue;
            }
            isSame &= originals[i].equals(colors.get(sampleI[i]).getColor());
        }
        assertFalse(isSame);

    }

    @Test
    public void deletingFirstColorShouldChangeAllColorsTest() {
        //store original samples
        final int samples = 10;
        final Random random = new Random();
        boolean isSame = true;
        final Color[] originals = new Color[samples];
        final int[] sampleI = new int[samples];
        for (int i = 0; i < samples; i++) {
            final int r = Math.round(Math.abs(random.nextFloat()) * (maxRange - 1));
            originals[i] = colors.get(r).getColor().clone();
            sampleI[i] = r;
        }
        //remove first value
        colors.get(0).remove();
        //check all samples
        for (int i = 0; i < samples; i++) {
            if (i == 0) {
                continue;
            }
            isSame &= originals[i].equals(colors.get(sampleI[i]).getColor());

        }
        assertFalse(isSame);

    }

    @Test
    public void deletingMidColorShouldNotChangeAllColorsTest() {
        //store original samples
        final int samples = 10;
        final Random random = new Random();
        boolean isSame = true;
        final Color[] originals = new Color[samples];
        final int[] sampleI = new int[samples];
        for (int i = 0; i < samples; i++) {
            final int r = Math.round(Math.abs(random.nextFloat()) * (maxRange - 1));
            originals[i] = colors.get(r).getColor().clone();
            sampleI[i] = r;
        }
        //remove random value
        final int r = 1 + Math.round(Math.abs(random.nextFloat()) * (maxRange - 2));
        colors.get(r).remove();
        //check all samples
        for (int i = 0; i < samples; i++) {
            if (sampleI[i] == r) {
                continue;
            }

            isSame &= originals[i].equals(colors.get(sampleI[i]).getColor());

        }
        assertTrue(isSame);

    }

    @Test
    public void testRGBToLabIsCorrectTest() {
        final double precision = 5e-2;
        final Color red = Color.getColor("red");
        final float[] redLab = red.asLab();
        assertEquals(53.241, redLab[0], precision);
        assertEquals(80.092, redLab[1], precision);
        assertEquals(67.203, redLab[2], precision);
        final Color green = Color.getColor("lime");
        final float[] greenLab = green.asLab();
        assertEquals(87.735, greenLab[0], precision);
        assertEquals(-86.183, greenLab[1], precision);
        assertEquals(83.179, greenLab[2], precision);
        final Color blue = Color.getColor("blue");
        final float[] blueLab = blue.asLab();
        assertEquals(32.297, blueLab[0], precision);
        assertEquals(79.188, blueLab[1], precision);
        assertEquals(-107.860, blueLab[2], precision);
    }

    @Test
    public void ensureDefaultColorMapsLoadTest() throws IOException, ClassNotFoundException {
        assertTrue(ColorMap.listDefaultColorMaps().size() > 0);
    }
}
