package org.sibermatica.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * <h1>ObjectWriter</h1>
 *
 * This class is used for converting objects to output streams, commonly are used for save debugging instance traces in a file.
 *
 * @since 1.0
 *
 * @see IOUtils
 * @see java.io.InputStream
 * @see java.io.OutputStream
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @apiNote If you want to use binary data or more complex object
 *   storaging you should use {@linkplain java.io.ObjectOutputStream} and {@linkplain java.io.ObjectInputStream}.
 *   One more complement for working with binary data. {@linkplain org.sibermatica.io.binary.Binary}
 * @see org.sibermatica.io.binary.Binary
 * */

public class ObjectWriter<T> {

    /* -- Constructors -- */

    public ObjectWriter() {}

    /* -- I/O Methods -- */

    /**
     * The method {@code write} it used to write an object instance data to an output stream.
     *
     * @param writer The output stream to write to.
     * @param object The object to write.
     * @see java.io.OutputStream
     * @throws java.io.IOException If an exception occurs while writing data.
     * */
    public void write(OutputStream writer, T object) throws IOException {
        if (writer == null) /* Manually assert, it can also be done with `assert writer != null` */
            throw new NullPointerException("Writer is null");

        if (object == null) /* Manually assert, it can also be done with `assert object != null` */
            throw new NullPointerException("Object is null");

        /* Possible error thread */

        try {

            /* Convert the String buffer to a byte array */
            byte[] buffer = object.toString().getBytes(StandardCharsets.UTF_8);

            /* Write the byte array to a OutputStream */
            writer.write(buffer);

        } catch (Exception e) {
            /* If an exception occurs we throw a IOException with the exception message */
            throw new IOException(e.getMessage());
        }
        /* --------------------------------------------- */

    }

}
