package net.mahdilamb.colormap;

import net.mahdilamb.colormap.color.Color;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public interface ColorMap {
    /**
     * All registered colormaps
     */
    Map<String, Class<ColorMap>> colorMaps = new HashMap<>();
    /**
     * A subset of all the color maps - those that are the defaults.
     */
    NavigableSet<String> defaultColorMaps = new TreeSet<>();
    /**
     * Get the Color at a specified value. Does not add the value to the color map. Primary way to show a graphical representation of this color map.
     *
     * @param value Value to get the associated Color from
     * @return The associated Color
     */
    Color colorAt(double value);

    /**
     *
     * @return whether the colormap is reversed
     */
    boolean isReversed();

    /**
     * Set the color map as reversed
     * @param isReversed whether the colormap should be set as reversed
     */
    void setReversed(boolean isReversed);

    /**
     * Get the Color at a specified value. Does not add the value to the color map. Considers whether the color map is
     * reversed or not.
     *
     * @param value Value to get the associated Color from
     * @return The associated Color
     */
    default Color getColorAt(final double value) {
        return colorAt(isReversed() ? 1 - value : value);
    }
    /**
     * Register a color map so that it can be found by {@link ColorMap#getColorMap(String)}
     *
     * @param colorMapName  The name used to later find this color map
     * @param colorMapClass The class of the color map.
     */
    static void registerColorMap(final String colorMapName, final Class<ColorMap> colorMapClass) {
        if (Arrays.stream(colorMapClass.getConstructors()).allMatch(c -> c.getParameterCount() != 0)) {
            throw new UnsupportedOperationException("Registered colormaps must contain a no args constructor");
        }
        colorMaps.put(colorMapName, colorMapClass);
    }


    /**
     * Convenience method to get colormap through java reflection
     *
     * @param colormapType The colormap type (e.g. qualitative, sequential, diverging, cyclic)
     * @param colormapName The name of the colormap (e.g. Viridis)
     * @param isReversed   Whether the colormap should be reversed
     * @return An instance of the requested colormap, or {@code null} if it cannot be found.
     */
    static ColorMap getColorMap(final String colormapType, final String colormapName, final boolean isReversed) {
        final Class<?> colormapClass;
        final String requestedClass = String.format("%s.%s", colormapType == null ? "*" : colormapType.toLowerCase(), colormapName.toLowerCase());
        if (colorMaps.containsKey(requestedClass)) {
            assert colormapType != null;
            colormapClass = colorMaps.get(String.format("%s.%s", colormapType.toLowerCase(), colormapName.toLowerCase()));
        } else {
            try {
                cacheDefaultColorMaps();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                System.exit(-1);
            }
            colormapClass = colorMaps.get(requestedClass);

        }

        try {
            final ColorMap out = (ColorMapImpl) colormapClass.getConstructor().newInstance();
            out.setReversed(isReversed);
            return out;
        } catch (final InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
        return null;

    }


    /**
     * Get a colormap using a string representation of the colormap in the form:
     * A.B[.C] Where A is the category such as sequential, qualitative, diverging.
     * B is the name of the color map, and C (optional) is reversed if the color maps should be reversed.
     * All parts are case-insensitive.
     *
     * @param colormap A string representation of a colormap (e.g. "sequential.viridis.reversed", note sequential can be omitted).
     * @return An instance of the requested colormap or {@code null} if it cannot be found.
     */
    static ColorMap getColorMap(final String colormap) {
        final String[] cmparts = colormap.split("\\.");
        switch (cmparts.length) {
            case 2:
                if (cmparts[1].compareTo("reversed") == 0) {
                    return getColorMap(null, cmparts[0].toLowerCase(), true);
                } else {
                    return getColorMap(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), false);
                }
            case 3:
                return getColorMap(cmparts[0].toLowerCase(), cmparts[1].toLowerCase(), cmparts[2].compareTo("reversed") == 0);
            case 1:
                return getColorMap(null, cmparts[0].toLowerCase(), false);
            default:
                throw new IllegalArgumentException("argument should be in the form A.B.[C]. Where A is the category such as sequential, qualitative, diverging. "
                        + "B is the name of the color map. And C is \"reversed\" if the color maps should be reversed.  ");
        }
    }

    static void cacheDefaultColorMaps() throws IOException, ClassNotFoundException {
        if (defaultColorMaps.size() == 0) {
            final String packagePath = ColorMap.class.getPackageName().replace(".", "/");
            final File packageName = new File(packagePath);
            final URL codeSource = ColorMap.class.getProtectionDomain().getCodeSource().getLocation();
            if (new File(codeSource.getPath()).isDirectory()) {

                final Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
                final Stack<File> directories = new Stack<>();
                while (resources.hasMoreElements()) {
                    try {
                        final File file = new File(URLDecoder.decode(resources.nextElement().getPath(), "UTF-8"));
                        if (!file.isFile()) {
                            directories.push(file);
                        } else {
                            addColorMapClass(packageName, file);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                while (!directories.empty()) {
                    final File dir = directories.pop();
                    if (dir == null) {
                        continue;
                    }
                    final File[] files = dir.listFiles();
                    if (files == null) {
                        continue;
                    }
                    for (final File file : files) {
                        if (!file.isFile()) {
                            directories.push(file);
                        } else {
                            addColorMapClass(packageName, file);
                        }
                    }
                }
            } else {
                try (final ZipInputStream jar = new JarInputStream(codeSource.openStream())) {
                    ZipEntry ze;
                    while ((ze = jar.getNextEntry()) != null) {
                        final File file = new File(ze.toString());
                        if (!file.toString().endsWith(".class") || file.toString().length() < packagePath.length() || !file.toString().contains(packageName.toString())) {
                            continue;
                        }

                        addColorMapClass(packageName, file);
                    }
                }
            }


        }
    }

    @SuppressWarnings("unchecked")
    static void addColorMapClass(final File packageName, final File file) throws ClassNotFoundException {

        final Class<?> colorMap = Class.forName(
                file
                        .toString()
                        .substring(file.toString().indexOf(packageName.toString()))
                        .replace(File.separator, ".")
                        .replace(".class", "")
        );
        final NewColorMap annotation = colorMap.getDeclaredAnnotation(NewColorMap.class);
        if (annotation == null) {
            return;
        }
        final String name = annotation.name().toLowerCase();
        final String type = annotation.type().name().toLowerCase();
        final String withWildCard = String.format("*.%s", name);
        final String withoutWildCard = String.format("%s.%s", type, name);

        if (ColorMap.class.isAssignableFrom(colorMap)) {
            defaultColorMaps.add(String.format("%s.%s", annotation.type(), annotation.name()));
            registerColorMap(withWildCard, (Class<ColorMap>) colorMap);
            registerColorMap(withoutWildCard, (Class<ColorMap>) colorMap);
        }

    }

    /**
     * Get a String list of all the default colormaps.
     *
     * @return A list (set) of the Strings representing the default colormaps.
     */
    static Set<String> listDefaultColorMaps() {
        try {
            cacheDefaultColorMaps();
        } catch (Exception e) {
            System.out.println("Could not load default colormaps.");
            e.printStackTrace();
            System.exit(-1);
        }
        return defaultColorMaps;
    }
}
