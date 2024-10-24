package com.xworkz.comparetor.runner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	
	  
	        private int age;
	        private String name;

	        public Sort(int age, String name) {
	            this.age = age;
	            this.name = name;
	        }

	        public int getAge() {
	            return age;
	        }

	        public String getName() {
	            return name;
	        }
	    

	    
	    static Comparator<Sort> ageNameComparator = Comparator.comparingInt(Sort::getAge);
	                                                       

	    public static void main(String[] args) {
	        List<Sort> people = new ArrayList<>();
	        people.add(new Sort(30, "Shashi"));
	        people.add(new Sort(25, "Rajesh"));
	        people.add(new Sort(30, "Prajwal"));
	        people.add(new Sort(25, "Taseer"));

	    
	        Collections.sort(people, ageNameComparator);


	        for (Sort person : people) {
	            System.out.println(person.getName() + " - " + person.getAge());
	        }
	    }
	}



