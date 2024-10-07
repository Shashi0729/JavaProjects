package com.xworks.task.exceptions;

public class NullCheckExceptions extends Throwable{
	   public NullCheckExceptions(String message) {
	        super(message);
	    }
	   
	   public String EnterUserName(String userName) {
		   return userName;
		   
	   }

}

