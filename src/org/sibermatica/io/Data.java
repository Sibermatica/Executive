package org.sibermatica.io;

import org.sibermatica.util.StringUtils;

/**
 * <h1>Data</h1>
 * Is is used for converting byte size, for this purpose
 * this contains instances representing the size in bytes,
 * and methods that convert the byte size in the required
 * byte size.<br>
 *
 * Byte size are:
 * <ul>
 *     <li>Byte</li>
 *     <li>Kilobyte</li>
 *     <li>Megabyte</li>
 *     <li>Gigabyte</li>
 *     <li>Terabyte</li>
 *     <li>Petabyte</li>
 * </ul>
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @see java.lang.Byte
 * @see java.lang.Long
 * @since 1.0
 * @deprecated This class manages high quantities of bytes, and it is low-performance because it uses long values. But isn't for removal, you can use it without preoccupations.
 * */
@Deprecated( since = "1.4" )
public final class Data {

    /* -- Variables -- */

    public static final long BYTE_LEVEL = 1024;

    /**
     * Bit unit equals 1000.
     * */
    public static final long BIT_LEVEL = 1000;

    /**
     * Kilobyte is the first unit.
     * */
    public static final int KILO = 1;

    /**
     * Mega is the second unit.
     * */
    public static final int MEGA = 2;

    /**
     * Giga is the third unit.
     * */
    public static final int GIGA = 3;

    /**
     * Tera is the fourth unit.
     * */
    public static final int TERA = 4;

    /**
     * Peta is the fifth unit.
     * */
    public static final int PETA = 5;

    /**
     * Bytes storaged in memory.
     * */
    private final long bytes;

    /* -- Constructors & Instances -- */

    /**
     * Instances a Data instance with the selected number of bytes that represents the instance value on bytes.
     * @param bytes Byte size to store
     * */
    public Data(long bytes) {
        this.bytes = bytes;
    }

    /**
     * Generates a Data instance with the selected number of kilobytes that represents the instance value on bytes.
     * @param kilobytes Kilobytes size to store
     * @return the kilobytes instance
     * */
    public static Data kilobyteInstance(long kilobytes) {
        return new Data((long) (kilobytes * Math.pow(BYTE_LEVEL, KILO)));
    }

    /**
     * Generates a Data instance with the selected number of kilobits that represents the instance value on bytes.
     * @param kilobits Kilobits size to store
     * @return the kilobits instance
     * */
    public static Data kilobitInstance(long kilobits) {
        return new Data((long) (kilobits * Math.pow(BIT_LEVEL, KILO)));
    }

    /**
     * Generates a Data instance with the selected number of megabits that represents the instance value on bytes.
     * @param megabits Megabits size to store
     * @return the metabits instance
     * */
    public static Data megabitInstance(long megabits) {
        return new Data((long) (megabits * Math.pow(BIT_LEVEL, MEGA)));
    }

    /**
     * Generates a Data instance with the selected number of megabytes that represents the instance value on bytes.
     * @param megabytes Megabytes size to store
     * @return the megabytes instance
     * */
    public static Data megabyteInstance(long megabytes) {
        return new Data((long) (megabytes * Math.pow(BYTE_LEVEL, MEGA)));
    }

    /**
     * Generates a Data instance with the selected number of gigabits that represents the instance value on bytes.
     * @param gigabits Gigabits size to store
     * @return the gigabit instance
     * */
    public static Data gigabitInstance(long gigabits) {
        return new Data((long) (gigabits * Math.pow(BIT_LEVEL, GIGA)));
    }

    /**
     * Generates a Data instance with the selected number of gigabytes that represents the instance value on bytes.
     * @param gigabytes Gigabyte size to store
     * @return the gigabytes instance
     * */
    public static Data gigabyteInstance(long gigabytes) {
        return new Data((long) (gigabytes * Math.pow(BYTE_LEVEL, GIGA)));
    }

