package com.example;

/**
* Class Greeter
*/
public class Greeter {
    /**
     * Constructor Greeter
     */
    public Greeter() {
    }

    /**
     * @param someone
     * @return String bonjour
     */
    public final String greet(final String someone) {
        return String.format("Hello babacar, %s!", someone);
    }
}
