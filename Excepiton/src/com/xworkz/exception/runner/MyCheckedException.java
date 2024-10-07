package com.xworkz.exception.runner;

	public class MyCheckedException extends Exception {
	    public MyCheckedException(String message) {
	        super(message);
	    }

	    public static void riskyMethod() throws MyCheckedException {
	        boolean errorOccurred = true; 
	        if (errorOccurred) {
	            throw new MyCheckedException("An error occurred in riskyMethod.");
	        }
	    }
	  
	}


