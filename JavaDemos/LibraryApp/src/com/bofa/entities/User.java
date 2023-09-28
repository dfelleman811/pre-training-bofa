package com.bofa.entities;

public class User {

    // Instance Variables
    public String username;
    public String pass;
    public Role role;

    // Constructor
    public User() {

    }

    public User(String username, String password, Role type) {
        this.username = username;
        this.pass = password;
        this.role = type;
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
                    ", pass=" + this.pass +
                    ", type=" + this.role +
                    "]";
    }


}
