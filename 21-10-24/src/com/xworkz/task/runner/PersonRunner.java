package com.xworkz.task.runner;

import com.xworkz.task.dto.Person;
import com.xworkz.task.repo.PersonRepo;

public class PersonRunner {
	public static void main(String[] args) {
		Person person1 = new Person(23,"Shashi","Shashissg@gmail.com",7584759674l);
		Person person2 = new Person(24,"Shashi2","Shashissg@gmail.com2",8584759674l);
		PersonRepo prepo =new PersonRepo();
		prepo.onSave(person1);
		prepo.onSave(person2);
		prepo.read();
		
	}

}
