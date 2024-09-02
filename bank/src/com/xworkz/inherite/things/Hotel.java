package com.xworkz.inherite.things;

public class Hotel {
    public String name;
    public String location;
    public int rating;

    public Hotel(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel:" +
                "name=" + name + "," +
                "location=" + location + "," +
                "rating=" + rating 
              ;
    }
}










