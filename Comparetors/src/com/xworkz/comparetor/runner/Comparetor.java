package com.xworkz.comparetor.runner;

import java.util.Comparator;

public class Comparetor {

	public static void main(String[] args) {
		Comparator<String> compare =new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.equals(o2))
				return 0;
				else
					return 1;
			}
		};
System.out.println(compare.compare("malli", "malli"));

Comparator<String> compare2=(String s1,String s2)-> s1.equals(s2)? 0:1;
System.out.println(compare2.compare("raju", "raju"));

Compare com=(String s1,String s2)-> s1.equals(s2)? true:false;
System.out.println(com.test("shashi", "shashi"));

	}

	
	}


