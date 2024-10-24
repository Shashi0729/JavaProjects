package com.xworkz.task.dto;


import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Planet {
    private String name;
    private Long mass; // Mass in kilograms (using -1 for unknown mass)
    private double diameter; 
}
