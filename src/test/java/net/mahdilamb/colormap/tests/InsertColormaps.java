package net.mahdilamb.colormap.tests;

import net.mahdilamb.colormap.Colormap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;

import static net.mahdilamb.colormap.tests.GenerateReadme.toTitleCase;

public class InsertColormaps {
    public static void main(String[] args) throws IOException {
        final Path path = new File("src/main/java/net/mahdilamb/colormap/Colormap.java").toPath();
        final StringBuilder insert = new StringBuilder();
        final StringBuilder tail = new StringBuilder();
        AtomicBoolean addToHead = new AtomicBoolean(true);
        AtomicBoolean addToTail = new AtomicBoolean(false);
        Files.lines(path).forEach(line -> {
            if (addToHead.get()) {
                insert.append(line).append('\n');
            }
            if (line.contains("//{START}//")) {
                addToHead.set(false);
            }
            if (line.contains("//{END}//")) {
                addToTail.set(true);
            }
            if (addToTail.get()) {
                tail.append(line).append('\n');
            }
        });

        final String[] last = {null};
        Colormap.listDefaults().forEach(cmapName -> {
            final String[] cmapSplit = cmapName.split("\\.");
            if (last[0] == null || !last[0].equals(cmapSplit[0])) {
                if (last[0] != null) {
                    insert.append("\t}\n\n");

                }
                insert.append(String.format("\t/**\n\t * Create %s colormaps \n\t */\n", cmapSplit[0].toLowerCase()));
                insert.append(String.format("\tfinal class %s {\n", toTitleCase(cmapSplit[0])));
                insert.append(String.format("\t\tprivate %s (){}\n", toTitleCase(cmapSplit[0])));

                last[0] = cmapSplit[0];
            }
            insert.append(String.format("\t\t/**\n\t\t * @return a new %s colormap\n\t\t */\n\t\tpublic static Colormap %s(){\n\t\t\treturn Colormap.get(\"%s.%s\");\n\t\t}\n\n", cmapSplit[1], cmapSplit[1], toTitleCase(cmapSplit[0]), cmapSplit[1]));
        });
        insert.append("\t}\n\n");
        insert.append(tail);
        Files.write(path, insert.toString().getBytes());
    }
}
