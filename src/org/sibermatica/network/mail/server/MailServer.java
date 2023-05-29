package org.sibermatica.network.mail.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MailServer {

    private static final ArrayList<ServerSocket> servers = new ArrayList<>();

    public static boolean validate(Object[] server_data) {
        for (ServerSocket server : servers) {
            if (server_data[0].equals(server.getInetAddress().getHostAddress())
                && server_data[1].equals(server.getLocalPort())
            ) {
                return true;
            }
        }

        return false;
    }

    public static void add(ServerSocket server) {
        servers.add(server);
    }

    public static void remove(ServerSocket server) {
        servers.remove(server);
    }

    public static ServerSocket get(int index) {
        return servers.get(index);
    }

}
