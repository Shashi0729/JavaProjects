package com.xworkz.task.Runner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.City;

public class CityRunner {
	
	    public static void main(String[] args) {
	        List<City> cities = new ArrayList<>();
	        cities.add(new City("Bengaluru", 8443675)); 
	        cities.add(new City("Mysuru", 887446)); 
	        cities.add(new City("Mangaluru", 619664)); 
	        cities.add(new City("Hubballi", 943857)); 
	        cities.add(new City("Davanagere", 435000));
	        cities.add(new City("Ballari", 340000)); 
	        cities.add(new City("Kalaburagi", 532378)); 
	        cities.add(new City("Shivamogga", 367152)); 
	        cities.add(new City("Belagavi", 500000)); 

	        // Sort by name case-insensitively
	        Comparator<City> BY_NAME_CASE_INSENSITIVE =Comparator.comparing(city -> city.getName().toLowerCase());
	        cities.sort(BY_NAME_CASE_INSENSITIVE);

	        System.out.println("Karnataka Cities sorted by name (case-insensitive):");
	        for (City city : cities) {
	            System.out.println(city);
	        }
	    }
	}


