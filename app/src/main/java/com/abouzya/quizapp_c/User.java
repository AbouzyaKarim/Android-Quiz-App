package com.abouzya.quizapp_c;

public class User {

    public String name;
    public String email;
    public String password;

    public User(){

    }

    public User(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.password = pass;
    }
}
