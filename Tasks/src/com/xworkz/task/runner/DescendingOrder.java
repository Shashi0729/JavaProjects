package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DescendingOrder {

	public static void main(String[] args) {
		ArrayList<String> stateNames = new ArrayList<String>();
		stateNames.add("Karnataka");
		stateNames.add("Jammu kashmir");
		stateNames.add("Bihar");
		stateNames.add("Delhi");
		stateNames.add("Hariyana");
		stateNames.add("Maharashtra");
		stateNames.add("Telangana");
		stateNames.add("Andrapradesh");
		stateNames.add("Tamilnadu");
		stateNames.add("Kerala");
		stateNames.add("Goa");
		stateNames.add("Madyapradesh");
		stateNames.add("Gujarat");
		stateNames.add("Panjab");
		stateNames.add("Sikkim");
		
		System.out.println(stateNames);
		Collections.sort(stateNames);
		System.out.println(stateNames);
		Collections.reverse(stateNames);
		System.out.println(stateNames);

	}

}
