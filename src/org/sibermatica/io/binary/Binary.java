package org.sibermatica.io.binary;

/**
 * <h1>Binary</h1>
 * This class it's used to work with binary data.  It can parse
 * and handle easily binary data.
 * <p>Can:</p>
 * <ul>
 *     <li>Parse binary data</li>
 *     <li>Handle binary data</li>
 *     <li>Convert binary data (to String, to Integer and other type of classes)</li>
 * </ul>
 *
 * @apiNote We recommend to use this class as a base class
 *   for other binary classes and manage binary files.
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.3
 * */
public abstract class Binary {

    public static boolean parse(boolean b) {
        return b;
    }

    public static boolean parse(char c) {
        return c == '1';
    }

    public static boolean parse(int i) {
        return i > 0;
    }

}
