package com.xworkz.inherite.runner;

import java.util.Date;

import com.xworkz.inherite.things.Booking;
import com.xworkz.inherite.things.Guest;
import com.xworkz.inherite.things.Hotel;
import com.xworkz.inherite.things.Payment;
import com.xworkz.inherite.things.Room;

public class HotelRunner {
	    public static void main(String[] args) {
	        Hotel hotel = new Hotel("ABC Hotel", "New York", 5);
	        Room room = new Room(101, "Deluxe", hotel);
	        Guest guest = new Guest("John Doe", "john@example.com", room);
	        Booking booking = new Booking("BK001", new Date(), guest);
	        Payment payment = new Payment("Credit Card", 200.0, booking);
	        System.out.println(payment.toString());
	    }
	}


