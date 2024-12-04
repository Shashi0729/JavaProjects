package com.xworkz.task.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.dto.BuildingDto;
import com.xworkz.task.dto.Chairs;
import com.xworkz.task.dto.ComputerDto;
import com.xworkz.task.dto.CupDto;
import com.xworkz.task.dto.PaperDto;
import com.xworkz.task.dto.PlanDto;
import com.xworkz.task.dto.PowerBankDto;
import com.xworkz.task.dto.RoadDto;

import lombok.Data;

@Data
public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComputerDto.class);
		String[] i = context.getBeanDefinitionNames();
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(i));
		System.out.println(context.getBean(ComputerDto.class));

		AnnotationConfigApplicationContext building = new AnnotationConfigApplicationContext(BuildingDto.class);
		String[] j = building.getBeanDefinitionNames();
		System.out.println(building.getBeanDefinitionCount());
		System.out.println(Arrays.toString(j));
		System.out.println(building.getBean(BuildingDto.class));

		AnnotationConfigApplicationContext cup = new AnnotationConfigApplicationContext(CupDto.class);
		String[] k = cup.getBeanDefinitionNames();
		System.out.println(cup.getBeanDefinitionCount());
		System.out.println(Arrays.toString(k));
		System.out.println(cup.getBean(CupDto.class));

		AnnotationConfigApplicationContext paper = new AnnotationConfigApplicationContext(PaperDto.class);
		String[] l = paper.getBeanDefinitionNames();
		System.out.println(paper.getBeanDefinitionCount());
		System.out.println(Arrays.toString(l));
		System.out.println(paper.getBean(PaperDto.class));

		AnnotationConfigApplicationContext chairs = new AnnotationConfigApplicationContext(Chairs.class);
		String[] m = chairs.getBeanDefinitionNames();
		System.out.println(chairs.getBeanDefinitionCount());
		System.out.println(Arrays.toString(m));
		System.out.println(chairs.getBean(Chairs.class));

		AnnotationConfigApplicationContext plan = new AnnotationConfigApplicationContext(PlanDto.class);
		String[] n = plan.getBeanDefinitionNames();
		System.out.println(plan.getBeanDefinitionCount());
		System.out.println(Arrays.toString(n));
		System.out.println(plan.getBean(PlanDto.class));

		AnnotationConfigApplicationContext pBank = new AnnotationConfigApplicationContext(PowerBankDto.class);
		String[] o = pBank.getBeanDefinitionNames();
		System.out.println(pBank.getBeanDefinitionCount());
		System.out.println(Arrays.toString(o));
		System.out.println(pBank.getBean(PowerBankDto.class));

		AnnotationConfigApplicationContext road = new AnnotationConfigApplicationContext(RoadDto.class);
		String[] p = road.getBeanDefinitionNames();
		System.out.println(road.getBeanDefinitionCount());
		System.out.println(Arrays.toString(p));
		System.out.println(road.getBean(RoadDto.class));

	}

}
