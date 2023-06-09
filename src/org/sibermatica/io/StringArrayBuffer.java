package org.sibermatica.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * <h1>StringArrayBuffer</h1>
 * This class implements methods for manipulating bytes in a
 * string.
 *
 * @since 1.1
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @see java.io.ByteArrayInputStream
 * */
public final class StringArrayBuffer {

    /**
     * Don't let anyone instantiate this class.
     * */
    private StringArrayBuffer() {}

    /**
     * Converts a byte array to a string.
     *
     * @param bytes the byte array to convert
     * @return the string
     * */
    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

    /**
     * Converts a byte array to a string.
     *
     * @param bytes the byte array to convert
     * @param offset the offset
     * @param length the length
     * @return the string
     * */
    public static String toString(byte[] bytes, int offset, int length) {
        return new String(bytes, offset, length);
    }

    /**
     * Converts a char array to a string.
     *
     * @param chars the char array to convert
     * @return the string
     * */
    public static String toString(char[] chars) {
        return new String(chars);
    }

    /**
     * Converts a char array to a string.
     *
     * @param chars the char array to convert
     * @param offset the offset
     * @param length the length
     * @return the string
     * */
    public static String toString(char[] chars, int offset, int length) {
        return new String(chars, offset, length);
    }

    /**
     * Converts a stream to a string.
     *
     * @param stream the stream to convert
     * @throws IOException if an I/O error
     * @return the string
     * */
    public static String toString(InputStream stream) throws IOException {
        return StringArrayBuffer.toString(stream.readAllBytes());
    }

    /**
     * Converts a string to a byte array.
     * @return the byte array
     * */
    public static byte[] toBytes(String string) {
        return string.getBytes();
    }

}
