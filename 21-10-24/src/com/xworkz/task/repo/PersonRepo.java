package com.xworkz.task.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.task.dto.Person;

public class PersonRepo {
	
	List<Person> list=new ArrayList<>();
	
	public void onSave(Person personDto) {
		System.out.println("Onsave is running");
		if(personDto != null) {
			list.add(personDto);
			System.out.println("saved");
			

		}else {
			System.out.println("not saved");

		}
	}
	
	public void read() {
		System.out.println("read is running");
		list.forEach(i -> System.out.println(i));
//		return list;
	
	}

}
