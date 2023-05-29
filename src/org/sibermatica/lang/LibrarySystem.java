package org.sibermatica.lang;

import java.io.File;
import java.util.logging.Level;

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
