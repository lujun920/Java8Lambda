package com.zt;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )    {
        Runnable r2 = () -> System.out.println("Howdy, world!");
        r2.run();
    }
}
