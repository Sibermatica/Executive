package org.sibermatica.util;

import org.sibermatica.io.IOUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <h1>Cast</h1>
 * This class casts classes from different types.
 * (eg. String to XML Document, String to File, {@code FileInputStream} object)
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * */
public class Cast {

    public static Document toDocument(String parsed_xml) throws IOException, SAXException, ParserConfigurationException {
        /* Creating W3C Instances */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        /* Parsing XML File */
        InputStream XmlFileDocument = IOUtils.toInputStream(parsed_xml);
        return builder.parse(XmlFileDocument);
    }

    public static FileInputStream toFile(String str) {
        /* Convert String to a File */
        return (FileInputStream) IOUtils.toInputStream(str);
    }

    public static byte toByte(int x) {
        byte result = (byte) x;

        // Checksum
        if (!toString(x).equals(toString(result)))
            throw new NumberFormatException("Cannot convert");

        return result;
    }

    public static short toShort(int x) throws NumberFormatException {
        short result = (short) x;

        // Checksum
        if (!toString(x).equals(toString(result)))
            throw new NumberFormatException("Cannot convert");

        return result;
    }

    public static String toString(int x) {
        return String.valueOf(x);
    }

}
