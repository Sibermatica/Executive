package org.sibermatica.annotations;

public @interface Test {

    boolean canFail() default true;
    boolean optimized() default false;

}
