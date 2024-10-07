package com.xworkz.bookmyshow.service;

import com.xworkz.bookmyshow.dto.BookMyShowDto;
import com.xworkz.bookmyshow.repository.BookingRepository;

public class BookMyShowService {
	
	    private static final int TOTAL_TICKETS = 100;
	    private int availableTickets;
	    private BookMyShowDto registeredUser;

	    public BookMyShowService() {
	        availableTickets = TOTAL_TICKETS;
	    }

	    public void registerUser(BookMyShowDto name,BookMyShowDto email,BookMyShowDto password ) {
	    	BookingRepository bookRepo = new BookingRepository();
	        if (bookRepo.isValidEmail(email) && bookRepo.isValidPassword(password)) {
	            
	            System.out.println("User registered successfully!");
	        } else {
	            System.out.println("Invalid email or password.");
	        }
	    }

	    public boolean validateUser(String username, String passwordvalidation) {
	       

	        if (registeredUser != null && registeredUser.getName().equals(username) && registeredUser.getPassword().equals(passwordvalidation)) {
	            return true;
	        } else {
	            System.out.println("Invalid username or password.");
	            return false;
	        }
	    }

	    public void bookTickets(int numTickets) {
	      // Consume the newline character

	        if (numTickets <= availableTickets) {
	            availableTickets -= numTickets;
	            System.out.println("Tickets booked successfully!");
	            System.out.println("Remaining tickets: " + availableTickets);
	        } else {
	            System.out.println("Not enough tickets available.");
	        }
	    }

}
