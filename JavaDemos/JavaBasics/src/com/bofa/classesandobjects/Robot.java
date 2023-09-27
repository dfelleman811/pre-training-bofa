package com.bofa.classesandobjects;

/*
Java code is written as modules, packages, and classes
- modules are groups of packages (don't worry about these)
- packages are groups of classes
- classes are blueprints for objects

Class vs Object

Class = blueprint
Object = Instance of the Class
 */

/**
 * The Robot class models what it means to BE a Robot.
 * The attributes of this class denote what properties a Robot can have
 * The methods of this class denote what behavior a Robot can have
 */
public class Robot { // the name MUST match the name of the file (Robot.java)

    // Attributes/Properties are used to represent an object's state
    // We represent them as Instance Variables
    String name;
    String color;
    boolean isOn;
    double size;

    // Constructor is used to create an object
    // BY DEFAULT - Java provides us a default constructor
    // the default constructor has no parameters
    // colloquially it's called the 'no-args constructor'
    public Robot() {

    }

    // we can have multiple constructors
    // as long as they have different parameters
    // This is called a Parameterized Constructor
    // What's the difference between Parameter and Argument?
    // Parameters are placeholders for the Arguments that we pass in
    // Constructors do NOT have a return type
    public Robot(String name, String color, boolean isOn, double size) {
        this.name = name; // 'this' is a keyword that refers to the current object in this case
        this.color = color;
        this.isOn = isOn;
        this.size = size;
    }
    // ** When we define a parameterized constructor
    // we no longer have default access to the no-args constructor
    // we MUST EXPLICITLY define both in our class


    // Behavior - in Java we represent behaviors as methods (methods are functions)
    // method = some block of code that can be invoked. it executes the same.

    // methods have signatures
    // access modifier + optional non-access modifier + return type + name(optional parameters) { body of method }
    public void speak() {
        if (this.isOn) {
            System.out.println("The robot says hello.");
        } else {
            System.out.println("The robot has no power");
        }

    }

    public String getGreeting() {
        return "Hello, I'm a robot. And my name is " + this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void powerSwitch() {
        this.isOn = !this.isOn;
    }

}
