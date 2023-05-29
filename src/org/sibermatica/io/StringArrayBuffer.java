package org.sibermatica.io;

import java.io.IOException;
import java.io.InputStream;

public class StringArrayBuffer {

    private StringArrayBuffer() {}

    public static String toString(byte[] bytes) {
        return new String(bytes);
    }

    public static String toString(byte[] bytes, int offset, int length) {
        return new String(bytes, offset, length);
    }

    public static String toString(char[] chars) {
        return new String(chars);
    }

    public static String toString(char[] chars, int offset, int length) {
        return new String(chars, offset, length);
    }

    public static String toString(InputStream stream) throws IOException {
        return StringArrayBuffer.toString(stream.readAllBytes());
    }



    public static byte[] toBytes(String string) {
        return string.getBytes();
    }

}
