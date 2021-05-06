package net.mahdilamb.colormap.reflect;

import net.mahdilamb.colormap.Colormap;
import net.mahdilamb.colormap.Colormaps;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import javax.imageio.ImageIO;
import java.awt.*;
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
        readme.append("|Category|ColorMap|Sample|Source|\n" +
                "|---|---|---|---|\n"
        );
        if (out.exists()) {
            //noinspection ResultOfMethodCallIgnored
            Arrays.stream(Objects.requireNonNull(out.listFiles())).iterator().forEachRemaining(File::delete);
        } else {
            Files.createDirectory(out.toPath());
        }
        Colormaps.named().stream().sorted(/*(Comparator<CharSequence>) (o1, o2) -> {
            final ReferenceColormap cmap1 = Colormaps.get(o1).getClass().getAnnotation(ReferenceColormap.class);
            final ReferenceColormap cmap2 = Colormaps.get(o2).getClass().getAnnotation(ReferenceColormap.class);
            return 31 * cmap1.source().compareTo(cmap2.source()) +  cmap1.name().compareTo(cmap2.name());
        }*/).forEach(cmapName -> {
            final Colormap cmap = Colormaps.get(cmapName);
            final BufferedImage image = new BufferedImage(192, 20, BufferedImage.TYPE_INT_ARGB);
            for (int x = 0; x < image.getWidth(); ++x) {
                final Color rgb = cmap.get(((double) x) / image.getWidth());
                for (int y = 0; y < image.getHeight(); ++y) {
                    image.setRGB(x, y, rgb.getRGB());
                }
            }
            try {
                final File path = new File(String.format("swatches/%s.png", cmapName));
                ImageIO.write(image, "png", path);
                final String[] cmapSplit = cmapName.toString().split("\\.");
                final ReferenceColormap annotation = cmap.getClass().getAnnotation(ReferenceColormap.class);
                String source = annotation.source();
                switch (source.toLowerCase()) {
                    case "ocean":
                        source = "[CMOcean](https://matplotlib.org/cmocean/)";
                        break;
                    case "colorbrewer":
                        source = "[ColorBrewer](https://colorbrewer2.org/)";
                        break;
                    case "kenneth moreland":
                        source = "[Kenneth Moreland](https://www.kennethmoreland.com/color-advice/)";
                        break;
                    case "google ai":
                        source = "[Google AI](https://ai.googleblog.com/2019/08/turbo-improved-rainbow-colormap-for.html)";
                        break;
                    case "peter karpov":
                        source = "[Peter Karpov](http://inversed.ru/Blog_2.htm)";
                        break;
                    case "tableau":
                        source = "[Tableau](https://www.tableau.com/)";
                        break;
                    case "kindlmann et al":
                        source = "[Kindlmann et al.](https://www.kennethmoreland.com/color-advice/)";
                        break;
                    case "carto":
                        source = "[CARTO](https://carto.com/carto-colors/)";
                        break;
                    case "matplotlib":
                        source = "[matplotlib](https://matplotlib.org/3.1.1/gallery/color/colormap_reference.html)";
                        break;
                    case "cet":
                        source = "[CET](https://colorcet.com/)";
                        break;
                    case "plotly":
                        source = "[Plotly](https://plotly.com/python/colorscales/)";
                        break;
                    case "mycarta":
                        source = "[MyCarta](https://mycarta.wordpress.com/2013/02/21/perceptual-rainbow-palette-the-method/)";
                        break;
                    case "polychrome":
                        source = "[Polychrome](https://cran.r-project.org/web/packages/Polychrome/index.html)";
                        break;
                    case "d3":
                        source = "[d3.js](https://github.com/d3/d3-scale-chromatic/blob/master/README.md#schemeCategory10)";
                        break;
                    case "paraview":
                        source = "[Paraview](https://www.paraview.org/)";
                        break;
                }
                readme.append(String.format("|%s|%s|![%s](%s)|%s|\n", toTitleCase(annotation.type().name()), annotation.name(), cmapSplit[1], path.toString().replace("\\", "/"), source));
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
