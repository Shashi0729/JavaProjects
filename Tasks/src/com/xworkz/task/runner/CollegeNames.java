package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollegeNames {
	 public static void main(String[] args) {
	        ArrayList<String> collegeNames = new ArrayList<>();
	       ArrayList<Integer> collegeNames1 = new ArrayList<>();

	        collegeNames.add("Harvard University");
	        collegeNames.add("Stanford University");
	        collegeNames.add("MIT");

	        System.out.println(collegeNames);
	        collegeNames.add("Kle");
	        collegeNames1.add(1);
	        collegeNames1.add(2);
	        
    //  collegeNames.add(collegeNames1);
//	        System.out.println(collegeNames);
	        
	      //  collegeNames.remove("Sgbit");
	        System.out.println(collegeNames);
	        
	       // collegeNames.removeAll(collegeNames1);
	       // collegeNames1.addAll(collegeNames);
	        //System.out.println(collegeNames1);
	        
	        Collections.sort(collegeNames);
	        System.out.println(collegeNames);
	        
	     System.out.println(collegeNames.contains("Sgbit"));   
	     System.out.println(collegeNames.containsAll(collegeNames1));  
	     
	    
	     collegeNames.toArray();
	     
	     

	    }

}
