package com.xworkz.inherite.things;

public class VowelConsonants {

	    public static void countVowelsAndConsonants(char[] array) {
	        int vowelCount = 0;
	        int consonantCount = 0;

	        for (int i = 0; i < array.length; i++) {
	            char c = array[i];
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
	                vowelCount++;
	            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	                consonantCount++;
	            }
	        }

	        System.out.println("Vowel Count: " + vowelCount);
	        System.out.println("Consonant Count: " + consonantCount);
	    }

	}


