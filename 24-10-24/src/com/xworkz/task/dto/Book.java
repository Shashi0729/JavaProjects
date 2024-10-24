package com.xworkz.task.dto;



import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Book {
	private String title;
	private String author;
	private double price;

}