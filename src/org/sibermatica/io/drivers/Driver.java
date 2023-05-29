package org.sibermatica.io.drivers;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public abstract class Driver implements Serializable {
    public InputStream out = InputStream.nullInputStream();
    public OutputStream in = OutputStream.nullOutputStream();
    protected int port;
    protected String model;

    public abstract void run();
    public abstract void stop();

    public int getPort() {
        return port;
    }

    public String getModel() {
        return model;
    }
}
