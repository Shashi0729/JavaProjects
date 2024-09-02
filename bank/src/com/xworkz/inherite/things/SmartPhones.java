package com.xworkz.inherite.things;


	public class SmartPhones extends ElectronicDevice {
	    SmartPhones(String brand) {
			super(brand);
			
		}

		String model;

	    SmartPhones(String brand, String model) {
	        super(brand);
	        this.model = model;
	        System.out.println("Smartphone constructor called");
	    }

	    void display() {
	        super.display();
	        System.out.println("Model: " + model);
	    }
	}

