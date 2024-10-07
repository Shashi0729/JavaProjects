package com.xworkz.exception.runner;
	
	class MyUncheckedException extends RuntimeException {
	    public MyUncheckedException(String message) {
	        super(message);
	    }
	    public static void riskyMethod() {
	        throw new MyUncheckedException("An error occurred!");
	    }
	}
 