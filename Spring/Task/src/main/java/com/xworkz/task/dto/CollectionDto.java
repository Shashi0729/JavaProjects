package com.xworkz.task.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



import lombok.Data;

@ComponentScan("com.xworkz")
@Component
@Data
public class CollectionDto {
	
	@Bean
	public List task() {
		System.out.println("list");
		return new ArrayList();
		
	}
	
	
	@Bean
	public Iterable task1() {
		System.out.println("Iterable");
		return new ArrayList();
		
	}
	
	@Bean
	public Collection task2() {
		System.out.println("Collection");
		return new ArrayList();
		
	}
	
	@Bean
	public Set task3() {
		System.out.println("Set");
		return new HashSet();
		
	}
	
	@Bean
	public HashSet task4() {
		System.out.println("Hashset");
		return new HashSet();
		
	}
	
	@Bean
	public TreeSet task5() {
		System.out.println("TreeSet");
		return new TreeSet();
		
	}
	
	@Bean
	public ArrayList task6() {
		System.out.println("ArrayList");
		return new ArrayList();
		
	}
	@Bean
	public LinkedList task7() {
		System.out.println("LinkedList");
		return new LinkedList();
		
	}
	
	@Bean
	public LinkedHashSet task8() {
		System.out.println("LinkedHashSet");
		return new LinkedHashSet() ;
		
	}
	
	@Bean
	public Map task9() {
		System.out.println("Map");
		return new LinkedHashMap() ;
		
	}
	
	@Bean
	public LinkedHashMap task10() {
		System.out.println("LinkedHashMap");
		return new LinkedHashMap() ;
		
	}
	
	@Bean
	public HashMap task11() {
		System.out.println("HashMap");
		return new HashMap() ;
		
	}
	
	@Bean
	public Queue task12() {
		System.out.println("Queue");
		return new PriorityQueue() ;
		
	}
	
	
	

}
