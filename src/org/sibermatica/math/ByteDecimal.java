package org.sibermatica.math;

import org.sibermatica.util.Cast;

import static org.sibermatica.math.Numbers.extractDecimal;
import static org.sibermatica.math.Numbers.extractInteger;
import static org.sibermatica.util.Cast.toByte;

public class ByteDecimal {

    /**
     * The decimal part of the ByteDecimal.
     */
    public final byte decimal;

    /**
     * The integer part of the ByteDecimal.
     */
    public final byte integer;

    /**
     * It cannot be instantiated.
     */
    private ByteDecimal(byte integer, byte decimal) {
        this.integer = 0;
        this.decimal = 0;
    }

    /**
     * Instantiates a ByteDecimal from a double.
     *
     * @param value the double to convert to a ByteDecimal.
     */
    public ByteDecimal(double value) {
        integer = toByte(extractInteger(value));
        decimal = toByte(extractDecimal(value));
    }

    /**
     * Converts the ByteDecimal to a String.
     *
     * @return the String representation of the ByteDecimal.
     */
    @Override
    public String toString() {
        return Cast.toString(integer) + "." + Cast.toString(decimal);
    }

}
