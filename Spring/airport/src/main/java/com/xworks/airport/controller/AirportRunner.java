package com.xworks.airport.controller;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworks.airport.configuration.AirPortConfiguration;

public class AirportRunner {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AirPortConfiguration.class);
	System.out.println(context.getBeanDefinitionCount());
	   String[] instance= context.getBeanDefinitionNames();
	   System.out.println(Arrays.toString(instance));
}
}
