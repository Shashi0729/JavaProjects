package com.xworkz.task.Runner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Movie;
public class MovieRunner {
	
	    public static void main(String[] args) {
	        List<Movie> movies = new ArrayList<>();
	        movies.add(new Movie("KGF Chapter 1", 8.4, 2018));
	        movies.add(new Movie("KGF Chapter 2", 9.0, 2022));
	        movies.add(new Movie("Shivaji Surathkal", 7.8, 2020));
	        movies.add(new Movie("Ugramm", 8.2, 2014));
	        movies.add(new Movie("Operation Gold Fish", 7.5, 2019));

	        Collections.sort(movies, (m1, m2) -> Double.compare(m2.getRating(), m1.getRating()));

	        System.out.println("Kannada Movies sorted by rating (descending):");
	        for (Movie movie : movies) {
	            System.out.println(movie);
	        }

	        System.out.println();

	        Collections.sort(movies, Comparator.comparingInt(Movie::getReleaseYear));

	        System.out.println("Kannada Movies sorted by release year (ascending):");
	        for (Movie movie : movies) {
	            System.out.println(movie);
	        }
	    }
	}



