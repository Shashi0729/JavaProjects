package com.xworkz.inherite.runner;

import com.xworkz.inherite.things.Books;
import com.xworkz.inherite.things.Publication;

public class PublicationRunner {
	  public static void main(String[] args) {
	        Publication publication1 = new Publication();
	        Publication publication2 = new Publication();
	        Books book1 = new Books();
	        Books book2 = new Books();

//	        Publication upcastedBook1 = new Books();
//	        Publication upcastedBook2 = new Books();

	        publication1.print();
	        publication2.digitalize();
	        book1.distribute();
	        book2.sell();
//	        upcastedBook1.advertise();
//	        upcastedBook2.print();

	        System.out.println(publication1 instanceof Publication); 
	        System.out.println(publication2 instanceof Publication); 
	        System.out.println(book1 instanceof Publication); 
	        System.out.println(book2 instanceof Publication); 
//	        System.out.println(upcastedBook1 instanceof Publication); 
//	        System.out.println(upcastedBook2 instanceof Publication); 
	        System.out.println(book1 instanceof Books); 
//	        System.out.println(upcastedBook2 instanceof Books); 
	        System.out.println(publication1 instanceof Books);
	    }
}
