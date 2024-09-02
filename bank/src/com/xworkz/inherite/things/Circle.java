package com.xworkz.inherite.things;
	public class Circle extends Shapes {
	    double radius;

	    public Circle(String color, double radius) {
	        super(color); 
	        this.radius = radius;
	        System.out.println("Circle constructor called");
	    }

	    public void display() {
	        super.display();
	        System.out.println("Radius: " + radius);
	    }

	    public double area() {
	        return Math.PI * radius * radius;
	    }
	}

	



	
	
	
	
	
	
	
	
	
	
	
	
	
	