    /**
     * Generates a Data instance with the selected number of terabits that represents the instance value on bytes.
     * @param terabits Terabits size to store
     * @return the terabits instance
     * */
    public static Data terabitInstance(long terabits) {
        return new Data((long) (terabits * Math.pow(BIT_LEVEL, TERA)));
    }

    /**
     * Generates a Data instance with the selected number of terabytes that represents the instance value on bytes.
     * @param terabytes Terabytes size to store
     * @return the terabytes instance
     * */
    public static Data terabyteInstance(long terabytes) {
        return new Data((long) (terabytes * Math.pow(BYTE_LEVEL, TERA)));
    }

    /**
     * Generates a Data instance with the selected number of petabits that represents the instance value on bytes.
     * @param petabits Petabits size to store
     * @return the petabits instance
     * */
    public static Data petabitInstance(long petabits) {
        return new Data((long) (petabits * Math.pow(BIT_LEVEL, PETA)));
    }

    /**
     * Generates a Data instance with the selected number of petabytes that represents the instance value on bytes.
     * @param petabytes Petabytes size to store
     * @return the petabytes instance
     * */
    public static Data petabyteInstance(long petabytes) {
        return new Data((long) (petabytes * Math.pow(BIT_LEVEL, PETA)));
    }

    /* -- Converters -- */

    /**
     * Converts instance data into a kilobyte unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toKilobyte() {
        return (long) (bytes / Math.pow(BYTE_LEVEL, KILO));
    }

    /**
     * Converts instance data into a kilobits unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toKilobit() {
        return (long) (bytes / Math.pow(BIT_LEVEL, KILO));
    }

    /**
     * Converts instance data into a megabits unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toMegabit() {
        return (long) (bytes / Math.pow(BIT_LEVEL, MEGA));
    }

    /**
     * Converts instance data into a megabytes unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toMegabyte() {
        return (long) (bytes / Math.pow(BYTE_LEVEL, MEGA));
    }

    /**
     * Converts instance data into a gigabits unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toGigabit() {
        return (long) (bytes / Math.pow(BIT_LEVEL, GIGA));
    }

    /**
     * Converts instance data into a gigabytes unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toGigabyte() {
        return (long) (bytes / Math.pow(BYTE_LEVEL, GIGA));
    }

    /**
     * Converts instance data into a terabits unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toTerabit() {
        return (long) (bytes / Math.pow(BIT_LEVEL, TERA));
    }

    /**
     * Converts instance data into a terabytes unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toTerabyte() {
        return (long) (bytes / Math.pow(BYTE_LEVEL, TERA));
    }

    /**
     * Converts instance data into a petabits unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toPetabit() {
        return (long) (bytes / Math.pow(BIT_LEVEL, PETA));
    }

    /**
     * Converts instance data into a petabytes unit.
     * @return Representation of the instance value in the selected unit.
     * */
    public long toPetabyte() {
        return (long) (bytes / Math.pow(BIT_LEVEL, PETA));
    }

    /**
     * Converts the bytes to a binary representation
     * @return the binary representation
     * */
    public String toBinary() {
        String gBinary = Long.toBinaryString(bytes).replace(" ", "");
        StringBuilder binary = new StringBuilder();

        for (int i = gBinary.length(); i > 0; i -= 8) {
            binary.append(StringUtils.padStart(gBinary.substring(i - 8, i), 8, "0"));
            binary.append(" ");
        }

        return binary.toString();
    }

    /**
     * Converts the bytes to a hexadecimal representation
     * @return the hexadecimal representation
     * */
    public String toHexadecimal() {
        return "0x" + StringUtils.padStart(Long.toHexString(bytes), String.valueOf(Long.MAX_VALUE).length(), "0");
    }

    /* -- Getters & setters -- */

    /**
     * @return Byte size storaged
     * */
    public long getBytes() {
        return bytes;
    }
}
