package org.sibermatica.lang;

public class Buildable {

    private Buildable() {}

    public Buildable buildSelf(Builder builder) {
        return new Buildable(builder.toArray());
    }

    public Buildable(Object... args) {}


}
