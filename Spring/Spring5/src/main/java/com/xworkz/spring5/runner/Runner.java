package com.xworkz.spring5.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring5.config.Spring5;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring5.class);
		System.out.println(context.getBeanDefinitionCount());
		
		String[] instance = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
	}
}
