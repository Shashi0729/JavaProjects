package com.xworkz.comparetor.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
public static void main(String[] args) {
	List<ExampleDto> list =new ArrayList<ExampleDto>();
	list.add(new ExampleDto("shashi", 23));
	list.add(new ExampleDto("taseer", 24));
	list.add(new ExampleDto("nitin", 22));
	list.add(new ExampleDto("prajwal", 26));
//	System.out.println(list);
//   Collections.sort(list);
//   System.out.println(list);
   
   String sentence="hii where are u";
  String[] sr= sentence.split(" ");
   //.out.println(sr);
   
 List<String> list2=  Arrays.asList(sr);
 Comparator<String> com =(String o1,String o2)-> o2.compareTo(o1);
 Collections.sort(list2, com);
 System.out.println(list2);
   
    
   
}
}
