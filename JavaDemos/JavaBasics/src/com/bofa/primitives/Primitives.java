package com.bofa.primitives;

public class Primitives {

    /*
     data types in JavaScripts
    - boolean (true/false)
    - number (1, 55, 88.4, ...)
    - strings ("a", "some sentence")
     */


    /*
    In Java we have two kinds of variables
    - Primitives - there are 8
    - Objects

    Primitives reserve a fixed amount of space in memory and hold a single value of a specific type

    Whole Numbers
    byte - 1 byte / 8 bits 0000 0000
    short - 2 bytes / 16 bits
    char* - 2 bytes
    int - 4 bytes / 32 bits
    long - 8 bytes / 64 bits


    Floating Point Numbers (Decimals)
    float - 4 bytes / 32 bits
    double - 8 bytes / 64 bits

    Other
    boolean - use the available space and it can differ between jvms/operating systems

    EVERYTHING ELSE in Java is a REFERENCE VARIABLE - that points to some OBJECT in memory location

     */

    public static void main(String[] args) {

        // declare a variable in Java - we have to specify the data type FIRST
        // datatype variableName
        int myInt;


        // assign a value to that variable
        myInt = 144;

        // to print values to our console - equivalent of console.log() in JS
        System.out.println(myInt);

        // we can reassign variables
        myInt = 55555; // as long as the data type stays the same

        // because Java is Strictly and Statically typed - we must assign a value that matches the datatype
        //myInt = false; // this isn't possible - myInt is an 'int' - not a boolean


        // we can declare and assign at the same time
        int anotherInt = 777;

        byte b1 = -128; // this is the smallest value we can store in a byte
        byte b2 = 127; // this is the largest

        short s = 32767;
        char c = 65; // behind the scenes this is stored and understood to be a number

        System.out.println("C = " + c); // we can do this similar to JS
        int i = 2147483647; // if you need to store a larger number - use long
        long l = 100L;  // all whole numbers (no decimals) default to 'int' datatype - use capital L to denote long
        long longestLong = 9223372036854775807L; // larger than this you need some helper classes (BigDecimal)
        System.out.println("Before casting: " + longestLong);
        // use these types if we needed to store numbers with decimals
        float myFloat = 5.0F; // decimals default to double - so we need to specify float with an F.
        double myDouble = 5.5; // default datatype for decimal numbers

        /*
        Explicit - something is clearly, obviously, stated in full - no need for inferring any details
        Implicit - something that is unsaid or unstated - the true meaning is implied.
         */

        // Casting - the way we can 'change' datatypes
        // we can Explicitly cast to another data type
        int casted = (int) longestLong; // CAREFUL - this will result in data loss
        System.out.println("After casting: " + casted);

        // we can cast Implicitly - without the syntax of '(datatype)' - if there's no risk of dataloss
        // but it's best practice to be as explicit as possible.
        double castedDouble = myFloat;

    }

}
