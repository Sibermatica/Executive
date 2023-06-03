package org.sibermatica.lang;

import org.sibermatica.annotations.Test;

import java.io.File;
import java.util.logging.Level;

/**
 * <h1>LibrarySystem</h1>
 * This class it's used to load a library.  The library
 * can be loaded from a dll file or from a jar file.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.1
 * @apiNote We're not tested this class, try it with caution!
 * */

 @Test
public class LibrarySystem implements Eventualizable {

    public static Runnable onLoad = null;
    public static boolean LOG_EVENTS = false;
    public static Level LOG_LEVEL = Level.FINEST;

    public static void load(String library) {
        assert library != null;
        System.loadLibrary(library.toLowerCase());
        if (onLoad != null) onLoad.run();
    }

    public static void load(File library) {
        assert library != null;
        assert !library.exists();
        System.load(library.getName().toLowerCase());
        if (onLoad != null) onLoad.run();
    }


}
