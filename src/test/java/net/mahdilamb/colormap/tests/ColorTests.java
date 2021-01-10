package net.mahdilamb.colormap.tests;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.Colors;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class ColorTests {
    /**
     * Compare the results to EasyRGB.com for primary and secondary colors
     */
    @Test
    public void RGBToXYZIsCalculatedCorrectlyTest() {
        assertArrayEquals(new float[]{0, 0, 0}, Colors.RGBToXYZ(0, 0, 0), 0.01f);
        assertArrayEquals(new float[]{41.246f, 21.267f, 1.933f}, Colors.RGBToXYZ(1, 0, 0), 0.01f);
        assertArrayEquals(new float[]{35.758f, 71.515f, 11.919f}, Colors.RGBToXYZ(0, 1, 0), 0.01f);
        assertArrayEquals(new float[]{18.044f, 7.217f, 95.03f}, Colors.RGBToXYZ(0, 0, 1), 0.01f);
        assertArrayEquals(new float[]{53.801f, 78.733f, 106.950f}, Colors.RGBToXYZ(0, 1, 1), 0.01f);
        assertArrayEquals(new float[]{59.289f, 28.485f, 96.964f}, Colors.RGBToXYZ(1, 0, 1), 0.01f);
        assertArrayEquals(new float[]{77.003f, 92.783f, 13.85f}, Colors.RGBToXYZ(1, 1, 0), 0.01f);
        assertArrayEquals(new float[]{95.047f, 100.000f, 108.883f}, Colors.RGBToXYZ(1, 1, 1), 0.01f);

    }

    @Test
    public void XYZToRGBIsCalculatedCorrectlyTest() {
        assertArrayEquals(new float[]{0, 0, 0}, Colors.XYZToRGB(0, 0, 0), 0.01f);
        assertArrayEquals(new float[]{1, 0, 0}, Colors.XYZToRGB(41.246f, 21.267f, 1.933f), 0.01f);
        assertArrayEquals(new float[]{0, 1, 0}, Colors.XYZToRGB(35.758f, 71.515f, 11.919f), 0.01f);
        assertArrayEquals(new float[]{0, 0, 1}, Colors.XYZToRGB(18.044f, 7.217f, 95.03f), 0.01f);
        assertArrayEquals(new float[]{0, 1, 1}, Colors.XYZToRGB(53.801f, 78.733f, 106.950f), 0.01f);
        assertArrayEquals(new float[]{1, 0, 1}, Colors.XYZToRGB(59.289f, 28.485f, 96.964f), 0.01f);
        assertArrayEquals(new float[]{1, 1, 0}, Colors.XYZToRGB(77.003f, 92.783f, 13.85f), 0.01f);
        assertArrayEquals(new float[]{1, 1, 1}, Colors.XYZToRGB(95.047f, 100.000f, 108.883f), 0.01f);


    }

    @Test
    public void RGBToLabIsCalculatedCorrectlyTest() {
        assertArrayEquals(new float[]{0, 0, 0}, new Color(0, 0, 0).toLab(), 0.01f);
        assertArrayEquals(new float[]{53.241f, 80.092f, 67.203f}, new Color(1., 0, 0).toLab(), 0.01f);
        assertArrayEquals(new float[]{87.735f, -86.183f, 83.179f}, new Color(0, 1., 0).toLab(), 0.01f);
        assertArrayEquals(new float[]{32.297f, 79.188f, -107.860f}, new Color(0, 0, 1.).toLab(), 0.01f);
        assertArrayEquals(new float[]{91.113f, -48.088f, -14.131f}, new Color(0, 1, 1.).toLab(), 0.01f);
        assertArrayEquals(new float[]{60.324f, 98.234f, -60.825f}, new Color(1, 0, 1.).toLab(), 0.01f);
        assertArrayEquals(new float[]{97.139f, -21.554f, 94.478f}, new Color(1, 1, 0.).toLab(), 0.01f);
        assertArrayEquals(new float[]{100.000f, 0.000f, -0.000f}, new Color(1, 1, 1.).toLab(), 0.01f);

    }

    @Test
    public void LabToRGBsCalculatedCorrectlyTest() {
        assertArrayEquals(new float[]{0, 0, 0}, Colors.RGBToLab(0, 0, 0), 0.01f);
        assertArrayEquals(new float[]{1, 0, 0}, Colors.LabToRGB(53.241f, 80.092f, 67.203f), 0.01f);
        assertArrayEquals(new float[]{0, 1, 0}, Colors.LabToRGB(87.735f, -86.183f, 83.179f), 0.01f);
        assertArrayEquals(new float[]{0, 0, 1}, Colors.LabToRGB(32.297f, 79.188f, -107.860f), 0.01f);
        assertArrayEquals(new float[]{0, 1, 1}, Colors.LabToRGB(91.113f, -48.088f, -14.131f), 0.01f);
        assertArrayEquals(new float[]{1, 0, 1}, Colors.LabToRGB(60.324f, 98.234f, -60.825f), 0.01f);
        assertArrayEquals(new float[]{1, 1, 0}, Colors.LabToRGB(97.139f, -21.554f, 94.478f), 0.01f);
        assertArrayEquals(new float[]{1, 1, 1}, Colors.LabToRGB(100.000f, 0.000f, -0.000f), 0.01f);

    }

    @Test
    public void HexSanitizationTest() {
        try {
            Colors.sanitizeRGBA("#00ff00");
            Colors.sanitizeRGBA("#00ff00ff");
            Colors.sanitizeRGBA("00ff00");
            Colors.sanitizeRGBA("00ff00ff");
            Colors.sanitizeRGB("#00ff00");
            Colors.sanitizeRGB("#00ff00ff");
            Colors.sanitizeRGB("00ff00");
            Colors.sanitizeRGB("00ff00ff");

        } catch (Exception e) {
            fail("Should not have thrown any exception");
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void HexSanitizationAltTest() {

        Colors.sanitizeRGBA("#00ff0");
        Colors.sanitizeRGBA("#00f00ff");
        Colors.sanitizeRGBA("00f00");
        Colors.sanitizeRGBA("f00ff");
        Colors.sanitizeRGB("#0ff00");
        Colors.sanitizeRGB("#0f0ff");
        Colors.sanitizeRGB("0ff00");
        Colors.sanitizeRGB("f00ff");


    }
}
