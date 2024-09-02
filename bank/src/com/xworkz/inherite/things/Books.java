package com.xworkz.inherite.things;

	public class Books extends Publication {
	    @Override
	    public void print() {
	        System.out.println("Book is printed");
	    }

	    @Override
	    public void digitalize() {
	        System.out.println("Book is digitalized");
	    }

	    @Override
	    public  void distribute() {
	        System.out.println("Book is distributed");
	    }

	    @Override
	    public  void sell() {
	        System.out.println("Book is sold");
	    }

	    @Override
	    public  void advertise() {
	        System.out.println("Book is advertised");
	    }
	


}
