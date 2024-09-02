package com.xworks.task.service;

import java.time.LocalDate;
import java.time.LocalDateTime;




	public class SubClass extends AbstractClass {
	  

	  

		public SubClass(int id, String name, double price, int quantity, String description, boolean isActive,
				LocalDate createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
			super(id, name, price, quantity, description, isActive, createdAt, updatedAt, createdBy, updatedBy);
			
		}

		@Override
	    public void calculateDiscount() {
	        System.out.println("Discount calculated");
	    }

	    @Override
	    public void calculateTax() {
	        System.out.println("Tax calculated");
	    }

	    @Override
	    public void calculateTotal() {
	        System.out.println("Total calculated");
	    }
	}

	
