package com.xworkz.exception.runner;

public class ExceptionRunner {
	public static void main(String[] args) throws CloneNotSupportedException {
		Properties properties = new Properties();
		properties.name="Shashi";
		properties.age=25;
		properties.department="CSE";
		properties.designation="Developer";
		properties.email="shashisg@gmail.com";
		properties.location="Bengaluru";
		properties.phone="3254688545";
		properties.salary=100000;
		System.out.println("properties:"+properties);
		
			Properties properties1 =properties.clone();
			System.out.println("Before properties1:"+properties1);
			properties1.name="Mallikarjun";
			properties1.age=45;
			properties1.department="ME";
			properties1.designation="Developer";
			properties1.email="mallikarjun@gmail.com";
			properties1.location="Bengaluru";
			properties1.phone="3254685465";
			properties1.salary=150000;
			System.out.println("properties1:"+properties1);
		
		
			
		}
	}


