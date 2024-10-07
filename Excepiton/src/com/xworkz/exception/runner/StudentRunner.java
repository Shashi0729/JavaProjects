package com.xworkz.exception.runner;

public class StudentRunner {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student();
		student.address = "BTM";
		student.branch = "CSE";
		student.collegeName = "SGBIT";
		student.contactNumber = "254655555";
		student.percentage = 78.56;
		student.rollNumber = 424;
		student.university = "VTU";
		student.studentName = "Shashi";
		System.out.println(student);

		Student student1 = student.clone();
		System.out.println(student1);

		student1.address = student.address;
		student1.branch = student.branch;
		student1.collegeName = student.collegeName;
		student1.contactNumber = student.contactNumber;
		student1.percentage = student.percentage;
		student1.rollNumber = student.rollNumber;
		student1.university = student.university;
		student1.studentName = student.studentName;
		System.out.println(student1);

	}

}
