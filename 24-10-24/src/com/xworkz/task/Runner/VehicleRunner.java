package com.xworkz.task.Runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.task.dto.Vehicle;

public class VehicleRunner {
	
	   public static void main(String[] args) {
	        List<Vehicle> vehicles = new ArrayList<>();
	        vehicles.add(new Vehicle("Toyota", "Corolla", 180));
	        vehicles.add(new Vehicle("Ford", "Mustang", 250));
	        vehicles.add(new Vehicle("Honda", "Civic", 220));
	        vehicles.add(new Vehicle("BMW", "M3", 240));

	        // Sort the vehicles by topSpeed
	        Collections.sort(vehicles);

	        // Print sorted vehicles
	        for (Vehicle vehicle : vehicles) {
	            System.out.println(vehicle);
	        }
	    }

}
