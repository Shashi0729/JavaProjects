package com.xworkz.task.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lombok.*;
@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Gadget implements Comparator<Gadget>{
    private String brand;
    private int batteryLife;
    private double price;
    
	@Override
	public int compare(Gadget o1, Gadget o2) {
		   
        int batteryComparison = Integer.compare(o2.getBatteryLife(), o1.getBatteryLife());
        
        
        if (batteryComparison == 0) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
        return batteryComparison;
	} 
}
