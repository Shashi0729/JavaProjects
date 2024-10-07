package com.xworkz.exception.runner;

public class Properties implements Cloneable {
	String name;
	int age;
	String department;
	String designation;
	double salary;
	String location;
	String email;
	String phone;

	@Override
	public Properties clone() throws CloneNotSupportedException {
		return (Properties) super.clone();

	}

	@Override
	public String toString() {
		return "Properties [name=" + name + ", age=" + age + ", department=" + department + ", designation="
				+ designation + ", salary=" + salary + ", location=" + location + ", email=" + email + ", phone="
				+ phone + "]";
	}

}
