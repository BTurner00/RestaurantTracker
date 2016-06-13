package com.theironyard;

/**
 * Created by Ben on 6/7/16.
 */
public class Restaurant {
    String name;
    String location;
    int rating;
    String comment;
    int id;

    public Restaurant(String name, String location, int rating, String comment) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
    }

    public Restaurant(int id, String name, String location, int rating, String comment) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
        this.id = id;
    }
}
