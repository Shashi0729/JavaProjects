package com.xworkz.inherite.things;
import java.util.Date;

public class Booking {
    public String id;
    public Date date;
    public Guest guest;

    public Booking(String id, Date date, Guest guest) {
        this.id = id;
        this.date = date;
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Booking id=" + id + "," +
                "date=" + date +","+
                "guest=" + guest;
    }
}