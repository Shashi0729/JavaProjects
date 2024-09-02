package com.xworkz.inherite.things;

public class ElectronicDevice {

	    String brand;

	    ElectronicDevice(String brand) {
	        this.brand = brand;
	        System.out.println("ElectronicDevice constructor called");
	    }

	    void display() {
	        System.out.println("Brand: " + brand);
	    }
	}




