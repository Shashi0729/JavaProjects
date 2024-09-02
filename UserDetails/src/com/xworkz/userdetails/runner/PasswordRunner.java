package com.xworkz.userdetails.runner;

public class PasswordRunner {

	public static void main(String[] args) {
		String password = "sg0shashi";
		char[] ch = password.toCharArray();

		if (password != null && ch.length >= 8 && ch.length <= 16 && Character.isUpperCase(password.charAt(0))
				&& Character.isDigit(password.charAt(2)) && Character.isLowerCase(password.charAt(ch.length - 1))) {

			if (ch.length == 10) {
				Character.isLowerCase(10);
			}
			System.out.println("Password is valid.. and it is alpha numaric");
		} else {
			System.out.println("Password is not valid..");
		}

	}

}
