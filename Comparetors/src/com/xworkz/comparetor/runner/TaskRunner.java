package com.xworkz.comparetor.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public abstract class TaskRunner {

	public static void main(String[] args) {
		List<Integer> stateIds = new ArrayList<Integer>();
		List<Character> alphabets = new LinkedList<>();

		stateIds.add(1);
		stateIds.add(2);
		stateIds.add(3);
		stateIds.add(4);
		stateIds.add(5);
		stateIds.add(6);
		stateIds.add(7);
		stateIds.add(8);
		stateIds.add(9);
		stateIds.add(10);
		stateIds.add(11);
		stateIds.add(12);
		stateIds.add(13);
		stateIds.add(14);
		stateIds.add(15);
		
		
		System.out.println(stateIds);
		Comparator<Integer> comp= (Integer a1,Integer a2)->a2.compareTo(a1);
		Collections.sort(stateIds, comp);
		System.out.println(stateIds);
		
		
		

	       alphabets.add('K'); 
	       alphabets.add('J'); 
	       alphabets.add('B'); 
	       alphabets.add('D'); 
	       alphabets.add('H'); 
	       alphabets.add('M'); 
	       alphabets.add('T'); 
	       alphabets.add('A'); 
	       alphabets.add('T'); 
	       alphabets.add('K'); 
	       alphabets.add('G'); 
	       alphabets.add('M'); 
	       alphabets.add('G'); 
	       alphabets.add('P'); 
	       alphabets.add('S'); 
	       
	       System.out.println(alphabets);
			Comparator<Character> comp2= (Character a1,Character a2)->a2.compareTo(a1);
			Collections.sort(alphabets, comp2);
			System.out.println(alphabets);
			
			
	PersonDto pdto =new PersonDto();
	pdto.setName("Ganesh");
	PersonDto pdto2 =new PersonDto();
		pdto2.setName("Mallikarjun");
//			pdto.setName("Rajesh");
//			pdto.setName("Taseer");
//			pdto.setName("Prajwal");
//			pdto.setName("Nitin");

			List<PersonDto> persondto = new ArrayList<PersonDto>();
			persondto.add(pdto); 
			persondto.add(pdto2);
			System.out.println(persondto);
			Comparator<PersonDto> comp3= (PersonDto a1,PersonDto a2)->a2.getName().compareTo(a1.getName());
		
			Collections.sort(persondto, comp3);
			System.out.println(persondto);
			
			
			
			
	}

}
