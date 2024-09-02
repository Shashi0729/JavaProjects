package com.xworks.task.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworks.task.service.AbstractClass;
import com.xworks.task.service.SubClass;


public class TaskRunner {
	
	    public static void main(String[] args) {
	        SubClass subclass = new SubClass(1, "Product", 10.99, 10, "Description", true, LocalDate.now(), LocalDateTime.now(), "John", "Jane");
	        subclass.printDetails();
	        subclass.updateQuantity(20);
	        subclass.updateStatus(false);
	        AbstractClass.printHello();
	        AbstractClass.printWelcome();
	        AbstractClass.printGoodbye();
	        subclass.calculateDiscount();
	        subclass.calculateTax();
	        subclass.calculateTotal();
	    }
	}


