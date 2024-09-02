package com.xworkz.inherite.runner;
import com.xworkz.inherite.things.*;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Location loc =new Location();
		 * 
		 * Country c= new Country("india",01,29); System.out.println(c.toString());
		 */
		
		/*
		 * Dog dog = new Dog("Max"); dog.eat(); dog.bark();
		 * 
		 * 
		 * int[] array = {5, 2, 3, 1, 7, 8, 2, 3, 4}; int target = 7;
		 * 
		 * ThalaForReason.findPairs(array, target); ThalaForReason.findTrios(array,
		 * target);
		 */
	  
	/*        Circle circle = new Circle("Red", 5.0);
	        circle.display();
	        System.out.println("Area: " + circle.area());
	        Rectangle rec=new Rectangle();
	        System.out.println("===================================================");
	        
		        AndroidPhone phone = new AndroidPhone("Samsung", "Galaxy S22", "Android 12");
		        phone.display();
		        System.out.println("===================================================");
		    	
		    	     ICICI icici = new ICICI();
		    	     icici.deposit();
		    	     icici.withdraw();
		    	     icici.checkBalance();
		    	     icici.transfer();
		    	     icici.loan();
		    	     icici.credit();
		    	     icici.debit();
		    	     icici.statement();
		    	     icici.customerSupport();
		    	     icici.onlineBanking();
		    	 }*/
		
		
		Whatsapp wtsapp=new Whatsapp();
		Whatsapp Gbwtsapp=new Whatsapp();
		
		wtsapp.id=4;
		Gbwtsapp.id=31;
		
		wtsapp.version=4.0f;
		Gbwtsapp.version=10.0f;
		
		wtsapp.contactno=4525242555l;
		Gbwtsapp.contactno=10514255154524525l;
		
		wtsapp.Appname="GB";
		Gbwtsapp.Appname="Meta";
		
		wtsapp.size=45.25;
		Gbwtsapp.size=12.5;
		
		wtsapp.inuse=true;
		Gbwtsapp.inuse=false;
		
		wtsapp.forword=3;
		Gbwtsapp.forword=10;
		
		System.out.println(Gbwtsapp.hashcode());
		System.out.println(wtsapp.hashcode());
		
		
	}
		    	
		    }
	    
	    
	


