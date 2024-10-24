package com.xworkz.comparetor.runner;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExampleDto implements Comparable<ExampleDto> {
  
	private String name;
	private int age;
	@Override
	public int compareTo(ExampleDto dto) {
		System.out.println("compare to is running");
		
		return dto.get;
	}
	
}
