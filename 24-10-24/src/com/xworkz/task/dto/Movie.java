package com.xworkz.task.dto;



import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Movie {
    private String title;
    private double rating; // Rating out of 10
    private int releaseYear;
}
