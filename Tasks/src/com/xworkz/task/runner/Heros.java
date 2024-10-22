package com.xworkz.task.runner;

import java.util.ArrayList;

public class Heros {
public static void main(String[] args) {
	ArrayList<String> heroNames = new ArrayList<String>();
	heroNames.add("YASH");
	heroNames.add("SUDEEP");
	heroNames.add("PUNITRAJKUMAR");
	heroNames.forEach(s->System.out.println(s));
	
	ArrayList<String> yashMovieNames = new ArrayList<String>();
	yashMovieNames.add("KGF");
	yashMovieNames.add("KGF2");
	yashMovieNames.add("LUCKY");
	yashMovieNames.forEach(s->System.out.println(s));
	
	ArrayList<String> sudeepMovieNames = new ArrayList<String>();
	sudeepMovieNames.add("VIKRANTRONA");
	sudeepMovieNames.add("MAX");
	sudeepMovieNames.add("HUBBALI");
	sudeepMovieNames.forEach(s->System.out.println(s));
	
	ArrayList<String> punitMovieNames = new ArrayList<String>();
	punitMovieNames.add("APPU");
	punitMovieNames.add("AKASH");
	punitMovieNames.add("ARASU");
	punitMovieNames.forEach(s->System.out.println(s));
	
	

}
}
