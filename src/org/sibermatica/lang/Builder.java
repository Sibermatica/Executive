package org.sibermatica.lang;

import java.util.ArrayList;

public class Builder extends ArrayList<Object> {

    private Buildable buildObj;

    public Builder() {}

    public void setBuildable(Buildable buildObj) {
        if (buildObj == null) throw new IllegalStateException("The buildable is invalid");
        this.buildObj = buildObj;
    }

    public Buildable build() {
        Thread.currentThread().setName("Building system");
        return buildObj.buildSelf(Builder.this);
    }


}
