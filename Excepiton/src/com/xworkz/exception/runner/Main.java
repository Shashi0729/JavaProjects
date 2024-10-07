package com.xworkz.exception.runner;

public class Main {
	public static void main(String[] args) throws InsufficientBalanceException {
		InsufficientBalanceException i = new InsufficientBalanceException("hiii");

		try {
			i.withdrawAmount(1000, 1500);
		} catch (InsufficientBalanceException e) {
			// System.out.println("Error: " + e.getMessage());
			throw new InsufficientBalanceException("Error: " + e.getMessage());
		}
	}

}
 