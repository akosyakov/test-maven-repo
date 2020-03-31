package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    static int jacques = 7;

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        Object myObject = null;
        System.out.println("A NullPointerException is a drag...");

        /**
         * Checker prevents this from compiling...
         */
        // System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null reference
         * myObject
         *
         * http://checkerframework.org
         */
        System.out.println("the value is " + jacques);
int j;
        // System.out.println("... but thankfully, Checker has our back:
        // http://checkerframework.org");
        System.out.println("The test Hello World 909 is completed");
    }
}
