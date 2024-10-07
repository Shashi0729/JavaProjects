package com.xworkz.bookmyshow.runner;

import com.xworkz.bookmyshow.dto.BookMyShowDto;
import com.xworkz.bookmyshow.service.BookMyShowService;

import java.util.Scanner;

public class BookMyShowRunner {
	
	    public static void main(String[] args) {
	        BookMyShowDto bookMyShow = new BookMyShowDto();
	        BookMyShowService BookService = new BookMyShowService();
            Scanner scanner=new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        bookMyShow.setName(name);
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();
	        bookMyShow.setEmail(email);
	        System.out.print("Enter your password:    ");
	        String password = scanner.nextLine();
	        bookMyShow.setPassword(password);
	        
	       // BookService.registerUser(name, bookMyShow.getEmail(),bookMyShow.getPassword());
	        
	        
	        System.out.print("Enter your username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter your password: ");
	        String passwordvalidation = scanner.nextLine();
	        
	        
	        
	      

			
			  if (BookService.validateUser(username,passwordvalidation)) {
				  System.out.print("Enter the number of tickets: ");
			        int numTickets = scanner.nextInt();
			        scanner.nextLine(); 
				  BookService.bookTickets(numTickets); }
			 
	        
	       
	    }
	}


