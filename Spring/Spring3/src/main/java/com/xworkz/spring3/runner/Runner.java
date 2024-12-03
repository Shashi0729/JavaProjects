package com.xworkz.spring3.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring3.config.Spring3Config;

public class Runner {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Spring3Config.class);
		System.out.println(context.getBeanDefinitionCount());
		String[] instance=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
		
		
	}

}
