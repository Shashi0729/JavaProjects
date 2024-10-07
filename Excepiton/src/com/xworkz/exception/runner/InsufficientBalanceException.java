package com.xworkz.exception.runner;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);

	}

	public static void withdrawAmount(int balance, int amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		System.out.println("Withdrawal successful");
	}
}
