package com.xworkz.exception.runner;

public class Student implements Cloneable {
	String studentName;
	int rollNumber;
	String branch;
	String collegeName;
	double percentage;
	String university;
	String address;
	String contactNumber;

	@Override
	public Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();

	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", branch=" + branch
				+ ", collegeName=" + collegeName + ", percentage=" + percentage + ", university=" + university
				+ ", address=" + address + ", contactNumber=" + contactNumber + "]";
	}

}
