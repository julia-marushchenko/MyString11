/**
 *  Java program to demonstrate method indent() of String class.
 */
package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an initialized string instance.
        String str = "I am a string.";

        // Printing original string.
        System.out.println("Original string: " + str);

        //  Changing the string with method indent.
        str = str.indent(2);

        // Printing the value of str.
        System.out.println("After indent() method: " + str); // Output: After indent() method:   I am a string.

        //  Changing the string with method indent with 0 parameter.
        str = str.indent(0);

        // Printing the value of str.
        System.out.println("After indent() method: " + str); // Output: After indent() method:   I am a string.

        //  Changing the string with method indent.
        str = str.indent(-1);

        // Printing the value of str.
        System.out.println("After indent() method: " + str); // Output: After indent() method:  I am a string.

    }
}