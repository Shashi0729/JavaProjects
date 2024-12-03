package com.xwokz.spring2.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwokz.spring2.config.SpringInit;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringInit.class);
		System.out.println(context.getBeanDefinitionCount());
		   String[] instance= context.getBeanDefinitionNames();
		   System.out.println(Arrays.toString(instance));
	}

}
