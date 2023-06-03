package org.sibermatica.jah.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>OptionParser</h1>
 * This class is used to parse command line arguments.
 * Commonly, we need arguments to easily handle our programs.  But now
 * we always have a library that facilitates this process.  Then we
 * implemented this class to facilitate this process of parsing arguments.
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.3
 * @apiNote If you want the original concept of parsing arguments
 *  you should visit Apache JOptsimple.  This open-source library
 *  contains this class and others more advanced.  This only is a
 *  copy of this.  If you want the original, visit Apache JOptsimple.
 * */
public final class OptionParser {

    /**
     * The format of options.  Defaults to "-".
     * */
    private static String OPTION = "-";

    /**
     * The format of map options. Defaults to "--".
     * */
    private static String MAP_OPTION = "--";

    /**
     * The map options. Defaults to empty HashMap.
     * @see java.util.HashMap
     * */
    private final Map<String, Object> map = new HashMap<>();

    /**
     * The options. Defaults to empty HashMap.
     * @see java.util.ArrayList
     * */
    private final ArrayList<String> options = new ArrayList<>();

    /**
     * Here is located the trash arguments.
     * */
    private static final ArrayList<String> ignoredOptions = new ArrayList<>();

    /**
     * Instantiates a new OptionParser.
     * */
    public OptionParser() {}

    /**
     * Instantiates a new OptionParser.  But with the given options.
     *
     * @param options the options to use.
     * */
    private OptionParser(HashMap<String, Object> options) {
        if (options.get("map.option") == null)
            throw new IllegalArgumentException("map.option cannot be set");
        if (options.get("option") == null)
            throw new IllegalArgumentException("option cannot be set");

        MAP_OPTION = options.get("map.option").toString();
        OPTION = options.get("option").toString();
    }

    /**
     * Parse the selected string array to a valid list of
     * arguments.
     *
     * @param args the string array to parse.
     *
     * @return the instance of OptionParser.
     * */
    public OptionParser parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.startsWith(MAP_OPTION) && arg.length() > MAP_OPTION.length() + 1) {
                map.put(arg.substring(MAP_OPTION.length()), args[i + 1]);
                i++;
            } else if (arg.startsWith(OPTION) && arg.length() > OPTION.length() + 1) {
                options.add(arg.substring(OPTION.length()));
            } else {
                ignoredOptions.add(arg);
            }

        }

        return this;

    }

    /**
     * Returns true if a key exists.
     *
     * @param key the key to look for.
     *
     * @return true if the key exists.
     * */
    public boolean has(String key) {
        return map.containsKey(key) || options.contains(key);
    }

    /**
     * Returns true if a key exists.
     *
     * @param key the key to look for.
     *
     * @return true if the key exists.
     * */
    public boolean has(OptionSpec key) {
        return has(key.toString());
    }

    /**
     * Returns the value of a map key.
     *
     * @param key the key to get the value for.
     * */
    public Object get(String key) {
        return map.getOrDefault(key, null);
    }

    /**
     * Returns the value of a map key.
     *
     * @param key the key to get the value for.
     * */
    public Object get(OptionSpec key) {
        return get(key.toString());
    }

    /**
     * Returns a new instance of OptionSpec.  More information about
     * in {@linkplain org.sibermatica.jah.util.OptionSpec}.
     *
     * @return a new instance of OptionSpec.
     *
     * @see org.sibermatica.jah.util.OptionSpec
     * */
    public OptionSpec accepts(String key) {
        return new OptionSpec(key);
    }

    /**
     * Returns the value of a map key.  If the key
     * is {@code null}, invalid or empty returns other value.
     *
     * @param key the key to get the value for.
     * @param default_obj the value to return if the key is null, invalid or empty.
     * */
    public Object getOrDefault(String key, Object default_obj) {
        return map.getOrDefault(key, default_obj);
    }

    /**
     * Returns the value of a map key.  If the key
     * is {@code null}, invalid or empty returns other value.
     *
     * @param key the key to get the value for.
     * @param default_obj the value to return if the key is null, invalid or empty.
     * */
    public Object getOrDefault(OptionSpec key, Object default_obj) {
        return getOrDefault(key.toString(), default_obj);
    }

    /**
     * Formats the arguments selecting format for arguments and
     * for options.
     *
     * @param OPTION formats the arguments for options.
     * @param MAP_OPTION formats the arguments for map options.
     *
     * @return OptionParser instance but correctly formatted.
     * */
    public static OptionParser format(String OPTION, String MAP_OPTION) {
        return new OptionParser(new HashMap<String, Object>() {

            private static final long serialVersionUID = 1L;

            {
                put("map.option", MAP_OPTION);
                put("option", OPTION);
            }
        });
    }

    /**
     * Returns options that are invalid for be arguments.  Then,
     * you can get them.
     *
     * @return options that are invalid for be arguments.
     * */
    public ArrayList<String> getIgnoredOptions() {
        return ignoredOptions;
    }

    /**
     * Returns options that are invalid for be arguments.
     * Then, you can get them.
     *
     * @return options that are invalid for be arguments.
     * */
    public String[] getIgnoredOptionsAsArray() {
        return getIgnoredOptions().toArray(new String[0]);
    }
}
