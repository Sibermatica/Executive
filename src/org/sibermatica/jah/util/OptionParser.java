package org.sibermatica.jah.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class OptionParser {

    private static String arg_indicator = "-"; // Defaults to "-"
    private final Map<String, Object> map = new HashMap<>();
    private final ArrayList<String> options = new ArrayList<>();

    public OptionParser() {

    }

    private OptionParser(HashMap<String, Object> config) {
        if (config.get("arg_indicator") == null)
            throw new IllegalArgumentException("arg_indicator cannot be set");

        arg_indicator = config.get("arg_indicator").toString();
    }

    public void parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.startsWith(arg_indicator) && arg.length() > arg_indicator.length() + 1) {

                if (!args[i + 1].startsWith(arg_indicator)) {
                    map.put(arg.substring(arg_indicator.length()), args[i + 1]);
                    i++;
                } else {
                    options.add(arg.substring(arg_indicator.length()));
                }

            }

        }

    }

    public boolean has(String key) {
        return map.containsKey(key) || options.contains(key);
    }

    public Object getValue(String key) {
        return map.getOrDefault(key, null);
    }

    public static OptionParser format(String arg_indicator) {
        OptionParser.arg_indicator = arg_indicator;
        return new OptionParser();
    }

}
