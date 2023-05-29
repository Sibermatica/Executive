package org.sibermatica.math;

public class Numbers {

    /**
     * It cannot be instantiated.
     */
    private Numbers() {}

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
