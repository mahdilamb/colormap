package net.mahdilamb.colormap.reflect;

import net.mahdilamb.colormap.Colormaps;
import net.mahdilamb.colormap.api.Colormap;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public final class GenerateReadme {
    public static void main(String[] args) throws IOException {
        final File out = new File("swatches/");
        final StringBuilder readme = new StringBuilder();
        readme.append(new String(Files.readAllBytes(Paths.get("readme/before.md")), StandardCharsets.UTF_8));


        readme.append('\n');
        readme.append("|Category|ColorMap|Sample|\n" +
                "|---|---|---|\n"
        );
        if (out.exists()) {
            //noinspection ResultOfMethodCallIgnored
            Arrays.stream(Objects.requireNonNull(out.listFiles())).iterator().forEachRemaining(File::delete);
        } else {
            Files.createDirectory(out.toPath());
        }
        Colormaps.named().forEach(cmapName -> {
            final Colormap cmap = Colormaps.get(cmapName);
            final BufferedImage image = new BufferedImage(192, 20, BufferedImage.TYPE_INT_ARGB);
            for (int x = 0; x < image.getWidth(); ++x) {
                final int rgb = cmap.get(((double) x) / image.getWidth()).toDecimal();
                for (int y = 0; y < image.getHeight(); ++y) {
                    image.setRGB(x, y, rgb);
                }
            }
            try {
                final File path = new File(String.format("swatches/%s.png", cmapName));
                ImageIO.write(image, "png", path);
                final String[] cmapSplit = cmapName.toString().split("\\.");
                readme.append(String.format("|%s|%s|![%s](%s)|\n", toTitleCase(cmapSplit[0]), cmapSplit[1], cmapSplit[1], path.toString().replace("\\", "/")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        readme.append(new String(Files.readAllBytes(Paths.get("readme/after.md")), StandardCharsets.UTF_8));
        Files.write(new File("README.md").toPath(), readme.toString().getBytes());
    }

    public static String toTitleCase(final String text) {
        return text.length() <= 1 ?
                text.toUpperCase() :
                Arrays.stream(text.split(" ")).map(w -> String.valueOf(w.charAt(0)).toUpperCase() + w.substring(1).toLowerCase()).collect(Collectors.joining(" "));
    }
}
