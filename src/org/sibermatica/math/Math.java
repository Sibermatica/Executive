package org.sibermatica.math;

import static java.lang.Math.*;

/**
 * <h1>Math</h1>
 * This class implements extensions for the original
 * Math class ({@linkplain java.lang.Math}).
 *
 * @see java.lang.Math
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.1
 * */
public final class Math {

    /* -- Constructors -- */

    /**
     * Don't let anyone instance this class
     * */
    private Math() {
    }

    /* -- Variables -- */

    /**
     * The {@code double} value that is closer than any other to
     * <i>e</i>, the base of the natural logarithms.
     */
    public static final double E = 2.7182818284590452354;

    /**
     * The {@code double} value that is closer than any other to
     * <i>pi</i>, the ratio of the circumference of a circle to its
     * diameter.
     */
    public static final double PI = 3.14159265358979323846;

    /**
     * Constant by which to multiply an angular value in degrees to obtain an
     * angular value in radians.
     */
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295;

    /**
     * Constant by which to multiply an angular value in radians to obtain an
     * angular value in degrees.
     */
    private static final double RADIANS_TO_DEGREES = 57.29577951308232;

    /* -- Methods -- */

    /**
     * Gets the PI number with a specified level of precision.
     *
     * @param precision the level of precision
     * @apiNote Only recommended for high performance computers.
     * @return PI number
     * */
    public static double getPI(long precision) {
        double result = 0;

        for (long i = 0 ; i < precision; i++) {
            result += 1 / java.lang.Math.pow(i + 1, 2);
        }

        return java.lang.Math.sqrt(6 * result);
    }

}
