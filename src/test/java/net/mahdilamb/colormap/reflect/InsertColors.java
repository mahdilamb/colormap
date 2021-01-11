package net.mahdilamb.colormap.reflect;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.Colors;
import net.mahdilamb.colormap.reference.ColorType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Insert reference colors from a csv/tsv file
 */
public class InsertColors {
    private static final File output = new File("src/main/java/" + Color.class.getName().replace(".", File.separator) + ".java");

    private static final String startTag = "//{{START}}//";
    private static final String endTag = "//{{END}}//";

    private static String parse(final URL source, int column, char separator, String var_prefix, String format, ColorType type) {
        final StringBuilder output = new StringBuilder();
        final String split = String.valueOf(separator);
        final List<String> vars = new ArrayList<>();
        try (final Scanner scanner = new Scanner(new File(source.getFile()))) {
            while (scanner.hasNextLine()) {
                final String line = scanner.nextLine();
                if (line.charAt(0) == '#') {
                    continue;
                }
                final String[] cols = line.split(split);
                if (column >= cols.length) {
                    continue;
                }
                if (!Colors.isValidRGB(cols[column])) {
                    continue;
                }
                final String name = cols[0].replace(" ", "").replace("/", "_").replace("'", "_");
                if (vars.contains(name)) {
                    continue;
                }
                vars.add(name);
                final int[] rgba = Colors.hexadecimalToRGB8Bit(cols[column]);
                output.append(String.format("\t/**\n\t * %s (%s)\n\t * <div style=\"border:1px solid black;width:40px;height:20px;background-color:%s;float:right;margin: 0 10px 0 0\"></div>\n\t */\n\t@ReferenceColor(type = %s.%s, name = \"%s\")\n\tpublic static final Color %s%s = new Color(%d, %d, %d);\n\n", String.format(format, cols[0]), cols[column], cols[column], type.getClass().getSimpleName(), type.name(), name, var_prefix, name, rgba[0], rgba[1], rgba[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    private static String insert(final File source, String startTag, String endTag, String... codes) {
        final StringBuilder out = new StringBuilder();
        boolean afterStart = false;
        boolean afterEnd = false;
        try (final Scanner scanner = new Scanner(source)) {
            while (scanner.hasNextLine()) {
                final String line = scanner.nextLine();
                if (afterStart) {
                    final boolean e = line.contains(endTag);
                    if (e) {
                        for (final String block : codes) {
                            out.append(block).append('\n');
                        }
                    }
                    afterEnd |= e;

                }
                if (!afterStart || afterEnd) {
                    out.append(line).append('\n');
                }

                afterStart |= line.contains(startTag);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static void main(String[] args) throws IOException {
        Files.write(output.toPath(),
                insert(output, startTag, endTag,
                        parse(InsertColors.class.getClassLoader().getResource("colors/css4.csv"), 1, ',', "", "CSS color \"%s\"", ColorType.CSS),
                        //   parse(InsertColors.class.getClassLoader().getResource("colors/xkcd.tsv"), 1, '\t', "xkcd_", "XKCD color \"%s\"", ColorType.XKCD),
                        parse(InsertColors.class.getClassLoader().getResource("colors/tab.csv"), 1, ',', "tab_", "Tableau color \"%s\"", ColorType.TABLEAU)

                ).getBytes());

    }
}
