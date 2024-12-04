package com.xworkz.mobile.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mobile.dto.User;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(User.class);
		String[] i=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(i));
		System.out.println(context.getBean(User.class));
	}

}
