package org.sibermatica.io.drivers;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * <h1>Driver</h1>
 * This class is designed to handle devices.  It implements
 * real-time updating and synchronized functions.
 * <br/><br/>
 * <strong>WARNING: This class it is not finished! Please, use with caution.</strong>
 *
 * @since 1.3
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * */
public abstract class Driver implements Serializable {

    /**
     * Device output.
     * */
    public InputStream out = InputStream.nullInputStream();

    /**
     * Device input.
     * */
    public OutputStream in = OutputStream.nullOutputStream();

    /**
     * USB Device Port.
     * */
    protected int port;

    /**
     * Device model.
     * @apiNote It is used to identify phones and other devices.
     * */
    protected String model;

    /**
     * Runs the driver.
     * */
    public abstract void run();

    /**
     * Stop the driver.
     * */
    public abstract void stop();

    /**
     * Returns the device port.
     * @return the device port
     * */
    public int getPort() {
        return port;
    }

    /**
     * Returns the device model.
     * @return the device model
     * */
    public String getModel() {
        return model;
    }
}
