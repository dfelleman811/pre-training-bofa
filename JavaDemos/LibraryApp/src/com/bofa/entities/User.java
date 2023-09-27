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
}
