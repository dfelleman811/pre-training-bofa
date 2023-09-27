package com.bofa.arrays; // in our file system this will become "com/bofa/arrays/ArraysPlayground.java"

// we need to import java packages and classes to use them
import java.util.ArrayList;
import java.util.Arrays;
// anything inside the java.lang package is imported by default

public class ArraysPlayground {

    /*

    Java arrays are Objects that contain elements of a similar data type
    the elements are stored in a contiguous memory location (relevant because we cannot change the length of
    an array, once it's instantiated)
    instantiated = 'created' - specifically space in memory is allocated

     */

    public static void main(String[] args) {

        // Declaring an array - 2 ways to do that
        int[] intRay = new int[5]; // this line creates an array with a length of 5. its reference var is 'intRay'

        // each element has an index - it always starts at 0
        intRay[0] = 10;
        intRay[1] = 20;
        intRay[2] = 30;
        intRay[3] = 40;
        intRay[4] = 50;
        //intRay[4] = "fifty"; // we can only store 'int' data types in this array

        System.out.println(intRay[3]);
        //System.out.println(intRay[199]); // ArrayIndexOutOfBoundsException


        // Another way - array literals
        String[] stringRay = {"stapler","pencil case", "notebook", "monitor"};
        int[] anotherIntRay = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // arrays have a fixed length that can't be changed once created
        // length is a property of the array object
        System.out.println(stringRay.length);
        // N.B. length != index (an array's last index is always one less than the length

        System.out.println(stringRay[2]);
        stringRay[2] = "changed";
        System.out.println(stringRay[2]);
        System.out.println(anotherIntRay[4]);

        System.out.println(stringRay); // this prints out: [Ljava.lang.String;@65ab7765
        // because stringRay is a reference variable, it is storing a memory address (where the object is)

        // to actually see the eleements in the array we need to do the below
        System.out.println(Arrays.toString(stringRay));

        System.out.println(anotherIntRay); // [I@1b28cdfa
        System.out.println(Arrays.toString(anotherIntRay));

        // we can't store different datat types in an array
        double[] dRay = {'a', 5.6, 4, }; // bad practice - NONO

        // Collection API - mutable data structures with support/features than Arrays
        ArrayList<String> myRayList = new ArrayList<>();

        myRayList.add("dan");


        System.out.println("****************************************");
        // we can use loops to iterate over an array
        // (starting value; condition to check each loop; increment)
        for (int i = 0; i < anotherIntRay.length; i++) {
            System.out.println(anotherIntRay[i]);
        }

        int lastIndex = anotherIntRay.length - 1;

        for (int i = lastIndex; i >= 0; i--) {
            System.out.println(anotherIntRay[i]);
        }
        System.out.println("************enhanced for loops********************");
        // enhanced for loops
        // in order for enhanced for loops to work - the structure we're looping over must be Iterable
        for (int i : anotherIntRay) {
            System.out.println(i);
        }

        // we can mix out control flow
        for (String str : stringRay) {
            if (str.equals("changed")) {
                System.out.println("This value has been messed with!");
            } else {
                System.out.println(str);
            }

        }

        for (int i = 0; i < anotherIntRay.length; i++) {
            if (i % 2 == 0) { // if the index is even
                System.out.println(anotherIntRay[i]);
            }
        }
    }

}
