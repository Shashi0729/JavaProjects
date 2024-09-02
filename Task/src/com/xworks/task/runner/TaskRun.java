package com.xworks.task.runner;

public class TaskRun {

		    public static void main(String[] args) {
		        String sentence = "Hello World 123";
		        countCharacters(sentence);
		        countSpaces(sentence);
		        removeSpaces(sentence);
		        System.out.println("Upper case: " + toUpperCase(sentence));
		        System.out.println("Lower case: " + toLowerCase(sentence));
		        System.out.println("Contains digit: " + containsDigit(sentence));
		    }

		    public static void countCharacters(String sentence) {
		        int charCount = 0;
		        for (char c : sentence.toCharArray()) {
		            charCount++;
		        }
		        System.out.println(charCount); 
		    }

		    public static void countSpaces(String sentence) {
		        int spaceCount = 0;
		        for (char c : sentence.toCharArray()) {
		            if (c == ' ') {
		                spaceCount++;
		            }
		        }
		        System.out.println(spaceCount); 
		    }

		    public static void removeSpaces(String sentence) {
		    	String noSpaces = "";
		        for (char c : sentence.toCharArray()) {
		            if (c != ' ') {
		                noSpaces += c;
		            }
		        }
		       
		        System.out.println(noSpaces); 

		    }

		    public static String toUpperCase(String sentence) {
		        return sentence.toUpperCase();
		    }

		    public static String toLowerCase(String sentence) {
		        return sentence.toLowerCase();
		    }

		    public static boolean containsDigit(String sentence) {
		        for (char c : sentence.toCharArray()) {
		            if (c >= '0' && c <= '9') {
		                return true;
		            }
		        }
		        return false;
		    }
		}




