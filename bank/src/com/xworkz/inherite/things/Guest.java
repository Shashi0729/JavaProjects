package com.xworkz.inherite.things;

public class Guest {
    public String name;
    public String contact;
    public Room room;

    public Guest(String name, String contact, Room room) {
        this.name = name;
        this.contact = contact;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Guest name=" + name + "," +
                "contact=" + contact + "," +
                "room=" + room;
    }
}
