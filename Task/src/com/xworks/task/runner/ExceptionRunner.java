package com.xworks.task.runner;

import com.xworks.task.exceptions.AgeCheckException;
import com.xworks.task.exceptions.LengthCheckException;
import com.xworks.task.exceptions.NullCheckExceptions;
import com.xworks.task.exceptions.PhoneNumberCheckException;

public class ExceptionRunner {
	public static void main(String[] args) throws LengthCheckException,NullCheckExceptions,AgeCheckException,PhoneNumberCheckException {
		LengthCheckException length = new LengthCheckException(null);
		AgeCheckException age =new AgeCheckException(null);
		PhoneNumberCheckException phone =new PhoneNumberCheckException(null);
		String phoneResult=phone.PhoneNumberCheck("1234567890");
		if(phoneResult.length()==10) {
			throw new PhoneNumberCheckException("phonenumber is not currect");
			
		}
		int ageResult=age.EnterUserName(17);
		if (ageResult<18) {
			throw new AgeCheckException("age is small");
		}
		String result = length.EnterUserName("ds");
		if(result==null) {
			throw new NullCheckExceptions("username is null");
			
		}else if (result.length() < 3) {
			throw new LengthCheckException("length is small");
		}
		
	}
}
