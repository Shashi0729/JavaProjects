package com.xworkz.task.Runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Gadget;
public class GadgetRunner {
	public static void main(String[] args) {
        List<Gadget> gadgets = new ArrayList<>();
        gadgets.add(new Gadget("Gadget A", 10, 299.99));
        gadgets.add(new Gadget("Gadget B", 15, 199.99));
        gadgets.add(new Gadget("Gadget C", 10, 249.99));
        gadgets.add(new Gadget("Gadget D", 20, 349.99));
        gadgets.add(new Gadget("Gadget E", 15, 149.99));

       
        Collections.sort(gadgets, new Gadget());
        

       
        System.out.println("Gadgets sorted by battery life and price:");
        for (Gadget gadget : gadgets) {
            System.out.println(gadget);
        }
    }
}
