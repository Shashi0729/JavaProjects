package com.xworks.task.exceptions;

public class PhoneNumberCheckException extends Throwable{
	public PhoneNumberCheckException(String message) {
		super(message);
	}
	
	public String PhoneNumberCheck(String phoneNumber) {
		return phoneNumber;
		
	}

}
