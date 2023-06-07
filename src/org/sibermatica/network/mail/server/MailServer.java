package org.sibermatica.network.mail.server;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * <h1>MailServer</h1>
 * This class is for creating a mail server (not necessary smtp).
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.3
 * @see org.sibermatica.network.mail
 * */
public abstract class MailServer {

    /* -- Variables -- */

    /**
     * Existing servers.
     * @see java.util.ArrayList
     * */
    private static final ArrayList<ServerSocket> servers = new ArrayList<>();

    /**
     * Server data.  It storage in a Map<String, Object> (JSON Structure).
     * */
    private final Map<String, Object> server_data = new HashMap<>();

    /* -- Constructors -- */

    /**
     * Initializes a new mail-server.
     *
     * @param port The port where be located the server.
     * @param host The host where be located the server.
     * */
    public MailServer(int port, String host) {
        this.server_data.put("port", port);
        this.server_data.put("host", host);
    }

    /* -- Methods -- */

    /**
     * Validates servers.  It uses the server data to, internally, validate the server.
     *
     * @return true if the server is valid.
     * */
    public static boolean validate(MailServer server) {
        /* Parsing data... */

        Map<String, Object> server_data = server.getMappings();

        if (!(server_data instanceof HashMap) || server_data.isEmpty())
            return false;

        /* Getting server properties */

        Integer port = (int) server_data.get("port");
        String host = (String) server_data.get("host");

        /* With the got information, validate them */

        for (ServerSocket serverSocket : servers) {
            return host.equals(serverSocket.getInetAddress().getHostAddress())
                && port.equals(serverSocket.getLocalPort());
        }

        /* -- Server isn't valid -- */
        return false;
    }

    /**
     * Adds a server to the list of "valid" servers.
     * @param server The server to add
     * */
    public static void add(ServerSocket server) {
        servers.add(server);
    }

    /**
     * Removes a server from the list of "valid" servers.
     * @param server The server to remove
     * @apiNote Only use if you close the server otherwise could be compatibility issues.
     * */
    public static void remove(ServerSocket server) {
        servers.remove(server);
    }

    /**
     * Gets a server from the list of "valid" servers.
     * @param index The (integer) index of the server.
     * @return The server.
     * */
    public static ServerSocket getMappings(int index) {
        return servers.get(index);
    }

    /**
     * Gets server data from this instance.
     *
     * @return The server server data.
     * */
    public Map<String, Object> getMappings() {
        return server_data;
    }

    /* HashCode, equals, toString and other methods... */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailServer that = (MailServer) o;
        return Objects.equals(server_data, that.server_data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server_data);
    }

    @Override
    public String toString() {
        return "MailServer{" + "server_data=" + server_data + '}';
    }

}
