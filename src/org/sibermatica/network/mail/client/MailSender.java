package org.sibermatica.network.mail.client;

import org.sibermatica.network.mail.Email;
import org.sibermatica.network.mail.server.MailServer;

import java.io.OutputStream;
import java.net.Socket;

public class MailSender {

    public static void send(Email email, Object[] user_data, Object[] server_data) throws RuntimeException {
        if (!MailServer.validate(server_data))
            throw new RuntimeException("Invalid server data");

        try {
            Socket socket = new Socket((String) server_data[0], (Integer) server_data[1]);
            StringBuilder bytes = new StringBuilder();

            bytes.append(email.getFrom().concat("\n"));      // HEADER
            bytes.append(email.getTo().concat("\n"));        // HEADER
            bytes.append(email.getSubject().concat("\n"));   // BODY
            bytes.append(email.getBody().toString());           // BODY

            socket.getOutputStream().write(bytes.toString().getBytes());
            socket.getOutputStream().flush();

            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
