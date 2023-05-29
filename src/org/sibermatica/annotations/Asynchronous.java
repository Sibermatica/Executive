package org.sibermatica.annotations;

/**
 * <h1>Asynchronous</h1>
 * This class implements asynchronous operations and methods
 * to java api like {@link java.util.concurrent.ExecutorService}
 * */
public @interface Asynchronous {

    /**
     * Maximum method timeout
     * */
    long maximumTime = -1;

    /**
     * Method timeout expected
     * */
    long timeExpected = -1;

}
