package org.sibermatica.io.binary;

import org.sibermatica.math.Numbers;

/**
 * <h1>BinaryLogicalGates</h1>
 *
 * This class implements the binary logical gates.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.3
 * */
public final class BinaryLogicalGates {

    /** Don't let anyone instance this class */
    private BinaryLogicalGates() {}

    /**
     * Returns the logical AND of two boolean values.
     *
     * @param a the first boolean value to compare.
     * @param b the second boolean value to compare.
     *
     * @return the logical AND of two boolean values.
     * */
    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    /**
     * Returns the logical AND of two integer values.
     *
     * @param a the first integer value to compare.
     * @param b the second integer value to compare.
     *
     * @return the logical AND of two integer values.
     * */
    public static int and(int a, int b) {
        return a & b;
    }

    /**
     * Returns the logical AND of two long values.
     *
     * @param a the first "long" value to compare.
     * @param b the second "long" value to compare.
     *
     * @return the logical AND of two long values.
     * */
    public static long and(long a, long b) {
        return a & b;
    }

    /**
     * Returns the logical AND of two double values.
     *
     * @param a the first double value to compare.
     * @param b the second double value to compare.
     *
     * @return the logical AND of two double values.
     * */
    public static double and(double a, double b) {
        int intBinary = BinaryLogicalGates.and(Numbers.extractInteger(a), Numbers.extractInteger(b));
        int decimalBinary = BinaryLogicalGates.and(Numbers.extractDecimal(a), Numbers.extractDecimal(b));

        return intBinary + (float) decimalBinary / String.valueOf(decimalBinary).length();
    }

    /**
     * Returns the logical AND of two float values.
     *
     * @param a the first float value to compare.
     * @param b the second float value to compare.
     *
     * @return the logical AND of two float values.
     * */
    public static float and(float a, float b) {
        return (float) BinaryLogicalGates.and(a, (double) b);
    }

    /**
     * Returns the logical AND of a array of boolean values.
     *
     * @param x the array of booleans.
     *
     * @return the logical AND of boolean array values.
     * */
    public static boolean and(boolean[] x) {
        for (boolean b : x)
            if (!b) return false;
        return true;
    }

    /**
     * Returns the logical OR of two boolean values.
     *
     * @param a the first boolean value to compare.
     * @param b the second boolean value to compare.
     *
     * @return the logical OR of two boolean values.
     * */
    public static boolean or(boolean a, boolean b) {
        return a || b;
    }

    /**
     * Returns the logical OR of two integer values.
     *
     * @param a the first integer value to compare.
     * */
    public static int or(int a, int b) {
        return a | b;
    }

    /**
     * Returns the logical OR of two long values.
     *
     * @param a the first "long" value to compare.
     * */
    public static long or(long a, long b) {
        return a | b;
    }

    /**
     * Returns the logical OR of two double values.
     *
     * @param a the first double value to compare.
     * */
    public static double or(double a, double b) {
        int intBinary = BinaryLogicalGates.or(Numbers.extractInteger(a), Numbers.extractInteger(b));
        int decimalBinary = BinaryLogicalGates.or(Numbers.extractDecimal(a), Numbers.extractDecimal(b));

        return intBinary + (float) decimalBinary / String.valueOf(decimalBinary).length();
    }

    /**
     * Returns the logical OR of two float values.
     *
     * @param a the first float value to compare.
     * */
    public static float or(float a, float b) {
        return (float) BinaryLogicalGates.or(a, (double) b);
    }

}
