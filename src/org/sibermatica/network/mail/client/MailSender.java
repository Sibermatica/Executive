package org.sibermatica.network.mail.client;

import org.sibermatica.network.mail.Email;
import org.sibermatica.network.mail.server.MailServer;

import java.net.Socket;

/**
 * <h1>MailSender</h1>
 * It is used to send client emails.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.3
 * */
public abstract class MailSender {

    /* -- Methods -- */

    /**
     * Sends an email.
     *
     * @param email the email to send.
     * @param server the mail server to use.
     *
     * @throws UnsupportedOperationException if the server is not valid.
     * @apiNote We recommend creating a new class that inherits from this class.
     * */
    public static void send(Email email, MailServer server)
            throws UnsupportedOperationException {

        /* -- Checksum -- */

        if (!MailServer.validate(server))
            throw new IllegalArgumentException("Invalid server data");

        if (email == null)
            throw new IllegalArgumentException("Email cannot be null");

        if (email.from().contains("\\")
                || email.to().contains("\\")
                || email.subject().contains("\\"))
            throw new IllegalArgumentException("Email cannot contain slash bars");

        /* -------------------------------- */

        /* Sets server properties */
        int port = (int) server.getMappings().get("port");
        String host = (String) server.getMappings().get("host");

        /* Sender thread */
        try {
            /* Creating communication socket */
            Socket socket = new Socket(host, port);

            /* Email message header */
            byte[] bytes = (email.from() + "\\" +
                    email.to() + "\\" +
                    email.subject() + ":\n" +
                    email.body()).getBytes();

            /* Writing and sending mail */
            socket.getOutputStream().write(bytes);
            socket.getOutputStream().flush();

            /* Ending the connection */
            socket.close();
        } catch (Exception e) {

            // In case of any error, we throw an exception
            throw new UnsupportedOperationException(e.getMessage());
        }
    }

}
