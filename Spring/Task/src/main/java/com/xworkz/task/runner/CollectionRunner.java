package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.dto.CollectionDto;

public class CollectionRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(CollectionDto.class);
Object result=
		context.getBean("task");
		System.out.println(result);
		
		Object result1=context.getBean("task1");
				System.out.println(result1);
				
				Object result2=context.getBean("task2");
				System.out.println(result2);
				Object result3=context.getBean("task3");
				System.out.println(result3);
				Object result4=context.getBean("task4");
				System.out.println(result4);
				Object result5=context.getBean("task5");
				System.out.println(result5);
				Object result6=context.getBean("task6");
				System.out.println(result6);
				Object result7=context.getBean("task7");
				System.out.println(result7);
				Object result8=context.getBean("task8");
				System.out.println(result8);
				Object result9=context.getBean("task9");
				System.out.println(result9);
				Object result10=context.getBean("task10");
				System.out.println(result10);
				Object result11=context.getBean("task11");
				System.out.println(result11);
				Object result12=context.getBean("task12");
				System.out.println(result12);
//				Object result13=context.getBean("task13");
//				System.out.println(result13);
//				
	}

}
