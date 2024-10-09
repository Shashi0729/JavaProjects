package com.xworkz.task.runner;


	import java.util.Scanner;

	public class GuessTheNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        int n =10;
	        
	        int pickedNumber = 7;
	        int guess;

	        if (pickedNumber < 1 || pickedNumber > n) {
	            System.out.println("Picked number must be between 1 and " + n + ". Exiting.");
	            return;
	        }


	        System.out.println("Now, guess the number I picked!");
	           
	            do {
	                System.out.print("Enter your guess: ");
	                guess = scanner.nextInt();
	               

	                if (guess > pickedNumber) {
	                    System.out.println(-1);
	                } else if (guess < pickedNumber) {
	                    System.out.println(1);
	                } else {
	                    System.out.println(0);
	                }

	            } while (guess != pickedNumber);
	            System.out.println("Congratulations! You guessed the number " + pickedNumber);

	            }
		       
	        }

	    
	
	

