package org.sibermatica.util;

import org.sibermatica.io.IOUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * <h1>Cast</h1>
 * This class casts classes from different types.
 * (eg. String to XML Document, String to File, {@code FileInputStream} object)
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * */
public final class Cast {

    /**
     * Don't let anyone instance this class
     * */
    private Cast() {
    }


    /**
     * Converts a String to an XML Document.
     * @param parsed_xml the String to convert
     * @return an XML Document
     * @throws IOException                  if an I/O error occurs
     * @throws SAXException                 if a parser exception occurs
     * @throws ParserConfigurationException if the parser configuration is invalid
     * */
    public static Document toDocument(String parsed_xml) throws IOException, SAXException, ParserConfigurationException {
        /* Creating W3C Instances */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        /* Parsing XML File */
        InputStream XmlFileDocument = IOUtils.toInputStream(parsed_xml);
        return builder.parse(XmlFileDocument);
    }

    /**
     * Converts a String to a FileInputStream.
     * @param str the String to convert
     * @return a FileInputStream
     * */
    public static FileInputStream toFile(String str) {
        /* Convert String to a File */
        return (FileInputStream) IOUtils.toInputStream(str);
    }

    /**
     * Converts an integer number into a byte.
     * @param x the integer number
     * @return the byte representation
     * */
    public static byte toByte(int x) {
        byte result = (byte) x;

        /* -- Checksum -- */
        if (!toString(x).equals(toString(result)))
            throw new NumberFormatException("byte limit rebased");

        return result; // Return result
    }

    /**
     * Converts an integer number into a short primitive value.
     * @param x the integer number
     * @return the short primitive value
     * @throws NumberFormatException if the integer number rebases the short limits
     * */
    public static short toShort(int x) throws NumberFormatException {
        short result = (short) x;

        // Checksum
        if (!toString(x).equals(toString(result)))
            throw new NumberFormatException("cannot convert");

        return result;
    }

    /**
     * Converts an integer number into a String.
     * @param x the integer number
     * @return the String representation
     * */
    public static String toString(int x) {
        return String.valueOf(x);
    }

    /**
     * Converts an array of any type to another array type.
     *
     * @param array The array to convert.
     * @param type The type to convert to
     * @param <T> The type to convert to
     * @return The converted array.
     * */

    public static <T> T[] toArray(T[] type, Object[] array) {
        // Make a new array of a's runtime type, but my contents:
        return (T[]) Arrays.copyOf(array, array.length, type.getClass());
    }

    /**
     * Converts an array of any type to another array type.
     *
     * @param array The array to convert.
     * @param type The type to convert to
     * @param <T> The type to convert to
     * @return The converted array.
     * */
    public static <T> T[] toSecureArray(T[] type, Object[] array) {
        return Arrays.stream(array).toList().toArray(type);
    }

}
