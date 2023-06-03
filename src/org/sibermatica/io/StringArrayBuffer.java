package org.sibermatica.io;

import java.io.IOException;
import java.io.InputStream;

public final class StringArrayBuffer {

    /**
     * Don't let anyone instantiate this class.
     * */
    private StringArrayBuffer() {}

    /**
     * Converts a byte array to a string.
     * @return the string
     * */
    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

    /**
     * Converts a byte array to a string.
     * @return the string
     * */
    public static String toString(byte[] bytes, int offset, int length) {
        return new String(bytes, offset, length);
    }

    /**
     * Converts a char array to a string.
     * @return the string
     * */
    public static String toString(char[] chars) {
        return new String(chars);
    }

    /**
     * Converts a char array to a string.
     * @return the string
     * */
    public static String toString(char[] chars, int offset, int length) {
        return new String(chars, offset, length);
    }

    /**
     * Converts a stream to a string.
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
