package net.mahdilamb.colormap.tests;


import net.mahdilamb.colormap.Colormaps;
import net.mahdilamb.colormap.ColormapNode;
import net.mahdilamb.colormap.Colors;
import net.mahdilamb.colormap.FluidColormap;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;


public class JUnitTests {
    static final FluidColormap grays = Colormaps.fluidColormap(Colormaps.buildSequential().addColor(
            Colors.get("black"),
            Colors.get("white")
    ).build());
    static final Map<Integer, ColormapNode> colors = new TreeMap<>();
    static final int maxRange = 255;

    static {
        for (int i = 0; i <= maxRange; i++) {
            colors.put(i, grays.getNode(((float) i) / maxRange));
        }
    }

    @Test
    public void greyColorMapShouldStartAtBlackTest() {
        assertEquals(colors.get(0).getColor(), Colors.get("black"));
    }

    @Test
    public void greyColorMapShouldEndAtWhiteTest() {
        assertEquals(colors.get(maxRange).getColor(), Colors.get("white"));
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
            originals[i] = colors.get(r).getColor();
            sampleI[i] = r;
        }
        //remove last value
        colors.get(maxRange).remove();
        //check all samples
        for (int i = 0; i < samples; i++) {
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
            originals[i] = colors.get(r).getColor();
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
            originals[i] = colors.get(r).getColor();
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

    @SuppressWarnings("ConstantConditions")
    @Test
    public void testRGBToLabIsCorrectTest() {
        final double precision = 5e-2;
        final Color red = Colors.get("red");
        final float[] redLab = Colors.toLab(red);
        assertEquals(53.241, redLab[0], precision);
        assertEquals(80.092, redLab[1], precision);
        assertEquals(67.203, redLab[2], precision);
        final Color green = Colors.get("lime");
        final float[] greenLab = Colors.toLab(green);
        assertEquals(87.735, greenLab[0], precision);
        assertEquals(-86.183, greenLab[1], precision);
        assertEquals(83.179, greenLab[2], precision);
        final Color blue = Colors.get("blue");
        final float[] blueLab = Colors.toLab(blue);
        assertEquals(32.297, blueLab[0], precision);
        assertEquals(79.188, blueLab[1], precision);
        assertEquals(-107.860, blueLab[2], precision);
    }


}
