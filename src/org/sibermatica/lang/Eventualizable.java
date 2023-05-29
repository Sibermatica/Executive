package org.sibermatica.lang;

import java.util.logging.Level;

/**
 * <h1>Eventualizable</h1>
 * If this interface is implemented, the class that implemented
 * it will automatically converts to an Event.
 *
 * @since 1.0
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @see Event
 * @see java.util.logging
 * @version 1.0
 * */
public interface Eventualizable {

    /**
     * Log events to the console, default is {@linkplain java.lang.Boolean#FALSE}
     * */
    boolean LOG_EVENTS = false;

    /**
     * Which level to log to the console, default is {@linkplain java.util.logging.Level#INFO}
     * */
    Level LOG_LEVEL = Level.INFO;
}
