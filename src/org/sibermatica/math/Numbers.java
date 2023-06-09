package org.sibermatica.math;

/**
 * <h1>Numbers</h1>
 * This class allow modifying numbers extracting decimal values
 * and <i>integer</i> values.  Above all, it's purpose is to manage
 * floating point numbers and double values.  This feature is useful
 * for some special cases where the number values are represented
 * as floats.
 *
 * @since 1.0
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @see java.lang.Number
 * @see java.lang.Integer
 * */
public final class Numbers {

    /* -- Constructors -- */

    /**
     * Don't let anyone instance this class.
     */
    private Numbers() {}

    /* -- Methods -- */

    /**
     * Extracts the decimal part of a number.
     *
     * @param x The number.
     * @return The decimal part of the number.
     */
    public static int extractDecimal(double x) {
        double dComplementedDecimal = x - extractInteger(x);
        int length = String.valueOf(dComplementedDecimal).length();

        return (int) dComplementedDecimal * length;
    }

    /**
     * Extracts the decimal part of a number.
     *
     * @param x The number.
     * @return The decimal part of the number.
     */
    public static int extractDecimal(float x) {
        return extractDecimal((double) x);
    }

    /**
     * Extracts the integer part of a number.
     *
     * @param x The number.
     * @return The integer part of the number.
     */
    public static int extractInteger(double x) {
        return (int) x;
    }

    /**
     * Extracts the integer part of a number.
     *
     * @param x The number.
     * @return The integer part of the number.
     */
    public static int extractInteger(float x) {
        return extractInteger((double) x);
    }

}
