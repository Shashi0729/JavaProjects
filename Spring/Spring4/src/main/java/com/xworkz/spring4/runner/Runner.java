package com.xworkz.spring4.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring4.config.Spring4Config;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring4Config.class);
		System.out.println(context.getBeanDefinitionCount());
		
		String[] instance = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
	}

}
