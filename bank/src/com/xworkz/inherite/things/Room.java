package com.xworkz.inherite.things;

public class Room {
    public int number;
    public String type;
    public Hotel hotel;

    public Room(int number, String type, Hotel hotel) {
        this.number = number;
        this.type = type;
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Room number=" + number + ","+
                "type=" + type + "," +
                "hotel=" + hotel;
    }
}
