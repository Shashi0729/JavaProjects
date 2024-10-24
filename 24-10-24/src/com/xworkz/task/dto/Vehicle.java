package com.xworkz.task.dto;


import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Vehicle implements Comparable<Vehicle> {
    private String brand;
    private String model;
    private int topSpeed;
   
    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.topSpeed, other.topSpeed);
    }
}
