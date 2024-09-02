package com.xworkz.arrays;

import java.util.Arrays;

public class Array {
	
	public static void findArrayele() {
		 char[] b= {'g','s','t','a'};
		
		int index=Arrays.binarySearch(b,'g');
		System.out.println("element is present in array at index:"+index);
	}
	
	public static void compareArray() {
		 char[] b= {'g','s','a','a'};
		 char[] c= {'g','s','h','a'};
		int index=Arrays.compare(b, c);
		System.out.println(+index);
	}
	public static void hashcodeArray() {
		 char[] b= {'g','s','a','a'};
		 char[] c= {'g','s','h','a'};
		int index=Arrays.hashCode(c);
		int index2=Arrays.hashCode(b);
		System.out.println(+index);
		System.out.println(+index2);
	}
	
	public static void mismatchArray() {
		 char[] b= {'g','s','t','a'};
		 char[] c= {'g','r','t','a'};
		int index=Arrays.mismatch(b, c);
		System.out.println(+index);
	}
	
	public static void sortArray() {
		 char[] b= {'g','s','t','a'};
		 char[] c= {'g','r','t','a'};
	     Arrays.sort(b);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Array.findArrayele();
		Array.compareArray();
		Array.hashcodeArray();
		Array.mismatchArray();
		
		
	}

}
