package com.xworkz.task.Runner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Planet;
public class PlanetRunner {
	
	    public static void main(String[] args) {
	        List<Planet> planets = new ArrayList<>();
	        planets.add(new Planet("Earth", 5972000000000000000L, 12742));
	        planets.add(new Planet("Mars", 6417000000000000000L, 6779));
	        planets.add(new Planet("Jupiter", 189800000000000000L, 139820));
	        planets.add(new Planet("Venus", 4867000000000000000L, 12104));
	        planets.add(new Planet("Pluto", null, 2370)); 
	        planets.add(new Planet("Mercury", 3285000000000000000L, 4879));

	       Comparator<Planet> BY_MASS = Comparator.comparingLong(planet -> planet.getMass() != null ? planet.getMass() : Long.MAX_VALUE);

	       planets.sort(BY_MASS);
	        System.out.println("Planets sorted by mass (unknown masses last):");
	        for (Planet planet : planets) {
	            System.out.println(planet);
	        }
	    }
	}



