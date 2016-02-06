package com.example.noura.testregister;

/**
 * Created by Noura on 2/5/2016.
 */
public class User {
    String name, password, email;
    int id;

    public User (int id, String name, String password, String email){

        this.id = id;
        this.name= name;
        this.password= password;
        this.email= email;

    }

}
