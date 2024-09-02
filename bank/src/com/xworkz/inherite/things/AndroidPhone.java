package com.xworkz.inherite.things;

	public class AndroidPhone extends SmartPhones {
	    String osVersion;

	    public AndroidPhone(String brand, String model, String osVersion) {
	        super(brand, model); 
	        this.osVersion = osVersion;
	        System.out.println("AndroidPhone constructor called");
	    }

	    public void display() {
	        super.display(); 
	        System.out.println("OS Version: " + osVersion);
	    }
}
