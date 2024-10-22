package com.xworkz.task.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EmailRunner {
	public static void main(String[] args) {
		List<String> emailList = new LinkedList<String>();

		emailList.add("Shashisg@gmail.com");
		emailList.add("Shashisg@gmail.com2");
		emailList.add("Shashisg@gmail.com3");
		emailList.add("Shashisg@gmail.com4");
		 System.out.println(emailList);
		ListIterator<String> iterator = emailList.listIterator();

		iterator.add("Hii@gmail.com");
		iterator.add("Hello@gmail.com");
		emailList.remove(0);
		emailList.forEach(i -> System.out.println("After Remove:" + i));
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasPrevious());
		
		System.out.println("Search:" + emailList.contains("ganeshsai224466@gmail.com"));
		emailList.add(0, "Shashisg");
		emailList.forEach(i -> System.out.println("After update:" + i));

		
		

//		System.out.println("Main Method Running");
//
//		List<String> list = new LinkedList<String>();
//		list.add("ganeshsaivenkat.c@gmail.com");
//		list.add("ganeshsai224466@gmail.com");
//
//		ListIterator<String> listIterator = list.listIterator();
//		listIterator.add("abscedfsj@gmail.com");
//		listIterator.add("yubscedfsj@gmail.com");
//		listIterator.add("opscedfsj@gmail.com");
//
//		list.remove(1);
//		list.forEach(i -> System.out.println("After Remove:" + i));
//
//		System.err.println("Search:" + list.contains("ganeshsai224466@gmail.com"));
//
//		list.add(2, "ahgydywhjsi@gmail.com");
//		list.forEach(i -> System.out.println("After update:" + i));

	}

}
