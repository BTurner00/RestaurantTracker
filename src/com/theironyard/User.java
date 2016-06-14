package com.theironyard;

import java.util.ArrayList;

/**
 * Created by Ben on 6/7/16.
 */
public class User {

    String name;
    String password;
    ArrayList<Restaurant> restaurants = new ArrayList<>();
    int id;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
