package com.xworkz.bookmyshow.repository;

import com.xworkz.bookmyshow.dto.BookMyShowDto;

public class BookingRepository {
	 public boolean isValidEmail(BookMyShowDto BDto) {
		 if(BDto !=null && BDto.getEmail().length()>=6 && !BDto.getEmail().isBlank() && !BDto.getEmail().isEmpty()) {
				return true;
			}else {
				System.out.println("Email is not valid....");
				
			}
	        
	        return true;
	    }

	    public boolean isValidPassword(BookMyShowDto BDto) {
	    	 if(BDto !=null && BDto.getPassword().length()>=3 && !BDto.getPassword().isBlank() && !BDto.getPassword().isEmpty() && BDto.getPassword().endsWith("@gmail.com")) {
					return true;
				}else {
					System.out.println("password is not valid....");
					
				}
	        return true; 

}
}
