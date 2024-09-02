package com.xworks.task.runner;

public class TaskRun {

		    public static void main(String[] args) {
		        String sentence = "Hello World 123";

		        System.out.println("Character count: " + countCharacters(sentence));
		        System.out.println("Space count: " + countSpaces(sentence));
		        System.out.println("No spaces: " + removeSpaces(sentence));
		        System.out.println("Upper case: " + toUpperCase(sentence));
		        System.out.println("Lower case: " + toLowerCase(sentence));
		        System.out.println("Contains digit: " + containsDigit(sentence));
		    }

		    public static int countCharacters(String sentence) {
		        int charCount = 0;
		        for (char c : sentence.toCharArray()) {
		            charCount++;
		        }
		        return charCount;
		    }

		    public static int countSpaces(String sentence) {
		        int spaceCount = 0;
		        for (char c : sentence.toCharArray()) {
		            if (c == ' ') {
		                spaceCount++;
		            }
		        }
		        return spaceCount;
		    }

		    public static String removeSpaces(String sentence) {
		    	String noSpaces = "";
		        for (char c : sentence.toCharArray()) {
		            if (c != ' ') {
		                noSpaces += c;
		            }
		        }
		       
				return noSpaces;

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




