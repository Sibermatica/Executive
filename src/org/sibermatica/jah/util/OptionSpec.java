package org.sibermatica.jah.util;

import java.util.Objects;

/**
 * <h1>OptionSpec</h1>
 * This class is used to specify an option.  It also is used in
 * {@linkplain org.sibermatica.jah.util.OptionParser}, is used to select
 * the specific key that is to be parsed.
 *
 * @apiNote We recommend no use on other classes or other frameworks.
 *   This because this class is only designed to work with {@linkplain org.sibermatica.jah.util.OptionParser} class in
 *   specific and this could cause compatibility issues.
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.3
 * */
public class OptionSpec {

    private final Object value;

    /**
     * Instances a new OptionSpec
     * @param value the key of the value
     * */
    public OptionSpec(Object value) {
        this.value = value;
    }

    /**
     * Gets the value on the internal mappings
     * @return the object
     * */
    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionSpec that = (OptionSpec) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
