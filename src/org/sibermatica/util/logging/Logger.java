package org.sibermatica.util.logging;

import java.io.OutputStream;
import java.util.Date;
import java.util.logging.Level;

import static org.sibermatica.io.IOUtils.ToString;
import static org.sibermatica.io.IOUtils.toOutputStream;

/**
 * <h1>Logger</h1>
 * This class it's used to log messages to the system console and write
 * them to a file.  Can handle some various log files and output streams.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * @apiNote It's very recommended to logging.  You can visit Apache Log4J for advanced logging.
 * */
public final class Logger {

    /* Variables */

    /**
     * Default format of the log messages.
     * */
    public static final String DEFAULT_FORMAT = "[${HOUR_24}:${MINUTE}:${SECOND}] [${CLASS}/$Upper{LOGGING_LEVEL}]: ${MESSAGE}";

    /**
     * Formats of the log messages.
     * */
    private String format = DEFAULT_FORMAT;

    /* Constructors */

    /**
     * Generates a new Logger instance.
     * */
    public Logger() {

    }

    /**
     * Generates a new Logger instance, but with the specified
     * arguments.
     *
     * @param format The format of the log messages.
     * */
    public Logger(String format) {
        this.format = format;
    }

    /* Methods */

    /**
     * This method is used to log system console.
     * @return The output stream to log onto.
     * */
    public OutputStream logSystemConsole() {
        // IOUtils.toOutputStream(String) => this: toOutputStream
        // IOUtils.ToString(OutputStream) => this: ToString

        return toOutputStream(ToString(System.out));
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param level The level of the message.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void log(Level level, String message, Date timestamp, Class<?> clss) {
        String formatted = this.format;

        /* Hours */
        formatted = formatted.replace("${HOUR_24}", Integer.valueOf(timestamp.getHours()).toString());
        formatted = formatted.replace("${HOUR_12}", (timestamp.getHours() - 12 < 0 ? (timestamp.getHours() + " AM") : (timestamp.getHours() - 12 + " PM")));

        /* Minutes */
        formatted = formatted.replace("${MINUTE}", Integer.valueOf(timestamp.getMinutes()).toString());

        /* Seconds */
        formatted = formatted.replace("${SECOND}", Integer.valueOf(timestamp.getSeconds()).toString());

        /* Threads */
        formatted = formatted.replace("${CLASS}", clss.getName());
        formatted = formatted.replace("$Upper{CLASS}", clss.getName().toUpperCase());
        formatted = formatted.replace("$Lower{CLASS}", clss.getName().toLowerCase());

        formatted = formatted.replace("${LOGGING_LEVEL}", level.toString());
        formatted = formatted.replace("$Upper{LOGGING_LEVEL}", level.toString().toUpperCase());
        formatted = formatted.replace("$Lower{LOGGING_LEVEL}", level.toString().toLowerCase());

        /* Message */
        formatted = formatted.replace("${MESSAGE}", message);
        formatted = formatted.replace("$Upper{MESSAGE}", message.toUpperCase());
        formatted = formatted.replace("$Lower{MESSAGE}", message.toLowerCase());

        /* Print */
        System.out.println(formatted);

    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void info(String message, Date timestamp, Class<?> clss) {
        this.log(Level.INFO, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void warn(String message, Date timestamp, Class<?> clss) {
        this.log(Level.WARNING, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void error(String message, Date timestamp, Class<?> clss) {
        this.log(Level.SEVERE, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void debug(String message, Date timestamp, Class<?> clss) {
        this.log(Level.FINE, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void technical(String message, Date timestamp, Class<?> clss) {
        this.log(Level.FINER, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void engineering(String message, Date timestamp, Class<?> clss) {
        this.log(Level.FINEST, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void all(String message, Date timestamp, Class<?> clss) {
        this.log(Level.ALL, message, timestamp, clss);
    }

    /**
     * Logs the given message to the system console.  Can handle timestamps
     * and classes.
     *
     * @param message The message to log.
     * @param timestamp The timestamp when log is made.
     * @param clss The class that's logged it.
     * */
    public void config(String message, Date timestamp, Class<?> clss) {
        this.log(Level.CONFIG, message, timestamp, clss);
    }

    /**
     * Returns the current logging format.
     * @return The current logging format.
     * */
    public String currentFormat() {
        return format;
    }

    /**
     * Sets the specified logging format.
     * @param format The new logging format
     * */
    public Logger format(String format) {
        this.format = format;
        return this;
    }
}