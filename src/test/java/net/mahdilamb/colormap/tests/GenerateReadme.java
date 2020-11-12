package net.mahdilamb.colormap.tests;

import net.mahdilamb.colormap.ColorMap;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public final class GenerateReadme {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final File out = new File("swatches/");
        final StringBuilder readme = new StringBuilder();
        readme.append(Files.readString(new File("readme.template/before.txt").toPath()));
        readme.append('\n');
        readme.append("|Category|ColorMap|Sample|\n" +
                "|---|---|---|\n"
        );
        if (out.exists()) {
            Arrays.stream(Objects.requireNonNull(new File("swatches/").listFiles())).iterator().forEachRemaining(File::delete);
        } else {
            Files.createDirectory(out.toPath());
        }
        ColorMap.listDefaultColorMaps().forEach(cmapName -> {
            final ColorMap cmap = ColorMap.getColorMap(cmapName);
            final BufferedImage image = new BufferedImage(256, 24, BufferedImage.TYPE_INT_ARGB);
            for (int x = 0; x < image.getWidth(); x++) {
                final int rgb = cmap.colorAt(((double) x) / image.getWidth()).asDecimal();
                for (int y = 0; y < image.getHeight(); y++) {
                    image.setRGB(x, y, rgb);
                }
            }
            try {
                final File path = new File(String.format("swatches/%s.png", cmapName));
                ImageIO.write(image, "png", path);
                final String[] cmapSplit = cmapName.split("\\.");
                readme.append(String.format("|%s|%s|![%s](%s)|\n", toTitleCase(cmapSplit[0]), cmapSplit[1], cmapSplit[1], URLEncoder.encode(path.toString(), StandardCharsets.UTF_8)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        readme.append(Files.readString(new File("readme.template/after.txt").toPath()));

        Files.writeString(Path.of("README.md"), readme.toString());
    }

    private static String toTitleCase(final String text) {
        return String.valueOf(text.charAt(0)).toUpperCase() + text.toLowerCase().substring(1);
    }
}
