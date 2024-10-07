package com.xworkz.exception.runner;

public class MyUncheckedExceptionRunner {
	  public static void main(String[] args) {
	        
	        try {
	          MyUncheckedException.riskyMethod();
	        } finally {
	        	System.out.println("Caught exception: ");
			} 
	        
	  }
}
