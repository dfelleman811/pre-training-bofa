package com.bofa.entities;

public class User {

    // Instance Variables
    public String username;
    public String password;
    public String type;

    // Constructor
    public User() {

    }

    public User(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    // This is an Annotation
    // anything with an @ sign
    /*
    According to the Java documentation:
    Annotations are a form of metadata. They provide data/info about a program
    that is not a part of the program itself. Annotations have no direct effect on the code they annotate.
    Rather - they are used:
        - to provide to info to compiler - like ignoring or suppressing warnings
        - at runtime - to provide details for processing (generate code, read properties from external sources)
        - and more

     */
    @Override // this annotation is optional - but it's best to include it
    public String toString() {
        return "User [username=" + this.username +
                    ", password=" + this.password +
                    ", type=" + this.type +
                    "]";
    }


}
