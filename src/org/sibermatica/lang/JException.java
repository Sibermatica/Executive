package org.sibermatica.lang;

import org.sibermatica.annotations.CustomException;
import org.sibermatica.util.StringUtils;

/**
 * <h1>JException</h1>
 * This class is used to replace the standard Java Exception
 * class adding additional methods and functions.
 *
 * @see java.lang.Exception
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * @version 1.2
 */
public class JException
        extends java.lang.Throwable {

    /* -- Variables -- */

    /**
     * The name of the exception.
     */
    private final String exceptionName;

    /**
     * The possible causes of the exception.
     */
    private final String[] possibleCauses;

    /* -- Constructors -- */

    /**
     * Creates a new Exception with the specified detail message and cause.
     * @param possibleCauses the possible causes of the exception
     * @param exceptionName the name of the exception
     */
    @CustomException
    public JException(String[] possibleCauses, String exceptionName) {
        this.exceptionName = exceptionName;
        this.possibleCauses = possibleCauses;
    }

    /**
     * Instanciates a new custom exception with
     * the specified detail message and the exception name.
     * @param exceptionName the exception name
     * */
    @CustomException
    public JException(String exceptionName) {
        this.possibleCauses = new String[]{};
        this.exceptionName = exceptionName;
    }

    /* -- Methods -- */

    /**
     * Shows the exception message, causes and name.
     * @see Exception#printStackTrace()
     */
	public void printStackTrace() {
        System.err.println(StringUtils.Color.Foreground.RED +
        		"""
                ████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████
                █░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█
                █░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░██░░▄▀░░█
                █░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░░░░░▄▀░░░░░░█░░░░▄▀░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░██░░▄▀░░█
                █░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███░░▄▀░░█████████░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████░░▄▀░░███████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░██░░▄▀░░█
                █░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█████░░▄▀░░███████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█
                █░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀▄▀▄▀░░█████░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀░░███████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█
                █░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█████░░▄▀░░███████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█
                █░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███░░▄▀░░█████████░░▄▀░░█████████░░▄▀░░█████████████░░▄▀░░███████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░░░░░▄▀░░█
                █░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░█████████████░░▄▀░░█████░░░░▄▀░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀▄▀▄▀▄▀▄▀░░█
                █░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░█████████████░░▄▀░░█████░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░░░░░░░░░▄▀░░█
                █░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░█████████████░░░░░░█████░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█
                ████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████
                """ + StringUtils.Color.RESET);
        System.err.println("――――――――――――――――――――――――――――――――――――――――――――――――"); // Separator
        System.err.println(); // Line break
        System.err.println(getType() + " - Possible causes:");
        System.err.println(); // Other line break
        for (String cause : enumPossibleCauses()) {
            System.err.println("\t• " + cause);
        }
    }

    /**
     * Returns the type of the exception.
     * @return the type of the exception
     */
    public String getType() {
        return exceptionName;
    }

    /**
     * Returns the message of the exception.
     * @return the message of the exception
     */
    public String getMessage() {
    	return getType();
    }

    /**
     * Return the parent of the exception.
     * @return the parent of the exception
     */
    public final Class<?> getParent() {
    	return JException.class;
    }

    /**
     * Enum the possible causes of the exception.
     * @return the possible causes of the exception
     */
    public String[] enumPossibleCauses() {
        return possibleCauses;
    }
}
