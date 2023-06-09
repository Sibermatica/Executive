package org.sibermatica.io;

import java.io.*;
import java.nio.charset.*;

/**
 * <h1>IOUtils</h1>
 *
 * This class provides methods for I/O converting, also it contains converter
 * methods like String to an InputStream and miscellaneous converting
 * I/O methods.
 *
 * @see java.io
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 */
public final class IOUtils {

    /* -- Constructors -- */

    /**
     * Don't let anyone instance this class.
     */
    private IOUtils() {}

    /* -- Converters -- */

    /**
     * Convert a String to an InputStream
     *
     * @param initialString the String to convert
     * @return the InputStream instance of {@linkplain java.io.ByteArrayInputStream}
     */
    public static InputStream toInputStream(String initialString) {
        return new ByteArrayInputStream(initialString.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Convert a String to an OutputStream.  It
     * is used commonly to logging utilities.
     *
     * @param initialString the string to convert
     * @return the OutputStream
     */
    public static OutputStream toOutputStream(String initialString) {
        OutputStream outputStream = OutputStream.nullOutputStream();
        try {
            outputStream.write(initialString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException ignored) {}

        return outputStream;
    }

    /**
     * Convert a String to an PrintStream.  It
     * is used commonly to logging utilities.
     *
     * @param initialString the string to convert
     * @return the PrintStream
     */
    public static PrintStream toPrintStream(String initialString) {
        return new PrintStream(IOUtils.toOutputStream(initialString));
    }

    /**
     * Convert a InputStream to a String
     * @param initialStream the stream to convert
     * @return the String
     */
    public static String ToString(InputStream initialStream) {
        /* Just in case */

        try {
            return new String(
                    initialStream.readAllBytes());
        } catch (IOException ignored) {}

        return ""; // It doesn't have any data
    }

    /**
     * Convert a PrintStream to a String
     * @param initialStream the stream to convert
     * @return the String
     */
    public static String ToString(PrintStream initialStream) {
        return initialStream.toString();
    }

}
