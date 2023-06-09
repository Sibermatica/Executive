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
 * @see System#loadLibrary
 * */

 @Test
public final class LibrarySystem
        implements Eventualizable {

    /* -- Variables -- */

     /**
      * It is a lambda that executes a function when the libraries
      * are loaded on the system.  The function is a instance of
      * {@linkplain java.lang.Runnable}.
      * */
    public static Runnable onLoad = null;

    /**
     * If this variable is set to true, when the libraries
     * are loaded on the system, the function will be executed
     * */
    public static boolean LOG_EVENTS = false;

    /**
     * Log level of the Logger.  Defaults to {@linkplain java.util.logging.Level#FINEST}
     * */
    public static Level LOG_LEVEL = Level.FINEST;

    /* -- Constructors -- */

    /**
     * Don't let anyone instance this class.
     * */
    private LibrarySystem() {}

    /* -- Methods -- */

    /**
     * Loads the library with their name.
     * @param library the library to load
     * */
    public static void load(String library) {
        assert library != null;
        System.loadLibrary(library.toLowerCase());
        if (onLoad != null) onLoad.run();
    }

    /**
     * Loads the library with their file path.
     * @param library the library to load
     * */
    public static void load(File library) {
        assert library != null;
        assert !library.exists();
        System.load(library.getName().toLowerCase());
        if (onLoad != null) onLoad.run();
    }


}
