package com.xworkz.laptop.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.laptop.config.User;

public class Runner {

	public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
   String[] res=  context.getBeanDefinitionNames();
   System.out.println(Arrays.toString(res));
 System.out.println(context.getBean(User.class));  
 
	}

}
