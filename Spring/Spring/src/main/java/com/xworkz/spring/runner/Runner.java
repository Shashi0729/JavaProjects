package com.xworkz.spring.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.config.SpringConfig;

public class Runner {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
	System.out.println(context.getBeanDefinitionCount());
	String[] instance=context.getBeanDefinitionNames();
	System.out.println(Arrays.toString(instance));
}
}
