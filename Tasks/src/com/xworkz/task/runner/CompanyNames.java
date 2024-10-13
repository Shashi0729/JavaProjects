package com.xworkz.task.runner;

import java.util.ArrayList;

public class CompanyNames {
	   public static void main(String[] args) {
	        ArrayList<String> companyNames = new ArrayList<>();
	        ArrayList<String> companyNames1 = new ArrayList<>();

	        
	        companyNames.add("Apple");
	        companyNames.add("Google");
	        companyNames.add("Microsoft");

	        System.out.println(companyNames);
	        companyNames1.add("BMW");
	        companyNames1.add("AUDI");
	        companyNames1.add("SUPRA");
	        
	        companyNames.addAll(companyNames1);
	        System.out.println(companyNames);
	        
	        companyNames.remove("Apple");
	        System.out.println(companyNames);
	        
	        companyNames.removeAll(companyNames1);
	        System.out.println(companyNames);
	        
	        
	        
	        
	        
	        
	        
	        
	    }
}
