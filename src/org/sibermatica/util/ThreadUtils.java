package org.sibermatica.util;

import org.sibermatica.annotations.Asynchronous;

/**
 * <h1>ThreadUtils</h1>
 * {@code ThreadUtils} it used to control the execution of a thread
 * or many threads at once and easily manages multiple threads.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * @see java.lang.Thread
 * */
public class ThreadUtils {

    /**
     * Cancel the application execution with a custom status code.
     * @param status the status code
     * @see java.lang.System#exit(int)
     * */
    public static void stop(int status) {
        System.exit(status);
    }

    /**
     * Cancel the application execution with a default status code of 0.
     * @see java.lang.System#exit(int)
     * */

    public static void stop() {
        System.exit(0);
    }

    /**
     * Sleep current thread for a specified amount of time in milliseconds.
     * @param millis the amount of time in milliseconds
     * @return an integer, if the sleep was sucessful 0, -1 otherwise
     * @see java.lang.Thread#sleep(long)
     * */
    @Asynchronous
    public int sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch(Exception e) {
            return -1; // Finished with errors
        }

        return 0; // Correct
    }

}
