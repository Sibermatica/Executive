package org.sibermatica.annotations;

/**
 * <h1>Test</h1>
 * This annotation is used to mark a test method.
 * */
public @interface Test {
    boolean canFail() default true;
}
