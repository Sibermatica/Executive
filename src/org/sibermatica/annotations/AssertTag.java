package org.sibermatica.annotations;

/**
 * <h1>AssertTag</h1>
 * If an argument does not match a tag, an exception is thrown.
 *
 * @since 1.0
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * */
public final class AssertTag {

    /* -- Constructors -- */

    /**
     * Don't let anyone instance this class
     * */
    private AssertTag() {}

    /* -- Methods -- */

    /**
     * If an argument does not match a tag, an exception is thrown.
     *
     * @param tag The tag, of type {@linkplain java.lang.Class}.
     * @param value The value, of type {@linkplain java.lang.Object}.
     * @see org.sibermatica.annotations
     * */
    public static boolean tryTag(Class<?> tag, Object value) {
        return switch (tag.getSimpleName()) {
            case "NotNull" -> value != null; // The value, obligatory has to be non-null.
            case "Nullable" -> true; // The value can be null.

            /* Invalid tag name, Search for tags on net.cybermatics.annotations */
            default -> throw new IllegalArgumentException("Illegal tag name: " + tag.getSimpleName() + "");
        };
    }

}
