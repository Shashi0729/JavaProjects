package com.xworkz.task.runner;

public class DuplicateCharacters {

	    public static void main(String[] args) {
	        
	        String input = "Shashi"; 

	       
	        char[] charArray = input.toCharArray();

	     
	        boolean hasDuplicates = false;

	        for (int i = 0; i < charArray.length; i++) {
	 
	            for (int j = i + 1; j < charArray.length; j++) {
	              
	                if (Character.toLowerCase(charArray[i]) == Character.toLowerCase(charArray[j])) {
	                   
	                    System.out.println("Duplicate character found: " + charArray[i]);
	                    hasDuplicates = true;
	                   
	                }
	            }
	        }

	 
	        if (!hasDuplicates) {
	            System.out.println("No duplicate characters found.");
	        }
	    }
	}


