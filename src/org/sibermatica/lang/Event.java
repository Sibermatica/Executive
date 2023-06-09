package org.sibermatica.lang;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Event</h1>
 * This class it used to create events such as <i>mouse click</i>,
 * <i>key pressed</i>, <i>key released</i>, <i>mouse over</i>, etc.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * */
public class Event implements Eventualizable {

    /**
     * Logging tools
     * @see java.util.logging
     * */
    private static final Logger LOGGER = Logger.getLogger("Event");

    /**
     * The name of the event.
     * */
    protected String event_name;

    /**
     * The description of the event.
     * */
    private String event_description;

    /**
     * Whether to log the event or not.
     * */
    private final boolean LOG_EVENT;

    /**
     * Which level to log to the console, default is {@linkplain java.util.logging.Level#INFO}
     * */
    private final Level LOG_LEVEL = Level.INFO;


    /**
     * Don't let anyone instantiate this class.
     * */
    private Event() {
        LOG_EVENT = false;
    }

    /**
     * Creates a new event.
     * @param event_name The name of the event.
     * @param log_event Whether to log the event or not.
     * @param event_description Description of the event
     * */
    public Event(String event_name, String event_description, boolean log_event) {
        this.event_name = event_name;
        this.event_description = event_description;
        LOG_EVENT = log_event;

        /* When event created, log it, (or not) */
        if (LOG_EVENT) {
            LOGGER.log(LOG_LEVEL, event_name + " : " + event_description);
        }
    }

    /**
     * Returns the type of the event.
     * @return The type of the event.
     * */
    public String getEventName() {
        return event_name;
    }

    /**
     * Returns the description of the event.
     * @return The description of the event.
     * */
    public String getEventDescription() {
        return event_description;
    }

    @Override
    public String toString() {
        return "Event:" + event_name + "/" + event_description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return LOG_EVENT == event.LOG_EVENT && Objects.equals(event_name, event.event_name) && Objects.equals(event_description, event.event_description) && Objects.equals(LOG_LEVEL, event.LOG_LEVEL);
    }

}
